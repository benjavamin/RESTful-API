/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, String>{
    
    public List<Course> findByTopicId(String topicId);
}
