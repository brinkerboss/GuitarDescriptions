package applicationcontrollerpattern;


public class PRS implements GuitarHandler {

    @Override
    public void execute(String desc) {
        System.out.println(desc);
    }
    
}
