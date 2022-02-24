package uz.nb.simple_trello.services.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.nb.simple_trello.config.security.UserDetails;
import uz.nb.simple_trello.config.security.UserDetailsService;
import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.auth.AuthUserCreateDto;
import uz.nb.simple_trello.dto.auth.AuthUserDto;
import uz.nb.simple_trello.dto.auth.AuthUserUpdateDto;
import uz.nb.simple_trello.dto.auth.LoginDto;
import uz.nb.simple_trello.entity.auth.AuthRole;
import uz.nb.simple_trello.entity.auth.AuthUser;
import uz.nb.simple_trello.entity.base.AuditAwareImpl;
import uz.nb.simple_trello.mapper.auth.AuthUserMapper;
import uz.nb.simple_trello.reposiroty.auth.AuthRoleRepository;
import uz.nb.simple_trello.reposiroty.auth.AuthUserRepository;
import uz.nb.simple_trello.services.base.AbstractService;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.auth.AuthUserValidator;

import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthUserServiceImpl extends
        AbstractService<AuthUserRepository, AuthUserMapper, AuthUserValidator>
        implements AuthUserService {

    @Autowired
    private final PasswordEncoder encoder;

    @Autowired
    private final AuthRoleRepository authRoleRepository;

    @Autowired
    UserDetailsService userDetailsService;

    protected AuthUserServiceImpl(AuthUserRepository repository,
                                  AuthUserMapper mapper,
                                  AuthUserValidator validator,
                                  BaseUtils baseUtils, PasswordEncoder encoder, AuthRoleRepository authRoleRepository) {
        super(repository, mapper, validator, baseUtils);
        this.encoder = encoder;
        this.authRoleRepository = authRoleRepository;
    }

    @Override
    public Long create(AuthUserCreateDto createDto) {
        AuthUser user = mapper.fromCreateDto(createDto);
        user.setPassword(encoder.encode(createDto.getPassword()));
        user.setOrganizationId(1L);

        user.setRole(authRoleRepository.getAuthRoleById(createDto.getRole()).get());
        user.setCreatedBy(new AuditAwareImpl().getCurrentAuditor().get());
        user.setCode(UUID.randomUUID());
        repository.save(user);
        return user.getId();
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(AuthUserUpdateDto updateDto) {
        return null;
    }


    @Override
    public List<AuthUserDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public AuthUserDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }


    @Override
    public void login(LoginDto dto) {
      Optional<AuthUser> authUser = repository.findAuthUserByUsername(dto.getUsername());
        if (authUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        if (!encoder.matches(dto.getPassword(), authUser.get().getPassword())) {
            throw new UsernameNotFoundException("User not found");
        }
        userDetailsService.loadUserByUsername(dto.getUsername());
    }
}
