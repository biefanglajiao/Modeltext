package 实验二三;

public class Mainframe {

        private Cpu cpu=new Cpu();
        private Memory memory=new Memory();
        private HardDisk hardDisk=new HardDisk();
        private Os  os=new Os();


        public void run(){


                if (cpu.run()==1&&memory.check()==1&&hardDisk.read()==1&&os.load()==1) {
                    System.out.println("运行正常");
                }else {
                    System.out.println("运行异常");
                }


        }

}
