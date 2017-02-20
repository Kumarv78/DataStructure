import java.util.*;
public class StringReverseDuplicacyRemove{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         String st = sc.nextLine();
         int len = st.length();
         int abc[] = new int[128];
         char ans[] = new char[len];
         int d=0,k=0,v=0;
         char c ;
         for(int i = len-1 ; i >=0 ; i--) {
             c = st.charAt(i);
             v = (int)c;
             if( ((v>=65 && v<=90)||(v>=97) && (v<=122)) && abc[v]==0) { 
                 if(v<=90){
                     abc[v]=1;
                     abc[v+32] =1;
                     ans[k]=c;
                     k++;
                 }
                 else {
                     abc[v]=1;
                     abc[v-32] = 1;
                     ans[k] = c;
                     k++;
                 }
             }
              else if( abc[v]== 0) {
                 abc[v] = 1;
                 ans[k] = c;
                 k++;
             }
         }
        for(int j =0; j<k; j++) { 
         System.out.print(ans[j]);   
        } 
     }
}
