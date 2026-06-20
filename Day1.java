// Client-Server Architecture
// HTTP / HTTPS Protocol
/* Request format
       |- Method name
       |- URL / Path
       |- Header
       |- Body


       example
       GET /v1/courses
       Host: www.coderarmy.com
       Content-Type: application/json
       {

       }
*/

/* Response Format
       |- Status Code
       |- Header
       |- Body


       example
       200 OK
       contentType: application/json
       {
            message: "login successfull",
       }
*/


// java mein saari chize objects hai

// how endpoints are mapped with the function/methods

/*Code Flow
    START -> RUN -> STOP -> EXIT
*/

/* Website flow
    START -> RUN -> WAIT FOR REQUEST -> GIVE RESPONSE -> KEEP RUNNIG 24*7
*/

// WE HIT THE ENDPOINT AND THEN CALL THE METHODS

// With the help of core java we can do the networking

//every application on our computer runs on a specific port number

//with the help of core java it becomes very difficult to parse the get , endpoints etc and the jvm will not understand


/*  Using java.net
        input -> BufferReader

        1-> Read I/P Streams
        2-> Parse Request manually
        3-> map a method to the end point

        if(endpoints.equals("course")){
        
        }
        else{
        
        }
        
        4-> Manually built http resopnse 
        5-> Implement multithreading (for handling multiple users) to handle concurrent users
        
        These are the issues which have to work for if using serversocket
        1-> Bohot sara boiler plate code likhna parega
        isko eradicate karne aaya servlet and servlet container

        Servlet container(Tomcat / jetty / underflow)
        //sara ka sara manual kaam karta hai
        1 Open port 
        2 read incoming bytes
        3 parse http req
        3 manage threads
        4 create/built http response

        when a client hits the container then it decides which servlet to call

        Why servlet fails
    ans-> When we scale a servlet to enterprise level   then the codes becomes tightly coupled.

    Spring Framework -> loosely coupled -> taaki ache se scale kar sake

    spring boot ek automation layer hai, jiski ideology yeh hai ki aap apni web- development bohot jaldi start kar sako
    having predefined configuration

    JDBC jaha per query likhni parti thi
    JPA (Java Persistence Api) 
    we don't write the sql queries and we call some methods

    JPA ko implement karta hai Hibernate ko implment karta hai JDBC
*/ 