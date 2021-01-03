import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t,p,c,i,j,n;
        t=sc.nextInt();
        ;	    
	    for(i=0;i<t;i++){
            int b=sc.nextInt();	
            int a[][]=new int[t][b];      
	        for(int i1=0;i1<b;i1++)
                a[i][i1]=sc.nextInt();
	        n=a[i][b-1];
	        c=a[i][0];
	        for(j=1;j<b;j++)
	        {
	            p=c;
	            c=a[i][j];
	            a[i][j]=p;
	        }
	        a[i][0]=n;
	        for(j=0;j<b;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.print("\n");
        }
    }	    
}
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class GFG {
// 	public static void main (String[] args) {
// 	    Scanner sc=new Scanner(System.in);
// 	    int t,p,c,i,j;
// 	    t=sc.nextInt();
// 	    for(i=0;i<t;i++){
// 	        int b=sc.nextInt();
//             int a[]=new int[b];
//             for(int i1=0;i1<b;i1++)
//             a[i1]=sc.nextInt();
// 	        t=a[a.length-1];
// 	        c=a[0];
// 	        for(j=1;j<a.length;j++){
// 	        p=c;
// 	        c=a[j];
// 	        a[j]=p;
// 	        }
// 	        a[0]=t;
// 	        System.out.println(Arrays.toString(a));
// 	    }
	    
// 		//code
// 	}
// }