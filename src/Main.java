import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hyf on 2019/4/14 1:23
 */
public class Main {
    public static void main(String[] args) {
        Fuck fuck = new Fuck();

//        测试
//        fuck.fuck("https://nocachemedia.ucampus.unipus.cn/uexercise/static/res/8951/1184899.htm");

//        上线
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入答案网址");
        fuck.fuck(scanner.nextLine());
        scanner.close();

        CreateFile createFile = new CreateFile();
        createFile.create(fuck.toString());
        try {
            Runtime.getRuntime().exec("C:\\WINDOWS\\system32\\notepad.exe answer.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
