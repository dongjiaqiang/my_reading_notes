/**
 * Created by geek on 15-9-9.
 */
public class CanReliveObj {
    public static CanReliveObj obj;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("CanReliveObj finalize called");
        obj=this;
    }
    @Override
    public String toString() {
        return "CanReliveObj{}";
    }
    public static void main(String [] args)throws InterruptedException{
        obj=new CanReliveObj();
        obj=null;
        //这里obj设置为null,调用gc是将触发finalize方法,在这个方法中对象将被复活
        System.gc();
        Thread.sleep(1000);
        if(obj==null)
            System.out.println("obj是null");
        else
            System.out.println("obj可用");
        System.out.println("第2次gc");
        obj=null;
        //finalize方法只能被调用一次,对象真正被回收.
        System.gc();
        Thread.sleep(1000);
        if(obj==null)
            System.out.println("obj是null");
        else
            System.out.println("obj可用");

    }
}
