package com.portfolio.MR.DTO;

import javax.validation.constraints.NotNull;

public class SkillsDTO {
    @NotNull
    private String name;
    @NotNull
    private Number percentage;
    @NotNull
    private boolean hard;

    public SkillsDTO() {
    }

    public SkillsDTO(String name, Number percentage, boolean hard) {
        this.name = name;
        this.percentage = percentage;
        this.hard = hard;
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

    public boolean isHard() {
        return hard;
    }

    public void setHard(boolean hard) {
        this.hard = hard;
    }
   
}
