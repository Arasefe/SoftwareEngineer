package numbers;

public class AreaCalculator {

    public static double area(double radius){
        if(radius<0){
            return -1.0;

        }
        double areaCircle=radius*radius*Math.PI;
        return areaCircle;

    }
    public static double area(double x, double y){
        if(x<0||y<0){
            return -1;
        }
        double areaRectangle=x*y;
        return areaRectangle;
    }

    public static void main(String[] args) {
        System.out.println(area(23,12));
    }
}
