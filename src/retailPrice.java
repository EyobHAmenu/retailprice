import java.util.Scanner;

public class retailPrice {
    public static void main(String args[]) {
        String cont;
        double cost, retail, rate;
        boolean boo = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the cost please: ");
            cost = sc.nextDouble();
            System.out.print("Enter the rate please: ");
            rate = sc.nextDouble();
            sc.nextLine();
            retail = rate * cost;
            System.out.printf("Retail Price = " + "%.2f %n",retail);
            System.out.print("Do you receives a shipment ? (yes/no) ");
            cont = sc.nextLine();
            if(cont.equalsIgnoreCase("no")){
                boo = false;
            }
        }while(boo == true);
    }
}
