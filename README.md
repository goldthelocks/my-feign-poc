# OpenFeign POC

A sample Spring Boot app using OpenFeign to communicate with https://thecatapi.com.

## Getting Started

### run via IDE with Spring plugin
1. Import as maven project.
2. Run as Spring Boot application.

### run via IDE without Spring plugin
1. Import as maven project.
2. Run main method in Application.java.

### run via command line
```
cd my-feign-poc
mvn spring-boot:run
```

## Configuration

If you want to customize this project and try out other endpoints in https://thecatapi.com, you may sign-up at their
 website to obtain your own API key. Afterwards, set the value at application.yml:
 
 ```
  client:
    cat-api:
      api-key: <your_api_key>
 ```