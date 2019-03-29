package adapter.objectadapter;

public class VGAHDMIAdapter implements RequireAdapter {
    private VGAOutput VGAOutput;

    public VGAHDMIAdapter(VGAOutput VGAOutput) {
        this.VGAOutput = VGAOutput;
    }

    public void HDMI() {
        this.VGAOutput.VGA();
    }
}
