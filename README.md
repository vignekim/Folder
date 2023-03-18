# Folder
Spring Boot + Docker 


### Step 1
##### 프로젝트 배포 하기 (jar 파일 만들기)
```
./gradlew bootJar
```
<img src="./images/gradle_bootJar.png" width="700"></img>

### Step 2
##### build 폴더 확인 하기
```
tree build/libs
```
<img src="./images/app.png" width="700"></img>

### Step 3 
##### Docker 폴더에서 compose 실행 하기
```
docker-compose up -d
```
<img src="./images/docker-compose_up.png" width="700"></img>

### Step 4 
##### Docker DashBoard에서 확인 하기
<img src="./images/docker.png" width="700"></img>

### Step 5 
##### Docker 컨테이너 삭제하기 
```
docker-compose down
```
<img src="./images/docker-compose_down.png" width="700"></img>

----

### Spring boot - Application.yml

##### > 제어 Profile
```
spring:
  profiles:
    group:
      dev: 
        - dev-app
        - comm
      prod:
        - prod-app
        - comm
```

##### > 공통 Profile
```
spring:
  config:
    activate:
      on-profile: comm
  datasource:
    driver-class-name: org.mariadb.jdbc.Driver
    username: folder
    password: 1234
```

##### > 개발 Profile
```
spring:
  config:
    activate:
      on-profile: dev-app
  datasource:
    url: jdbc:mariadb://localhost:23306/edu
```

##### > 배포(운영) Profile
```
spring:
  config:
    activate:
      on-profile: prod-app
  datasource:
    url: jdbc:mariadb://DB:3306/edu
```
