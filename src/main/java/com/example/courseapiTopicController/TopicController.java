package com.example.courseapiTopicController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "JAVA", "JAVA Description") /*passing values to TopicClass Constructor which
                                                                                    returns data in JSON format in web browser*/
        );
    }
}
