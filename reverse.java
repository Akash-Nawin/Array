import java.io.*;
import java.util.*;

class reverse
{
public static void main(String arg[]){
    
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int n=b-1;
    int[] a=new int[b];
    for(int i=0;i<b;i++){
        a[i]=sc.nextInt();
    }
System.out.println("REVERSE ARRAY");
    for(int i=0;i<b/2;i++){
        int t=a[i];
        a[i]=a[n];
        a[n]=t;
        n--;
    }
    for(int i=0;i<b;i++){
        System.out.print(a[i]+" ");
    }  
    System.out.println(Arrays.toString(a)+" ");
}
}