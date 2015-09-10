package com.mysite;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named

public class MessagesView {
    public void error(){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error!","You done screwed up, son."));
    }
}
