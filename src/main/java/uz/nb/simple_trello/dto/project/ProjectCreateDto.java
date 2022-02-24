package uz.nb.simple_trello.dto.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.Dto;
import uz.nb.simple_trello.entity.organization.Organization;

import java.time.Instant;

@Getter
@Setter
@Builder
public class ProjectCreateDto implements Dto {
    private String name;
    private String tzPath;
    private Organization organization;
    private String email;
    private Boolean closed;

    public ProjectCreateDto(String name, String tzPath, Organization organization, String email, Boolean closed) {
        this.name = name;
        this.tzPath = tzPath;
        this.organization = organization;
        this.email = email;
        this.closed = closed;

    }
}
