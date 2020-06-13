package constructors;

public class VipCostumers {
    /*
   Create a new class VipCustomer
   it should have 3 fields name, credit limit, and email address.
   create 3 constructors
   1st constructor empty should call the constructor with 3 parameters with default values
   2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
   3rd constructor should save all fields.
   create getters only for this using code generation of intellij as setters wont be needed test and confirm it works.
     */
    private String name;
    private long creditLimit;
    private String emailAddress;
    public VipCostumers(){
        this("default Name", 500000,"defaultname@email.com");
    }
    public VipCostumers(String name, long creditLimit){
        this("Default Name",50000,"default@email.com");

    }
    public VipCostumers(String name, long creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public static void main(String[] args) {
        VipCostumers vip1=new VipCostumers();
        vip1.name="Aras Efe YILDIRIM";
        vip1.emailAddress="aras_efe@gmail.com";
        System.out.println(vip1.creditLimit);
        System.out.println(vip1.emailAddress);
        System.out.println(vip1.name);
        VipCostumers vip2=new VipCostumers("Tulpar Ege YILDIRIM",90000,"tulpar_ege@gmail.com");
        System.out.println(vip2.creditLimit);
        System.out.println(vip2.emailAddress);
        System.out.println(vip2.name);


    }
}
