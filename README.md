# File Processor Documentation
This is a sample project to demonstrate bootstrap integration with Spring Data JPA and Liquibase

## Spring Data JPA
Check out examples from the following link for more JPA related examples

https://github.com/spring-projects/spring-data-examples/tree/master/jpa/example/src/main/java/example/springdata/jpa

## Spring Properties
Understanding setup of application variables 

https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html

## DBScripts

### Run the db changes using flyway

Document all the db scripts by version under src/main/resources/db/migration. Flyway will apply all the migration scripts based on the last executed scripts

> gradle flywayMigrate -i -b db.gradle 

Check out the following link to see gradle integration with liquibase
https://flywaydb.org/getstarted/firststeps/gradle
