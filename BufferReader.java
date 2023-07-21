import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\a.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
public void close() throws IOException {
            synchronized (lock) {
                if (in == null)
                    return;
                try {
                    in.close();
                } finally {
                    in = null;
                    cb = null;
                }
            }
        }
    }
bufferedReader.close();
}