package test2;

import java.util.ArrayList;

public class q1 {

    public static void printList(ArrayList<String> list){
        System.out.print(list);
        System.out.println();
    }
    public static void main(String[] args) {

        //creaete a list
        ArrayList<String> car_models = new ArrayList<>();
        car_models.add("Mercedes-Benz");
        car_models.add("BMW");
        car_models.add("Audi");
        car_models.add("Lexus");
        car_models.add("Porshe");
        car_models.add( "Ferrari");
        car_models.add("Maserati");
        // print the original list
        printList(car_models);

        // remove first and last car and print
        car_models.remove(0);
        car_models.remove(car_models.size()-1);
        printList(car_models);

        // add a different car at the end and print
        car_models.add("Tesla");
        printList(car_models);

        // add another at index 1 and print
        car_models.add(1, "Rolls-Royce");
        printList(car_models);

        // move last one to the middle of the llist and print
        int middle_idx = car_models.size() / 2;
        String last = car_models.get(car_models.size() - 1);
        car_models.add(middle_idx, last);
        car_models.remove(car_models.size() - 1);
        printList(car_models);
    }
}
