import java.util.Scanner;

public class nghiemptbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("a");
        a = sc.nextDouble();
        System.out.println("b");
        b = sc.nextDouble();
        System.out.println("c");
        c = sc.nextDouble();
        if (a != 0) {
            double solution = (c - b / a);
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x !");
            } else {
                System.out.println(" No solution ");
            }

        }
    }
}

