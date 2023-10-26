package it.gb.remoteControls;

import it.gb.remoteControls.Radio.RadioRegion;

public abstract class RemoteControlsApp {
    
    public static void executeRemoteControlsApp() {
        System.out.println("Using a remote to turn on the Radio");
        Radio radio = new Radio(RadioRegion.ITU_R1);
        BasicRemote radioRemote = new BasicRemote(radio);
        radioRemote.powerOn();
        radioRemote.channelUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.powerOff();

        System.out.println("Using an advanced remote to turn on the TV");
        Television tv = new Television();
        AdvancedRemote advancedTvRemote = new AdvancedRemote(tv);
        advancedTvRemote.powerOn();
        advancedTvRemote.channelDown();
        advancedTvRemote.volumeDown();
        advancedTvRemote.setVolume(30);
        advancedTvRemote.setChannel(123);
        advancedTvRemote.powerOff();

        System.out.println("Using an advanced remote to turn on the radio");
        AdvancedRemote advancedRadioRemote = new AdvancedRemote(radio);
        advancedRadioRemote.powerOn();
        advancedRadioRemote.volumeDown();
        advancedRadioRemote.setVolume(60);
        advancedRadioRemote.setChannel(123);
        advancedRadioRemote.setChannel(95023);
        advancedRadioRemote.channelUp();
        advancedRadioRemote.powerOff();

    }
}
