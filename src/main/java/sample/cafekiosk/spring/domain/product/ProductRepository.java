package sample.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    List<Product> findAllByProductNumberIn(List<String> productNumbers);

    @Query(value = "select p.product_number from Product p order by p.id desc limit 1", nativeQuery = true)
    String findLatestProductNumber();
}
