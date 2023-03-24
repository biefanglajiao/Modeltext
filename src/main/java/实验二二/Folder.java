package 实验二二;

import java.util.ArrayList;

public class Folder extends AbstractFile{

     private  ArrayList arrayList=new ArrayList();
    @Override
    public void addAbstractFile(AbstractFile abstractFile) {
       arrayList.add(abstractFile);
    }

    @Override
    public void removeAbstractFile(AbstractFile abstractFile) {
        arrayList.remove(abstractFile);
    }

    @Override
    public void display() {
        for (Object o:arrayList
             ) {

            ((AbstractFile)o).display();

        }
    }
}
