/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author oerte
 */
public class Quotes {
    
    
    private final List<String> quotesList = new ArrayList();

    public Quotes() {
        quotesList.add("We make a living by what we get, but we make a life by what we give.");
        quotesList.add("If you’re going through hell, keep going.");
        quotesList.add("You have enemies? Good. That means you’ve stood up for something, sometime in your life.");
        quotesList.add("To improve is to change, so to be perfect is to have changed often.");
        quotesList.add("Success consists of going from failure to failure without loss of enthusiasm.");
    }

    public List<String> getQuotesList() {
        return Collections.unmodifiableList(quotesList);
    }

    public void setQuotesList(String quotesList) {
        this.quotesList.add(quotesList);
    }
    
    
    
    
    
}
