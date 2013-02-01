package com.porpoise.thegamesdb.client;


import com.porpoise.thegamesdb.schema.Data;
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

    public Data getGamesList(String game) {
        Data data = null;
        try {
            HttpGet request = new HttpGet("http://thegamesdb.net/api/GetGamesList.php?name=" + URLEncoder.encode(game, "UTF-8"));
            HttpResponse response = httpClient.execute(request);
            JAXBContext context = JAXBContext.newInstance(Data.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            data = (Data)unmarshaller.unmarshal(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return data;
    }
}
