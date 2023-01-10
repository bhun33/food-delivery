package food.delivery.infra;

import food.delivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="menuSelects", path="menuSelects")
public interface MenuSelectRepository extends PagingAndSortingRepository<MenuSelect, Long> {

    

    
}
