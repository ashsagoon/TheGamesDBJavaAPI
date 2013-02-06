package com.porpoise.thegamesdb.client;


import com.porpoise.thegamesdb.schema.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/1/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheGamesDBClient {
    HttpClient httpClient;

    public TheGamesDBClient() {
        httpClient = new DefaultHttpClient();
    }

    public GamesListData getGamesList(String game) {
        GamesListData gamesListData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetGamesList.php?name=" + URLEncoder.encode(game, "UTF-8"));
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(GamesListData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            gamesListData = (GamesListData)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return gamesListData;
    }

    public GameData getGame(int id) {
        GameData gameData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetGame.php?id=" + id);
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(GameData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            gameData = (GameData)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return gameData;
    }

    public GameArtData getArt(int id) {
        GameArtData gameArtData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetArt.php?id=" + id);
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(GameArtData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            gameArtData = (GameArtData)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return gameArtData;
    }

    public PlatformListData getPlatformsList() {
        PlatformListData platformListData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetPlatformsList.php");
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(PlatformListData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            platformListData = (PlatformListData)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return platformListData;
    }

    public PlatformData getPlatform(int id) {
        PlatformData platformData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetPlatform.php?id=" + id);
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(PlatformData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            platformData = (PlatformData)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return platformData;
    }

}
