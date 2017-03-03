package com.vangroan.botexperiment.graph.nodes;

import android.support.annotation.Nullable;

import com.vangroan.botexperiment.graph.NodeResult;
import com.vangroan.botexperiment.util.StringHelper;

import io.realm.RealmObject;

/**
 * BotNode should be stateless.
 *
 * Created by Victor on 2017/02/08.
 */

public class BotNode extends RealmObject {

    private String id = "";
    private int botTypeId = BotNodeType.DEFAULT.getId();

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

    public BotNodeType getBotType() {
        return BotNodeType.byId(botTypeId);
    }

    public boolean hasType() {
        return BotNodeType.containsId(botTypeId);
    }

    ///////////////
    // Behaviour //
    ///////////////

    @Nullable
    public NodeResult execute() {
        return new NodeResult("Hello World");
    }
}
