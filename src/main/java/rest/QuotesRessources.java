/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facade.QuoteFacade;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author oerte
 */
@Path("quotes")
public class QuotesRessources {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static QuoteFacade facade = new QuoteFacade();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Joke
     */
    public QuotesRessources() {
    }

    /**
     * Retrieves representation of an instance of
     * com.joergoertel.week.day2.ajax.fetch.dom.QuotesRessources
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQuotes() {
        String quote = facade.getQuote();
        return Response.ok()
                .header("Content-Type", "application/json")
                .entity(gson.toJson(quote)).build();
    }

    /**
     * PUT method for updating or creating an instance of QuotesRessources
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
