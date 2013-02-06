package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/5/13
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "Data")
public class PlatformListData {
    private String basePlatformUrl;
    private PlatformListPlatforms platforms;

    public String getBasePlatformUrl() {
        return basePlatformUrl;
    }

    @XmlElement(name = "basePlatformUrl")
    public void setBasePlatformUrl(String basePlatformUrl) {
        this.basePlatformUrl = basePlatformUrl;
    }

    public PlatformListPlatforms getPlatforms() {
        return platforms;
    }

    @XmlElement(name = "Platforms")
    public void setPlatforms(PlatformListPlatforms platforms) {
        this.platforms = platforms;
    }
}
