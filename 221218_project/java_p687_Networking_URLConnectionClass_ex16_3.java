import java.net.URL;
import java.net.URLConnection;

public class java_p687_Networking_URLConnectionClass_ex16_3 {

    public static void main(String[] args) {
        String address = "http://www.codechobo.com/sample/hello.html";

        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            System.out.println("conn.toString(): " + conn);
            System.out.println("getAllowUserInteraction(): " + conn.getAllowUserInteraction());
            System.out.println("\tgetConnectTimeout(): " + conn.getConnectTimeout());
            System.out.println("getContent(): " + conn.getContent());
            System.out.println("getContentEncoding(): " + conn.getContentEncoding());
            System.out.println("\tgetContentLength(): " + conn.getContentLengthLong());
            System.out.println("getContentType(): " + conn.getContentType());
            System.out.println("\tgetDate(): " + conn.getDate());
            System.out.println("getDefaultAllowUserInteraction(): " + conn.getDefaultAllowUserInteraction());
            System.out.println("getDefaultUseCaches(): " + conn.getDefaultUseCaches());
            System.out.println("\tgetDoInput(): " + conn.getDoInput());
            System.out.println("getDoOutput(): " + conn.getDoOutput());
            System.out.println("\tgetExpiration(): " + conn.getExpiration());
            System.out.println("getHeaderFields(): " + conn.getHeaderFields());
            System.out.println("getIfModifiedSince(): " + conn.getIfModifiedSince());
            System.out.println("\tgetLastModified(): " + conn.getLastModified());
            System.out.println("getReadTimeout(): " + conn.getReadTimeout());
            System.out.println("getURL(): " + conn.getURL());
            System.out.println("getUseCaches(): " + conn.getUseCaches());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
