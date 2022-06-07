package lab53.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab53.bed.Bed;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface bRepo extends JpaRepository<Bed, Integer> {

}
