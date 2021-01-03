import java.io.*;
import java.util.*;
public class ZeroOneTwo {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n,k,l,i,m;
        k=l=m=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0)
            k++;
            else if(a[i]==1)
            l++;
            else
            m++;
        }
        if(k!=0){
            for(i=0;i<k;i++)
                System.out.print(0+" ");
                }
        if(l!=0){
            for(i=0;i<l;i++)
                System.out.print(1+" ");
                 }
        if(m!=0){
            for(i=0;i<m;i++)
                System.out.print(2+" ");
                }
            }      
    
}
