public class stringies {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println("Length of greeting '" + greeting + "' is: " + greeting.length());

        System.out.println("Upper: " + greeting.toUpperCase());
        System.out.println("Lower: " + greeting.toLowerCase());

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

    }
}
