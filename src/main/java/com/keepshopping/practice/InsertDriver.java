package com.keepshopping.practice;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class InsertDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DB dB=(new MongoClient("localhost",27017)).getDB("keepshopping");
		DBCollection dBCollection=dB.getCollection("fruitvegetable");
		BasicDBObject basicDBObject=new BasicDBObject();
		basicDBObject.put("itemName", "Chausa Mango");
		basicDBObject.put("price", 150);
		basicDBObject.put("quantity", "1 dozen");
		basicDBObject.put("quantityLeft", "50.0 dozen");
		basicDBObject.put("type", "fruit");
		dBCollection.insert(basicDBObject);
	}
}
