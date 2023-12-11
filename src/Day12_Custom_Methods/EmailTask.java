package Day12_Custom_Methods;

public class EmailTask {
    public static void main(String[] args) {
        String email = "cydeo_school@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

        String rest = email.substring(email.indexOf("@"));

        System.out.println(firstName);

        System.out.println(lastName);

        System.out.println(rest);

        email = lastName + "_" + firstName + rest;

        System.out.println(email);
    }
}
