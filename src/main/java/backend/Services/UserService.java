package backend.Services;

import backend.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> findAll();
    public User create(User user);
    public User update(User user);
    public Optional<User> findOne(Long id);
    public Optional<User> delete(Long id);
}
