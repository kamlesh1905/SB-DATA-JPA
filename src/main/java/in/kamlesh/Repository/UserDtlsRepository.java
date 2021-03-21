package in.kamlesh.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.kamlesh.Entity.UserDtls;

@Repository
public interface UserDtlsRepository extends CrudRepository<UserDtls,Integer> {

public UserDtls findByUsername(String uname);

public List<UserDtls> findByUserAge(Integer age);

public List<UserDtls> findByUserAgeAndUserCount(Integer Age , String Country);

@Query("from UserDtls where userEmail=:email")
public UserDtls getUser(String email);

	
}
