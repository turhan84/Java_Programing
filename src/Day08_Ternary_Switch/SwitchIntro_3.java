package Day08_Ternary_Switch;

import java.util.Scanner;

public class SwitchIntro_3 {
    public static void main(String[] args) {

//HOMEWORK
/*        int score = 85; // 0 ~ 100

        String result = "";

        if(score >= 90){ // false: score < 90
            result = "A";
        }else if(score >= 80 && score < 90){ //false: score < 80
            result = "B";
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }*/

        String result = "";
       Scanner scan = new Scanner(System.in);
        System.out.println("Score!");
        int score = scan.nextInt();
        if (score>= 0 && score<=100) {
            switch (score) {

                case 0:
                    result = "F";
                    break;
                case 1:
                    result = "F";
                    break;
                case 2:
                    result = "F";
                    break;
                case 3:
                    result = "F";
                    break;
                case 4:
                    result = "F";
                    break;
                case 5:
                    result = "F";
                    break;
                case 6:
                    result = "F";
                    break;
                case 7:
                    result = "F";
                    break;
                case 8:
                    result = "F";
                    break;
                case 9:
                    result = "F";
                    break;
                case 10:
                    result = "F";
                    break;
                case 11:
                    result = "F";
                    break;
                case 12:
                    result = "F";
                    break;
                case 13:
                    result = "F";
                    break;
                case 14:
                    result = "F";
                    break;
                case 15:
                    result = "F";
                    break;
                case 16:
                    result = "F";
                    break;
                case 17:
                    result = "F";
                    break;
                case 18:
                    result = "F";
                    break;
                case 19:
                    result = "F";
                    break;
                case 20:
                    result = "F";
                    break;
                case 21:
                    result = "F";
                    break;
                case 22:
                    result = "F";
                    break;
                case 23:
                    result = "F";
                    break;
                case 24:
                    result = "F";
                    break;
                case 25:
                    result = "F";
                    break;
                case 26:
                    result = "F";
                    break;
                case 27:
                    result = "F";
                    break;
                case 28:
                    result = "F";
                    break;
                case 29:
                    result = "F";
                    break;
                case 30:
                    result = "F";
                    break;
                case 31:
                    result = "F";
                    break;
                case 32:
                    result = "F";
                    break;
                case 33:
                    result = "F";
                    break;
                case 34:
                    result = "F";
                    break;
                case 35:
                    result = "F";
                    break;
                case 36:
                    result = "F";
                    break;
                case 37:
                    result = "F";
                    break;
                case 38:
                    result = "F";
                    break;
                case 39:
                    result = "F";
                    break;
                case 40:
                    result = "F";
                    break;
                case 41:
                    result = "F";
                    break;
                case 42:
                    result = "F";
                    break;
                case 43:
                    result = "F";
                    break;
                case 44:
                    result = "F";
                    break;
                case 45:
                    result = "F";
                    break;
                case 46:
                    result = "F";
                    break;
                case 47:
                    result = "F";
                    break;
                case 48:
                    result = "F";
                    break;
                case 49:
                    result = "F";
                    break;
                case 50:
                    result = "F";
                    break;
                case 51:
                    result = "F";
                    break;
                case 52:
                    result = "F";
                    break;
                case 53:
                    result = "F";
                    break;
                case 54:
                    result = "F";
                    break;
                case 55:
                    result = "F";
                    break;
                case 56:
                    result = "F";
                    break;
                case 57:
                    result = "F";
                    break;
                case 58:
                    result = "F";
                    break;
                case 59:
                    result = "F";
                    break;
                case 60:
                    result = "D";
                    break;
                case 61:
                    result = "D";
                    break;
                case 62:
                    result = "D";
                    break;
                case 63:
                    result = "D";
                    break;
                case 64:
                    result = "D";
                    break;
                case 65:
                    result = "D";
                    break;
                case 66:
                    result = "D";
                    break;
                case 67:
                    result = "D";
                    break;
                case 68:
                    result = "D";
                    break;
                case 69:
                    result = "D";
                    break;
                case 70:
                    result = "C";
                    break;
                case 71:
                    result = "C";
                    break;
                case 72:
                    result = "C";
                    break;
                case 73:
                    result = "C";
                    break;
                case 74:
                    result = "C";
                    break;
                case 75:
                    result = "C";
                    break;
                case 76:
                    result = "C";
                    break;
                case 77:
                    result = "C";
                    break;
                case 78:
                    result = "C";
                    break;
                case 79:
                    result = "C";
                    break;
                case 80:
                    result = "B";
                    break;
                case 81:
                    result = "B";
                    break;
                case 82:
                    result = "B";
                    break;
                case 83:
                    result = "B";
                    break;
                case 84:
                    result = "B";
                    break;
                case 85:
                    result = "B";
                    break;
                case 86:
                    result = "B";
                    break;
                case 87:
                    result = "B";
                    break;
                case 88:
                    result = "B";
                    break;
                case 89:
                    result = "B";
                    break;
                case 90:
                    result = "A";
                    break;
                case 91:
                    result = "A";
                    break;
                case 92:
                    result = "A";
                    break;
                case 93:
                    result = "A";
                    break;
                case 94:
                    result = "A";
                    break;
                case 95:
                    result = "A";
                    break;
                case 96:
                    result = "A";
                    break;
                case 97:
                    result = "A";
                    break;
                case 98:
                    result = "A";
                    break;
                case 99:
                    result = "A";
                    break;
                case 100:
                    result = "A";
                    break;
            }
            System.out.println(result);
        }
        else {
            System.out.println("Invalid Score!");
        }

    }
}
/*
        for (int i = 0; i < 100; i++) {
            if(i >= 90 && i < 100)System.out.println("case " + i +" : result = \"A\"; break;");
            if(i >= 80 && i < 90)System.out.println("case " + i +" : result = \"B\"; break;");
            if( i >= 70 && i < 80 )System.out.println("case " + i +" : result = \"C\"; break;");
            if(i >= 60 && i < 70)System.out.println("case " + i +" : result = \"D\"; break;");
            if( i < 60)System.out.println("case " + i +" : result = \"F\"; break;");
            }
*/