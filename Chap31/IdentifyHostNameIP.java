import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by xute02 on 2016/11/4.
 */
public class IdentifyHostNameIP {
    public static void main(String[] args) {
        for (int i = 0; i<args.length; i++) {
            try {
                InetAddress address = InetAddress.getByName(args[i]);
                System.out.print("Host name: " + address.getHostName());
                System.out.println("IP address: " + address.getHostAddress());
            }
            catch (UnknownHostException ex) {
                System.err.println("Unknown host or IP address: " + args[i]);
            }
        }
    }
}
