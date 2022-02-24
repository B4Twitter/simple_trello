package uz.nb.simple_trello.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.dto.Dto;
import uz.pdp.entity.auth.AuthRole;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserCreateDto implements Dto {
    private String username;
    private String password;
    private String  phoneNumber;
    private String  email;
    private AuthRole role;
    private boolean blocked;
}
