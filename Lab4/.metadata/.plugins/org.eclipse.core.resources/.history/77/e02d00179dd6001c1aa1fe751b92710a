package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import insect.Insect;
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
	
	public static Insect insectParse(HttpServletRequest request) {
		Insect insect = new Insect();
		JsonElement jsonElement = bodyParse(request);
		insect.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		insect.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		insect.setAge(jsonElement.getAsJsonObject().get("age").getAsInt());
		insect.setDesc(jsonElement.getAsJsonObject().get("desc").getAsString());
		return insect;
	}
	
	public static int getNextId(List<Insect> list) {
		int maxId = 0;
		
		Iterator<Insect> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByInsectId(int id,List<Insect> list) {
		int listId = id;
		
		Iterator<Insect> iterator = list.iterator();
		while(iterator.hasNext()) {
			Insect temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}
