package com.geniedev.screenmatch.math;
import com.geniedev.screenmatch.Title;

public class TimeCalculator {
    private int time;

    public int getTime() {
        return time;
    }

    public void addList(Title title){
        this.time += title.getDurationMinutes();
    }


}
