//Reflection
import java.lang.reflect.*;
class Ref{
    public static void main(String ar[]){
        try{
            Class c = Class.forName("java.awt.Button");
            Field cn[] = c.getFields();
            for(int i=0;i<cn.length;i++){
                System.out.println(cn[i]);
            }
            System.out.println("");
            // Added a comment in Reflection
    }
}
catch(Exception e){
    System.out.println(e);
}
}
}