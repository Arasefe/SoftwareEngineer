package classdesign.inheritance.a;

public class Mercedes extends Car {
    private int roadServiceMonths;

    public Mercedes(int roadServiceMonths) {
        super("GLK 350", "4WD",5,5,6,false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity=getCurrentVelocity()+rate;
        if (newVelocity==0){
            stop();
        }else if(newVelocity>10 &&newVelocity<=20){
            changeGear(2);
        }else if(newVelocity>20&&newVelocity<=30){
            changeGear(3);
        }else if(newVelocity>40&&newVelocity<=40){
            changeGear(4);
        }else if(newVelocity>50&&newVelocity<=70){
            changeGear(5);
        }else{
            changeGear(6);
        }if(newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
