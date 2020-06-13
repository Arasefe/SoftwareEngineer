package variables.instancevariables;

public class Dog {
    private String name;
    public Dog (String name){
        this.name=name;
    }
    public void printName(){
        System.out.println("name= "+ name);
    }
}
class Main{
    public static void main(String[] args) {
        Dog rex=new Dog("rex");
        rex.printName();
        Dog fluffy=new Dog("fluffy");
        fluffy.printName();
    }
}
