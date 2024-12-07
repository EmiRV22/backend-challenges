package com.geniedev.screenmatch;

public class Series extends Title{

    int season ;
    int episodes ;
    int minutesEpisode ;


    @Override
    public int getDurationMinutes() {
        return season * episodes * minutesEpisode;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }
}
