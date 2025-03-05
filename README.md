# secure-api-ping-demo
Secure spring boot REST api with PingOne

# Maven dependencies

***Add below dependencies in maven or gradle***

```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
</dependency>
```

# OAuth2 Configs

  ***Configure spring security oauth2 properties in application.yaml/properties***

```
spring:
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: pfsso.ping.krpoc.com
          jwk-set-uri: https://pfsso.ping.krpoc.com/pf/JWKS
        opaquetoken:
          client-id: <clientId>
          client-secret: <clientSecret>
```

# Validate

Run this spring boot service with env vars ${CLIENT_ID} & ${CLIENT_SECRET}.

Validate GET /getinfo endpoint

***Success Request***
```
 HTTP GET http://localhost:8080/getinfo
 Header : Bearer <ping-one-access-token>
```
***Response***
```
 HTTP 200 OK
 ```

****
***Invalid Request***
```
 HTTP GET http://localhost:8080/getinfo
```
***Response***
```
 HTTP 401 Unauthorized
```
