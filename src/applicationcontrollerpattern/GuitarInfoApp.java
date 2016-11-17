package applicationcontrollerpattern;

import static java.lang.System.in;
import java.util.Scanner;

public class GuitarInfoApp {

   
    public static void main(String[] args) {
        ApplicationControllerPatternGuitar controller = new ApplicationControllerPatternGuitar();
        
        String name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the name of a guitar company"
                         + " (fender, gibson, prs, or rickenbacker): ");
        name = input.nextLine();
        
        System.out.println("Here is some info on: "+name);
        controller.handleCommand(name);
        
    }
    
}
