package uz.nb.simple_trello.config.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import uz.nb.simple_trello.entity.auth.User;
import uz.nb.simple_trello.entity.auth.UserRole;

import java.util.*;

@Getter
@Setter
public class UserDetails implements org.springframework.security.core.userdetails.UserDetails {

    @Getter
    private Long id;
    private String username;
    private String password;
    private UUID code;
    private boolean blocked;
    private boolean active;
    private Set<GrantedAuthority> authorities;


    public UserDetails(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        processAuthorities(user);
    }

    private void processAuthorities(User user) {
        authorities = new HashSet<>();
        UserRole role = user.getRole();

        if (Objects.isNull(role)) return;
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role.name()));
    }

    @Override

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !this.blocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.active;
    }
}
