package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/5/13
 * Time: 5:39 PM
 */
@XmlRootElement(name = "Platforms")
public class PlatformListPlatforms {
    private List<PlatformListPlatform> platformListPlatforms;

    public List<PlatformListPlatform> getPlatformListPlatforms() {
        return platformListPlatforms;
    }

    @XmlElement(name = "Platform")
    public void setPlatformListPlatforms(List<PlatformListPlatform> platformListPlatforms) {
        this.platformListPlatforms = platformListPlatforms;
    }
}
