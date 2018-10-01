FROM openjdk

WORKDIR /

# Bundle app source
ADD target/springbootreact-0.0.1-SNAPSHOT.jar springbootreact-0.0.1-SNAPSHOT.jar

EXPOSE 8080

# Create an app user so the program doesn't run as root.
RUN /usr/sbin/groupadd -r app
RUN useradd -g app -u 999 app

# Chown all files to the user
RUN chown -R app:app springbootreact-0.0.1-SNAPSHOT.jar

USER 999

#CMD java - jar springbootreact-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Dfile.encoding=windows-1252","-jar","/springbootreact-0.0.1-SNAPSHOT.jar"]

# Create app directory
#WORKDIR /d/work/springboot

# Install app dependencies
# A wildcard is used to ensure both package.json AND package-lock.json are copied
# where available (npm@5+)
#COPY package*.json ./



#RUN npm install
# If you are building your code for production
# RUN npm install --only=production

# Bundle app source
#COPY . .

#EXPOSE 8080

#CMD [ "npm", "start" ]

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]