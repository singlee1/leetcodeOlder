package multithreading;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author singlee
 * @create 2021-02-28-14:53
 */
public class ThreadDemo02{



    public static void main(String[] args) {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader("https://ss3.baidu.com/9fo3dSag_xI4khGko9WTAnF6hhy/image/pic/item/730e0cf3d7ca7bcbb8ab733eb1096b63f724a8cb.jpg","1.jpg");
        System.out.println("图片下载成功");

    }
}
//下载器
class WebDownLoader{
    //下载方法
    public void downLoader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件下载失败，Io有问题");//文件下载失败
        }
    }
}
