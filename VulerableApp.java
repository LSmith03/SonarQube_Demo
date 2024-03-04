public class VulerableApp {
    
    public static void Main(String[] args) {
        String username = args[0];
        login(username); // Potential vulnerability
    }

    private static void login(String username) {
        if (username.equals("admin")) {
            System.out.println("Logged in as admin");
        } else {
            System.out.println("Login failed for user: " + username); // Code Smell (Potential logging of sensative information)
        }

        String unused = "HAHA, This will never be used Batman"; // Unused line of code

        System.out.println("Operation completed."); // Redundant code: Does not contribute to overall program's functionality
    }
}
