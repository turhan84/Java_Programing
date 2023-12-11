package Day08_Ternary_Switch;
import java.util.Scanner;

public class CustomComputer {
    public static void main(String[] args) {
        double amount = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = scan.nextLine();

        System.out.println("Select CPU type:");
        String CPU = scan.nextLine();

        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();

        System.out.println("Select storage type:");
        String storageType = scan.next();

        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();

        System.out.println("Select screen resolution:");
        String screenResolution = scan.next();

        if     (screenSize.equals("13.3")){ amount = amount + 200 ;}
        else if(screenSize.equals("15.0")){ amount = amount + 300 ;}
        else if(screenSize.equals("17.3")){ amount = amount + 400 ;}

        if     (CPU.equals("i3")){ amount = amount +  150;}
        else if(CPU.equals("i5")){ amount = amount +  250;}
        else if(CPU.equals("i7")){ amount = amount + 350;}

        int ramSize = RAM % 4;
        if (ramSize == 0 ){
            int RAMprice = RAM / 4;
            RAMprice = RAMprice * 50;
            amount = amount +  RAMprice ;
        }

        if     (storageType.equals("HDD")){
            amount = amount +( (storageSize / 500) * 50 );
        }
        else if(storageType.equals("SSD")){
            amount = amount +( (storageSize / 500) * 100 );
        }

        if     (screenResolution.equals("FULLHD")){amount = amount + 100;}
        else if(screenResolution.equals("4K"))    {amount = amount + 200;}

        System.out.println("Final price is: $" + amount);
    }
}
/*

### Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:

**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

```
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
```

=================================================================================================
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
```

#### Take all the inputs from the above flow and combine these sections together

- Declare and assign a `contact` variable using these inputs: *work phone, personal phone and email*. Use a comma and a space to separate each value

- Declare and assign a `fullName` variable using these inputs: *first name and last name* Use a space to seperate each value

- Declare and assign an `address` variable using these inputs: *street, city, state, zip code* Use a comma and a space to separate each value

#### Display all of the information together as below

#### The final output of your program should be:
  > The first part of the outcome are the questions which are asked from the Scanner portion

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?

Patient personal information
Full name: James May
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married: true
```

Main topics: variables, primitive datatypes, String, Scanner, concatenation
 */
