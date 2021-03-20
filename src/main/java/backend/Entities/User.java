package backend.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class User extends PanacheEntity {

    @NotEmpty(message = "Nome não pode ser vazio")
    public String name;

    @NotEmpty(message = "E-mail não pode ser vazio")
    public String email;

    @NotEmpty(message = "Password não pode ser vazio")
    public String password;

    public static User findByName(String name){
        return find("name", name).firstResult();
    }

    public List<User> listUser(){
        return listAll();
    }
}
