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
public class Animal { // parent
    public int  x =5 ; 
    protected String nameOfAnimal ; //protected to get child ability to see animal private attributes
    protected int numberOfLeg ; 
    protected int speed ;
    public Animal(String nameOfAnimal, int numberOfLeg , int speed){
    this.nameOfAnimal = nameOfAnimal ;
    this.numberOfLeg = numberOfLeg ;
    this.speed = speed ; 
    }
    public void play(){
    System.out.println("The Animal "+nameOfAnimal+" Is Playing Now With Speed "+speed+" And Have "+numberOfLeg+" Legs ");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
