package io.javabrains.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    
    
    public List<Course> getAllCourses(String topicId){
        /*List<Course> topics = new ArrayList<>();
        courseRepository.findAll()
                .forEach(topics::add);*/
        
        return (List<Course>)courseRepository.findByTopicId(topicId);
    }
    
    public Course getCourse(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        Course course = courseRepository.findById(id).get();
        return course;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
        
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Course course) {
        //topics.removeIf(t -> t.getId().equals(id));
        courseRepository.delete(course);
    }
    
    
    
}
