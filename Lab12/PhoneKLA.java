//Kyi Lei Aye
package Lab12;

public class PhoneKLA {

    // private variables
    private String company;
    private String model;
    private int year;
    private String storage;
    private String color;

    // Constructors
    PhoneKLA(String company, String model, int year, String storage, String color){
        this.company = company;
        this.model = model;
        this.year = year;
        this.storage = storage;
        this.color = color;
    }

    public void set_company(String company){
        this.company = company;
    }

    public void set_model(String model){
        this.model = model;
    }

    public void set_year(int year){
        this.year = year;
    }

    public void set_storage(String storage){
        this.storage = storage;
    }

    public void set_color(String color){
        this.color = color;
    }

    public String get_company(){
        return company;
    }

    public String get_model(){
        return model;
    }

    public int get_year(){
        return year;
    }

    public String get_storage(){
        return storage;
    }

    public String get_color(){
        return color;
    }

}
class Main{

    public static void main(String[] args) {
        // creating myphone object
        PhoneKLA phone = new PhoneKLA("Samsaung", "S8", 2017, "64GB", "Midnight Black");

        // get and display the myphone using getter method
        System.out.println("Old Phone Details");
        System.out.println("Manufacturer: " + phone.get_company());
        System.out.println("Model: " + phone.get_model());
        System.out.println("Year: " + phone.get_year());
        System.out.println("Storage: " + phone.get_storage());
        System.out.println("Color: " + phone.get_color());

        System.out.println();

        // set new values for myphone using setter method
        phone.set_company("Apple");
        phone.set_model("iPhone 17");
        phone.set_year(2025);
        phone.set_storage("256GB");
        phone.set_color("Deep Purple");

        // get and display the updated myphone details using getter method
        System.out.println("Updated Phone Details");
        System.out.println("Manufacturer: " + phone.get_company());
        System.out.println("Model: " + phone.get_model());
        System.out.println("Year: " + phone.get_year());
        System.out.println("Storage: " + phone.get_storage());
        System.out.println("Color: " + phone.get_color());

        System.out.println("-------------------------");

    }

}
