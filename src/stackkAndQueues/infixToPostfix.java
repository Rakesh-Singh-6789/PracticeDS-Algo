package stackkAndQueues;

import java.util.Stack;

public class infixToPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evaluatePostfix("3-4*2");
	}

	public static void evaluatePostfix(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */

		Stack<Character> stack=new Stack<>();
		int length=str.length();
		String postfix="";

		for(int i=0;i<length;i++){
			char ch=str.charAt(i);

			if(stack.isEmpty() && ( ch=='+' || ch=='*' || ch=='-' || ch=='/' )){
				stack.push(ch);
			}else if(ch=='+' || ch=='*' || ch=='-' || ch=='/'){
				char top=stack.peek();

				if((ch=='-' || ch=='+') && (top=='*' || top=='/' )){
					postfix+=stack.pop();
					stack.push(ch);
				}else if(ch=='-' || ch=='+' || ch=='*' || ch=='/'){
					stack.push(ch);
				}



			}else{
				postfix+=ch;
			}


			//System.out.println(stack.peek());  

		}

		while(!stack.isEmpty()){
			postfix+=stack.pop();
		}

		Stack<Integer> evaluationStack=new Stack<>();
		
		//System.out.println(evaluationStack.isEmpty());
		for(int i=0;i<postfix.length();i++){

			char ch=postfix.charAt(i);
			
			if(Character.isDigit(ch)){
				evaluationStack.push(ch-'0');
			}else{
				int b=evaluationStack.pop();
				int a=evaluationStack.pop();

				switch(ch){
				case '+': 
					evaluationStack.push(a+b); 
					break; 

				case '-': 
					evaluationStack.push(a-b); 
					break; 

				case '/': 
					evaluationStack.push(a/b); 
					break; 

				case '*': 
					evaluationStack.push(a*b); 
					break;
					//default: System.out.println();

				}

			}
			
			System.out.println(ch+" "+(int)evaluationStack.peek());
		}




		System.out.println(postfix);
		System.out.println(evaluationStack.pop());
	}

}
