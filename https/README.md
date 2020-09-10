## Creating Certificates

### Using keytool
Java provides the keytool utility to create and manage certificates locally.

```
keytool -genkey -keyalg RSA -alias local -keystore local.jks -storepass password -validity 365 -keysize 4096 -storetype pkcs12
```

