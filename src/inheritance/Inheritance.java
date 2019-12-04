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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal cat = new Animal("Cat",4,50);
      cat.play();
      Animal elephant = new Animal("Elephant",4,10);
      elephant.play();
      Dog dog = new Dog("Dog",4,50);
      dog.play(); // inheritance
      dog.woof();
    }
    
}
