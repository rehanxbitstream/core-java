import java.util.Vector;
import java.util.Enumeration;
public class VectorDemonstration{

 public static void main(String[] args) {

        Vector<String> v = new Vector<>(3);

        // 1.addElement():Adds an element to the end of the vector.
        v.addElement("Java");
        v.addElement("Python");
        v.addElement("C++");
        System.out.println("After addElement(): " + v);

        // 2.capacity():Returns the current capacity of the vector.
        System.out.println("\nCapacity: " + v.capacity());

        // 3.ensureCapacity(int minCapacity):Increases the vector's capacity if required.
        v.ensureCapacity(10);
        System.out.println("Capacity after ensureCapacity(10): " + v.capacity());

        //4.insertElementAt(insertElementAt(E obj, int index)):Inserts an element at the specified index.
        v.insertElementAt("HTML", 1);
        System.out.println("\nAfter insertElementAt(): " + v);

        //5. elementAt(int index):Returns the element at the specified index.
        System.out.println("elementAt(2): " + v.elementAt(2));

        //6.firstElement():Returns the first element of the vector.
        //7.lastElement():Returns the last element of the vector.
        System.out.println("firstElement(): " + v.firstElement());
        System.out.println("lastElement() : " + v.lastElement());

        //8.setElementAt():Replaces the element at the specified index.
        v.setElementAt("CSS", 2);
        System.out.println("\nAfter setElementAt(): " + v);

        //9.removeElement(Object obj):Removes the first occurrence of the specified element.
        v.removeElement("Python");
        System.out.println("After removeElement(\"Python\"): " + v);

        // 10.removeElementAt(int index):Removes the element at the specified index.
        v.removeElementAt(1);
        System.out.println("After removeElementAt(1): " + v);

        //11.setSize(int newSize):Changes the size of the vector.
        v.setSize(5);
        System.out.println("\nAfter setSize(5): " + v);

        //12.trimToSize():Reduces the capacity to match the current size.
        v.trimToSize();
        System.out.println("Capacity after trimToSize(): " + v.capacity());

        //13.copyInto(Object[] array):Copies all vector elements into the given array.
        Object[] arr = new Object[v.size()];
        v.copyInto(arr);

        System.out.println("\nArray after copyInto():");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        //14.elements():Returns an Enumeration to traverse the vector.
        System.out.println("\nEnumeration using elements():");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        
        //15. removeAllElements():Removes all elements from the vector.
        v.removeAllElements();
        System.out.println("\nAfter removeAllElements(): " + v);
    }


  
}
