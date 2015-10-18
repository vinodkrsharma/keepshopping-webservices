package com.keepshopping.practice;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class NewQueryDriver {

	public static void main(String[] args) {
		MongoClientURI uri  = new MongoClientURI("mongodb://vinod:vinod121@ds039484.mongolab.com:39484/keepshopping"); 
        MongoClient client = new MongoClient(uri);
        DB db = client.getDB("keepshopping");
        
        DBCollection confectionary = db.getCollection("Confectionary");
		BasicDBObject basicDBObject=new BasicDBObject();
		basicDBObject.put("itemName", "Truffle");
		
		DBCursor dBCursor=confectionary.find(basicDBObject);
		
		while (dBCursor.hasNext()) {
			System.out.println(dBCursor.next());
		}
	}
}
