//package array;
import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] array = new int[cnt];
        double sum = 0;
        for( int i=0; i<cnt ; i++){
            array[i] = in.nextInt();
            sum+=array[i];
        }
        double average = sum/cnt;
        System.out.println("the average score is:"+average);
        System.out.println("the length is:"+array.length);
    }
}