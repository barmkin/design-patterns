package it.gb.remoteControls;

public interface Device {

    public void turnOn();

    public void turnOff();

    public void increaseChannel();

    public void decreaseChannel();
    
    public void setChannel(int channel);

    public void increaseVolume();

    public void decreaseVolume();
    
    public void setVolume(int volume);


}
