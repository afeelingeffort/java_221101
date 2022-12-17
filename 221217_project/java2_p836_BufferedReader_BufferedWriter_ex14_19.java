import java.io.*;

public class java2_p836_BufferedReader_BufferedWriter_ex14_19 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java2_p836_BufferedReader_BufferedWriter_ex14_19.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                if (line.indexOf(",") != -1) {
                    System.out.println(i + ":" + line);
                }
            }
            br.close();
        } catch (IOException e) {
        }
    }
}
