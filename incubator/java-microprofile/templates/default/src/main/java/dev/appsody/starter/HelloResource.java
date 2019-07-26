package dev.appsody.starter;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.stream.JsonCollectors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {

    @Inject
    Hello hello;

    @GET
    public JsonArray hello() {
        return hello.hello()
                .stream()
                .map(Json::createValue)
                .collect(JsonCollectors.toJsonArray());
    }

}
