package in.kamlesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kamlesh.Entity.UserDtls;
import in.kamlesh.Repository.UserDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
    ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
    
    UserDtlsRepository dtlsRepository = context.getBean(UserDtlsRepository.class);
    
    System.out.println(dtlsRepository.getClass().getName());
    
    UserDtls user = new UserDtls();
    user.setUserId(2);
    user.setUsername("Ganesh");
    user.setUserEmail("G@gmail.com");
    user.setUserAge(27);
    user.setUserCount("USA");
    
    dtlsRepository.save(user);
    
    System.out.println("Record Saved");
    
	}

}
