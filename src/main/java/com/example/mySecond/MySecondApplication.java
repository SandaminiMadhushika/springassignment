package com.example.mySecond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.util.Date;

@SpringBootApplication
@EnableJpaRepositories("com.example.mySecond")
@EntityScan("com.example.mySecond")
public class MySecondApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MySecondApplication.class, args);
	}
	@Autowired
	DataSource dataSource;

	@Autowired
	Systemrepository systemRepository;



@Override
	public void run(String... args) throws Exception {

		System.out.println("Our DataSource is = " + dataSource);
	//systemRepository.findAllActiveUsers();
//	Employee e=new Employee("sanda",new Date(2015-02-02));
//	systemRepository.save(e);


		Iterable<Employee> systemlist = systemRepository.findAll();

		for(Employee systemmodel:systemlist){

			System.out.println("Here is a system: " + systemmodel.toString());

		}

	}


}
