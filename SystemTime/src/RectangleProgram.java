import java.util.Scanner ;
public class RectangleProgram {
    public static void main(String[] args) {
        float  width;
        float  height ;

        Scanner scaner = new Scanner(System.in);

        System.out.println("enter width");
        width = scaner.nextFloat();

        System.out.println("enter height");
        height = scaner.nextFloat();

        float area = width * height ;
        System.out.println("area =" + area );
    }
}

