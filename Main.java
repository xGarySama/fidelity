/**
 * Name:Melgar A. CAbalan
 * Section: BsIndTech
 * Year: 4th year
 */
import java.util.Scanner;
public class Main {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
        System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t           MELGARS MENU          ");
        System.out.println("\t\t\t\t   Foods");
        System.out.println("\t\t\t\t   1. Chicken               Php. 25.00");
        System.out.println("\t\t\t\t   2. Hamburger             Php. 20.00");
        System.out.println("\t\t\t\t   3. French Fries          Php. 25.00");
        System.out.println("\t\t\t\t   4. Nuggets               Php. 30.00");
        System.out.println("\t\t\t\t   5. Beef Stake            Php. 30.00");
        System.out.println("\t\t\t\t   Drinks");
        System.out.println("\t\t\t\t   6. Coke                  Php. 30.00");
        System.out.println("\t\t\t\t   7. Sprite                Php. 30.00");
        System.out.println("\t\t\t\t   8. Royal                 Php. 30.00");
        System.out.println("\t\t\t\t   Snacks");
        System.out.println("\t\t\t\t   9. Nova                  Php. 15.00");
        System.out.println("\t\t\t\t   10.Mr Chips              Php. 15.00");
        System.out.println("\t\t\t\t   11.Piatos                Php. 15.00");
        System.out.println("\t\t\t\t   12.CANCEL                         ");
        System.out.println("\t\t\t\t+====================================+");
    }

    public static void order(){
        System.out.println("Press the corresponding number of the menu or Press 12 to Cancel");
        System.out.print("Press you want to buy? :");
        choose = input.nextInt();
        //conditions
        if(choose==1){
            System.out.println("You choose Chicken");
            System.out.print("How many Chickens you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*25);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }else if(choose==2){
            System.out.println("You choose Hamburger");
            System.out.print("How many Hamburger you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*20);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }else if(choose==3){
            System.out.println("You choose French Fries");
            System.out.print("How many French Fries you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*25);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }else if(choose==4){
            System.out.println("You choose Nuggets");
            System.out.print("How many Nuggets you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==5){
            System.out.println("You choose Beef Stake");
            System.out.print("How many Beef Stake you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==6){
            System.out.println("You choose Coke");
            System.out.print("How many Coke you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==7){
            System.out.println("You choose Sprite");
            System.out.print("How many Sprite you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==8){
            System.out.println("You choose Royal");
            System.out.print("How many Royal you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==9){
            System.out.println("You choose Nova");
            System.out.print("How many Nova you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*15);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==10){
            System.out.println("You choose Mr Chips");
            System.out.print("How many Mr Chips you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*15);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }
        else if(choose==11){
            System.out.println("You choose Piatos");
            System.out.print("How many Piatos you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*15);
            System.out.println("Initial price is: " + total + "\n");
            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank you for Ordering and Happy Eating");
                }
            }
        }

        else if(choose==12){
            System.out.println("You have cancel your order");
            System.exit(0);//close program
        }else{
            System.out.println("Choose 1 to 4 only!");
            order();
        }
    }
    public static void main(String[] args) {
        menu();
        order();
    }
}
