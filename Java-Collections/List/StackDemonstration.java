import java.util.Stack;
public class StackDemonstration{
  public static void main(String[] args){
    Stack<String> stack = new Stack<>();
    //1.push():Adds an element to the top of the stack.
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
    
     //2.peek():Returns the top element without removing it.
        System.out.println("\npeek(): " + stack.peek());
    
     //3.search():Returns the 1-based position of an element from the top of the stack, or -1 if not found.
        System.out.println("search(\"Python\"): " + stack.search("Python"));
        System.out.println("search(\"Java\"): " + stack.search("Java"));
        System.out.println("search(\"HTML\"): " + stack.search("HTML"));
    
     //4.pop():Removes and returns the topmost element from the stack.
         System.out.println("\npop(): " + stack.pop());
         System.out.println("After pop(): " + stack);
    
      //5.empty():Returns true if the stack is empty; otherwise false.
        System.out.println("\nIs Stack Empty? " + stack.empty());
    
    
  }
}
