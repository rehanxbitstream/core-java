public class TryWithFinally{

public static void main(String[] args){

try{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int div=a/b;

}

finally{
System.out.println("This is finally block");
}

catch(ArithmeticException ae){
System.out.println(ae.getMessage());
}

}


}