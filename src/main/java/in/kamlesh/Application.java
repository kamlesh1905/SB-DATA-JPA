package in.kamlesh;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kamlesh.Entity.UserDtls;
import in.kamlesh.Repository.UserDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserDtlsRepository dtlsRepository = context.getBean(UserDtlsRepository.class);

		System.out.println(dtlsRepository.getClass().getName());

		/*
		 * UserDtls user = new UserDtls();
		 * 
		 * UserDtls user1 = new UserDtls();
		 * 
		 * UserDtls user2 = new UserDtls();
		 * 
		 * UserDtls user3 = new UserDtls();
		 */

		/*
		 * user.setUserId(6); user.setUsername("Thabi");
		 * user.setUserEmail("T@gmail.com"); user.setUserAge(28);
		 * user.setUserCount("USA");
		 */

		/*
		 * user1.setUserId(2); user1.setUsername("Rahesh");
		 * user1.setUserEmail("rahes@gmail.com"); user1.setUserAge(27);
		 * user1.setUserCount("India");
		 * 
		 * user2.setUserId(3); user2.setUsername("Kumar");
		 * user2.setUserEmail("Kum@gmail.com"); user2.setUserAge(27);
		 * user2.setUserCount("USA");
		 * 
		 * user3.setUserId(4); user3.setUsername("Rahesh");
		 * user3.setUserEmail("rahes@gmail.com"); user3.setUserAge(27);
		 * user3.setUserCount("USA");
		 */

		// save

		/*
		 * dtlsRepository.save(user);
		 * 
		 * System.out.println("Single Record Saved");
		 */

		/*
		 * List<UserDtls> list = new ArrayList<>(); list.add(user); list.add(user1);
		 * list.add(user2); list.add(user3);
		 */

		// saveall

		/*
		 * dtlsRepository.saveAll(list);
		 * 
		 * System.out.println("All Record Saved");
		 */

		/*
		 * Optional<UserDtls> findById = dtlsRepository.findById(1);
		 * 
		 * if(findById.isPresent()) { UserDtls userdtls = findById.get();
		 * 
		 * System.out.println (userdtls);
		 * 
		 * }
		 */

		/*
		 * Iterable<UserDtls> findAll= dtlsRepository.findAll();
		 * 
		 * findAll.forEach(user5 -> {
		 * 
		 * System.out.println(user2); });
		 * 
		 * }
		 */

		/*
		 * boolean existsById = dtlsRepository.existsById(1);
		 * 
		 * System.out.println("Record exists " + existsById);
		 */

		/*
		 * long count = dtlsRepository.count(); System.out.println("Total Count " +
		 * count);
		 */

		/*
		 * UserDtls userval = dtlsRepository.findByUsername("Karan");
		 * 
		 * System.out.println(userval);
		 * 
		 * List<UserDtls> users = dtlsRepository.findByUserAge(27); users.forEach(user
		 * ->{ System.out.println(user); });
		 */

		List<UserDtls> users101 = dtlsRepository.findByUserAgeAndUserCount(27, "USA");
		users101.forEach(user -> {
			System.out.println(user);
		});
		
		UserDtls c=dtlsRepository.getUser("Kum@gmail.com");
		System.out.println(c);

	}

}
