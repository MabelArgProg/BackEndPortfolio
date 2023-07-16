FROM amazoncorretto:11-alpine-jdk                  //de que imagen de java partimos
MAINTAINER MCP                                     //dueño
COPY  target/MCP-0.0.1-SNAPSHOT.jar  mcp-app.jar   //copia el empaquetado de nuestra pc y lo sube a github
ENTRYPOINT  ["java","-jar","/mcp-app.jar"]         //lo primero que se ejecuta 
