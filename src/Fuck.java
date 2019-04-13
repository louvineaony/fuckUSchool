import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by hyf on 2019/4/14 0:48
 */
public class Fuck {

    private String[] texts;

    private void fuckReady(String url) {
//        数组对象，用来储存答案
        texts = new String[64];
//        文档对象，用来接收html页面
        Document document;
        try {
//            获取指定网址的页面内容
            document = Jsoup.connect(url).timeout(50000).get();
//        通过Document的select方法获取class为green的Elements结点集合
            Elements elements = document.select(".green");
            for (int i = 0; i < 64; i++) {
//            获取文本
                texts[i] = elements.get(i).text();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fuck(String url) {
        fuckReady(url);
        for (int i = 0; i < 64; i++) {
//            去除选项干扰
            texts[i] = texts[i].substring(2).replace("　", " ").replace("’", "'").trim();
//            添加题号
            texts[i] = (i + 1) + ". " + texts[i];
        }
    }

    public String[] getTexts() {
        return texts;
    }

    @Override
    public String toString() {
//        生成字符串
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 64; i++) {
            builder.append(texts[i]).append("\n");
        }
        return builder.toString();
    }
}
