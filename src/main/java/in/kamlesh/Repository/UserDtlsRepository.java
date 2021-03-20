package in.kamlesh.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.kamlesh.Entity.UserDtls;

@Repository
public interface UserDtlsRepository extends CrudRepository<UserDtls,Integer> {


	
}
