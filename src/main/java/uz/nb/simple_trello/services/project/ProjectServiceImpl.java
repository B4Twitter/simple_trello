package uz.nb.simple_trello.services.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.project.ProjectCreateDto;
import uz.nb.simple_trello.dto.project.ProjectDto;
import uz.nb.simple_trello.dto.project.ProjectUpdateDto;
import uz.nb.simple_trello.entity.project.Project;
import uz.nb.simple_trello.mapper.project.ProjectMapper;
import uz.nb.simple_trello.reposiroty.project.ProjectRepository;
import uz.nb.simple_trello.services.base.AbstractService;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.project.ProjectValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class ProjectServiceImpl extends AbstractService<
        ProjectRepository,
        ProjectMapper,
        ProjectValidator> implements ProjectService {

    @Autowired
    protected ProjectServiceImpl(
            ProjectRepository repository,
            ProjectMapper mapper,
            ProjectValidator validator,
            BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ProjectCreateDto createDto) {
        Project project = mapper.fromCreateDto(createDto);
        project.setOrganizationId(1L);
        return repository.save(project).getId();
    }

    @Override
    public void delete(Long id) {
        Optional<Project> project = repository.findById(id);
        if (project.isEmpty()) {
            throw new RuntimeException("Pr not found");
        }
        repository.delete(project.get());
    }

    @Override
    public void update(ProjectUpdateDto updateDto) {
        Optional<Project> project = repository.findById(updateDto.getId());
        if (project.isEmpty()) {
            throw new RuntimeException("Project not found");
        }
        Project project1 = mapper.fromUpdateDto(updateDto);
        repository.save(project1);
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        List<Project> projects = repository.findAll();
        List<ProjectDto> projectsDto = new ArrayList<>();
        for (Project project : projects) {
            ProjectDto projectDto = mapper.toDto(project);
            projectsDto.add(projectDto);
        }
        return projectsDto;
    }

    @Override
    public ProjectDto get(Long id) {
        Project project = repository.getById(id);

        if (Objects.isNull(project)) {
            throw new RuntimeException("Project not found");
        }
        return mapper.toDto(project);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }


}