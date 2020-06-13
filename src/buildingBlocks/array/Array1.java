package buildingBlocks.array;


public class Array1 {
    public static void main(String[] args) {
        int[]myIntArray=new int[10];

//        for(int i=0;i<myIntArray.length;i++){
//            myIntArray[i]=(i+2)+i;
//        }
        for(int i=0;i<myIntArray.length;i++){
            myIntArray[i]=i*2;
            System.out.println("Element "+i+", value is "+myIntArray[i]);
        }
    }

}
