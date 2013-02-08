package com.porpoise.thegamesdb.client;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/7/13
 * Time: 5:54 PM
 */
public class GamesDBImage {
    protected String side;
    protected int width;
    protected int height;
    protected String thumb;
    protected String url;

    public GamesDBImage(String side, int width, int height, String thumb, String url) {
        this.side = side;
        this.width = width;
        this.height = height;
        this.thumb = thumb;
        this.url = url;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
