package com.geniedev.screenmatch;

import com.geniedev.screenmatch.math.Clasification;

public class Episodes implements Clasification {

    private int num;
    private String name;
    private  Series series;
    private int viewsT ;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClasification() {
        if (viewsT > 100){
            return  4;
        }else {
            return 2;
        }
    }
}
