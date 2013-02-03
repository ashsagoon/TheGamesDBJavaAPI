package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/3/13
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */

public class GameGenre {
    private String genre;

    @XmlElement(name = "genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
