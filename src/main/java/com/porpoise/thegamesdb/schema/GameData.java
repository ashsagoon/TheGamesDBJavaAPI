package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/3/13
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Data")
public class GameData {
    private String baseImgUrl;
    private GameGame game;

    @XmlElement(name = "baseImgUrl")
    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    @XmlElement(name = "Game")
    public GameGame getGame() {
        return game;
    }

    public void setGame(GameGame game) {
        this.game = game;
    }
}
