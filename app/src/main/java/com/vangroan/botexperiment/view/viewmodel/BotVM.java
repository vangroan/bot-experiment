package com.vangroan.botexperiment.view.viewmodel;

import com.vangroan.botexperiment.view.enums.BotVMType;

/**
 * Created by Victor on 2017/02/08.
 */

public class BotVM {

    private BotVMType type = BotVMType.UNDEFINED;
    private String text = "";

    /////////////////////////
    // Bot View Model Type //
    /////////////////////////

    public BotVMType getType() {
        return type;
    }

    public boolean hasType() {
        return type != null;
    }
}
