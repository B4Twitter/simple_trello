package uz.nb.simple_trello.dto.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.base.GenericDto;


@Setter
@Getter
public class ProjectDto extends GenericDto {
    private String name;
    private String description;
    private Long organizationId;
    private boolean closed;

    @Builder(builderMethodName = "childBuilder")
    public ProjectDto(Long id, String name, Long organizationId, boolean closed, String description) {
        super(id);
        this.name = name;
        this.organizationId = organizationId;
        this.closed = closed;
        this.description = description;
    }
}
