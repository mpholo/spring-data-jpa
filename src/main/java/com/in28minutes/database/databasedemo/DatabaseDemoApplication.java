package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;


	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

    	logger.info("All users -> {}",personJdbcDao.findAll());
		logger.info("User id 10001 -> {}",personJdbcDao.findById(10001));
		logger.info("Deleting 10001 -> No of rows Deleted {}",personJdbcDao.deleteById(10001));

		logger.info("Inserting 10004 ->  {}",personJdbcDao.insert(new Person(10004,"Bohlokwa","Khuma", LocalDateTime.now())));

		logger.info("Updating 10003 ->  {}",personJdbcDao.update(new Person(10003,"Nyakallo","Gauteng", LocalDateTime.now())));



	}
}
