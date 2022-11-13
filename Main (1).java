import java.util.Scanner;
class main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        int grade, grades = 0, num1, num2 = 0;
        System.out.print("Are you here to input Grade? ");
        do {
            num1 = 0;
            System.out.println("Yes or No?");
            answer = in.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                num1 += 1;
                System.out.println("Enter grade: ");
                grade = in.nextInt();
                in.nextLine();
                grades += grade;
                num2 += 1;

                System.out.print("Want to add another grade? ");
            } else if (answer.equalsIgnoreCase("no")) {
                num1 = 0;
                int avegrades = grades/ num2;
                System.out.println("average of the grades entered: " + avegrades);
            }
        } while (num1 == 1);
    }
}