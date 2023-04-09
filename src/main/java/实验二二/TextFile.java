package 实验二二;

public class TextFile extends AbstractFile{
    @Override
    public void addAbstractFile(AbstractFile abstractFile) {
        System.out.println("TextFile add Error");
    }

    @Override
    public void removeAbstractFile(AbstractFile abstractFile) {
        System.out.println("TextFile remove error");
    }

    @Override
    public void display() {
        System.out.println("2028班 TextFile  display!!");
    }
}
