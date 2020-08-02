package pl.sda.ex24;

public class Basket {
    int counter = 0;
    public void addToBasket(){
        try {
            if (counter == 10) {
                throw new BasketFullExeption();
            }
            counter++;
        } catch (BasketFullExeption e) {
            System.out.println("Basket is full");
        }
    }

    public void removeToBasket() throws BasketEmptyExeption{ //przerzucamy wyjątek do góry
        if(counter==0) {
            throw new BasketEmptyExeption();
        }
        counter++;
    }
}
