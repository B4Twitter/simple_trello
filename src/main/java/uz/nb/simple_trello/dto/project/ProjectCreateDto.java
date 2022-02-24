package uz.nb.simple_trello.dto.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
import uz.nb.simple_trello.dto.base.Dto;

@Setter
@Getter
@Builder
public class ProjectCreateDto implements Dto {
    private String name;
    private MultipartFile tz;

    public ProjectCreateDto(String name, MultipartFile tz) {
        this.name = name;
        this.tz = tz;
    }
}
