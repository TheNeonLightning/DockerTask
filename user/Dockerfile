FROM adoptopenjdk/openjdk11
EXPOSE 7070/tcp
ADD target/user-0.0.1-SNAPSHOT.jar user-app.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/user-app.jar", "--service.address=service"]