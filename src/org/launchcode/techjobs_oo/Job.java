package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job(Object product_tester, Employer acme, Location desert, PositionType quality_control, CoreCompetency persistence) {

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String info = "\n";
        info += "ID: " + id + '\n';
        if (getName().isBlank()){
            info += "Name not available\n";

        } else {
            info += "name: " + name + '\n';
        }
        if (getEmployer().toString().isBlank()){
            info += "Employer not available\n";
        } else {
            info += "employer: " + employer + '\n';
        }
        if (getLocation().toString().isBlank()){
            info += "Location not available\n";
        } else {
            info += "location: " + location + '\n';
        }
        if (getPositionType().toString().isBlank()){
            info += "Position Type not available\n";
        } else {
            info += "positionType: " + positionType + '\n';
        }
        if (getCoreCompetency().toString().isBlank()){
            info += "Core Competency is not available\n";
        } else {
            info += "coreCompetency: " + coreCompetency + '\n';
        }
        return info;
//                "id: " + id + '\n' +
//                "name: " + name + '\n' +
//                "employer: " + employer + '\n' +
//                "location: " + location + '\n' +
//                "positionType: " + positionType + '\n' +
//                "coreCompetency: " + coreCompetency + '\n';
    }


}


