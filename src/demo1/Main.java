package demo1;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Car c1 = new Car();
        String s = "yellow";

        System.out.println(c.color);
        System.out.println(c1.color);

        System.out.println(c.ownerOfCar.name);


        c.run();
        c1.run();

        c.clearCar();


        c.color = "orange";
        c1.color = "Green";
        System.out.println(c.color);
        System.out.println(c1.color);

        c.printColor();
        c1.printColor();
    }
}
