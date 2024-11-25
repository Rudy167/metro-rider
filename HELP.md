# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0.RELEASE/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0.RELEASE/maven-plugin/build-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/actuator/index.html)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/3.4.0.RELEASE/specification/configuration-metadata/annotation-processor.html)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/data/sql.html#data.sql.jdbc)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/data/sql.html#data.sql.r2dbc)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/using/devtools.html)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/features/dev-services.html#features.dev-services.docker-compose)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/web/spring-graphql.html)
* [JDBC API](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/data/sql.html)
* [OAuth2 Client](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/web/spring-security.html#web.security.oauth2.client)
* [Spring Security](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/web/spring-security.html)
* [Thymeleaf](https://docs.spring.io/spring-boot/3.4.0.RELEASE/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links
These additional references should also help you:

* [R2DBC Homepage](https://r2dbc.io)

## GraphQL code generation with DGS

This project has been configured to use the Netflix DGS Codegen plugin.
This plugin can be used to generate client files for accessing remote GraphQL services.
The default setup assumes that the GraphQL schema file for the remote service is added to the `src/main/resources/graphql-client/` location.

You can learn more about the [plugin configuration options](https://github.com/deweyjose/graphqlcodegen) and
[how to use the generated types](https://netflix.github.io/dgs/generating-code-from-schema/) to adapt the default setup.


### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* mysql: [`mysql:latest`](https://hub.docker.com/_/mysql)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
