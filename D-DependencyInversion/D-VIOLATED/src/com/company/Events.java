package com.company;

import Device.Camera;
import Device.Flycam;

public class Events {
    // As we can see,Events is a high level module and it depends on low modules such as Camera and FLyCam
    public static void main(String[] args) {
        Flycam flycam = new Flycam();
        Camera camera = new Camera();

        camera.takePicture();
        flycam.takePicture();
    }
}
