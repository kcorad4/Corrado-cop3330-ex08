import java.util.Scanner;

public class PizzaParty {

    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("how many people?");
        int people = sc.nextInt();
        System.out.println("how many pizza do you have?");
        int pizza = sc.nextInt();
        System.out.println("how many slices per pizza");
        int slicesPer = sc.nextInt();
        int totalSlices = pizza*slicesPer;

        System.out.println(people+" people with "+pizza+" pizzas ("+totalSlices+" slices)");
        if(totalSlices/people==1)
        {//singular
            System.out.println("Each person gets "+totalSlices/people+" piece of pizza.");
            System.out.println("There are "+(totalSlices%people)+" leftover pieces.");
        }
        else
        {//plural
            System.out.println("Each person gets "+totalSlices/people+" pieces of pizza.");
            System.out.println("There are "+(totalSlices%people)+" leftover pieces.");
        }

    }

}
