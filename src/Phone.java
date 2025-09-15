
public class Phone {

    private String make;
    private String model;

    public Phone(String make, String model) {
        this.make = make;
        this.model =model;
    }



    public void call (String number){
        System.out.println("The number " + number + " is called.");
    }


}
