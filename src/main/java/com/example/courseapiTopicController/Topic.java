package com.example.courseapiTopicController;

//1- Declare variables
//2- Generate Getters and Setters for all Variables
//3- Generate Constructor for all variables and a no argument constructor

public class Topic {
    private String name;
    private String id;
    private String description;

    public Topic()  //No Argument constructor
    {

    }

    public Topic(String name, String id, String description) {  //Constructor
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
