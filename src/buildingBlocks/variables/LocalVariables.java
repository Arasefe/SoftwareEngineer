package buildingBlocks.variables;

public class LocalVariables {
     private int a;
     private String name;

     public LocalVariables(int a, String name){
         this.a=a;
         this.name=name;
     }

    public static final void main(String[] args) {
        int a=34;
        String name;
        name="Aras";
        char c=12;
        boolean b=false;
        System.out.println(a+name+c+b);

    }


}
