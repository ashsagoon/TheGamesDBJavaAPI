package com.porpoise.thegamesdb.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/5/13
 * Time: 5:47 PM
 */
@XmlRootElement(name = "Platform")
public class Platform {
    private int id;
    private String platform;
    private String console;
    private String controller;
    private String overview;
    private String developer;
    private String manufacturer;
    private String cpu;
    private String memory;
    private String sound;
    private String display;
    private String media;
    private String maxControllers;
    private String youTube;
    private double rating;
    private PlatformImages platformImages;

    public int getId() {
        return id;
    }

    @XmlElement(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    @XmlElement(name = "Platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getConsole() {
        return console;
    }

    @XmlElement(name = "console")
    public void setConsole(String console) {
        this.console = console;
    }

    public String getController() {
        return controller;
    }

    @XmlElement(name = "controller")
    public void setController(String controller) {
        this.controller = controller;
    }

    public String getOverview() {
        return overview;
    }

    @XmlElement(name = "overview")
    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDeveloper() {
        return developer;
    }

    @XmlElement(name = "developer")
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @XmlElement(name = "manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCpu() {
        return cpu;
    }

    @XmlElement(name = "cpu")
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    @XmlElement(name = "memory")
    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSound() {
        return sound;
    }

    @XmlElement(name = "sound")
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getDisplay() {
        return display;
    }

    @XmlElement(name = "display")
    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMedia() {
        return media;
    }

    @XmlElement(name = "media")
    public void setMedia(String media) {
        this.media = media;
    }

    public String getMaxControllers() {
        return maxControllers;
    }

    @XmlElement(name = "maxcontrollers")
    public void setMaxControllers(String maxControllers) {
        this.maxControllers = maxControllers;
    }

    public String getYouTube() {
        return youTube;
    }

    @XmlElement(name = "Youtube")
    public void setYouTube(String youTube) {
        this.youTube = youTube;
    }

    public double getRating() {
        return rating;
    }

    @XmlElement(name = "Rating")
    public void setRating(double rating) {
        this.rating = rating;
    }

    public PlatformImages getPlatformImages() {
        return platformImages;
    }

    @XmlElement(name = "Images")
    public void setPlatformImages(PlatformImages platformImages) {
        this.platformImages = platformImages;
    }
}
