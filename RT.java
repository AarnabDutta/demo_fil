public class RT {
    public static void main(String[] args) {
        try{
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("calc");
    }
    catch(Exception e){
        System.out.println(e);
    }
    // I am adding a demo comment
}
}
