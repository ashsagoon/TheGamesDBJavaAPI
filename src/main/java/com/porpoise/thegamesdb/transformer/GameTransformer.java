package com.porpoise.thegamesdb.transformer;

import com.porpoise.thegamesdb.client.*;
import com.porpoise.thegamesdb.schema.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Company: Porpoise Software
 * User: Terminus Est
 * Date: 2/7/13
 * Time: 5:32 PM
 */
public class GameTransformer {
    public static GamesDBGameDetails transform(GameData gameData) {
        GameGame game = gameData.getGame();
        GamesDBGameDetails gameDetails = new GamesDBGameDetails();
        if(gameData != null) {
            gameDetails.setId(game.getId());
            gameDetails.setGameTitle(game.getGameTitle());
            gameDetails.setPlatform(game.getPlatform());
            gameDetails.setReleaseDate(game.getReleaseDate());
            gameDetails.setOverview(game.getOverview());
            gameDetails.setESRB(game.getESRB());
            gameDetails.setGenres(transform(game.getGenres()));
            gameDetails.setPlayers(game.getPlayers());
            gameDetails.setCoop(game.getCoop());
            gameDetails.setYoutube(game.getYoutube());
            gameDetails.setPublisher(game.getPublisher());
            gameDetails.setDeveloper(game.getDeveloper());
            gameDetails.setRating(game.getRating());
            gameDetails.setImages(transform(game.getGameImages(), gameData.getBaseImgUrl()));
        }
        return gameDetails;
    }

    public static GamesDBImages transform(GameImages gameImages) {
        return transform(gameImages, null);
    }

    public static GamesDBImages transform(GameImages gameImages, String baseImgUrl) {
        GamesDBImages images = new GamesDBImages();
        if(gameImages != null) {
            images.setBaseImgUrl(baseImgUrl);
            images.setBanners(transformImages(gameImages.getBanners()));
            images.setBoxart(transformImages(gameImages.getBoxarts()));
            images.setClearLogos(transformImages(gameImages.getClearLogos()));
            images.setFanart(transformImages(gameImages.getFanarts()));
            images.setScreenshots(transformImages(gameImages.getScreenshots()));
        }
        return images;
    }

    private static List<GamesDBImage> transformImages(List<?> gameImages) {
        List<GamesDBImage> images = new ArrayList<GamesDBImage>();
        if (gameImages != null && gameImages.size() > 0) {
            if (gameImages.get(0) instanceof GameImage) {
                List<GameImage> gameImageList = (List<GameImage>) gameImages;
                for (GameImage image : gameImageList) {
                    images.add(new GamesDBImage(image.getSide(), image.getWidth(),
                            image.getHeight(), image.getThumb(), image.getUrl()));
                }
            }
        }
        return images;
    }

    private static List<String> transform(List<GameGenre> gameGenres) {
        List<String> genres = new ArrayList<String>();
        if(gameGenres != null) {
            for(GameGenre genre : gameGenres) {
                genres.add(genre.getGenre());
            }
        }
        return genres;
    }

    public static Date transform(String date) {
        if(date != null) {
            try {
                if(date.matches("^\\d{2}/\\d{2}/\\d{4}")) {
                    return new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(date);
                } else if (date.matches("^\\d{4}")) {
                    return new SimpleDateFormat("yyyy", Locale.ENGLISH).parse(date);
                }
            } catch (ParseException e) {
                //couldn't parse date
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return null;
    }

    public static List<GamesDBGame> transform(GamesListData gamesListSchema) {
        List<GamesDBGame> games = new ArrayList<GamesDBGame>();
        if(gamesListSchema != null) {
            for(GamesListGame game : gamesListSchema.getGamesListGames()) {
                games.add(transform(game));
            }
        }
        return games;
    }

    private static GamesDBGame transform(GamesListGame gamesListGame) {
        GamesDBGame game = new GamesDBGame();
        if(gamesListGame != null) {
            game.setId(gamesListGame.getId());
            game.setGameTitle(gamesListGame.getGameTitle());
            game.setPlatform(gamesListGame.getPlatform());
            game.setReleaseDate(gamesListGame.getReleaseDate());
            game.setThumb(gamesListGame.getThumb());
        }
        return game;
    }

    public static List<GamesDBPlatform> transform(List<PlatformListPlatform> platformList, String basePlatformUrl) {
        List<GamesDBPlatform> platforms = new ArrayList<GamesDBPlatform>();
        if(platformList != null) {
            for(PlatformListPlatform platform : platformList) {
                platforms.add(new GamesDBPlatform(platform.getId(), basePlatformUrl, platform.getName(), platform.getAlias()));
            }
        }
        return platforms;
    }

    public static GamesDBPlatformDetails transform(PlatformPlatform platformPlatform, String baseImgUrl) {
        GamesDBPlatformDetails platform = new GamesDBPlatformDetails();
        if(platformPlatform != null) {
            platform.setConsole(platformPlatform.getConsole());
            platform.setController(platformPlatform.getController());
            platform.setCpu(platformPlatform.getCpu());
            platform.setDeveloper(platformPlatform.getDeveloper());
            platform.setDisplay(platformPlatform.getDisplay());
            platform.setId(platformPlatform.getId());
            platform.setImages(transformImages(platformPlatform.getPlatformImages()));
            platform.setManufacturer(platformPlatform.getManufacturer());
            platform.setMaxControllers(platformPlatform.getMaxControllers());
            platform.setMedia(platformPlatform.getMedia());
            platform.setMemory(platformPlatform.getMemory());
            platform.setOverview(platformPlatform.getOverview());
            platform.setPlatform(platformPlatform.getPlatform());
            platform.setRating(platformPlatform.getRating());
            platform.setSound(platformPlatform.getSound());
            platform.setYouTube(platformPlatform.getYouTube());
        }
        return platform;
    }

    private static GamesDBImages transformImages(PlatformImages platformImages) {
        GamesDBImages images = new GamesDBImages();
        if(platformImages != null) {
            images.setFanart(transformImages(platformImages.getFanarts()));
            images.setConsolearts(transformImages(platformImages.getConsolearts()));
            images.setBanners(transformImages(platformImages.getBanners()));
            images.setBoxart(transformImages(platformImages.getBoxarts()));
            images.setControllerarts(transformImages(platformImages.getControllerarts()));
        }
        return images;
    }

    public static GamesDBUpdate transform(UpdateItems updateItems) {
        GamesDBUpdate update = new GamesDBUpdate();
        if(updateItems != null) {
            update.setTime(updateItems.getTime());
            List<GamesDBGame> games = new ArrayList<GamesDBGame>();
            if(updateItems.getGames() != null) {
                for(Integer id : updateItems.getGames()) {
                    games.add(new GamesDBGame(id));
                }
            }
            update.setGames(games);
        }
        return update;
    }
}
