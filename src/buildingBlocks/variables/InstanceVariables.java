package buildingBlocks.variables;

public class InstanceVariables {
    int count;
    public void InstanceVariables(){
        count=4;
        System.out.println(count);
    }

    public static void main(String[] args) {
        InstanceVariables iv=new InstanceVariables();
        System.out.println(iv.count);               // 0

        iv.InstanceVariables();                     // 4
    }
}
