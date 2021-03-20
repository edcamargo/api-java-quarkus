package backend.Services.Implements;

import backend.Entities.User;
import backend.Services.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public Optional<User> delete(Long id) {
        return Optional.empty();
    }
}
