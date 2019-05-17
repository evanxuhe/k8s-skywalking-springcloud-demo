FROM openjdk:8-jre-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    SPRINGBOOT_SLEEP=0 \
    JAVA_OPTS="" 
    
# Add a xuhe user to run our application so that it doesn't need to run as root
RUN adduser -D -s /bin/sh xuhe
WORKDIR /home/xuhe

#ADD ./agent  ${WORKDIR}/agent 

ADD entrypoint.sh entrypoint.sh
RUN chmod 755 entrypoint.sh && chown xuhe:xuhe entrypoint.sh
USER xuhe
ADD target ./
ENTRYPOINT ["./entrypoint.sh"]
RUN pwd
RUN ls -lh
EXPOSE 8080 8761
ADD target/*.jar app.jar


