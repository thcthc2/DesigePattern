package proxy.staticProxy;

public class Test {
    public static void main(String[] args) {
        PlayerImp player = new PlayerImp();
        PlayerProxy playerProxy = new PlayerProxy(player);
        playerProxy.login();
        playerProxy.killBoss();
        playerProxy.logout();
    }
}
