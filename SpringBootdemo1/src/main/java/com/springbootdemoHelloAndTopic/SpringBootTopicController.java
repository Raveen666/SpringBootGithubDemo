package com.springbootdemoHelloAndTopic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTopicController {
	
	//1
	/*
	 * @RequestMapping("/topics") 
	 * public String AllTopics() { 
	 * return "AllTopics"; 
	 * }
	 */
	
	
	
     //2
	/*
	 * @RequestMapping("/topics") 
	 * public List<Topic> AllTopics() { 
	 * return Arrays.asList(new Topic("Spring","SpringFramework","SpringFrameworkdescriptions"), 
	 *                      new Topic("java","corejava", "core java descriptions"), 
	 *                      new Topic("javaScript","JavaScript","JavaScriptDescriptions") ); }
	 */
	
	//3
	//get request used for display all topics using service class and get request is default not mention
	@Autowired
	private TopicService topicService;
	
	//a) get all topics using getrequest
	@RequestMapping("/topics")
	public List<Topic> AllTopics(){
		return topicService.AllTopics();
		
	}
	
	//b) get request used for display one topic from Topics with particular id
	// we pass an argument in the method @PathVariable which tolds spring MVC what type of request is payload in order to peek that request from this topics and take to me
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//c)post request
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
		
	}
	
	//d)put request for updating the data of particular id
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
		topicService.updateTopic(id,topic);
		
	}
	
	//e)delete request for deleting data of particular id
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
