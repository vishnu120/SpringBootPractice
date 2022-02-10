package com.jps.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jps.test.dao.UserRepository;
import com.jps.test.entities.User;

@SpringBootApplication
public class FirstStSbootWithJpaApplication {

	public static void main(String[] args) {
	    ApplicationContext ac =	SpringApplication.run(FirstStSbootWithJpaApplication.class, args);
	    UserRepository userrepo =ac.getBean(UserRepository.class);
		/*
		 * User user = new User(); user.setName("Vishnu"); user.setCity("Noida");
		 * user.setStatus("I am java programmer");
		 * 
		 * User user1 = userrepo.save(user); //System.out.println(user1); //update the
		 * name by id Optional<User> optional = userrepo.findById(1); User use1 =
		 * optional.get(); System.out.println(use1);
		 * use1.setName("Vishnu Pandey updated"); User use = userrepo.save(use1);
		 * System.out.println(use);
		 */
	    //getting the data
	    Iterable<User> itr = userrepo.findAll();
	    itr.forEach(t -> System.out.println(t));
	    // delete the given entity
	    //userrepo.deleteById(3);
	    List<User> result = userrepo.findByName("Vishnu Pandey updated");
	    result.stream().forEach(user -> System.out.println(user));
	    
	}

}
