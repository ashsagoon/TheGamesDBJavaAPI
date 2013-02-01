package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/1/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Game")
public class Game {
    private int id;
    private String gameTitle;
    private String rawReleaseDate;
    private Date releaseDate;
    private String platform;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "GameTitle")
    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    @XmlElement(name = "ReleaseDate")
    public String getRawReleaseDate() {
        return rawReleaseDate;
    }

    public void setRawReleaseDate(String rawReleaseDate) {
        this.rawReleaseDate = rawReleaseDate;
        try {
            if(this.rawReleaseDate.matches("^\\d{2}/\\d{2}/\\d{4}")) {
                this.releaseDate = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(this.rawReleaseDate);
            } else if (this.rawReleaseDate.matches("^\\d{4}")) {
                this.releaseDate = new SimpleDateFormat("yyyy", Locale.ENGLISH).parse(this.rawReleaseDate);
            }
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @XmlElement(name = "Platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Game:");
        sb.append("\n\tid: " + id);
        sb.append("\n\ttitle: " + gameTitle);
        sb.append("\n\trelease date: " + releaseDate);
        sb.append("\n\tplatform: " + platform);
        return sb.toString();
    }
}
