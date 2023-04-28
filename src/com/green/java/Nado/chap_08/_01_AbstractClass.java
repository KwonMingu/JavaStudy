package com.green.java.Nado.chap_08;

import com.green.java.Nado.chap_08.camera.Camera;
import com.green.java.Nado.chap_08.camera.FactoryCam;
import com.green.java.Nado.chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
