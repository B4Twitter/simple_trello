package uz.nb.simple_trello.dto.organization;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.GenericDto;

@Getter
@Setter
public class OrganizationDto extends GenericDto {

    private String name;
    private String logo;
    private String code;
    private String email;
    private String address;
    private Long owner;


    @Builder(builderMethodName = "childBuilder")
    public OrganizationDto(Long id, String name, String code, String address, String email, Long owner) {
        super(id);
        this.name = name;
        this.code = code;
        this.email = email;
        this.address = address;
    }
}

