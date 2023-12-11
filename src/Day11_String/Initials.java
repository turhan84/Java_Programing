package Day11_String;

public class Initials {
    public static void main(String[] args) {
        String name = "      chuck norris    ";

        name = name.trim().toLowerCase();

        int NameIndex = name.indexOf(" ");
        String firstN = "" + name.charAt(0);
        firstN = firstN.toUpperCase();

        String LastN = name.substring(NameIndex + 1, NameIndex + 2).toUpperCase();

        name = firstN + "." + LastN + ".";

        System.out.println(name);
    }
}
