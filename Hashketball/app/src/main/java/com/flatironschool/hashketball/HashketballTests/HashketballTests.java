package com.flatironschool.hashketball.HashketballTests;

import android.test.InstrumentationTestCase;

import com.flatironschool.hashketball.Hashketball;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class HashketballTests extends InstrumentationTestCase {

    private static Hashketball mHashketball = new Hashketball();

    @Override
    protected void setUp() {

    }

    public void testHashketballInitialization() throws Exception {
       assertTrue(mHashketball.getBasketballGame().getClass() == HashMap.class);
    }

    public void testHomeTeam() throws Exception {
        HashMap<String, Object> homeTeam = mHashketball.getBasketballGame().get("homeTeam");
        assertTrue(homeTeam.getClass() == HashMap.class);

        assertEquals(homeTeam.get("name"), "Brooklyn Nets");

        assertTrue(((String[])homeTeam.get("colors")).length == 2);
        assertEquals(((String[])homeTeam.get("colors"))[0], "Black");
        assertEquals(((String[])homeTeam.get("colors"))[1], "White");

        ArrayList<HashMap<String, Object>> players = (ArrayList<HashMap<String, Object>>)homeTeam.get("players");
        assertTrue(players.size() == 5);

        assertEquals((players.get(0)).get("name"), "Deron Williams");
        assertEquals((players.get(0)).get("jerseyNumber"), "8");
        assertEquals((players.get(0)).get("shoeSize"), "13");

        assertEquals((players.get(1)).get("name"), "Brook Lopez");
        assertEquals((players.get(1)).get("jerseyNumber"), "11");
        assertEquals((players.get(1)).get("shoeSize"), "20");

        assertEquals((players.get(2)).get("name"), "Paul Pierce");
        assertEquals((players.get(2)).get("jerseyNumber"), "34");
        assertEquals((players.get(2)).get("shoeSize"), "15");

        assertEquals((players.get(3)).get("name"), "Kevin Garnett");
        assertEquals((players.get(3)).get("jerseyNumber"), "2");
        assertEquals((players.get(3)).get("shoeSize"), "15");

        assertEquals((players.get(4)).get("name"), "Reggie Evans");
        assertEquals((players.get(4)).get("jerseyNumber"), "30");
        assertEquals((players.get(4)).get("shoeSize"), "14");
    }

    public void testAwayTeam() throws Exception {
        HashMap<String, Object> awayTeam = mHashketball.getBasketballGame().get("awayTeam");
        assertTrue(awayTeam.getClass() == HashMap.class);

        assertEquals(awayTeam.get("name"), "Chicago Bulls");

        assertTrue(((String[])awayTeam.get("colors")).length == 2);
        assertEquals(((String[])awayTeam.get("colors"))[0], "Black");
        assertEquals(((String[])awayTeam.get("colors"))[1], "Red");

        ArrayList<HashMap<String, Object>> players = (ArrayList<HashMap<String, Object>>)awayTeam.get("players");
        assertTrue(players.size() == 5);

        assertEquals((players.get(0)).get("name"), "Joakim Noah");
        assertEquals((players.get(0)).get("jerseyNumber"), "13");
        assertEquals((players.get(0)).get("shoeSize"), "23");

        assertEquals((players.get(1)).get("name"), "Jimmy Butler");
        assertEquals((players.get(1)).get("jerseyNumber"), "21");
        assertEquals((players.get(1)).get("shoeSize"), "15");

        assertEquals((players.get(2)).get("name"), "Kirk Hinrich");
        assertEquals((players.get(2)).get("jerseyNumber"), "12");
        assertEquals((players.get(2)).get("shoeSize"), "13");

        assertEquals((players.get(3)).get("name"), "Carlos Boozer");
        assertEquals((players.get(3)).get("jerseyNumber"), "5");
        assertEquals((players.get(3)).get("shoeSize"), "18");

        assertEquals((players.get(4)).get("name"), "Mike Dunleavy");
        assertEquals((players.get(4)).get("jerseyNumber"), "34");
        assertEquals((players.get(4)).get("shoeSize"), "12");
    }

    @Override
    protected void tearDown() {

    }
}
