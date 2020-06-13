package numbers;

public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour<0){
                return -1;
            }
                return Math.round(kilometersPerHour/1.609);                     //75
        }
        public static void printConversion(double kilometersPerHour){
            if(kilometersPerHour<0) {
                System.out.println("Invalid value");
            }
            else{
                long milesPerHour=toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour+" km/h = " + milesPerHour + " mi/h");

            }

        }

    public static void main(String[] args) {
        long miles =SpeedConverter.toMilesPerHour(120.50);
        SpeedConverter.printConversion(120.50);
         }
    }

