public class VulnerableApp {

    public static void main(String[] args) {
        if (args.length > 0) {
            // Greet the user with the name provided as an argument
            greetUser(args[0]);
        } else {
            System.out.println("Hello, World!");
        }
    }

    private static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
