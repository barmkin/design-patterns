package it.gb.remoteControls;

public class Television implements Device {

    private final int MIN_CHANNEL = 1;
    private final int MAX_CHANNEL = 200;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;

    private int channelNumber;
    private int volume;

    public Television() {
        super();
        this.channelNumber = this.MIN_CHANNEL;
        this.volume = this.MIN_VOLUME;
    }

    @Override
    public void turnOn() {
        System.out.println("[TV] Power ON");
    }

    @Override
    public void turnOff() {
        System.out.println("[TV] Power OFF");
    }

    @Override
    public void increaseChannel() {
        if (this.channelNumber < this.MAX_CHANNEL) {
            this.channelNumber++;
        } else {
            this.channelNumber = this.MIN_CHANNEL;
        }
        System.out.println("[TV] Channel: " + this.channelNumber);
    }

    @Override
    public void decreaseChannel() {
        if (this.channelNumber > this.MIN_CHANNEL) {
            this.channelNumber--;
        } else {
            this.channelNumber = this.MAX_CHANNEL;
        }
        System.out.println("[TV] Channel: " + this.channelNumber);
    }

    @Override
    public void setChannel(int channel) {
        if (channel < this.MIN_CHANNEL || channel > this.MAX_CHANNEL) {
            System.err.println("Channel does not exist!");
        } else {
            this.channelNumber = channel;
        }
        System.out.println("[TV] Channel: " + this.channelNumber);
    }

    @Override
    public void increaseVolume() {
        if (this.volume == this.MAX_VOLUME) {
            System.err.println("MAX VOLUME REACHED");
        } else {
            this.volume++;
        }
        System.out.println("[TV] Volume: " + this.volume + " %");
    }

    @Override
    public void decreaseVolume() {
        if (this.volume == this.MIN_VOLUME) {
            System.err.println("MIN VOLUME REACHED");
        } else {
            this.volume--;
        }
        System.out.println("[TV] Volume: " + this.volume + " %");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < this.MIN_VOLUME || volume > this.MAX_VOLUME) {
            System.err.println("Invalid volume level!");
        } else {
            this.volume = volume;
        }
        System.out.println("[TV] Volume: " + this.volume + " %");
    }

}
