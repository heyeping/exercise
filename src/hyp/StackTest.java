package hyp;
import java.util.*;
public class StackTest {
   static void showpush(Stack st, int a){
	   st.push(new Integer(a));
	   System.out.println("push("+a+")");
	   System.out.println("stack:"+st);
   }
   static void showpop(Stack st){
	   System.out.print("pop->");
	   Integer a=(Integer) st.pop();
	   System.out.println(a);
	   System.out.println("stack:"+st);

   }
   public static void main(String  args[]){
	   Stack st= new Stack();
	   System.out.println("stack"+st);
	   showpush(st,42);
	   showpush(st,59);
	   showpush(st,88);
	   showpush(st,99);
	   showpop(st);
	   showpop(st);
	   showpop(st);
	   showpop(st);
       try{
    	   showpop(st);
       }catch(EmptyStackException e){
    	   System.out.println("this is empty stack");
       }

   }
} 
