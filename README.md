# Spring-Boot + Jersey Example with Spring-CLI
-----------------------------------------------
These are the first steps of creating a spring-boot project.
However, even compiled into jar files, the cold start time still takes long
After about 140,000 requests, the service response time would become stable.

If you are still a spring framework user, be sure to switch to Akka framework and give it a try.

### Build Steps
- __Generate__:

```bash
spring init -d=jersey --build=gradle --lang=groovy app

```

- __Create Config__

```groovy
package com.example.app

import org.springframework.context.annotation.Configuration
import org.glassfish.jersey.server.ResourceConfig

@Configuration
class JerseyConfig extends ResourceConfig {
    def JerseyConfig() {
        return register(TestResource.class);
    }
}
```

- __Add Resource__

```groovy
package com.example.app

import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Pah

@Path("/")
class TestResource {
    @GET
    @Produces("text/plain")
    def String getMessage() {
        return "Hello World!";
    }
}
```

- __Test Run__:

```bash
cd app
./gradlew bootRun
```

- __List Built Components__:

```bash
cd app
./gradlew components
```

- __Build__:

```bash
cd app
./gradlew bootRepackage
# The result jar resides in build/libs/*
# you could run java -jar on such file directly for execution
# and be easier to deploy to other places
```

