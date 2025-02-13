package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 20, message = "Location length is too long")
    public String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public @NotBlank @Size(max = 20, message = "Location length is too long") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(max = 20, message = "Location length is too long") String location) {
        this.location = location;
    }


}
