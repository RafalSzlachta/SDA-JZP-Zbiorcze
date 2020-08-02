package pl.sda.ex24;

public class Basket {
    int counter = 0;
    public void addToBasket(){
        if(counter==10) {
            throw new BasketFullExeption();
        }
        counter++;
    }

    public void removeToBasket(){
        if(counter==0) {
            throw new BasketEmptyExeption();
        }
        counter++;
    }
}
