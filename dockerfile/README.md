## Basic Docker Commands

#### View available Docker images on your machine
 `docker images`
 
 #### View running Docker containers on your machine
 `docker ps`
 
 #### View exited Docker containers on your machine
 `docker ps -a`
 
 #### Build a Docker image when Dockerfile is present in current context
 `docker build -t rounakraj8/demo:latest .`
 
 #### Push the built Docker image to Image registry( DockerHub in this case)
 `docker push rounakraj8/demo:latest`
