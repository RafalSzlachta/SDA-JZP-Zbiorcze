package pl.sda.ex15;


public enum CarEnum {
    FERRARI(100.0d, true),
    BMW(80.0d, true),
    OPEL(60.0d, false);

    private Double velocity;
    private boolean premium;

    CarEnum(double velocity, boolean premium) {
        this.velocity = velocity;
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public boolean isFasterThan(CarEnum car){
        return this.velocity.compareTo(car.velocity)>0;
    }


}
