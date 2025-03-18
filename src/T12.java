import java.util.*;

public class T12 {
    // create a poftfix function for the given string
int postfix(String expression ){
    Stack <Integer> st = new Stack<>();
    for(int i=0;i<expression.length();i++){
        char ch = expression.charAt(i);

        if (Character.isDigit(ch)){
            st.push(ch-'0');
        }
        else{
            int Operand1 = st.pop();
            int Operand2 = st.pop();

           switch (ch) {
               case '+' :
                    st.push(Operand1+Operand2);
                   break;
               case '-' :
                   st.push(Operand1-Operand2);
                  break;
               case '*' :
                    st.push(Operand1*Operand2);
                   break;
               case '/' :
                    st.push(Operand1/Operand2);
                   break;
           }
        }
    }
    return st.pop();
}
public static void main(String[] args) {
    T12 p = new T12();
    String str = "53+26/*35*+";
    int a= p.postfix(str);
System.out.println("result after applying postfix is : "+a);
}
}
