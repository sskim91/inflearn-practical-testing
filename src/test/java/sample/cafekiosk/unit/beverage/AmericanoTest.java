package sample.cafekiosk.unit.beverage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author sskim
 */
class AmericanoTest {

    @Test
    void getName() throws Exception {

        Americano americano = new Americano();
        assertEquals(americano.getName(), "아메리카노");
        Assertions.assertThat(americano.getName()).isEqualTo("아메리카노");

    }

}