class Jn extends Thread{
    Jn(){
        start();
    }
    public void run(){
        System.out.println("CHILD Thread started:");
        try{
            for(int i=1;i<=5;i++){
                System.out.println("\t" +i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            
        }
        System.out.println("CHILD Thread interrupted");

    }
    public static void main(String []ar){
        System.out.println("MAIN Thread started:");
        Jn j1 = new Jn();
        try{
            j1.join();
        }
        catch(InterruptedException e){
            
        }
        System.out.println("MAIN Thread interrupted");
    }
}