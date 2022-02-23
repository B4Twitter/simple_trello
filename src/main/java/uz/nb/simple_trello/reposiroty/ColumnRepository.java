package uz.nb.simple_trello.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nb.simple_trello.entity.column.Column;

public interface ColumnRepository extends JpaRepository<Column, Long>, AbstractRepository{
}
