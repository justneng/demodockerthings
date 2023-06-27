# demodockerthings
A Demo project for build an image application using Spring-boot, Dockerfile and Docker Compose

DockerFile

# build app jar file
- `mvn package`

# run jar file with command
- `java -Dserver.port=8888 -jar target/demodockerthings-0.0.1-SNAPSHOT.jar`

# create docker image
- `docker build --build-arg JAR_FILE=target/demodockerthings-0.0.1-SNAPSHOT.jar -t my-demoapp-image .`

# start container
- `docker run  --name my-demoapp-image-container1 my-demoapp-image`
- `docker run -p 8888:8080 --name my-demoapp-image-container1 my-demoapp-image`
- `docker ps -f 'status=exited'`
- `docker rm <<CONTAINER_ID>>`
- `docker run --rm -p 8888:8080 --name my-demoapp-image-container1 my-demoapp-image`
- `docker exec -it <<CONTAINER_ID>> bash`
- `docker logs -f <<CONTAINER_ID>>`

# create docker compose
# run compose
- `docker-compose up -d`