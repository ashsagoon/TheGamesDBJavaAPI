package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/5/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Data")
public class GameArtData {
    private String baseImgUrl;
    private GameImages images;

    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    @XmlElement(name = "baseImgUrl")
    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    public GameImages getImages() {
        return images;
    }

    @XmlElement(name = "Images")
    public void setImages(GameImages images) {
        this.images = images;
    }
}
