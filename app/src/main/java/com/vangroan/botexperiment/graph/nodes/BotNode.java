package com.vangroan.botexperiment.graph.nodes;

import android.support.annotation.Nullable;

import com.vangroan.botexperiment.graph.NodeResult;
import com.vangroan.botexperiment.util.StringHelper;

/**
 * BotNode should be stateless.
 *
 * Created by Victor on 2017/02/08.
 */

public class BotNode {

    private String id = "";
    private BotNodeType type = BotNodeType.DEFAULT;

    ////////
    // ID //
    ////////

    public boolean hasId() {
        return !StringHelper.isEmpty(id);
    }

    public String getId() {
        return id;
    }

    ///////////////////
    // Bot Node Type //
    ///////////////////

    public BotNodeType getType() {
        return type;
    }

    public boolean hasType() {
        return type != null;
    }

    ///////////////
    // Behaviour //
    ///////////////

    @Nullable
    public NodeResult execute() {
        return new NodeResult("Hello World");
    }
}
