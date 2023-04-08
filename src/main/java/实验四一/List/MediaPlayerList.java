package 实验四一.List;

import 实验四一.Api.MediaPlayerAPI;
import 实验四一.Window.Mainwindow;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:43
 **/
public class MediaPlayerList extends PlayList{
    private MediaPlayerAPI mediaPlayerAPI=new MediaPlayerAPI();
    public void PlayerList() {
        System.out.println("MediaPlayerList");
  mediaPlayerAPI.list();
    }

}
