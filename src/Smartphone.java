public class Smartphone extends Phone implements Camera, Clock {
    public Smartphone(String make, String model) {
        super(make, model);



    }

    @Override
    public void photograph() {
        System.out.println("A photo is being taken");

    }
    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");

    }
}



