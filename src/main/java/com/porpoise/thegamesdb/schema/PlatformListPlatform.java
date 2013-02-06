package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/5/13
 * Time: 5:30 PM
 */
@XmlRootElement(name = "Platform")
public class PlatformListPlatform {
    private int id;
    private String name;
    private String alias;

    public int getId() {
        return id;
    }

    @XmlElement(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    @XmlElement(name = "alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
