package encapsulation;

public class SumCalculator {
        private double firstNumber;
        private double secondNumber;

        public void setFirstNumber(double firstNumber){
            this.firstNumber=firstNumber;
        }
        public void setSecondNumber(double secondNumber){
            this.secondNumber=secondNumber;
        }

        public double getFirstNumber(){
            return firstNumber;
        }
        public double getSecondNumber(){
            return secondNumber;
        }
        public double getAdditionResult(){
            double sum=firstNumber+secondNumber;
            return sum;
        }
        public double getSubtractionResult(){
            double subtraction=firstNumber-secondNumber;
            return subtraction;
        }
        public double getMultiplicationResult(){
            double multiplication=secondNumber*firstNumber;
            return multiplication;
        }
        public double getDivisionResult() {
            if (secondNumber > 0) {
                double division = firstNumber / secondNumber;
                return division;
            } else {
                return 0.0;
            }
        }
    public static void main(String[] args) {
        SumCalculator sumCalculator=new SumCalculator();
        System.out.println(sumCalculator.firstNumber);
        System.out.println(sumCalculator.secondNumber);
        sumCalculator.setFirstNumber(12);
        sumCalculator.setSecondNumber(0);

        System.out.println(sumCalculator.getFirstNumber());
        System.out.println(sumCalculator.getSecondNumber());

        System.out.println(sumCalculator.getAdditionResult());
        System.out.println(sumCalculator.getDivisionResult());
        System.out.println(sumCalculator.getMultiplicationResult());
        System.out.println(sumCalculator.getSubtractionResult());
    }
    }

