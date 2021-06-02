package org.example.entity;

import lombok.Data;

@Data

public class RemoteController {

    private Television television;
    public RemoteController(Television television){
        this.television = television;
    }



    public void selectChannel(int channel){
        this.television.showChannel(channel);
    }
}

