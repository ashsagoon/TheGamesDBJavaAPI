package com.porpoise.thegamesdb.client;

import java.util.List;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/7/13
 * Time: 7:13 PM
 */
public class GamesDBPlatform {
    private int id;
    private String basePlatformUrl;
    private String name;
    private String alias;
    private GamesDBPlatformDetails platformDetails;
    private List<GamesDBGame> games;

    public GamesDBPlatform() {
    }

    public GamesDBPlatform(int id, String basePlatformUrl, String name, String alias) {
        this.id = id;
        this.basePlatformUrl = basePlatformUrl;
        this.name = name;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBasePlatformUrl() {
        return basePlatformUrl;
    }

    public void setBasePlatformUrl(String basePlatformUrl) {
        this.basePlatformUrl = basePlatformUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public GamesDBPlatformDetails getPlatformDetails() {
        if(platformDetails == null) {
            platformDetails = TheGamesDBClient.getPlatform(id);
        }
        return platformDetails;
    }

    public void setPlatformDetails(GamesDBPlatformDetails platformDetails) {
        this.platformDetails = platformDetails;
    }

    public List<GamesDBGame> getGames() {
        if(games == null) {
            games = TheGamesDBClient.getPlatformGames(id);
        }
        return games;
    }

    public void setGames(List<GamesDBGame> games) {
        this.games = games;
    }
}
