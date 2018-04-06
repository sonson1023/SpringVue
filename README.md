


# SpringVue
It is my Vue.js example project based on Spring boot
Hello. This is my example project for study and project.

# Requirement
Vue.js, 3.9.3 Version - STS(https://spring.io/tools/sts), SpringBoot, Window10, gradle

## Setup Vue.js

``` 
mkdir Vue
cd Vue

npm install --global vue-cli
vue init webpack ./
```

## Setup Gradpe & SpringBoot
please check my build.gradle.
```
Install Gradle : Eclipse - Help ->  Eclipse MarketPlace - search 'gradle' - install 'Buildship Gradle Integration 2.0'
Install SpringBoot : write this sentence in build.gradle
```
```
dependencies {
    compile('org.springframework.boot:spring-boot-starter-thymeleaf')
	compile('org.springframework.boot:spring-boot-starter-web')
}
```

