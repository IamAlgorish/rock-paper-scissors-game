import java.util.Random;
import java.util.Scanner;
//import static com.sun.tools.javac.jvm.PoolConstant.LoadableConstant.Int;
public class game {
    private static void ownername( ){
        String owner = "Rishabh";
        //github Rishabhjha1421
    }
    public static void main(String[] args) {
        Random random = new Random();
        //int num = random.nextInt(int 1 , int 4);
       int comp= random.nextInt(1,4);
      //  System.out.println(comp);3
        System.out.println("Hello wanna play Rock paper Scissors\n Enter your choice below as:- \nType 1 for Rock \nType 2 for paper \nType 3 for Scissors \n ");
        Scanner sc = new Scanner(System.in);
        int man = sc.nextInt();
         /*R= 1
           P =2
           S= 3
comp = 1,2,3;

1 won  with 3
2 won with  1
3 won with  2*/
        if((man==1 &&comp==3)||(man==2&& comp==1)||(man==3&&comp==2)){
            System.out.println("Congrats you won");
            System.out.print("computer chooses:");
            System.out.println(comp);}
         else if ((man==1 &&comp==1)|| (man==2&& comp==2)||(man==3&&comp==3)){
                System.out.println("Oh its draw");
                System.out.print("computer chooses:");
                System.out.println(comp);
            }
         else {
            System.out.println("You loose");
            System.out.print("computer chooses:");
            System.out.println(comp);
        }
        }
    }

