package uz.nb.simple_trello.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.project.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {

}
