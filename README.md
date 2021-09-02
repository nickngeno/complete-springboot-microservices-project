# complete-springboot-microservices-project
This is a simple  all round spring boot microservices application

I have created two microservices which are independent of each other yet one is called by another one. 

Tiers microservice is a microservice that has infor about a certain internet package tier. 

Internetpackage microservice is a service with basic info about a given packages.

I have also set up a service registry microservice which will be used to host and encapsulate the other two microservices.

I have also set up an API Gateway service to help route the request to the right microservice.This will help increase efficiency and also help do loadbalancing of requests.

Since most of the times microservices share the same configurations, i have also set up an external config server to help store all the common configurations required by all the
microservice.This will help reduce time required to make common changes while also requcing error occurences in confugarions.
 
# Tools
Tools used are Java, spring boot, Spring cloud, Spring Data, Eureka discovery, API Gateway,Hystrix, Github etc.

