import java.util.*;
public class T7 {
public boolean isbalanced(String str){
    Stack<Character> stack =new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch=='[' || ch=='(' || ch=='{'){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            stack.pop();
        }
    }
    return stack.isEmpty();   
}
public static void main(String[] args) {
    T7 st = new T7();
    String str="[{}";
    System.out.println(st.isbalanced(str));
}
}
