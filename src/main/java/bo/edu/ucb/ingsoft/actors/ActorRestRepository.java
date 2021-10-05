package bo.edu.ucb.ingsoft.actors;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "actors", path = "act")
public interface ActorRestRepository extends PagingAndSortingRepository<Actor, Integer>{
    List<Actor> findByName(@Param("first_name") String first_name);
}
