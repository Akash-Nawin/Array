import java.io.*;
import java.util.*;
public class MaxMin {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int i,j,t;
        int b=sc.nextInt();
        int[] a=new int[b];
        for(i=0;i<b;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<b;i++){
            for(j=i+1;j<b;j++){
                if(a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[b-1]+"-MAX\n"+a[0]+"-Min");
    }
    
}
