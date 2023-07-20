package sample.cafekiosk.spring.domain.orderproduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sskim
 */
@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
