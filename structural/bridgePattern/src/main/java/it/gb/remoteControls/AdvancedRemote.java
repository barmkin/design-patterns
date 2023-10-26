package it.gb.remoteControls;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setChannel(int channel) {
        this.device.setChannel(channel);
    }
    
    public void setVolume(int volume) {
        this.device.setVolume(volume);
    }
}
