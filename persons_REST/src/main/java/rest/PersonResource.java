/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import facade.FacadePerson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Oliver
 */
@Path("person")
public class PersonResource {
    
    //EntityManagerFactory emf;
    Gson gson;
    FacadePerson fp = new FacadePerson();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
    }

    /**
     * Retrieves representation of an instance of rest.PersonResource
     * @return an instance of java.lang.String
     */
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getPerosnById(String json, @PathParam("id") int id) {
        json = gson.toJson(fp.getPersonById(id));
        return Response.ok(json).build();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllPersons() {
        String json = gson.toJson(fp.getAllPersons());
        return json;
    }
    
    @Path("test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return "Hej";
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
