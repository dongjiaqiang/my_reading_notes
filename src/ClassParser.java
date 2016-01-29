import java.io.*;

/**
 * Created by geek on 15-9-16.
 */
public class ClassParser {
    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    public static byte[] changeBytesOrder(byte[] src){
        byte[] dest=new byte[src.length];
        for(int i=1;i<=src.length;i++)
            dest[src.length-i]=src[i-1];
        return dest;
    }

    public static void main(String []args) throws FileNotFoundException,IOException {

        InputStream input=new FileInputStream(new File("/home/geek/understanding_the_jvm/out/production/understanding_the_jvm/TestClass.class"));

        byte[] magic_number=new byte[4];
        input.read(magic_number);
        System.out.println(bytesToHexString(magic_number));

        byte[] minor_version=new byte[2];
        input.read(minor_version);
        System.out.println(bytesToHexString(minor_version));
        byte[] major_version=new byte[2];
        input.read(major_version);
        System.out.println(bytesToHexString(major_version));

        byte[] constant_pool_count=new byte[2];
        input.read(constant_pool_count);
        System.out.println(Integer.toString(changeBytesOrder(constant_pool_count)[0]));

    }
}
