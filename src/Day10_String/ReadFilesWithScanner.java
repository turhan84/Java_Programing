package Day10_String;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(Path.of("src/Day10_String/Test.txt"));

/*
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
*/

        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());


    //    System.out.println(scan.hasNext());
        scan.close();


    }
}
