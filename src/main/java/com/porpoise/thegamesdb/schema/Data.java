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
public class Data {
    private List<Game> games;

    @XmlElement(name = "Game")
    public List<Game> getGames() {
        if(null==games) {
            games = new ArrayList<Game>();
        }
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Game game : games) {
            sb.append(game.toString() + "\n");
        }
        return sb.toString();
    }
}
