package estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudo.model.CustomerOrder;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {

}