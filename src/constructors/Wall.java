package constructors;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(10.5,12.0);
    }
    public Wall(double width, double height){
        if(width<0 &&height>=0){
            width=0;
            this.height=height;
        }else if(height<0 && width>=0){
            height=0;
            this.width=width;
        }else{
            this.width=width;
            this.height=height;
        }
    }
    public void setWidth(double width){
        if(width<0){
            width=0.0;
        }else {
            this.width = width;
        }
    }
    public void setHeight( double height){
        if(height<0){
            height=0;
        }else{
            this.height=height;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Wall wall=new Wall();
        System.out.println(wall.width);
        System.out.println(wall.height);
        System.out.println(wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
    }
}