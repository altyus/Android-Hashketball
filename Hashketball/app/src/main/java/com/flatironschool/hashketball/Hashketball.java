package com.flatironschool.hashketball;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by altyus on 6/30/14.
 */
public class Hashketball {

    private HashMap<String, HashMap> mBasketballGame;

    public Hashketball(){

        mBasketballGame = new HashMap<String, HashMap>();

        createHomeTeam();
        createAwayTeam();
    }

    private void createHomeTeam(){
        HashMap<String, Object> homeTeam = new HashMap<String, Object>();
        homeTeam.put("name", "Brooklyn Nets");
        homeTeam.put("colors", new String[]{"Black", "White"});

        HashMap<String, Object> dWill = new HashMap<String, Object>();
        dWill.put("name", "Deron Williams");
        dWill.put("jerseyNumber", "8");
        dWill.put("shoeSize", "13");

        HashMap<String, Object> brookLopez = new HashMap<String, Object>();
        brookLopez.put("name", "Brook Lopez");
        brookLopez.put("jerseyNumber", "11");
        brookLopez.put("shoeSize", "20");

        HashMap<String, Object> paulPierce = new HashMap<String, Object>();
        paulPierce.put("name", "Paul Pierce");
        paulPierce.put("jerseyNumber", "34");
        paulPierce.put("shoeSize", "15");

        HashMap<String, Object> kg = new HashMap<String, Object>();
        kg.put("name", "Kevin Garnett");
        kg.put("jerseyNumber", "2");
        kg.put("shoeSize", "15");

        HashMap<String, Object> reggieEvans = new HashMap<String, Object>();
        reggieEvans.put("name", "Reggie Evans");
        reggieEvans.put("jerseyNumber", "30");
        reggieEvans.put("shoeSize", "14");

        ArrayList<HashMap<String, Object>> players = new ArrayList<HashMap<String, Object>>();

        players.add(dWill);
        players.add(brookLopez);
        players.add(paulPierce);
        players.add(kg);
        players.add(reggieEvans);

        homeTeam.put("players", players);

        mBasketballGame.put("homeTeam", homeTeam);
    }

    private void createAwayTeam() {
        HashMap<String, Object> awayTeam = new HashMap<String, Object>();
        awayTeam.put("name", "Chicago Bulls");
        awayTeam.put("colors", new String[]{"Black", "Red"});

        HashMap<String, Object> jNoah = new HashMap<String, Object>();
        jNoah.put("name", "Joakim Noah");
        jNoah.put("jerseyNumber", "13");
        jNoah.put("shoeSize", "23");

        HashMap<String, Object> jButler = new HashMap<String, Object>();
        jButler.put("name", "Jimmy Butler");
        jButler.put("jerseyNumber", "21");
        jButler.put("shoeSize", "15");

        HashMap<String, Object> kHinrich = new HashMap<String, Object>();
        kHinrich.put("name", "Kirk Hinrich");
        kHinrich.put("jerseyNumber", "12");
        kHinrich.put("shoeSize", "13");

        HashMap<String, Object> boozer = new HashMap<String, Object>();
        boozer.put("name", "Carlos Boozer");
        boozer.put("jerseyNumber", "5");
        boozer.put("shoeSize", "18");

        HashMap<String, Object> dunleavy = new HashMap<String, Object>();
        dunleavy.put("name", "Mike Dunleavy");
        dunleavy.put("jerseyNumber", "34");
        dunleavy.put("shoeSize", "12");

        ArrayList<HashMap<String, Object>> players = new ArrayList<HashMap<String, Object>>();

        players.add(jNoah);
        players.add(jButler);
        players.add(kHinrich);
        players.add(boozer);
        players.add(dunleavy);

        awayTeam.put("players", players);

        mBasketballGame.put("awayTeam",awayTeam);
    }

    public HashMap<String, HashMap> getBasketballGame() {
        return mBasketballGame;
    }

    public String shoeSize(String name) {
        HashMap<String, HashMap> game = getBasketballGame();

        HashMap<String, Object> awayTeam = game.get("awayTeam");
        HashMap<String, Object> homeTeam = game.get("homeTeam");

        ArrayList<HashMap<String, Object>> awayPlayers = (ArrayList<HashMap<String, Object>>)awayTeam.get("players");
        ArrayList<HashMap<String, Object>> homePlayers = (ArrayList<HashMap<String, Object>>)homeTeam.get("players");

        ArrayList<HashMap<String, Object>> allPlayers = new ArrayList<HashMap<String, Object>>(awayPlayers);
        allPlayers.addAll(homePlayers);

        for (HashMap<String, Object> player :allPlayers){
            if (player.get("name").equals(name)){
                return (String)player.get("shoeSize");
            }
        }
        return null;
    }

    public String teamColors(String teamName) {
        HashMap<String, HashMap> game = getBasketballGame();

        HashMap<String, Object> awayTeam = game.get("awayTeam");
        HashMap<String, Object> homeTeam = game.get("homeTeam");

        HashMap<String, Object> desiredTeam = new HashMap<String, Object>();

        if (awayTeam.get("name").equals(teamName)){
            desiredTeam = awayTeam;
        }
        else if (homeTeam.get("name").equals(teamName)){
            desiredTeam = homeTeam;
        }

        if (desiredTeam != null) {
            StringBuilder colorString = new StringBuilder();

            for (String color :(String[])desiredTeam.get("colors")){
                if (colorString.length() > 0) {
                    colorString.append(", ");
                }
                colorString.append(color);
            }

            return colorString.toString();
        }
        return null;
    }

    public String[] teamNames(){
        HashMap<String, HashMap>game = getBasketballGame();

        ArrayList<String>teamNames = new ArrayList<String>();

        HashMap<String, Object> awayTeam = game.get("awayTeam");
        HashMap<String, Object> homeTeam = game.get("homeTeam");

        teamNames.add((String)awayTeam.get("name"));
        teamNames.add((String)homeTeam.get("name"));

        String [] teamNamesArray = new String[teamNames.size()];
        teamNamesArray = teamNames.toArray(teamNamesArray);

        return teamNamesArray;
    }

    public String[] playerNumbers(String teamName) {
        HashMap<String, HashMap> game = getBasketballGame();

        ArrayList<String> playerNumbers = new ArrayList<String>();

        HashMap<String, Object> awayTeam = game.get("awayTeam");
        HashMap<String, Object> homeTeam = game.get("homeTeam");

        HashMap<String, Object> desiredTeam = new HashMap<String, Object>();

        if (awayTeam.get("name").equals(teamName)) {
            desiredTeam = awayTeam;
        } else if (homeTeam.get("name").equals(teamName)) {
            desiredTeam = homeTeam;
        }

        ArrayList<HashMap<String, Object>> players = (ArrayList<HashMap<String, Object>>) desiredTeam.get("players");


        for (HashMap<String, Object> player : players) {
            playerNumbers.add((String) player.get("jerseyNumber"));
        }
        String[] playerNumbersArray = new String[playerNumbers.size()];
        playerNumbersArray = playerNumbers.toArray(playerNumbersArray);

        return playerNumbersArray;
    }

    public String playerWithLongestName() {
        HashMap<String, HashMap> game = getBasketballGame();

        HashMap<String, Object> awayTeam = game.get("awayTeam");
        HashMap<String, Object> homeTeam = game.get("homeTeam");

        ArrayList<HashMap<String, Object>> awayPlayers = (ArrayList<HashMap<String, Object>>) awayTeam.get("players");
        ArrayList<HashMap<String, Object>> homePlayers = (ArrayList<HashMap<String, Object>>) homeTeam.get("players");

        ArrayList<HashMap<String, Object>> allPlayers = new ArrayList<HashMap<String, Object>>(awayPlayers);
        allPlayers.addAll(homePlayers);

        String longestName = new String();

        for (HashMap<String, Object> player : allPlayers) {
            if (((String) player.get("name")).length() > longestName.length()) {
                longestName = (String) player.get("name");
            }
        }

        return longestName;
    }
}
