import java.net.*;
import java.io.*;


public class client {
    public static void main(String[] args) throws IOException {
        /// client things
        Socket S = new Socket("localhost", 3000);
        PrintWriter Pr = new PrintWriter(S.getOutputStream());
        Pr.println("hey you lol haha");
        Pr.flush();
    }
}