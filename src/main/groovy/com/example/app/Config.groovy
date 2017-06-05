package com.example.app

import org.springframework.context.annotation.Configuration
import org.glassfish.jersey.server.ResourceConfig

@Configuration
class JerseyConfig extends ResourceConfig {
    def JerseyConfig() {
        register(TestResource.class);
    }
}
