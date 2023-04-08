package 实验四一.Factory;

import 实验四一.List.PlayList;
import 实验四一.List.RealPlayerList;
import 实验四一.Window.Mainwindow;
import 实验四一.Window.RealPlayerWindow;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:39
 **/
public class RealPlayerFactory implements PlayerFactory{
    @Override
    public Mainwindow creatMainwindow() {
        System.out.println("RealPlayerFactorywindow");
        return new RealPlayerWindow();
    }

    @Override
    public PlayList creatPlayList() {

        System.out.println( "RealPlayerFactorylist");
        return new RealPlayerList();
    }
}
