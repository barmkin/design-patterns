package it.gb.remoteControls;

public abstract class RemoteControl {
    
    protected Device device;

    public RemoteControl(Device device) {
        super();
        this.device = device;
    }

    public void powerOn() {
        this.device.turnOn();
    }

    public void powerOff() {
        this.device.turnOff();
    }

    public void channelUp() {
        this.device.increaseChannel();;
    }

    public void channelDown() {
        this.device.decreaseChannel();;
    }

    public void volumeUp() {
        this.device.increaseVolume();
    }

    public void volumeDown() {
        this.device.decreaseVolume();
    }
}
