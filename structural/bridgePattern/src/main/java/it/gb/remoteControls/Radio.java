package it.gb.remoteControls;

public class Radio implements Device {

    public static enum RadioRegion {
        ITU_R1,
        ITU_R2,
        ITU_R3,
        JAPAN,
        OIRT
    }

    public static final int channelStep = 200; // KHz

    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;
    private final int MIN_CHANNEL; // KHz
    private final int MAX_CHANNEL; // KHz

    private int channelNumber;
    private int volume;

    public Radio(RadioRegion region) {
        super();
        this.volume = this.MIN_VOLUME;
        switch (region) {
            case ITU_R1:
                MIN_CHANNEL = 87500;
                MAX_CHANNEL = 108000;
                break;
            case ITU_R2:
                MIN_CHANNEL = 88000;
                MAX_CHANNEL = 108000;
                break;
            case ITU_R3:
                MIN_CHANNEL = 87000;
                MAX_CHANNEL = 108000;
                break;
            case JAPAN:
                MIN_CHANNEL = 76000;
                MAX_CHANNEL = 95000;
                break;
            case OIRT:
                MIN_CHANNEL = 65900;
                MAX_CHANNEL = 74000;
                break;
            default:
                throw new IllegalArgumentException("Invalid region " + region);
        }
        this.channelNumber = this.MIN_CHANNEL;
    }

    @Override
    public void turnOn() {
        System.out.println("[Radio] Power ON");
    }

    @Override
    public void turnOff() {
        System.out.println("[Radio] Power OFF");
    }

    @Override
    public void increaseChannel() {
        if ( (this.channelNumber + Radio.channelStep) <= this.MAX_CHANNEL) {
            // Clip
            this.channelNumber = this.channelNumber - (this.channelNumber % Radio.channelStep) + Radio.channelStep;
        }
        System.out.println("[Radio] Channel: " + this.channelNumber + " kHz");
    }

    @Override
    public void decreaseChannel() {
        if ( (this.channelNumber - Radio.channelStep) >= this.MIN_CHANNEL ) {
            // Clip
            this.channelNumber = this.channelNumber - (this.channelNumber % Radio.channelStep) - Radio.channelStep;
        }
        System.out.println("[Radio] Channel: " + this.channelNumber + " kHz");
    }

    @Override
    public void setChannel(int channel) {
        if ( ((channel + Radio.channelStep) <= this.MIN_CHANNEL) ||
          ((channel - Radio.channelStep) >= this.MAX_CHANNEL) ) {
            System.err.println("Channel does not exist!");
        } else {
            this.channelNumber = channel;
            if (this.channelNumber % Radio.channelStep != 0) {
                System.out.println("[Radio] Radio noise...");
            }
        }
        System.out.println("[Radio] Channel: " + this.channelNumber + " kHz");
    }

    @Override
    public void increaseVolume() {
        if (this.volume == this.MAX_VOLUME) {
            System.err.println("MAX VOLUME REACHED");
        } else {
            this.volume++;
        }
        System.out.println("[Radio] Volume: " + this.volume + " %");
    }

    @Override
    public void decreaseVolume() {
        if (this.volume == this.MIN_VOLUME) {
            System.err.println("MIN VOLUME REACHED");
        } else {
            this.volume--;
        }
        System.out.println("[Radio] Volume: " + this.volume + " %");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < this.MIN_VOLUME || volume > this.MAX_VOLUME) {
            System.err.println("Invalid volume level!");
        } else {
            this.volume = volume;
        }
        System.out.println("[Radio] Volume: " + this.volume + " %");
    }
}
