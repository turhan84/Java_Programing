package Day08_Ternary_Switch;

public class SwitchIntro_2 {
    public static void main(String[] args) {

/*
        if     (dayNum == 1) { day = "Monday";}
        else if(dayNum == 2){day = "Tuesday";}
        else if(dayNum == 3){day = "Wednesday";}
        else if(dayNum == 4){day = "Thursday";}
        else if(dayNum == 5){day = "Friday";}
        else if(dayNum == 6){day = "Saturday";}
        else if(dayNum == 7){day = "Sunday";}
        else                {day = "Not Found";}
*/

        int day = 6;

        String result = "";

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                    result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Day Not Found!";

        }

        System.out.println(result);

    }
}
