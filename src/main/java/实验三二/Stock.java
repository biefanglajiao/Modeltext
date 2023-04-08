package 实验三二;

import java.util.ArrayList;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 10:08
 **/
public  class Stock {
    protected ArrayList observes=new ArrayList();
    protected String stockName;
    protected ArrayList<Integer> price=new ArrayList();
    public void attach(Inverstor observer){
        observes.add(observer);
    }
    public void detach(Inverstor observer){
        observes.remove(observer);
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getPrice() {//获取增长额度
        int i = price.size();
            int a1 =  price.get(i-1);
          int   a2 =  price.get(i - 2);


        return (a2 - a1) / a1 * 100;
    }


        public void setPrice(int prices){
            price.add(prices);
        }

        public void notifyInverstor () {
            System.out.println("股票价格变化提醒:");
            if (getPrice() > 5) {
                for (Object o:observes){
                    ((Inverstor)o).upDate();
                }

            }
//            else System.out.println("股票价格影响" + getPrice() + "%，  不大");
        }
    }
