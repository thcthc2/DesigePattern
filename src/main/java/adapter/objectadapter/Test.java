package adapter.objectadapter;

public class Test {
    public static void main(String[] args) {
        VGAOutput vgaOutput = new VGAOutput();
        VGAHDMIAdapter vgahdmiAdapter = new VGAHDMIAdapter(vgaOutput);
        vgahdmiAdapter.HDMI();
    }
}
