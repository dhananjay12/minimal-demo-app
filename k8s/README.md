## How to run in K8 locally

Both with `mongo DB` and `file` as a source files are present. When using with file, you can
provide the application.yml with a config-map.

## Create Config Map
 
```
kubectl create configmap app-config --from-file=config-map\application.yml
```
To see the output you could use 

```
kubectl create configmap --dry-run app-config --from-file=config-map\application.yml --output yaml
```

## Run
```
kubectl apply -f .
```

## Check

```
kubectl get configmap
kubectl describe configmap <name>
```

## Cleanup
```
kubectl delete  configmaps app-config

kubectl delete -f .
```