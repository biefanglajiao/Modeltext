package 实验一二;

public class ComputerAssembleDirector {
    private ComputerBuilder computerBuilder;

    public ComputerAssembleDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer assemble(){
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildHardDisk();
        computerBuilder.buildHost();
        computerBuilder.builddisplay();
        System.out.println("软件2028 常兆海 2020007657");
        return computerBuilder.getComputer();
    }
}
