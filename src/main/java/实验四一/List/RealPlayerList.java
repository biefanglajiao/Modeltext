package 实验四一.List;

import 实验四一.Api.RealPlayerAPI;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 11:43
 **/
public class RealPlayerList extends PlayList {
    private RealPlayerAPI realPlayerAPI;

    public void PlayerList() {
        System.out.println("RealPlayerList");
        realPlayerAPI.list();
    }

}
