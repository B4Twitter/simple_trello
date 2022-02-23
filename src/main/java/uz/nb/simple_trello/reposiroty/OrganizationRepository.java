package uz.nb.simple_trello.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.organization.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {

}
