//Java program for Printing your name, age, city, and college name on separate lines.
/*class day2{
    public static void main(String args[]){
        System.out.print("muskan kachwaha\n20\npridarshini college of engineering");

    }
}

/* Print the following pattern using only println():
*
**
***
****
***** */
/*class day2{
    public static void main(String []args){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}



/*Shopping bill calculator

Write a program that accepts:
- Product name
- Product price
- Quantity
Calculate and display:
- Product name
- Total bill
- Price of 3 additional unit*/

/*import java.util.*;
class day2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String productname= sc.next();
        double productprice= sc.nextDouble();
        int quantity = sc.nextInt();

        double totalbill= productprice*quantity;
        double additionalunit=totalbill*3;

        System.out.println("product:"+productname);
        System.out.println("total bill:"+totalbill);
        System.out.println("additionalunit:"+additionalunit);

    }
}*/

/*Student percentage calculator

Accept marks for five subjects from the user.

Calculate and display:
- Total marks
- Average marks
- Percentage
Assume each subject is out of 100.*/

/*java program for calculating hours minutes and seconds from seconds given */
import java.util.*;
class day2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the seconds:");
        int seconds = sc.nextInt();

        int hours = seconds/3600;
        int remainingseconds = seconds%3600;
        int minutes = remainingseconds/60;
        int remainingsecond =minutes%60;
        System.out.println("hours:"+hours);
        System.out.println("minutes"+minutes);
        System.out.println("remainingsecond"+remaining second);
    }
}