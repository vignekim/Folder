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

---

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

### YouTube Link

###### 스프링 프로젝트 [Spring URL만들기]

## [![Video Label](http://img.youtube.com/vi/Wbor5JdymHI/0.jpg)](https://youtu.be/Wbor5JdymHI)

###### 스프링 프로젝트 [Thymeleaf]

## [![Video Label](http://img.youtube.com/vi/2ilL4Su6ZzU/0.jpg)](https://youtu.be/2ilL4Su6ZzU)

###### 사용자 테이블 만들기 [User Table]

## [![Video Label](http://img.youtube.com/vi/Z_9RKMg9SYA/0.jpg)](https://youtu.be/Z_9RKMg9SYA)

###### 사용자 정보 불러오기 [User Mapper]

## [![Video Label](http://img.youtube.com/vi/vc7dddX2WmE/0.jpg)](https://youtu.be/vc7dddX2WmE)

###### 사용자 목록 이벤트 [User List]

## [![Video Label](http://img.youtube.com/vi/8Z08xWcI-qY/0.jpg)](https://youtu.be/8Z08xWcI-qY)

###### 사용자 정보 이벤트 [User Detail]

## [![Video Label](http://img.youtube.com/vi/B3UwBuoYry8/0.jpg)](https://youtu.be/B3UwBuoYry8)

###### 사용자 수정 및 삭제 이벤트 [User Update or Delete]

## [![Video Label](http://img.youtube.com/vi/kaAxriCoV1I/0.jpg)](https://youtu.be/kaAxriCoV1I)

###### 사용자 추가 이벤트 [User Create]

## [![Video Label](http://img.youtube.com/vi/Wve-IkCz4A8/0.jpg)](https://youtu.be/Wve-IkCz4A8)

###### 프로젝트 배포하기 [Docker Compose]

## [![Video Label](http://img.youtube.com/vi/oVPBRi1A-eM/0.jpg)](https://youtu.be/oVPBRi1A-eM)
