package com.example.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;



public class ViewJSON {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		//By default all fields without explicit view definition are included, disable this
		mapper.configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);
		 
		//For testing
		ViewUser user = createDummyUser();
		
		try {
			//display name only
			String jsonInString = mapper.writerWithView(Views.NameOnly.class).writeValueAsString(user);
			System.out.println(jsonInString);
			
			//display namd ana age
			jsonInString = mapper.writerWithView(Views.AgeAndName.class).writeValueAsString(user);
			System.out.println(jsonInString);
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	private static ViewUser createDummyUser(){
		
		ViewUser user = new ViewUser();
		
		user.setName("mkyong");
		user.setAge(33);

		List<String> msg = new ArrayList<String>();
		msg.add("hello jackson 1");
		msg.add("hello jackson 2");
		msg.add("hello jackson 3");

		user.setMessages(msg);
		
		return user;
		
	}
}