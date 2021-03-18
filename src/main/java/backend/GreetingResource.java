package backend;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/helloNew")
    public String helloNew() {
        return "Hello New";
    }
}
