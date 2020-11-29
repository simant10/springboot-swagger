# springboot-swagger

Step 1:- 
Create a Spring boot project 
 (a). GoTo start.spring.io 
 (b). provide GoupdId and ArtifactId 
 (c). Add dependency Web,JPA,MySql,Devtool
 (d). Write code for CRUD.
 
 Step 2:-
 Integrate Swagger :-
  (a). Add Dependency in Pom.xml
  (b). Dependency Name :- 
        <dependency>
             <groupId>io.springfox</groupId>
             <artifactId>springfox-swagger2</artifactId>
             <version>2.9.2</version>
       </dependency>
       <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
       </dependency>
   (c). In Main Method class add annotation @EnableSwagger2 (After @SpringBootApplication annotation add @EnableSwagger2).
   
   (d). Opne Link http://localhost:8080/swagger-ui.html
 
