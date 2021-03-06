package com.springbootdemoHelloAndTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {

	/*
	 * private List<Topic> topics=Arrays.asList(new
	 * Topic("Spring","SpringFramework","SpringFrameworkdescriptions"), new
	 * Topic("java","corejava", "core java descriptions"), new
	 * Topic("javaScript","JavaScript","JavaScriptDescriptions") );
	 */
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("Spring","SpringFramework","SpringFrameworkdescriptions"), 
            new Topic("java","corejava", "core java descriptions"), 
          new Topic("javaScript","JavaScript","JavaScriptDescriptions") ));
	
	public List<Topic> AllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
}
