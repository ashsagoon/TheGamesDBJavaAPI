package com.porpoise.thegamesdb.client;

import java.util.Date;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/7/13
 * Time: 5:39 PM
 */
public class GamesDBGame {
    private int id;
    private String gameTitle;
    private Date releaseDate;
    private String platform;
    private String thumb;
    private GamesDBGameDetails gameDetails;
    private GamesDBImages images;

    public GamesDBGame() {
    }

    public GamesDBGame(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public GamesDBGameDetails getGameDetails() {
        if(gameDetails == null) {
            gameDetails = TheGamesDBClient.getGame(id);
        }
        return gameDetails;
    }

    public GamesDBImages getImages() {
        if(images == null) {
            if(gameDetails != null) {
                images = gameDetails.getImages();
            } else {
                images = TheGamesDBClient.getArt(id);
            }
        }
        return images;
    }

}
