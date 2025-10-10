# sensor-backend

Build
```
./mvnw package -Dquarkus.package.type=uber-jar -DskipTests
```

Build Docker
```
docker build -t {name} .
```

Run Docker
```
docker run -d -p 9090:9090 {name}
```