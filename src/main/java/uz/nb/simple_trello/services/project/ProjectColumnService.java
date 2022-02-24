package uz.nb.simple_trello.services.project;

import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.project.ProjectColumnCreateDto;
import uz.nb.simple_trello.dto.project.ProjectColumnDto;
import uz.nb.simple_trello.dto.project.ProjectColumnUpdateDto;
import uz.nb.simple_trello.services.base.GenericCrudService;


public interface ProjectColumnService extends GenericCrudService<
        ProjectColumnDto,
        ProjectColumnCreateDto,
        ProjectColumnUpdateDto,
        GenericCriteria,
        Long
        > {
}
