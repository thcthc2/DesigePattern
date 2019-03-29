package proxy.staticProxy;

public class PlayerImp implements Player {
    public void login() {
        System.out.println("玩家登陆游戏");
    }

    public void killBoss() {
        System.out.println("玩家击杀了BOSS");
    }

    public void logout() {
        System.out.println("玩家退出登陆");
    }
}
