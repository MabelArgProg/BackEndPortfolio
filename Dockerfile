FROM amazoncorretto:11               
MAINTAINER MCP                                     
COPY  target/MCP-0.0.1-SNAPSHOT.jar  mcp-app.jar   
ENTRYPOINT  ["java","-jar","/mcp-app.jar"]         
