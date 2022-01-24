public class WorkerProcess
{
    public static void main(String[] args)
    {
        while(true) {
        	try { 
        	    Thread.sleep(2000);
            } catch(InterruptedException e) {}
            System.out.println("cde-test-worker. Worker process woke up!!");
        }
    }    
}
