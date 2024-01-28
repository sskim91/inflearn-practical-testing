package sample.cafekiosk.spring.domain.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sskim
 */
class ProductTypeTest {

    @DisplayName("상품 타입이 재고 관련 타입인지를 체크한다.")
    @Test
    void containsStockType() throws Exception {
        //given
        final ProductType givenType = ProductType.HANDMADE;

        //when
        final boolean result = ProductType.containsStockType(givenType);

        //then
        assertThat(result).isFalse();

    }

    @DisplayName("상품 타입이 재고 관련 타입인지를 체크한다.")
    @Test
    void containsStockType2() throws Exception {
        //given
        final ProductType givenType = ProductType.BOTTLE;

        //when
        final boolean result = ProductType.containsStockType(givenType);

        //then
        assertThat(result).isTrue();

    }

}