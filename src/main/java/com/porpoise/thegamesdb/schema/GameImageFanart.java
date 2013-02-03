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
public class GameImageFanart {
    private GameImage original;
    private String thumb;

    @XmlElement(name = "original")
    public GameImage getOriginal() {
        return original;
    }

    public void setOriginal(GameImage original) {
        this.original = original;
    }

    @XmlElement(name = "thumb")
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
