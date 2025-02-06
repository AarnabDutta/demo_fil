import java.util.*;
public class VectorEg1 {
    public static void main(String[] args){
        //Vector v = new Vector();
        //Vector v = new Vector(4);
        Vector<Integer> v = new Vector<>(4,2);
        System.out.println("Capacity:" + v.capacity());
        System.out.println("Size:" + v.size());
        v.add(23);
        v.add(29);
        v.add(15);
        v.add(14);
        v.add(10);
        System.out.println("Capacity" + v.capacity());
        System.out.println("Sixe:" + v.size());
        Enumeration<Integer>e = v.elements();
        while(e.hasMoreElements()){
            System.out.println("\t" + e.nextElement());
        }




    }
}
