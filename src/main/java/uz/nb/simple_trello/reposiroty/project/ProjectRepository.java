package uz.nb.simple_trello.reposiroty.project;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.project.Project;
import uz.nb.simple_trello.reposiroty.base.AbstractRepository;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {
}
