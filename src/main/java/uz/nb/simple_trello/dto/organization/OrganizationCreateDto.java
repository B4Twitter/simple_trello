package uz.nb.simple_trello.dto.organization;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
import uz.nb.simple_trello.dto.Dto;

@Getter
@Setter
@Builder
public class OrganizationCreateDto implements Dto {
    private String name;
    private String code;
    private String email;

    public OrganizationCreateDto(String name, String code, String email) {
        this.name = name;
        this.code = code;
        this.email = email;
    }
}
