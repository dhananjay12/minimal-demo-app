## How to run in K8 locally

Both with `mongo DB` and `file` as a source files are present. When using with file, you can
provide the application.yml with a config-map.

## Create Config Map
 
```
kubectl create configmap app-config --from-file=config-map\application.yml
```
## Run
```
kubectl apply -f .
```

## Cleanup
```
kubectl delete  configmaps app-config

kubectl delete -f .
```