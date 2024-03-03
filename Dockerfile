FROM image-registry.openshift-image-registry.svc:5000/openshift/java:latest
 
LABEL base-image="java:latest" \
      java-version="latest" \
      purpose="Java app"
 
# set working directory at /deployments
WORKDIR /deployments
 
# copy my jar file
COPY ws-employee-soapcxf-master.jar app.jar
 
# gives uid
USER 185

EXPOSE 8080
 
# run it
CMD ["java", "-jar","app.jar"]
