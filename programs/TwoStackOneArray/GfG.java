//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.*;

/* Structure of the class is */
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}
/**/

class GfG
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
               if(sq.top1 == sq.size/2) {
                   System.out.println("stack 1 is full please pop");
               }
               else {
                   sq.top1=sq.top1+1;
                   sq.arr[sq.top1] = x;
               }
    }

    /* The method push to push element into the stack 1*/
    void push2(int x, TwoStack sq)
    {
               if(sq.top2 == sq.size/2) {
                   System.out.println("stack 2 is full please pop");
               }
               else {
                   sq.top2=sq.top2-1;
                   sq.arr[sq.top2] = x;
               }            
    }

    /* The method pop to pop element from the stack 1 */
    int pop1(TwoStack sq)
    {
               if(sq.top1 == -1) {
                   return -1;
               }
               else {
                   sq.top1=sq.top1-1;
                   return sq.arr[sq.top1+1];
               }                
    }

    /* The method pop to pop element from the stack 2 */
    int pop2(TwoStack sq)
    {
               if(sq.top2 == sq.size) {
                   return -1;
               }
               else {
                   sq.top2=sq.top2+1;
                   return sq.arr[sq.top2-1];
               }   
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TwoStack sq = new TwoStack();
        GfG obj = new GfG();
        for(int i=0;i<t;i++) {
            int q = sc.nextInt();
            for(int j=0;j<q;j++) {
                int stack_no = sc.nextInt();
                int op_no = sc.nextInt();
                switch(stack_no) {
                    case 1 :
                        switch(op_no){
                            case 1:
                                int x = sc.nextInt();
                                obj.push1(x,sq);
                                break;
                            case 2:
                                System.out.print(obj.pop1(sq)+" ");
                                break;
                        }
                        break ;
                    case 2 :
                        switch(op_no){
                            case 1:
                                int x = sc.nextInt();
                                obj.push2(x,sq);
                                break;
                            case 2:
                                System.out.print(obj.pop2(sq)+" ");
                                break;
                        }
                        break;
                }
            }
            System.out.println("");
        }
        
    }
    
}
