/**
 * Created by geek on 15-9-8.
 */
public class SimpleHeap {
    private int id;
    public SimpleHeap(int id) {
        this.id = id;
    }
    public void show(){
        System.out.println("My ID is: "+id);
    }
    public static void main(String[]args){
        SimpleHeap s1=new SimpleHeap(1);
        SimpleHeap s2=new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
