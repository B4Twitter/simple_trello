package uz.nb.simple_trello.dto.auth;


import uz.nb.simple_trello.dto.GenericDto;

public class AuthUserDto extends GenericDto {
    private String username;
    private String  phoneNumber;
    private String  email;
    private boolean blocked;
}
