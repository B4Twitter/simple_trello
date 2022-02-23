package uz.nb.simple_trello.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.project.Project;

public interface TaskRepository extends JpaRepository<Project, Long>, AbstractRepository{
}
