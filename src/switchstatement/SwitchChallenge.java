package switchstatement;

public class SwitchChallenge {
    public static void main(String[] args) {
        char switchValue='D';
        switch (switchValue){
            case 'A':
                System.out.println("Found char " + 'A');
                break;
            case 'B':
                System.out.println("Found char " + 'B');
                break;
            case 'C':
                System.out.println("Found char " + 'C');
                break;
            case 'D':
                System.out.println("Found char " + 'D');
                break;
            default:
                System.out.println("Not found any char character");
                break;
        }
    }
}
