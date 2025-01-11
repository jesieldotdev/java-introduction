import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // auto type
        // var
        var unknown = "teste";

        // strings
        // char
        String name = "Jesiel";

        // numbers
        // byte, short, int, long
        byte age = 24;

        //floating point
        // double, float
        double height = 1.80;

        //print
        System.out.print("Hello world!");
        System.out.printf("My name is %s. ", name);
        System.out.printf("I'm %s years old.", age);

        //condition
        // if, else, else if
        if (age > 18) {
            System.out.println(" Older");
        } else {
            System.out.println(" Younger");
        }



    }

}