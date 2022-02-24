package uz.nb.simple_trello.reposiroty.project;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.project.ProjectColumn;
import uz.nb.simple_trello.reposiroty.base.AbstractRepository;

public interface ProjectColumnRepository extends JpaRepository<ProjectColumn, Long>, AbstractRepository {
}
