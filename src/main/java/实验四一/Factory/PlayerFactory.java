package 实验四一.Factory;

import 实验四一.List.PlayList;
import 实验四一.Window.Mainwindow;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:25
 **/
public interface PlayerFactory {
  public Mainwindow creatMainwindow();
  public PlayList creatPlayList();
}
