package com.example.app

import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path

@Path("/")
class TestResource {

    @GET
    @Produces("text/plain")
    def String getClichedMessage() {
        return "Hello World";
    }
}
