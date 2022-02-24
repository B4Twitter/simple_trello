package uz.nb.simple_trello.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import uz.nb.simple_trello.entity.auth.User;

public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {
    User findUserByUsername(String username);
}
