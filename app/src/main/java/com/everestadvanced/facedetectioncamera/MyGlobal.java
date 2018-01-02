package com.everestadvanced.facedetectioncamera;

import android.app.Application;

/**
 * Created by Administrator on 11/13/2017.
 */

public class MyGlobal extends Application
{
    public static float SmileProbabitlity;
    public static float leftEye;
    public static float rightEye;
    public static int noOfFaceDetected;

    public void setSmileProbabitlity(float SmileProbabitlit) {
        SmileProbabitlity=SmileProbabitlit;
    }
    public float getSmileProbabitlity(){return SmileProbabitlity;}

    public void setleftEye(float leftEy){leftEye=leftEy;}
    public float getleftEye(){return leftEye;}

    public void setrightEye(float rightEy){rightEye=rightEy;}
    public float getrightEye(){return rightEye;}

    public void setnoOfFaceDetected(int noOfFaceDetecte){noOfFaceDetected=noOfFaceDetecte;}
    public int getnoOfFaceDetected(){return noOfFaceDetected;}

}


