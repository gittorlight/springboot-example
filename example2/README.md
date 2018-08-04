# springboot之@ConfigurationProperties注解 #

@ConfigurationProperties注解结合@EnableAutoConfiguration注解,会自动将属性配置文件转换成java bean,并会向spring中注入该bean,并以prefix+类的名称作为bean的名称。本例当中，使用@ConfigurationProperties(prefix = "c3p0") 和 @EnableConfigurationProperties(C3P0Properties.class) 向spring中注入"c3p0-com.torlight.C3P0Properties" bean,并在控制台上打印属性配置文件的所有值。

在springboot默认加载的配置文件application.properties配置文件中,使用spring.profiles.active=test告诉spring boot加载测试环境的配置,并加载application-test.properties配置文件

----------

### 向spring中注入该bean时,bean名称拼接规则见org.springframework.boot.context.properties.EnableConfigurationPropertiesImportSelector.ConfigurationPropertiesBeanRegistrar.registerBeanDefinitions

```java
    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata,
            BeanDefinitionRegistry registry) {
        MultiValueMap<String, Object> attributes = metadata
                .getAllAnnotationAttributes(
                        EnableConfigurationProperties.class.getName(), false);
        List<Class<?>> types = collectClasses(attributes.get("value"));
        for (Class<?> type : types) {
            String prefix = extractPrefix(type);
            String name = (StringUtils.hasText(prefix) ? prefix + "-" + type.getName()
                    : type.getName());
            if (!registry.containsBeanDefinition(name)) {
                registerBeanDefinition(registry, type, name);
            }
        }
    }