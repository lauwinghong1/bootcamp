#Spring Boot 

## Basic Spring Skill
- Spring Context -> Store Beans
  - Who create Bean? Before server start, "Spring Manager" manages bean cycle.
  - Bean cycle: @SpringBootApplication -> @ComponentScan
  - Find any class contains @Controller, @Service, @Repository, @Configuration
  - Create object for the above as Beans, put them into context
- Get Beans from Context (Purpose: Inject Dependency to Dependency User )
  - @Autowired on attribute (field injection)
  - @Autowired on constructor (Constructor injection)
  - i.e. Controller Bean usually @Autowired Service Bean
  - i.e. Service Bean @Autowired @Repository Bean
  - If the dependency not found, server start will fail.
- GET, POST, DELETE, PUT, PATCH
  - GET:  Without create/update/delete
  - POST: Create resource (you own your resource id)
  - DELETE: Delete by id
  - PUT:  Make sure resource exists, replace it directly.
  - PATCH: Make sure resource exists, set method on that object (i.e. patchCatName -> cat.setname) <= Replace an individual reference (field) within Class.

## Spring Boot Project Development
- Remember to add dependency that you need.
- After project creation, restart your project,
- Health Check pom.xml for dependency and application.yml
- Create Controller folder 
  - inside the folder, create interface (XXXXXOperation.java)
  - create impl folder, create implementation class for the interface
- Create Service folder
  - inside the folder, create interface (XXXXXService.java)
  - create impl folder, create implementation class for the interface
- Annotation: @RestController, @ResponseBody, @Service
- Connect Controller with Service: @Autowired
- test "mvn clean install"