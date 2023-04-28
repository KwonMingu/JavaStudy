package com.green.java.Nado.chap_08;

import com.green.java.Nado.chap_08.camera.FactoryCam;
import com.green.java.Nado.chap_08.detector.AdvanceFireDetector;
import com.green.java.Nado.chap_08.detector.Detectable;
import com.green.java.Nado.chap_08.detector.FireDector;
import com.green.java.Nado.chap_08.reporter.NormalReporter;
import com.green.java.Nado.chap_08.reporter.Reportable;
import com.green.java.Nado.chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDector = new FireDector();
        fireDector.detect();

        Detectable advancedFireDector = new AdvanceFireDetector();
        advancedFireDector.detect();

        System.out.println("======================");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
