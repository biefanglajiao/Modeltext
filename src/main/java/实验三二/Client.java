package 实验三二;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 10:28
 **/
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Inverstor inverstor = new ConcreteInverstor();
        stock.attach(inverstor);
        stock.setStockName("股票：常兆海2020007657");
        stock.getStockName();
        stock.setPrice(100);
        stock.setPrice(50);
        stock.notifyInverstor();
        System.out.println("!!!!!!!!!!!!!!");
        stock.setPrice(100);
        stock.setPrice(102);
        stock.notifyInverstor();
    }
}
