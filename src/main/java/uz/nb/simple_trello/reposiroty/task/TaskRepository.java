package uz.nb.simple_trello.reposiroty.task;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.task.Task;
import uz.nb.simple_trello.reposiroty.base.AbstractRepository;

/**
 * @Author Aziza Tojiboyeva
 */
public interface TaskRepository extends JpaRepository<Task, Long>, AbstractRepository {

}
