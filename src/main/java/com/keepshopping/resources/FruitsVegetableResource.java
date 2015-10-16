package com.keepshopping.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.keepshopping.model.Item;

@Path("fruitvegetable")
public class FruitsVegetableResource{
    
    private ArrayList<Item> items;
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Item> getIt() {
        List<Item> items=new ArrayList<Item>();
        
        return items;
    }
}