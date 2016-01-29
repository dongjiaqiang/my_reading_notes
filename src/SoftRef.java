import java.lang.ref.SoftReference;

/**
 * Created by geek on 15-9-9.
 */
public class SoftRef {
    public static class User{
        public  int id;
        public  String name;
        public User(int id,String name) {
            this.id=id;
            this.name=name;
        }
        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args){
        User u=new User(1,"g");
        SoftReference<User> userSoftRef=new SoftReference<User>(u);
        u=null;
        System.out.println(userSoftRef.get());
        System.gc();
        System.out.println("After gc");
        System.out.println(userSoftRef.get());

	byte[] b=new byte[1024*925*7];
	System.gc();
	System.out.println(userSoftRef.get());        
    }


}
