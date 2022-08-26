import java.util.HashMap;
import java.util.Scanner;

public class Coin{
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
    public Coin(){
        coinnames.put(1,"penny");
        coinnames.put(10,"dime");
        coinnames.put(25,"quarter");
        coinnames.put(50,"half-dolar");
        coinnames.put(50,"ababa");
        System.out.println(coinnames.keySet().size());
        System.out.println(coinnames);
        for( Integer k : coinnames.keySet()){
            System.out.println(coinnames.get(k));
        }
    }
    
    public String getName(int amout){
        if(coinnames.containsKey(amout)){
        return coinnames.get(amout);
    }
        else 
            return "Not Found";
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amout = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amout);
        System.out.println(name);
    }
}