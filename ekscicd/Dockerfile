FROM java:8
ADD target/dockerjar.jar dockerjar.jar
RUN bash -c 'touch /dockerjar.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","/dockerjar.jar"]