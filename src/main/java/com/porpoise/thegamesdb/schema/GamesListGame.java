package com.porpoise.thegamesdb.schema;

import com.porpoise.thegamesdb.transformer.GameTransformer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/1/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Game")
public class GamesListGame {
    private int id;
    private String gameTitle;
    private String rawReleaseDate;
    private Date releaseDate;
    private String platform;
    private String thumb;

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
        releaseDate = GameTransformer.transform(rawReleaseDate);
    }

    @XmlElement(name = "Platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @XmlElement(name = "thumb")
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GamesListGame:");
        sb.append("\n\tid: " + id);
        sb.append("\n\ttitle: " + gameTitle);
        sb.append("\n\trelease date: " + releaseDate);
        sb.append("\n\tplatform: " + platform);
        return sb.toString();
    }
}
