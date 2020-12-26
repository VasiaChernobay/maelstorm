import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String cmd = "ping -s 10000 -c 1 google.com";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        try {
            pr.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
    }
}
