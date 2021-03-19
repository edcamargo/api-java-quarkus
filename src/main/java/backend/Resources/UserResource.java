package backend.Resources;

import backend.Entities.User;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    public List<User> getAll() {
        User user = new User();
        return user.listUser();
    }

    @POST
    @Transactional
    public User Put(User user){
        user.persist();
        return user;
    }
}
