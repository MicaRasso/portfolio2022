package com.portfolio.MR.DTO;

import javax.validation.constraints.NotNull;

public class SkillsDTO {
    @NotNull
    private String name;
    private Number percentage;
    
    public SkillsDTO() {
    }

    public SkillsDTO(String name, Number percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getPercentage() {
        return percentage;
    }

    public void setPercentage(Number percentage) {
        this.percentage = percentage;
    }
   
}
