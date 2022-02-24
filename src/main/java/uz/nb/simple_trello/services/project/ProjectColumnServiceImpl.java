package uz.nb.simple_trello.services.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.project.ProjectColumnCreateDto;
import uz.nb.simple_trello.dto.project.ProjectColumnDto;
import uz.nb.simple_trello.dto.project.ProjectColumnUpdateDto;
import uz.nb.simple_trello.mapper.project.ProjectColumnMapper;
import uz.nb.simple_trello.reposiroty.project.ProjectColumnRepository;
import uz.nb.simple_trello.services.base.AbstractService;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.project.ProjectColumnValidator;

import java.util.List;

/**
 * @Author Aziza Tojiboyeva
 */
@Service
public class ProjectColumnServiceImpl extends AbstractService<
        ProjectColumnRepository,
        ProjectColumnMapper,
        ProjectColumnValidator
        > implements ProjectColumnService{

    @Autowired
    protected ProjectColumnServiceImpl(
            ProjectColumnRepository repository,
            ProjectColumnMapper mapper,
            ProjectColumnValidator validator,
            BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }


    @Override
    public Long create(ProjectColumnCreateDto createDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(ProjectColumnUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<ProjectColumnDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ProjectColumnDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
