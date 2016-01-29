import java.util.HashMap;
import java.util.Map;

/**
 * Created by geek on 15-9-10.
 */
public class StopWorldTest {
    public static class MyThread extends Thread {
        Map map = new HashMap();

        @Override
        public void run() {

            try {
                while (true) {
                    if (map.size() * 512 / 1024 / 1024 >= 860) {
                        map.clear();
                        System.out.println("clean map");
                    }
                    byte[] b1;
                    for (int i = 0; i < 100; i++) {
                        b1 = new byte[512];
                        map.put(System.nanoTime(), b1);
                    }
                    Thread.sleep(1);
                }
            } catch (Exception e) {


            }
        }
    }

    public static class PrintThread extends Thread{
        public static final long starttime=System.currentTimeMillis();

        @Override
        public void run() {
            try{
                while(true){
                    long t=System.currentTimeMillis()-starttime;
                    System.out.println(t/1000+"."+t%1000);
                    
                }
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args){
        MyThread t=new MyThread();
        PrintThread p=new PrintThread();
        t.start();
        p.start();
    }
}
