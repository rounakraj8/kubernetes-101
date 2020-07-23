# Basic Kubernetes Commands

### Displays merged kubeconfig settings or a specified kubeconfig file
`kubectl config view`

### Cluster Info
`kubectl cluster-info`

### Get current context
`kubectl config current-context`

### Creating a deployment with image as **rounakraj8/demo:latest**
`kubectl create deployment demo --image=rounakraj8/demo:latest`

### View Deployments
`kubectl get deployments`

### View Running Pods
`kubectl get pods`

### Describe a Running Pod
`kubectl describe pod $podName`


### View logs of a Running Pod
`kubectl logs -f $podName`

### Exposing deployment **demo** with type as LoadBalancer(for getting external/public IP).
`kubectl expose deployment demo --name=demo --port=80 --target-port=8080 --type=LoadBalancer`

### View Services
`kubectl get service`

### Scale deployment
`kubectl scale deployment demo --replicas=3`

### Delete Deployment **demo**
`kubectl delete deployment demo`

### Delete Service **demo**
`kubectl delete svc demo`

### For more commands, see https://kubernetes.io/docs/reference/kubectl/cheatsheet/
