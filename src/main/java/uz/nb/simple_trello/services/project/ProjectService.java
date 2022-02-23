package uz.nb.simple_trello.services.project;


import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.project.ProjectCreateDto;
import uz.nb.simple_trello.dto.project.ProjectDto;
import uz.nb.simple_trello.dto.project.ProjectUpdateDto;
import uz.nb.simple_trello.entity.project.Project;
import uz.nb.simple_trello.services.GenericCrudService;

public interface ProjectService extends GenericCrudService<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto,
        GenericCriteria,
        Long
        > {
}
