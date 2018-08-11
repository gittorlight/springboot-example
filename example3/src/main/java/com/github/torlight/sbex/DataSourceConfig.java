package com.github.torlight.sbex;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;


/**
 * 主数据源的配置
 *
 * @author gittorlight
 */
@Configuration
public class DataSourceConfig {
	
	// 精确到 master 目录，以便跟其他数据源隔离
	public static final String PACKAGE = "com.github.torlight.sbex";
	public static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";
	public static final String SESSION_FACTORY_BEAN_NAME="sqlsessionFactory";
	
	@Bean
	@ConfigurationProperties(prefix="druid.datasource")
	public DataSource dataSource() {
        return new DruidDataSource();
	}

    @Primary
    public DataSourceTransactionManager masterTransactionManager( DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name="sqlsessionFactory")
    public SqlSessionFactory masterSqlSessionFactory(DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(DataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        
    	Properties properties=new Properties();
        properties.put("mappers","tk.mybatis.mapper.common.Mapper,tk.mybatis.mapper.common.MySqlMapper");

        MapperScannerConfigurer msc=new MapperScannerConfigurer();      
        msc.getMapperHelper().setProperties(properties);
        msc.setBasePackage(DataSourceConfig.PACKAGE);
        msc.setSqlSessionFactoryBeanName(DataSourceConfig.SESSION_FACTORY_BEAN_NAME);
        
        return msc;
    }

}