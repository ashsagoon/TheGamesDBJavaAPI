package com.porpoise.thegamesdb.client;

import java.util.List;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/7/13
 * Time: 8:14 PM
 */
public class GamesDBUpdate {
    private int time;
    private List<GamesDBGame> games;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<GamesDBGame> getGames() {
        return games;
    }

    public void setGames(List<GamesDBGame> games) {
        this.games = games;
    }
}
