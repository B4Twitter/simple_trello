package uz.nb.simple_trello.services.task;


import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.task.TaskCreateDto;
import uz.nb.simple_trello.dto.task.TaskDto;
import uz.nb.simple_trello.dto.task.TaskUpdateDto;
import uz.nb.simple_trello.entity.task.Task;
import uz.nb.simple_trello.services.GenericCrudService;

public interface TaskService extends GenericCrudService<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long > {
}
