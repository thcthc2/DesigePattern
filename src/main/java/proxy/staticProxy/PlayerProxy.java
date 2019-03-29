package proxy.staticProxy;

import java.util.Date;

public class PlayerProxy implements Player {
    private Player player;
    public PlayerProxy(Player player){
        this.player = player;
    }

    public void login() {
        System.out.println(new Date()+"开始登陆");
        this.player.login();
        System.out.println(new Date()+"登陆成功");
    }

    public void killBoss() {
        System.out.println(new Date()+"开始打击BOSS");
        this.player.killBoss();
    }

    public void logout() {
        this.player.logout();
        System.out.println("完成退出登陆");
    }
}
