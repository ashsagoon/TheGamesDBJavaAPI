package com.porpoise.thegamesdb.client;


import com.porpoise.thegamesdb.schema.*;
import com.porpoise.thegamesdb.transformer.GameTransformer;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Terminus Est
 * Date: 2/1/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheGamesDBClient {
    private static HttpClient httpClient;

    public TheGamesDBClient() {
        httpClient = new DefaultHttpClient();
    }

    public static List<GamesDBGame> getGamesList(String game) {
        return GameTransformer.transform(getGamesListSchema(game));
    }

    protected static GamesListData getGamesListSchema(String game) {
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

    public static GamesDBGameDetails getGame(int id) {
        return GameTransformer.transform(getGameSchema(id));
    }

    protected static GameData getGameSchema(int id) {
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

    public static GamesDBImages getArt(int id) {
        GameArtData gameArtData = getArtSchema(id);
        return GameTransformer.transform(gameArtData.getImages(), gameArtData.getBaseImgUrl());
    }

    protected static GameArtData getArtSchema(int id) {
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

    public static List<GamesDBPlatform> getPlatformsList() {
        PlatformListData platformListData = getPlatformsListSchema();
        return GameTransformer.transform(platformListData.getPlatforms().getPlatformListPlatforms(), platformListData.getBasePlatformUrl());
    }

    protected static PlatformListData getPlatformsListSchema() {
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

    public static GamesDBPlatformDetails getPlatform(int id) {
        PlatformData platformData = getPlatformSchema(id);
        return GameTransformer.transform(platformData.getPlatformPlatform(), platformData.getBaseImgUrl());
    }

    protected static PlatformData getPlatformSchema(int id) {
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

    public static List<GamesDBGame> getPlatformGames(int id) {
        return GameTransformer.transform(getPlatformGamesSchema(id));
    }

    protected static GamesListData getPlatformGamesSchema(int id) {
        GamesListData gamesListData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetPlatformGames.php?platform=" + id);
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

    public static List<GamesDBGame> getPlatFormGames(String platform) {
        return GameTransformer.transform(platformGamesSchema(platform));
    }

    protected static GamesListData platformGamesSchema(String platform) {
        GamesListData gamesListData = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/PlatformGames.php?platform=" + URLEncoder.encode(platform, "UTF-8"));
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

    public static GamesDBUpdate updates(int time) {
        return GameTransformer.transform(updatesSchema(time));
    }

    protected static UpdateItems updatesSchema(int time) {
        UpdateItems updateItems = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/Updates.php?time=" + time);
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(UpdateItems.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            updateItems = (UpdateItems)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return updateItems;
    }
}
