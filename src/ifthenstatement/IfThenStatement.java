package ifthenstatement;

public class IfThenStatement {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }
        else if(bigCount*5+smallCount==goal){
            return true;
        }
        else if(smallCount==0&&bigCount*5>goal){
            return false;
        }
        else if (bigCount==0&&smallCount>goal){
            return true;
        }else if(bigCount*5+smallCount>goal){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(5,3,24));
    }
}
