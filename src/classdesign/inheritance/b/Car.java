package classdesign.inheritance.b;

 public class Car {
    /**
     * Create a base class called Car
     * It should have a few fields name, engine, cylinders, wheels.
     * Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
     * Cylinders and names would be passed parameters.
     * Create appropriate getters
     * Create some methods like startEngine, accelerate, and brake
     * show a message for each in the base class
     * Now create 3 sub classes for your favorite vehicles.
     * Override the appropriate methods to demonstrate polymorphism in use.
     * put all classes in the one java file (this one).
     */
        private String name;
        private boolean engine;
        private int cylinders;
        private int wheels;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
            this.engine = true;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

        public String startEngine() {
            return "Car -> startEngine()";      //Lambda
        }

        public String accelerate() {
            return "Car -> accelerate()";       //Lambda
        }

        public String brake() {
            return "Car -> brake()";            //Lambda
        }
    }

    class Mercedes extends Car {

        public Mercedes(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mercedes -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Mercedes -> accelerate()";
        }

        @Override
        public String brake() {
            return "Mercedes -> brake()";
        }
    }

    class BMW extends Car {

        public BMW (int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() +  " -> startEngine()";       //return "BMW->startEngine()";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() +  " -> accelerate()";        //return "BMW->accelerate()";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() +  " -> brake()";             //return "BMW->brake()";
        }
    }

    class Ford extends Car {

        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Ford -> accelerate()";
        }

        @Override
        public String brake() {
            return "Ford -> brake()";
        }
    }

     class Main {

        public static void main(String[] args) {

            Car car = new Car(8, "Base car");
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());

            Mercedes mercedes = new Mercedes(6, "GLK 350 4WD");
            System.out.println(mercedes.startEngine());
            System.out.println(mercedes.accelerate());
            System.out.println(mercedes.brake());

            Ford ford = new Ford(6, "Ford Falcon");
            System.out.println(ford.startEngine());
            System.out.println(ford.accelerate());
            System.out.println(ford.brake());

            BMW bmw = new BMW(6, "X7 AWD");
            System.out.println(bmw.startEngine());
            System.out.println(bmw.accelerate());
            System.out.println(bmw.brake());
        }
    }
