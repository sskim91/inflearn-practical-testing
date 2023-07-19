package sample.cafekiosk.spring.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sskim
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}