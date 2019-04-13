import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by hyf on 2019/4/14 1:15
 */
public class CreateFile {
    public void create(String answer) {
        File file = new File("answer.txt");
        try (FileOutputStream fop = new FileOutputStream(file)) {
            // get the content in bytes
            byte[] contentInBytes = answer.getBytes();
            fop.write(contentInBytes);
            fop.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
