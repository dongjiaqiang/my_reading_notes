/**
 * Created by geek on 15-9-8.
 */
public class TestStackDeep {
    private static int count=0;

    public static void recursion(long a,long b,long c){
        long e=1,f=2,g=3,h=4,i=5,k=6,l=7,m=8,n=9,x=10;
        count++;
        recursion(a,b,c);
    }
    public static void recursion(){
        count++;
        recursion();
    }

    public void localvar1(){
        int a=0;
        System.out.println(a);
        int b=0;
    }

    public void localvar2(){
        {
            int a=0;
            System.out.println(a);
        }
        int b=0;
    }

    //函数中在对上分配了一个6M的堆空间,并由a变量引用,显示调用gc方法无法释放a引用的堆空间.
    public void localvarGC1(){
        byte[] a=new byte[6*1024*1024];
        System.gc();
    }
    //函数显示的将a设置为null,显示调用gc可以成功回收
    public void localvarGC2(){
        byte[] a=new byte[6*1024*1024];
        a=null;
        System.gc();
    }
    //调用gc方法时a变量已经过期,但是局部变量表未被销毁,所以gc方法无法起作用
    public void localvarGC3(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }
    //b变量重用了a变量的槽位,使得gc方法可以其作用
    public void localvarGC4(){
        {
            byte[] a=new byte[6*1024*1024];
        }
        long b=8;
        System.gc();;
    }
    //调用localvarGC1方法可以使得局部变量表被销毁,显示gc可以其作用.
    public void localvarGC5() {
        localvarGC1();
        System.gc();
    }
    public static void main(String[] args){
      /*  try {
            recursion();
        }catch (Throwable e){
            System.out.println("deep of Calling: "+count);
        }*/
        new TestStackDeep().localvarGC4();
    }
}
