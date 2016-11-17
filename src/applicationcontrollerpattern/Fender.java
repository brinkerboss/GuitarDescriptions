package applicationcontrollerpattern;


public class Fender implements GuitarHandler {

    @Override
    public void execute(String desc) {
        System.out.println(desc);
    }
    
}
