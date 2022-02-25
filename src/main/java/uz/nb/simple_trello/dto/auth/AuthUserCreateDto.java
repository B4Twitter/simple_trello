package uz.nb.simple_trello.dto.auth;

import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.base.Dto;
import uz.nb.simple_trello.entity.auth.AuthRole;
import uz.nb.simple_trello.entity.auth.AuthUser;

import javax.management.relation.Role;

@Getter
@Setter
public class AuthUserCreateDto implements Dto {
    private String username;
    private String password;
    private String email;
    private String conPassword;
    private AuthRole role;
    private Long roleId;

}
