public class SingletonClass{
  
private static SingletonClass s=null;
private SingletonClass(){
System.out.println("This is singleton class");
}
  
public static SingletonClass getInstance(){
if(s==null){
s=new SingletonClass();
}
return s;
}
}
