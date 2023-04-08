package 实验四一;

import 实验四一.Factory.PlayerFactory;
import 实验四一.List.PlayList;
import 实验四一.Window.Mainwindow;
import 实验四一.Window.MediaPlayerWindow;

/**
 * @Author: 常兆海
 * @Description:（1）案例背景： Windows Media Player 和 RealPlayer 是两种常用的媒体播放器，它们的 API 结构和调用方法存在差别，
 * 现在你的应用程序需要支持这两种播放器 API，并且将来可能还需要支持新的媒体播放器，根据给出的类
 * 图，回答该应用程序使用了哪些设计模式，并编程实现这个应用程序
 * @method: 工厂模式 适配器模式
 * @DateTime: 2023/4/8 11:17
 **/
public class Client {
    public static void main(String[] args) {

        PlayerFactory playerFactory = (PlayerFactory) Xmlutil.getbBean();


        Mainwindow window;
        PlayList list;
        window = playerFactory.creatMainwindow();
        list=playerFactory.creatPlayList();
        window.PlayerWindow();
        list.PlayerList();
    }
}
