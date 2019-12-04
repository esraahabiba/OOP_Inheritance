/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author gt
 */
public class Dog extends Animal{ //child
  int x = 20 ;
    public Dog(String nameOfAnimal, int numberOfLeg, int speed) {
        super(nameOfAnimal, numberOfLeg, speed); // super to refer to parent attributes
    }
    
   
    public void woof(){
    System.out.println("Class Dog Woooooooooooofing"+ "My speed "+x+" My parent speed "+ super.x );
    }
}
