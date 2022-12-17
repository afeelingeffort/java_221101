import java.io.*;

//역시 출력이 안되는군..
public class java_p650_BufferedReader_BufferedWriter_ex15_11 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java_p650_BufferedReader_BufferedWriter_ex15_11.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                if (line.indexOf(";") != -1) {
                    System.out.println(i + ":" + line);
                }
            }
            br.close();
        } catch (IOException e) {
        }
    }
}
