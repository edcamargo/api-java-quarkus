package backend.Resources;

import backend.Entities.User;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    public List<User> getAll() {
        User user = new User();
        return user.listUser();
    }

    @GET
    @Path("{id}")
    public User getById(@PathParam("id") long id) {
        Optional<User> result = User.findByIdOptional(id);

        if (result.isPresent())
            return result.get();
        else throw new NotFoundException();
    }

    @POST
    @Transactional
    public User Create(User user){
        user.persist();
        return user;
    }

    @PUT
    @Path("{id}")
    @Transactional
    public User Update(@PathParam("id") long id, User user) {
        Optional<User> result = User.findByIdOptional(id);

        if (result.isPresent()) {
            User _user = result.get();
            _user.name = user.name;
            _user.email = user.email;
            _user.password = user.password;

            _user.persist();
        } else {
            throw new NotFoundException();
        }

        return user;
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void Delete(@PathParam("id") Long id) {
        Optional<User> result = User.findByIdOptional(id);

        result.ifPresentOrElse(User::delete, () -> {
            throw new NotFoundException();
        });
    }
}
