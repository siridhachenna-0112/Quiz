import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=0;
        System.out.println("");
        System.out.println("   WELCOME TO THE QUIZ  ");
        System.out.println("");
        System.out.println("1: what is the capital state of INDIA");
        System.out.println("A: Telangana \n B: Delhi \n C: Goa \n D: Punjab");
        System.out.println("enter your option: ");
        String choice=sc.nextLine();
        if(choice.equals("B")){
            System.out.println("your choice is correct");
            score=score+2;
        }
        else{
            System.out.println("your choice is wrong "+ "the correct answer is: Delhi");
            score=score-1;
        }
        System.out.println("2: 2+2=");
        System.out.println("A : 5 \n B : 7 \n C : 4 \n D : 9 ");
        System.out.println(" enter your choice:");
        String choice2=sc.nextLine();
        if(choice2.equals("C")){
            System.out.println("your choice is correct");
            score=score+2;
        }else{
            System.out.println("your choice is wrong");
            score=score-1;
        }
        System.out.println("your final score:"+score);
}
}
