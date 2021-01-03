import java.io.*;
import java.util.*;
public class KthMaxMin {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int i,j,b,t,k1,k2;
        b=sc.nextInt();
        int[] a=new int[b];
        for(i=0;i<b;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<b;i++){
            for(j=i+1;j<b;j++){
                if(a[i]>a[j]){
                t=a[i];
                a[i]=a[j];
                a[j]=t;}
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Kth max index:"+"");
        k1=sc.nextInt();
        System.out.println("The element is:"+a[b-k1]);
        System.out.println("Kth min index:"+"");
        k2=sc.nextInt();
        System.out.println("The element is:"+a[k2-1]);
        
    }
    
}
