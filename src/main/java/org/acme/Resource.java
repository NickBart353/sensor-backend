package org.acme;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.*;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Resource {

    @Inject
    WerteRepository werteRepository;

    @Inject
    GegossenRepository gegossenRepository;

    @Path("/login")
    @POST
    @Transactional
    public boolean login_user(){
        return true;
    }

    @Path("/post/werte")
    @POST
    @Transactional
    public Werte create(String vals) {
        String[] valsArray = vals.split(",");
        double co_zwei = Double.parseDouble(valsArray[0]);
        double erdfeuchtigkeit  = Double.parseDouble(valsArray[1]);
        Werte werte = new Werte(co_zwei, erdfeuchtigkeit);
        werteRepository.persist(werte);
        return werte;
    }

    @Path("/post/gegossen")
    @POST
    @Transactional
    public Gegossen create() {
        Gegossen gegossen = new Gegossen();
        gegossenRepository.persist(gegossen);
        return gegossen;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/werte")
    public List<Werte> listWert() {
        return werteRepository.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/gegossen")
    public List<Gegossen> listGegossen() {
        return gegossenRepository.listAll();
    }
}