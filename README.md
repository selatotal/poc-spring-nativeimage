# Spring Boot Native Image Test

Project to test GraalVM Native Image support in Spring Boot
Reference: https://docs.spring.io/spring-boot/reference/packaging/native-image/index.html

# Building image
```shell
./gradlew bootBuildImage
```

# Executing Image
```shell
docker run -p 8080:8080 docker.io/library/nativeimagetest:0.0.1-SNAPSHOT
```

Access endpoint in http://localhost:8080/

# To inspect image 
Install [dive](https://github.com/wagoodman/dive)
```shell
DIVE_VERSION=$(curl -s "https://api.github.com/repos/wagoodman/dive/releases/latest" | grep -Po '"tag_name": "v\K[0-9.]+')
curl -Lo dive.deb "https://github.com/wagoodman/dive/releases/latest/download/dive_${DIVE_VERSION}_linux_amd64.deb"
sudo apt install -y ./dive.deb
dive nativeimagetest:0.0.1-SNAPSHOT
```