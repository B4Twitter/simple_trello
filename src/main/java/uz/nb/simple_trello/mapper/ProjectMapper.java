package uz.nb.simple_trello.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.nb.simple_trello.dto.project.ProjectCreateDto;
import uz.nb.simple_trello.dto.project.ProjectDto;
import uz.nb.simple_trello.dto.project.ProjectUpdateDto;
import uz.nb.simple_trello.entity.project.Project;


@Component
@Mapper(componentModel = "spring")
public interface ProjectMapper extends BaseMapper<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto> {
}
