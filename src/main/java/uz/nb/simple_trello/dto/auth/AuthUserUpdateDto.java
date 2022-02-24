package uz.nb.simple_trello.dto.auth;

import uz.pdp.dto.GenericDto;

public class AuthUserUpdateDto extends GenericDto {
    private String username;
    private String  phoneNumber;
    private String  email;
    private boolean blocked;
}
