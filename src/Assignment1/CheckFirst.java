package Assignment1;

import java.math.BigInteger;
import java.util.*;

import org.xml.sax.ext.LexicalHandler;

public class CheckFirst {

	

	public static void main(String[] args) {
		//System.out.println((int)'A');
		
		Stack<Integer> stack=new Stack<>();
		for(int i=5;i>0;i--){
			stack.add(i);
		}
		
		Stack<Integer> tempStack=new Stack<>();	
		
		tempStack=(Stack<Integer>) stack.clone();
        
		
		stack.sort(null);
		
		System.out.println(tempStack.pop());
		System.out.println(stack.pop());
		
		Iterator<Integer> itr=stack.iterator();
		
		while(itr.hasNext()){
			//System.out.println(itr.next());
		}
		
		//System.out.println(stack.peek());
	}
}