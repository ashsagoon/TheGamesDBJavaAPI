package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/3/13
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameImage {
    private String side;
    private int width;
    private int height;
    private String thumb;
    private String url;

    @XmlAttribute(name = "side")
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @XmlAttribute(name = "width")
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @XmlAttribute(name = "height")
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @XmlAttribute(name = "thumb")
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlValue
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }}
