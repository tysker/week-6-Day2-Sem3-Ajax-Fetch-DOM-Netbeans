/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Quotes;
import java.util.List;

/**
 *
 * @author oerte
 */
public class QuoteFacade {

    private Quotes q = new Quotes();

    public String getQuote() {
        List<String> list = q.getQuotesList();
        String randomStr = list.get((int) (Math.random()*5));
        return randomStr;
    }

}
