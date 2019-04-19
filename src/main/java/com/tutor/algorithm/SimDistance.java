package com.tutor.algorithm;


public class SimDistance {

    public double EuclideanDistance(float[] v1,float[] v2){
        double distance=0;
        if(v1.length==v2.length){
            for (int i=0;i<v1.length;i++){
                if (v1[i]>0 || v2[i] >0){
                    double temp=Math.pow((v1[i]-v2[i]),2);
                    distance += temp;
                }
            }
            distance=Math.sqrt(distance);
        }
        return distance;
    }


}
