package sample.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sskim
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * select * from product where selling_status in('','')
     * @param sellingTypes
     * @return
     */
    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingTypes);
}
