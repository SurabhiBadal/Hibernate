package com.MappingDemo;

import javax.persistence.*;
import java.util.*;
@Entity
public class Employee {
    @Id
    private int eid;
    private String name;
    @ManyToMany
    private List<Project> projects;

    public Employee() {
    }

    public Employee(int eid, String name, List<Project> projects) {
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
