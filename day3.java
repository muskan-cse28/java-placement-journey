//number checker
/*import java.util.*;
public class day3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("number is positive");
        }
    else if(number<0){
        System.out.println("number is negative");
    }
else{
    System.out.println("number is 0");
}    
if(number%2==0){
    System.out.println("number is even");
}
    else{
System.out.println("number is odd");
    }

}
}*/

//student grade calculator
/*import java.util.*;
class day3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks = sc.nextInt();
        if(marks<=0||marks>=100){
            System.out.println("invalid marks");
        }
        if (marks>=90){
            System.out.println("A");
            }
            else if (marks>=75&&marks<=89){
                System.out.println("B");
            }
                else if (marks>=60&&marks<=74){
                    System.out.println("C");

                }
                else if (marks>=35&&marks<=59){
                    System.out.println("D");
                }
            else {
                System.out.println("FAIL");
            }
            }
    }*/


//electricity bill calculator

/*import java.util.*;
class day3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter electricity unit consumed:");
        double unit=sc.nextDouble();
        if (unit>=0&&unit<=100){
            System.out.println("bill is:"+ unit*5);
        }
            else if (unit>=101&&unit<=200){
                System.out.println("bill is:"+unit*7);
            }
        else {
            System.out.println("bill is:"+unit*10);
        }
        }
    }*/


        //calculator

        /*import java.util.*;
        class day3{
            public static void main(String[]args){
                Scanner sc = new Scanner ( System.in);
                System.out.println("enter first number:");
                int a = sc.nextInt();
                System.out.println("enter second number:");
                int b = sc.nextInt();
                System.out.println("1.addition(+)");
                System.out.println("2.substraction(-)");
                System.out.println("3.multiplication(*)");
                if(b>=1){
                System.out.println("4.division(/)");
                
            }
            else {
                System.out.println("division cant happen");
            }
            System.out.print("enter your operator:");
            int operator = sc.nextInt();
                switch(operator){
                    case 1:
                        System.out.println(a+b); 
                    break;
                    case 2:
                        System.out.println(a-b);
                    break;
                    case 3:
                        System.out.println(a*b);
                    break;
                    case 4:
                        System.out.println(a/b);
                    break;
                    default:
                         System.out.println("invalid operation");
                }
            
                
            }
        }*/

            // atm menu
           /*  import java.util.*;
            class day3 {
                public static void main ( String[]args){
                    Scanner sc= new Scanner(System.in);
                    int balance = 500;
                    int addmoney=100;
                    int minusmoney=50;
                    System.out.println("1.check balance");
                    System.out.println("2.deposit money");
                    System.out.println("3.withdraw money");
                    System.out.println("enter your operation");
                    int operation = sc.nextInt();
                    switch (operation){
                        case 1:
                            System.out.println("500");
                            break;
                        case 2:  
                        System.out.println("deposited money is:"+ (balance+addmoney));
                        break;
                        case 3 : 
                        System.out.println("withdraw money is:"+ (balance-minusmoney));
                        break;
                        default:
                            System.out.println("wrong operation");          
                }
            }
        }*/


            //valid triangle and type pf triangle
            import java.util.*;
            class day3{
                public static void main(String[]args){
                    Scanner sc = new Scanner(System.in);
                    int a=3;
                    int b=4;
                    int c=5;
                    if (a+b>=c && a+c>=b && b+c>=a){
                        System.out.println("triangle is valid");
                        if ( a==b&&b==c&&c==a){
                            System.out.println("triangle is equilateral");
                        }
                            else if (a==b||b==c||c==a){
                                System.out.println("triangle is isoceles");
                            }
                                else if (a!=b && b!=c && c!=a) {
                                    System.out.println("triangle is scaleces");
                                }
                            
                    
                        else {
                            System.out.println("triangle is invalid");

                        }
                    }
                }
            }
                    

            
