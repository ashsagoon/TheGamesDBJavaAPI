package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/3/13
 * Time: 11:53 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "fanart")
public class GameImageFanart extends GameImage {
    @XmlElement(name = "thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlElement(name = "original")
    public void setOriginal(GameImageFanartOriginal original) {
        url = original.getUrl();
        height = original.getWidth();
        width = original.getHeight();
    }

    public void setUrl(String url) {
        if(!url.equals("\n")) {
            this.url = url;
        }
    }

    public String getUrl() {
        return url;
    }

    public GameImage toGameImage() {
        GameImage gameImage = new GameImage();
        gameImage.setHeight(height);
        gameImage.setSide(side);
        gameImage.setThumb(thumb);
        gameImage.setUrl(url);
        gameImage.setWidth(width);
        return gameImage;
    }
}
