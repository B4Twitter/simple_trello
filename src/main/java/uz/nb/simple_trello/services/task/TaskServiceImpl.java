package uz.nb.simple_trello.services.task;

import org.springframework.stereotype.Service;
import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.task.TaskCreateDto;
import uz.nb.simple_trello.dto.task.TaskDto;
import uz.nb.simple_trello.dto.task.TaskUpdateDto;
import uz.nb.simple_trello.mapper.task.TaskMapper;
import uz.nb.simple_trello.reposiroty.task.TaskRepository;
import uz.nb.simple_trello.services.base.AbstractService;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.task.TaskValidator;

import java.util.List;

/**
 * @Author Aziza Tojiboyeva
 */
@Service
public class TaskServiceImpl extends AbstractService<
        TaskRepository,
        TaskMapper,
        TaskValidator
        >
        implements TaskService {


    protected TaskServiceImpl(TaskRepository repository, TaskMapper mapper, TaskValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(TaskCreateDto createDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(TaskUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<TaskDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public TaskDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
