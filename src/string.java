class string{ 
    public static void main(String args[]){ 
     String myString1="India"; 
     String myString2="India"; 
    String myString4=new String("India"); 
     String myString3="Great"; 
     System.out.println(myString1.compareTo(myString2)); 
     System.out.println(myString1.compareTo(myString3)); 
     System.out.println(myString3.compareTo(myString1)); 
    System.out.println(myString1==myString2); 
     System.out.println(myString1==myString4); 
    } } 
    