# springboot-swagger

Step 1:- 
----
Create a Spring boot project 
 >>(a). GoTo start.spring.io <br/>
 >>(b). provide GoupdId and ArtifactId <br/>
 >>(c). Add dependency Web,JPA,MySql,Devtool<br/>
 >>(d). Write code for CRUD.<br/>
 ![](image/Screenshot%202020-11-30%20at%2012.48.13%20AM.png)
 </br>
 Step 2:-
 ----
 Integrate Swagger :- <br/>
  (a). Add Dependency in Pom.xml <br/>
  (b). Dependency Name :- <br/>
        <dependency><br/>
             <groupId>io.springfox</groupId><br/>
             <artifactId>springfox-swagger2</artifactId><br/>
             <version>2.9.2</version><br/>
       </dependency><br/>
       <dependency><br/>
            <groupId>io.springfox</groupId><br/>
            <artifactId>springfox-swagger-ui</artifactId><br/>
            <version>2.9.2</version><br/>
       </dependency><br/>
   (c). In Main Method class add annotation @EnableSwagger2 (After @SpringBootApplication annotation add @EnableSwagger2).<br/>
   
   (d). Opne Link http://localhost:8080/swagger-ui.html<br/>
 
