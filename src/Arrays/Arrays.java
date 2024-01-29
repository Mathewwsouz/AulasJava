package Arrays;
import java.util.Scanner;
public class Arrays {
        int i;
        Scanner scan =  new Scanner (System.in);
        int [] a = new int[5];
        
        for( i=0; i<a.length; i++){
            System.out.println("Digite o numero do Array: ");
            a[i] = scan.nextInt();
        }

        for(i = 0; i<a.length ; i++){
            System.out.printf("Array na posição %d: %d5\n", i, a[i]);
        }
}
