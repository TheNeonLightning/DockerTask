FROM adoptopenjdk/openjdk11
EXPOSE 8080/tcp
ADD target/service-0.0.1-SNAPSHOT.jar service-app.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/service-app.jar"]