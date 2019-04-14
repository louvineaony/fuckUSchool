import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hyf on 2019/4/14 1:23
 */
public class Main {

    private static String url = "https://nocachemedia.ucampus.unipus.cn/uexercise/static/res/";

    public static void main(String[] args) {
        Fuck fuck = new Fuck();

//        测试
//        fuck.fuck("https://nocachemedia.ucampus.unipus.cn/uexercise/static/res/8951/1184899.htm");

//        上线
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学校Id");
        url = url + scanner.nextLine() + "/";
        System.out.println("请输入试卷Id");
        url = url + scanner.nextLine() + ".htm";
        fuck.fuck(url);
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
