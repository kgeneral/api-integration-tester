# Api Integration Tester

## Run with embeded Tomcat
- gradle 의 'bootRun' task 수행. 수행시 아래 JVM 환경 변수 추가
- -Dspring.profiles.active=localhost -Dserver.port=9000

## Testable Url

### Requestable url
- http://localhost:9000/index

### H2
- http://localhost:9000/console

### Swagger
- http://localhost:9000/swagger-ui.html
- http://localhost:9000/v2/api-docs

#### TroubleShooting for SwaggerUI
- 화면이 깨져 나오는 경우 : 브라우져 캐시를 삭제하고 다시 시도

## References
- http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
- https://blog.gradle.org/kotlin-meets-gradle
- https://github.com/sdeleuze/spring-boot-kotlin-demo

## Advanced Topics for Kotlin
- https://kotlinlang.org/docs/reference/java-interop.html
- https://kotlinlang.org/docs/reference/inline-functions.html
- https://kotlinlang.org/docs/reference/object-declarations.html#companion-objects

### open annotation on a class
```
The open annotation on a class is the opposite of Java's final: it allows others to inherit from this class.
By default, all classes in Kotlin are final, which corresponds to Effective Java, Item 17: Design and document for inheritance or else prohibit it.
```
