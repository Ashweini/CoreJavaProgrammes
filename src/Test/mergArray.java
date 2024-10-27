package Test;

import java.util.Arrays;

public class mergArray {
	
	public static void main(String[] args){
        int[] a = {1,3,5,7};
        int[] b={2,4,6};
        int[] c={a.length+b.length};

        for(int i=0; i<c.length; i++){
              if(i<=a.length){
                c[i]=a[i];
                
                 }
            else if(i<=b.length){
                c[i]=b[i];
                }
         }
         System.out.println(Arrays.toString(c));
}

}
