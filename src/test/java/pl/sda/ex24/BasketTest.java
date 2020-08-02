package pl.sda.ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;


public class BasketTest {

    @Test
    public void shouldThrowBasketFullExeption(){
        Assertions.assertThrows(BasketFullExeption.class, () -> {
            Basket b = new Basket();
            b.addToBasket();//1
            b.addToBasket();//2
            b.addToBasket();//3
            b.addToBasket();//4
            b.addToBasket();//5
            b.addToBasket();//6
            b.addToBasket();//7
            b.addToBasket();//8
            b.addToBasket();//9
            b.addToBasket();//10
            b.addToBasket();//11
        });
    }

    @Test
    public void shouldThrowBasketEmptyExeption(){
        Basket b = new Basket();
        b.addToBasket();
        try {
            b.removeToBasket(); // 1
        } catch (BasketEmptyExeption e) {
            fail("There where .."); //dokońćż!!
        }

    }

    @Test
    public void shouldAcceptTenItems(){
            Basket b = new Basket();
            b.addToBasket();//1
            b.addToBasket();//2
            b.addToBasket();//3
            b.addToBasket();//4
            b.addToBasket();//5
            b.addToBasket();//6
            b.addToBasket();//7
            b.addToBasket();//8
            b.addToBasket();//9
            b.addToBasket();//10
    }
}
