package uz.nb.simple_trello.dto.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.nb.simple_trello.dto.GenericDto;
import uz.nb.simple_trello.entity.organization.Organization;


@Getter
@Setter
@NoArgsConstructor
public class ProjectUpdateDto extends GenericDto {
    private String name;
    private Organization organization;
    private String email;
    private Boolean closed;
}
