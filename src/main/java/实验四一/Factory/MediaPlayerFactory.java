package 实验四一.Factory;

import 实验四一.Api.MediaPlayerAPI;
import 实验四一.List.MediaPlayerList;
import 实验四一.List.PlayList;
import 实验四一.Window.Mainwindow;
import 实验四一.Window.MediaPlayerWindow;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:38
 **/
public class MediaPlayerFactory implements PlayerFactory {
    @Override
    public Mainwindow creatMainwindow() {
        System.out.println("MediaPlayerFactorywuindow");
        return new MediaPlayerWindow();
    }

    @Override
    public PlayList creatPlayList() {
        System.out.println( "MediaPlayerFactorylist");
        return new MediaPlayerList();
    }
}

