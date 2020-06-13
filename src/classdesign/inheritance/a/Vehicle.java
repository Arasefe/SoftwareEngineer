package classdesign.inheritance.a;

public class Vehicle {              //Base class
    /*
   Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
   Finally, create another class, a specific type of Car that inherits from the Car class.
   You should be able to handle steering, changing gears, and moving (speed in other words).
   You will want to decide where to put the appropriate state and behaviours (fields and methods).
   As mentioned above, changing gears, increasing/decreasing speed should be included.
   For you specific type of vehicle you will want to add something specific for that type of car.
     */

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;
    public Vehicle (String name, String size){
        this.name=name;
        this.size=size;

        this.currentVelocity=0;
        this.currentDirection=0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection +" degrees");
    }
    public void move (int velocity, int direction){
        this.currentDirection=direction;
        this.currentVelocity=velocity;
        System.out.println("Vehicle.move(): Moving at "+ currentVelocity+ "is direction "+currentDirection);
    }
    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
    public int getCurrentVelocity(){
        return currentVelocity;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSize(String size){
        this.size=size;
    }
    public void setCurrentVelocity(int currentDirection){
        this.currentVelocity=currentVelocity;
    }
    public void setCurrentDirection(int currentDirection){
        this.currentDirection=currentDirection;
    }
    public void stop(){
        this.currentDirection=0;
    }
}
