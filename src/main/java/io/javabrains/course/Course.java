package io.javabrains.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import io.javabrains.topic.Topic;
import java.io.Serializable;
import javax.persistence.ManyToOne;

@Entity
public class Course implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    
    @ManyToOne
    private Topic topic;

    public Course() {
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
