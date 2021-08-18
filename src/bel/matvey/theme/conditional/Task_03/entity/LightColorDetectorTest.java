package bel.matvey.theme.conditional.Task_03.entity;

import bel.matvey.theme.conditional.Task_03.LightColorDetector;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        System.out.println(detector.detect(581));
    }
}
