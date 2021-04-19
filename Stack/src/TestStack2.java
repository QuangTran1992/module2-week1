public class TestStack2 {
    public static void main(String[] args) {
        myStack2<String> animals = new myStack2<>();

        animals.push("dog");
        animals.push("mouse");
        animals.push("horse");
        animals.push("Cat");

//       String temp =  animals.pop();
//        System.out.println("Temp: " + temp);
        String temp2 = animals.peek();
        System.out.println(temp2);
        System.out.println("**************");
        animals.display();
    }
}
