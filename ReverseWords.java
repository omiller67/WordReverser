import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {

	public String reverse(String s){
		//Create Stack for String objects
		Stack<String> my_stack = new Stack<String>();
		//Tokenize input String ==> String s: This is the input string
		//							StringTokenizer st: 0:This 1:is 2:the 3:input 4:string
		StringTokenizer st = new StringTokenizer(s);
		//Push each token to the stack
		while(st.hasMoreTokens()){
			String word = st.nextToken();
			my_stack.push(word);
		}
		/**
			The Stack now contains each word from the input String (with n-number of words, 
			and looks like this:  
			
							 0| word n
							 1| word n - 1
							 2| word n - 2
						   ...|  ...
						     n| word 0
		**/
		String result = "";
		
		/** 
		 	Add each word to return String, now in reverse order. This is done by popping each
			word off of the stack and adding it to the result string, along with a space.
		**/
		while(!my_stack.empty()){
			String curr_word = my_stack.pop();
			result += curr_word+" ";
		}
		return result;
	}

}
