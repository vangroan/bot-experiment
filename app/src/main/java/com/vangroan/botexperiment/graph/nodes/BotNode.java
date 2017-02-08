package com.vangroan.botexperiment.graph.nodes;

import com.vangroan.botexperiment.util.StringHelper;

/**
 * Created by Victor on 2017/02/08.
 */

public class BotNode {

    private String id = "";

    public boolean hasId() {
        return !StringHelper.isEmpty(id);
    }
}
