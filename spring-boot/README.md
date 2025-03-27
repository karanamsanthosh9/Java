Spring boot:
Spring-boot is an open source Java-based framework for building scalable applications with mininum configurations and maximum ease.


application.properties:

spring.application.name=spring-data-jpa-application

# Database configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/newdb
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver
#without this sql.init.mode schema.sql and data.sql are not getting picked during start
spring.sql.init.mode=always

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=9090
