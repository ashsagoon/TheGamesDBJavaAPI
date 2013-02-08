package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/5/13
 * Time: 5:46 PM
 */

@XmlRootElement(name = "Data")
public class PlatformData {
    private String baseImgUrl;
    private PlatformPlatform platformPlatform;

    public String getBaseImgUrl() {
        return baseImgUrl;
    }

    @XmlElement(name = "baseImgUrl")
    public void setBaseImgUrl(String baseImgUrl) {
        this.baseImgUrl = baseImgUrl;
    }

    public PlatformPlatform getPlatformPlatform() {
        return platformPlatform;
    }

    @XmlElement(name = "Platform")
    public void setPlatformPlatform(PlatformPlatform platformPlatform) {
        this.platformPlatform = platformPlatform;
    }
}
