package uz.nb.simple_trello.services.task;

import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.task.TaskCreateDto;
import uz.nb.simple_trello.dto.task.TaskDto;
import uz.nb.simple_trello.dto.task.TaskUpdateDto;
import uz.nb.simple_trello.services.base.GenericCrudService;
public interface TaskService extends GenericCrudService<
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long
        > {
}
