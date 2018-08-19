# spring boot 之使用mapstruct #

示例代码的详细说明见：https://www.cnblogs.com/yql1986/p/9500851.html

----------

示例代码用于解释，怎么样解决使用`mapstruct`出现**如下错误**：

```java
[ERROR] /F:/java.ws.01/springboot-example/example4/src/main/java/com/github/torlight/sbex/PeopleMapper.java:[21,15] No property named "age" exists in source parameter(s). Did you mean "null"?
[ERROR] /F:/java.ws.01/springboot-example/example4/src/main/java/com/github/torlight/sbex/PeopleMapper.java:[32,10] No property named "user.name" exists in source parameter(s). Did you mean "null"?
[ERROR] -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.5.1:compile (default-compile) on project example4: Compilation failure
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:307)
    at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:193)
    at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:106)
    at org.apache.maven.cli.MavenCli.execute(MavenCli.java:862)
    at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:286)
    at org.apache.maven.cli.MavenCli.main(MavenCli.java:197)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
Caused by: org.apache.maven.plugin.compiler.CompilationFailureException: Compilation failure
    at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute(AbstractCompilerMojo.java:972)
    at org.apache.maven.plugin.compiler.CompilerMojo.execute(CompilerMojo.java:129)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:134)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
    ... 20 more
[ERROR] 
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```