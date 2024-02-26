package edu.iu.habahram.remotecontroller.model;

public class CeilingFan {
    private int speed; //

    public CeilingFan() {
        speed = 0; //
    }

    public void high() {
        speed = 3;
        System.out.println("Ceiling fan set to high speed.");
    }

    public void medium() {
        speed = 2;
        System.out.println("Ceiling fan set to medium speed.");
    }

    public void low() {
        speed = 1;
        System.out.println("Ceiling fan set to low speed.");
    }

    public void getSpeed() {
        String speedText;
        switch (speed) {
            case 0:
                speedText = "off";
                break;
            case 1:
                speedText = "low";
                break;
            case 2:
                speedText = "medium";
                break;
            case 3:
                speedText = "high";

