public class ArithmeticExceptionTest{
  public static void main(String[] args){
    int a = 4;
    int b =0;

    try{
      int div = a/b;
      System.out.println(div);
    }
    catch(ArithmeticException ae){
      System.out.println(ae.printStackTrace());
    }
  }
}
