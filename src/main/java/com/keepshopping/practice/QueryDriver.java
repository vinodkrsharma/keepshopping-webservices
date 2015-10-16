package com.keepshopping.practice;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class QueryDriver {

	public static void main(String[] args) {
		DB dB=(new MongoClient("ds039484.mongolab.com",39484)).getDB("keepshopping");
		DBCollection dBCollection=dB.getCollection("fruitvegetable");
		BasicDBObject basicDBObject=new BasicDBObject();
		basicDBObject.put("itemName", "Chausa Mango");
		
		DBCursor dBCursor=dBCollection.find(basicDBObject);
		
		while (dBCursor.hasNext()) {
			System.out.println(dBCursor.next());
		}
	}
}
