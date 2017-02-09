package com.vangroan.botexperiment.graph.nodes;

import android.util.SparseArray;

/**
 * Created by Wimpie Victor on 2017/02/09.
 */

public enum BotNodeType {
    DEFAULT(0);

    private static SparseArray<BotNodeType> map = new SparseArray<>();

    static {
        for (BotNodeType t : BotNodeType.values())
            map.put(t.id, t);
    }

    int id;

    BotNodeType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
