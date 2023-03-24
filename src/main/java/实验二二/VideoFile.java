package 实验二二;

public class VideoFile extends AbstractFile{
    @Override
    public void addAbstractFile(AbstractFile abstractFile) {
        System.out.println(" VideoFile add Error");
    }

    @Override
    public void removeAbstractFile(AbstractFile abstractFile) {
        System.out.println(" VideoFile remove Error");
    }

    @Override
    public void display() {
        System.out.println(" VideoFile display!!");
    }
}
