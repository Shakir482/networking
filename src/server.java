import java.io.*;
import java.net.*;
import java.nio.Buffer;


public class server {
    public static void main(String[] args) throws IOException {
        /// server things
        ServerSocket SS = new ServerSocket(3000);
        Socket S = SS.accept();
        System.out.println("client conected");
        /// In Bf things to server
        InputStreamReader In = new InputStreamReader(S.getInputStream());
        BufferedReader Bf = new BufferedReader(In);

        String Str = Bf.readLine();
        System.out.println("client:"+ Str);

    }
}