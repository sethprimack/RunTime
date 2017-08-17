package com.android.seth.runningapp.listview;

import com.android.seth.runningapp.Workout;

public class PastWorkout {
    private String toDisplay;
    private Workout workout;
    private String key;

    public PastWorkout(String toDisplay, Workout workout, String key){
        this.toDisplay= toDisplay;
        this.workout = workout;
        this.key = key;
    }

    public String getToDisplay(){
        return toDisplay;
    }

    public Workout getWorkout() {
        return workout;
    }

    public String getKey() { return key; }
}
