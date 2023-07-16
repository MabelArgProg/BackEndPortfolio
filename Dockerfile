FROM amazoncorretto:11-alpine-jdk                 
MAINTAINER MCP                                     
COPY  target/MCP-0.0.1-SNAPSHOT.jar  mcp-app.jar   
ENTRYPOINT  ["java","-jar","/mcp-app.jar"]         
