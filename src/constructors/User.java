package constructors;

public class User {
    int id;
    String name;
    int salary;

   private User(int id, String name) {
       this(id,name,2300);
    }

    private User(int id, String name, int salary) {
       this.id=id;
       this.name=name;
       this.salary = salary;
    }

    public static void main(String[] args) {
       User user=new User(1001,"Tulpar");

        System.out.println("Name: " + user.name+", and salary: "+user.salary);
    }
}
