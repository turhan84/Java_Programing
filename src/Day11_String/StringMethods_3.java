package Day11_String;

import java.util.Scanner;

public class StringMethods_3 {
    public static void main(String[] args) {
        //   isEmpty() /  isBlank() /  equals ()  / equalsIgnoreCase() / contains() / startsWith() / endsWith()
        System.out.println("=========== isEmpty()  ==============");

        String word = "Java";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("=========== isBlank()  ==============");

        String str = "            ";
        boolean r2 = str.isEmpty();

        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);

        System.out.println("r3 = " + r3);

        System.out.println("=========== equals ()  ==============");
/*        equals(str): checks if two string has the same text. returns boolean
        Cannot ignore case sensitivity
                DO NOT use == to compare two strings. use .equals()
                */

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println( str1 == str2 ); // false

        System.out.println(str1.equals(str2)); // true

        String st3 = new String("cydeo");

        System.out.println(str2.equals(st3)); // false

        System.out.println("=========== equalsIgnoreCase()  ==============");
      //  equalsIgnoreCase(str):  checks if two strings are equal without case sensitivity
        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2));// true

        System.out.println("=========== contains()  ==============");
/*        contains(str): checks if the given str is contained in the string. returns boolean  (has)

                sentence = "My favorite programming languages are: C#, Java, JavaScript"   ;

        sentence.contains("Python") //false
        */

        String student = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = student.contains("Ahmed");

        System.out.println(hasAhmed);


        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");
        //   boolean hasJava = sentence.equalsIgnoreCase("java");

        System.out.println("hasJava = " + hasJava);

        System.out.println("=========== startsWith()  ==============");

 /*       startsWith(str): checks if the string is started with given str. returns boolean
                sentence = "Cybertek School is the best"

        sentence.startsWith("Cybertek")
*/

        String name = "Micheal";

        boolean l =  name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);


        System.out.println("=========== endsWith()  ==============");


        boolean t = url.endsWith(".com");

        System.out.println(t);

//------------------------------------------------------------
        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);





    }
}
