FROM openjdk:11
ADD target/covid19-0.0.1-SNAPSHOT.jar covid19-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "covid19-0.0.1-SNAPSHOT.jar"]