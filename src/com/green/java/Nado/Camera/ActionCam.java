package com.green.java.Nado.Camera;

public class ActionCam extends Camera {
    public String lens = "광각렌즈";
    public ActionCam() {
        super();
    }

    public void makeVideo() {
        System.out.println(this.name + "멋진 비디오를 제각합니다.");
    }
}
