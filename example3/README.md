# spring boot之使用通用Mapper批量添加数据 #

示例代码的详细说明见：https://www.cnblogs.com/yql1986/p/9459478.html

----------

示例代码用于解释，怎么样解决使用通用Mapper出现**如下错误**：

```java
Exception in thread "main" org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.builder.BuilderException: Error invoking SqlProvider method (tk.mybatis.mapper.provider.SpecialProvider.dynamicSQL).  Cause: java.lang.InstantiationException: tk.mybatis.mapper.provider.SpecialProvider
    at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:77)
    at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:446)
    at com.sun.proxy.$Proxy62.insert(Unknown Source)
    at org.mybatis.spring.SqlSessionTemplate.insert(SqlSessionTemplate.java:278)
    at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:57)
    at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:59)
    at com.sun.proxy.$Proxy63.insertList(Unknown Source)
    at com.github.torlight.sbex.Example3Main.main(Example3Main.java:33)
Caused by: org.apache.ibatis.builder.BuilderException: Error invoking SqlProvider method (tk.mybatis.mapper.provider.SpecialProvider.dynamicSQL).  Cause: java.lang.InstantiationException: tk.mybatis.mapper.provider.SpecialProvider
    at org.apache.ibatis.builder.annotation.ProviderSqlSource.createSqlSource(ProviderSqlSource.java:103)
    at org.apache.ibatis.builder.annotation.ProviderSqlSource.getBoundSql(ProviderSqlSource.java:73)
    at org.apache.ibatis.mapping.MappedStatement.getBoundSql(MappedStatement.java:292)
    at org.apache.ibatis.executor.statement.BaseStatementHandler.<init>(BaseStatementHandler.java:64)
    at org.apache.ibatis.executor.statement.PreparedStatementHandler.<init>(PreparedStatementHandler.java:40)
    at org.apache.ibatis.executor.statement.RoutingStatementHandler.<init>(RoutingStatementHandler.java:46)
    at org.apache.ibatis.session.Configuration.newStatementHandler(Configuration.java:545)
    at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:48)
    at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
    at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
    at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:198)
    at org.apache.ibatis.session.defaults.DefaultSqlSession.insert(DefaultSqlSession.java:185)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:606)
    at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:433)
    ... 6 more
Caused by: java.lang.InstantiationException: tk.mybatis.mapper.provider.SpecialProvider
    at java.lang.Class.newInstance(Class.java:364)
    at org.apache.ibatis.builder.annotation.ProviderSqlSource.createSqlSource(ProviderSqlSource.java:85)
    ... 22 more
```

**代码没有数据库相关的配置，运行代码之前，需要把数据库相关的配置补上。**