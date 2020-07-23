### This is a demo project to Dockerize a simple Java(Spring Boot) application and run it on a Kubernetes Cluster

#### Prerequisites:
   This article assumes that you have: 
   <ul>
      <li> Docker installed in your local system. </li>
      <li> A DockerHub account. </li>   
      <li> A running Kubernetes cluster.  </li>
   </ul>
   
[Setup Docker](https://docs.docker.com/get-docker/)    
[Signup for DockerHub](https://hub.docker.com/)      
[Setup a cluster in GKE](https://cloud.google.com/kubernetes-engine/docs/how-to/creating-a-cluster)

## Steps:

#### 1. Write a [simple Java(Spring Boot) application and create its artifact(\*.jar)](https://github.com/rounakraj8/kubernetes-101/tree/master/demo)

#### 2. Write a [Dockerfile](https://github.com/rounakraj8/kubernetes-101/tree/master/dockerfile)

#### 3. Build the Docker image locally with some tag.
        docker build -t rounakraj8/demo:latest .
        
#### 4. Push the Docker image to any container registry(eg. DockerHub, AWS ECR, GCR).
        docker push rounakraj8/demo:latest
        
#### 5. Create the deployment
        kubectl create deployment demo --image=rounakraj8/demo:latest
        
   Alternatively, you can create [deployment.yaml](https://github.com/rounakraj8/kubernetes-101/blob/master/config/deployment.yaml) file and achieve the same results using `kubectl apply -f deployment.yaml` command.
        
#### 6. Create the service
        kubectl expose deployment demo --name=demo --port=80 --target-port=8080 --type=LoadBalancer
        
   Alternatively, you can create [service.yaml](https://github.com/rounakraj8/kubernetes-101/blob/master/config/service.yaml) file and achieve the same results
        using `kubectl apply -f service.yaml`  command.
      
#### 7. Scale the deployment
        kubectl scale deployment demo --replicas=2      
        
#### 8. Test the service
        To test this setup/demo, you will have to hit the hello API.
        After creating the service, this service will get an external/public API(This may take couple of minutes).
        Once you get the IP, you can hit `xxx.xxx.xxx.xxx/hello/someName`.
        If you get `Hello! SomeName` as response, then you have successfully completed the demo.

#### 9. Delete the created service
        kubectl delete svc demo
        
#### 10. Delete the created deployment
        kubectl delete deployment demo
        
### Presentation
[PDF](https://github.com/rounakraj8/kubernetes-101/blob/master/presentation/Kubernetes%20101.pdf)
[PPT](https://github.com/rounakraj8/kubernetes-101/blob/master/presentation/Kubernetes%20101.pptx)
        
Basic [Kubernetes commands](https://github.com/rounakraj8/kubernetes-101/tree/master/basic-commands/kubernetes)   
Basic [Docker Commands](https://github.com/rounakraj8/kubernetes-101/blob/master/dockerfile/README.md)
                
