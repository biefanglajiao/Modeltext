package 实验四一.Window;

import 实验四一.Api.MediaPlayerAPI;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:41
 **/
public class MediaPlayerWindow extends Mainwindow {
    private MediaPlayerAPI mediaPlayerAPI =new MediaPlayerAPI();

    @Override
    public void PlayerWindow() {
        System.out.println("MediaPlayerWindow");
        mediaPlayerAPI.window();
    }
}
