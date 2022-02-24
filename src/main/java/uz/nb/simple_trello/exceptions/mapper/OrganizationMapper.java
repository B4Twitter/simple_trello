package uz.nb.simple_trello.exceptions.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.nb.simple_trello.dto.organization.OrganizationCreateDto;
import uz.nb.simple_trello.dto.organization.OrganizationDto;
import uz.nb.simple_trello.dto.organization.OrganizationUpdateDto;
import uz.nb.simple_trello.entity.organization.Organization;

@Component

@Mapper(componentModel = "spring")
public interface OrganizationMapper extends BaseMapper<
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto> {
}
