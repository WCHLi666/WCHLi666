import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello, 韩顺平教育!");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello2, 韩顺平教育!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3, 韩顺平教育!");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
