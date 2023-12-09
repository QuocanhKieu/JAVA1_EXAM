package Bank;

public class Main {
    public static void main(String[] args) {
        Bank mb = new Bank(1000, 10);
        System.out.println(mb.calculateInterest());
    }
}
