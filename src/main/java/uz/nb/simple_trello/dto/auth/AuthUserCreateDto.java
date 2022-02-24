package uz.nb.simple_trello.dto.auth;

import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.base.Dto;

@Getter
@Setter
public class AuthUserCreateDto implements Dto {
    private String username;
    private String password;
    private String email;
    private String conPassword;
    private Long role;

}
