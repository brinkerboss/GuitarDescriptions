/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;

/**
 *
 * @author brinkerboss
 */
public class Rickenbacker implements GuitarHandler{

    @Override
    public void execute(String desc) {
        System.out.println(desc);
    }
    
}
