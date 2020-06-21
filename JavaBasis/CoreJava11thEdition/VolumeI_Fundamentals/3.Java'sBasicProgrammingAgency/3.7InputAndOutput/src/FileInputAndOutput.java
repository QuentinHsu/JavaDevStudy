import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

// 文件输入和输出
public class FileInputAndOutput {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);
    }
}
