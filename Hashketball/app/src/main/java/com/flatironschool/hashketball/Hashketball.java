package com.flatironschool.hashketball;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by altyus on 6/30/14.
 */
public class Hashketball {

    private HashMap<String, HashMap> mBasketballGame;

    public Hashketball(){

        mBasketballGame = new HashMap<String, HashMap>();

    }

    public HashMap<String, HashMap> getBasketballGame() {
        return mBasketballGame;
    }
}
