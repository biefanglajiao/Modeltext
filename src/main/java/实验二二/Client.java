package 实验二二;

/**
 * 2.组合模式的运用
 * （1）案例背景：
 * 在操作系统中，一个文件夹中可能存放着图像文件，视频文件，文本文件，也可能存放其他的文件夹，
 * 而对不同类型的文件进行的浏览操作也不一样，使用透明组合模式，绘制类图并编程实现文件的浏览（课
 * 本 197 页第二题）。
 * （2）实现步骤：
 *  根据题意，画出组合模式的类图，类图中应包含抽象文件类 AbstractFile，具体的图像文件类
 * ImageFile，视频文件类 VideoFile，文本文件类 TextFile 以及文件夹类 Folder，对每个文件都有
 * display（）方法，而对文件夹可以进行 add（）方法和 remove（）方法。
 *  根据类图，实现上述类的具体代码以及用户类 Client，在用户类中需要将不同类型的文件放入文
 * 件夹中。
 *  编译并运行程序，使程序能够输出对文件的浏览过程。
 */
public class Client {
    public static void main(String[] args) {

        AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;
        file1=new ImageFile();
        file2=new VideoFile();
        file3=new TextFile();
        file4=new VideoFile();

        folder1=new Folder();
        folder2=new Folder();
        folder3=new Folder();


        folder1.addAbstractFile(folder2);
        folder1.addAbstractFile(file1);
        folder1.addAbstractFile(folder3);


        folder2.addAbstractFile(file2);
        folder3.addAbstractFile(file3);
        folder3.addAbstractFile(file4);


folder1.display();
    }
}
