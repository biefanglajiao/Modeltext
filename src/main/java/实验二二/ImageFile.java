package 实验二二;

public class ImageFile extends AbstractFile{
    @Override
    public void addAbstractFile(AbstractFile abstractFile) {
        System.out.println("ImageFile add Error");
    }

    @Override
    public void removeAbstractFile(AbstractFile abstractFile) {
        System.out.println("ImageFile remove Error");
    }

    @Override
    public void display() {
        System.out.println("常兆海ImageFile display！！");
    }
}
