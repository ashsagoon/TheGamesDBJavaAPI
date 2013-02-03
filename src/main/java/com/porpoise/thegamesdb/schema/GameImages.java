package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/3/13
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Images")
public class GameImages {
    private List<GameImageFanart> gameImageFanarts;
    private List<GameImage> gameImageBoxarts;
    private List<GameImage> clearLogos;
    private List<GameImage> banners;

    @XmlElement(name = "fanart")
    public List<GameImageFanart> getGameImageFanarts() {
        return gameImageFanarts;
    }

    public void setGameImageFanarts(List<GameImageFanart> gameImageFanarts) {
        this.gameImageFanarts = gameImageFanarts;
    }

    @XmlElement(name = "boxart")
    public List<GameImage> getGameImageBoxarts() {
        return gameImageBoxarts;
    }

    public void setGameImageBoxarts(List<GameImage> gameImageBoxarts) {
        this.gameImageBoxarts = gameImageBoxarts;
    }

    @XmlElement(name = "clearlogo")
    public List<GameImage> getClearLogos() {
        return clearLogos;
    }

    public void setClearLogos(List<GameImage> clearLogos) {
        this.clearLogos = clearLogos;
    }

    @XmlElement(name = "banner")
    public List<GameImage> getBanners() {
        return banners;
    }

    public void setBanners(List<GameImage> banners) {
        this.banners = banners;
    }
}
