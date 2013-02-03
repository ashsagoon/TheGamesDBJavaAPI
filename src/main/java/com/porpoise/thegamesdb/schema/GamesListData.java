package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/1/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Data")
public class GamesListData {
    private List<GamesListGame> gamesListGames;

    @XmlElement(name = "Game")
    public List<GamesListGame> getGamesListGames() {
        if(null== gamesListGames) {
            gamesListGames = new ArrayList<GamesListGame>();
        }
        return gamesListGames;
    }

    public void setGamesListGames(List<GamesListGame> gamesListGames) {
        this.gamesListGames = gamesListGames;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(GamesListGame gamesListGame : gamesListGames) {
            sb.append(gamesListGame.toString() + "\n");
        }
        return sb.toString();
    }
}
