public class casting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);


        myDouble = 9.78;
        myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);

    }
}
