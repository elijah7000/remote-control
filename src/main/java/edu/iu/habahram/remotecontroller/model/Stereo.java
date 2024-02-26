package edu.iu.habahram.remotecontroller.model;

public class Stereo {
    private String location;
    private boolean poweredOn;
    private boolean cdPlaying;
    private boolean dvdPlaying;
    private boolean radioPlaying;
    private int volume;

    public Stereo(String location) {
        this.location = location;
        this.poweredOn = false;
        this.cdPlaying = false;
        this.dvdPlaying = false;
        this.radioPlaying = false;
        this.volume = 0;
    }

    public String on() {
        this.poweredOn = true;
        return location + " Stereo is on";
    }

    public String off() {
        this.poweredOn = false;
        this.cdPlaying = false;
        this.dvdPlaying = false;
        this.radioPlaying = false;
        this.volume = 0;
        return location + " Stereo is off";
    }

    public String setCD() {
        if (poweredOn) {
            this.cdPlaying = true;
            this.dvdPlaying = false;
            this.radioPlaying = false;
            return location + " Stereo is playing CD";
        } else {
            return location + " Stereo is not powered on";
        }
    }

    public String setDVD() {
        if (poweredOn) {
            this.cdPlaying = false;
            this.dvdPlaying = true;
            this.radioPlaying = false;
            return location + " Stereo is playing DVD";
        } else {
            return location + " Stereo is not powered on";
        }
    }

    public String setRadio() {
        if (poweredOn) {
            this.cdPlaying = false;
            this.dvdPlaying = false;
            this.radioPlaying = true;
            return location + " Stereo is playing radio";
        } else {
            return location + " Stereo is not powered on";
        }
    }

    public String setVolume(int volume) {
        if (poweredOn) {
            this.volume = volume;
            return location + " Stereo volume set to " + volume;
        } else {
            return location + " Stereo is not powered on";
        }
    }
}
