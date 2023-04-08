package 实验四一.Window;

import 实验四一.Api.RealPlayerAPI;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:41
 **/
public class RealPlayerWindow extends Mainwindow{
    private RealPlayerAPI realPlayerAPI ;



    public void RealPlayerWindow() {
        System.out.println("RealPlayerWindow");
        realPlayerAPI.window();

    }
}
