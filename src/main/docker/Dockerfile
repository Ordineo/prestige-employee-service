FROM openjdk:8-jre
VOLUME /tmp
ADD prestige-employee-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8585
ENTRYPOINT ["java","-jar", "/app.jar"]
