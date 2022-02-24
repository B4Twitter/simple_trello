package uz.nb.simple_trello.services.auth;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.auth.AuthUserCreateDto;
import uz.nb.simple_trello.dto.auth.AuthUserDto;
import uz.nb.simple_trello.dto.auth.AuthUserUpdateDto;
import uz.nb.simple_trello.entity.auth.AuthUser;
import uz.nb.simple_trello.entity.base.AuditAwareImpl;
import uz.nb.simple_trello.mapper.auth.AuthUserMapper;
import uz.nb.simple_trello.reposiroty.auth.AuthRoleRepository;
import uz.nb.simple_trello.reposiroty.auth.AuthUserRepository;
import uz.nb.simple_trello.services.base.AbstractService;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.auth.AuthUserValidator;

import java.util.List;

@Service
public class AuthUserServiceImpl extends
        AbstractService<AuthUserRepository, AuthUserMapper, AuthUserValidator>
        implements AuthUserService {

    private final PasswordEncoder encoder;
    private final AuthRoleRepository authRoleRepository;

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
        user.setRole(authRoleRepository.getAuthRoleById(1L).get());
        user.setCreatedBy(new AuditAwareImpl().getCurrentAuditor().get());
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

}
