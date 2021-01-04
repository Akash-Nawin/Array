import java.util.*;
import java.lang.*;
import java.io.*;

class Union{
	public static void main (String[] args) {
		//code
		int t,m,n,i,j,k;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++){
		    m=sc.nextInt();
		    n=sc.nextInt();
		    int a[]=new int[m];
		    int b[]=new int[n];
		    for(j=0;j<m;j++){
		        a[j]=sc.nextInt();
		    }
		    for(j=0;j<n;j++){
		        b[j]=sc.nextInt();
		    }
		    int d=0;
		    for(j=0;j<n;j++){
		        for(k=0;k<m;k++){
		            if(b[j]==a[k]){
		                d++;
		                continue;}
		        }
            }
            System.out.println("Count of Union Elements:"+(m+n)-d);
		}
		
	}
}