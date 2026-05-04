FROM eclipse-temurin:17-jdk

COPY target/bankingApp.jar /usr/app/

WORKDIR /usr/app/


EXPOSE 8081

ENTRYPOINT [ "java","-jar","bankingApp.jar" ]