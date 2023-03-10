package estudo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import estudo.model.CustomerOrder;
import estudo.model.Employee;
import estudo.model.Status;
import estudo.repository.EmployeeRepository;
import estudo.repository.OrderRepository;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

		return args -> {
			log.info("Preloading " + employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar")));
			log.info("Preloading " + employeeRepository.save(new Employee("Frodo", "Baggins", "thief")));

			employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

			orderRepository.save(new CustomerOrder("One Ring", Status.COMPLETED));
			orderRepository.save(new CustomerOrder("Two Ring", Status.IN_PROGRESS));

			orderRepository.findAll().forEach(order -> {
				log.info("Preloaded " + order);
			});

		};
	}
}