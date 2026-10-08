import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String name = s.nextLine();

        System.out.print("Age: ");
        int age = s.nextInt();

        System.out.print("Initial Deposit: ");
        double money = s.nextDouble();

        System.out.println("\nAccount Opened Successfully!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: ₹" + money);
    }
}