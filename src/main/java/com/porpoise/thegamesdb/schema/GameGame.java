package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/3/13
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement(name = "Game")
public class GameGame {
    private int id;
    private String gameTitle;
    private String platform;
    private String rawReleaseDate;
    private Date releaseDate;
    private String overview;
    private String ESRB;
    private List<GameGenre> Genres;
    private String players;
    private String coop;
    private String youtube;
    private String publisher;
    private String developer;
    private double rating;
    private GameImages gameImages;

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

    @XmlElement(name = "Platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @XmlElement(name = "ReleaseDate")
    public String getRawReleaseDate() {
        return rawReleaseDate;
    }

    public void setRawReleaseDate(String rawReleaseDate) {
        this.rawReleaseDate = rawReleaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @XmlElement(name = "Overview")
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @XmlElement(name = "ESRB")
    public String getESRB() {
        return ESRB;
    }

    public void setESRB(String ESRB) {
        this.ESRB = ESRB;
    }

    @XmlElement(name = "Genres")
    public List<GameGenre> getGenres() {
        return Genres;
    }

    public void setGenres(List<GameGenre> genres) {
        Genres = genres;
    }

    @XmlElement(name = "Players")
    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    @XmlElement(name = "Co-op")
    public String getCoop() {
        return coop;
    }

    public void setCoop(String coop) {
        this.coop = coop;
    }

    @XmlElement(name = "Youtube")
    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    @XmlElement(name = "Publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @XmlElement(name = "Developer")
    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @XmlElement(name = "Rating")
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @XmlElement(name = "Images")
    public GameImages getGameImages() {
        return gameImages;
    }

    public void setGameImages(GameImages gameImages) {
        this.gameImages = gameImages;
    }
}
