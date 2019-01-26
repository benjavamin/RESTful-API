package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    
    
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("JavaScript", "JavaScript", "JavaScript Description")
        ));
    
    public List<Topic> getAllTopics(){
        /*return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);*/
        
        return (List<Topic>)topicRepository.findAll();
    }
    
    public Topic getTopic(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        Topic topic = topicRepository.findById(id).get();
        return topic;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
        
    }

    public void updateTopic(String id,Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(Topic topic) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(topic);
    }
    
    
    
}
