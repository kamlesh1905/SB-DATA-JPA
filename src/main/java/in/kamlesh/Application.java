package in.kamlesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    
    UserDtls user1 = new UserDtls();
    
    user.setUserId(4);
    user.setUsername("Kumar");
    user.setUserEmail("Kum@gmail.com");
    user.setUserAge(27);
    user.setUserCount("USA");
    
    user1.setUserId(5);
    user1.setUsername("Rahesh");
    user1.setUserEmail("rahes@gmail.com");
    user1.setUserAge(27);
    user1.setUserCount("USA");
    
    // save
    
    // dtlsRepository.save(user);
    
    List<UserDtls> list = new ArrayList<>();
    list.add(user);
    list.add(user1);
    
    // saveall
    
    //dtlsRepository.saveAll(list);
    
    //System.out.println("All Record Saved");
    
    
    //Optional<UserDtls> findById = dtlsRepository.findById(1);
    
   // if(findById.isPresent())
   // {
   // 	UserDtls userdtls = findById.get();
    	
    //	 System.out.println (userdtls); 
    	 
    //}
     
    
    Iterable<UserDtls> findAll=dtlsRepository.findAll();
    findAll.forEach(user2 -> {
    	
    	System.out.println(user2);
    });
    
    
    
    
    
    
    
    
    
    
   
    
	}

}
