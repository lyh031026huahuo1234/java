package  price;
import   java.util.Scanner;

public class price {
    public static void main(String[] args){
        int price = 0;
        Scanner in = new Scanner(System.in);
        price = in.nextInt();
        System.out.println(price>=10);
        int change = 100 - price;
        System.out.println("change is:"+change);
    }
}
