package com.mysite;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named

public class SelectOneBean implements Serializable {
     
    private String option;
 
    public String getOption() {
        return option;
    }
 
    public void setOption(String option) {
        this.option = option;
    }
}