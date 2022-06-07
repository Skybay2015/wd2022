package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import bed.Bed;
import jakarta.servlet.http.HttpServletRequest;

public class Helpers {
	
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static Bed bedParse(HttpServletRequest request) {
		Bed bed = new Bed();
		JsonElement jsonElement = bodyParse(request);
		bed.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		bed.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		bed.setPicture(jsonElement.getAsJsonObject().get("picture").getAsString());
		bed.setDesc(jsonElement.getAsJsonObject().get("desc").getAsString());
		return bed;
	}
	
	public static int getNextId(List<Bed> list) {
		int maxId = 0;
		
		Iterator<Bed> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByBedId(int id,List<Bed> list) {
		int listId = id;
		
		Iterator<Bed> iterator = list.iterator();
		while(iterator.hasNext()) {
			Bed temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}