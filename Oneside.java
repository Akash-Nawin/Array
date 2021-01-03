import java.io.*;
import java.util.*;
public class Oneside {
    public static void main(String arg[]){
        int n,i;
        int j=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("ARRANGE NEGATIVE ELEMENTS IN ONE SIDE OF ARRAY:");
        for(i=0;i<n;i++){
            if(a[i]<0){
            System.out.print(a[i]+" ");
            b[j]=a[i];
            j++;
            }
        }
        for(i=0;i<n;i++){
            if(a[i]>0){
            System.out.print(a[i]+" ");
            b[j]=a[i];
            j++;
        }
        }
        System.out.println(Arrays.toString(b));

    }
}
