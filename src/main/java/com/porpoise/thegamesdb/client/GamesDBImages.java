package com.porpoise.thegamesdb.client;

import java.util.List;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/7/13
 * Time: 5:35 PM
 */
public class GamesDBImages {
    private String baseImgUrl;
    private List<GamesDBImage> fanart;
    private List<GamesDBImage> boxart;
    private List<GamesDBImage> clearLogos;
    private List<GamesDBImage> banners;
    private List<GamesDBImage> screenshots;
    private List<GamesDBImage> consolearts;
    private List<GamesDBImage> controllerarts;


    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    public List<GamesDBImage> getFanart() {
        return fanart;
    }

    public void setFanart(List<GamesDBImage> fanart) {
        this.fanart = fanart;
    }

    public List<GamesDBImage> getBoxart() {
        return boxart;
    }

    public void setBoxart(List<GamesDBImage> boxart) {
        this.boxart = boxart;
    }

    public List<GamesDBImage> getClearLogos() {
        return clearLogos;
    }

    public void setClearLogos(List<GamesDBImage> clearLogos) {
        this.clearLogos = clearLogos;
    }

    public List<GamesDBImage> getBanners() {
        return banners;
    }

    public void setBanners(List<GamesDBImage> banners) {
        this.banners = banners;
    }

    public List<GamesDBImage> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<GamesDBImage> screenshots) {
        this.screenshots = screenshots;
    }

    public List<GamesDBImage> getConsolearts() {
        return consolearts;
    }

    public void setConsolearts(List<GamesDBImage> consolearts) {
        this.consolearts = consolearts;
    }

    public List<GamesDBImage> getControllerarts() {
        return controllerarts;
    }

    public void setControllerarts(List<GamesDBImage> controllerarts) {
        this.controllerarts = controllerarts;
    }
}
