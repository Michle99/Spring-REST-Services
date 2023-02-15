# Building REST services with Spring

Relearning the meaning of a REST service.

### Source

* [Building a REST Service with spring](https://spring.io/guides/tutorials/rest/)


### THE MEANING OF REST API/SERVICES:    
This statement of Roy Fielding’s may further lend a clue to the difference between REST and RPC:

I am getting frustrated by the number of people calling any HTTP-based interface a REST API. Today’s example is the SocialSite REST API. That is RPC. It screams RPC. There is so much coupling on display that it should be given an X rating.

What needs to be done to make the REST architectural style clear on the notion that hypertext is a constraint? In other words, if the engine of application state (and hence the API) is not being driven by hypertext, then it cannot be RESTful and cannot be a REST API. Period. Is there some broken manual somewhere that needs to be fixed?
*[Roy Fielding] (https://roy.gbiv.com/untangled/2008/rest-apis-must-be-hypertext-driven)

The side effect of NOT including hypermedia in our representations is that clients MUST hard code URIs to navigate the API. 

*[Spring HATEOAS] (https://spring.io/projects/spring-hateoas#overview), is a spring project aimed at helping you write hypermedia-driven outputs.

This tiny library will give us the constructs to define a RESTful service and then render it in an acceptable format for client consumption.

A critical ingredient to any RESTful service is adding links to relevant operations such as controllers. 
Links are what empower the web. Before the World Wide Web, other document systems would render information or links, but it was the linking of documents WITH this kind of relationship metadata that stitched the web together.