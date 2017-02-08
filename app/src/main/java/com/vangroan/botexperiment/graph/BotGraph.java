package com.vangroan.botexperiment.graph;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.vangroan.botexperiment.graph.exceptions.BotNodeIdExists;
import com.vangroan.botexperiment.graph.exceptions.BotNodeIdMissing;
import com.vangroan.botexperiment.graph.nodes.BotNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Victor on 2017/02/08.
 */

public class BotGraph {

    private List<BotNode> nodes = new ArrayList<>();
    private Map<String, Integer> indexes = new HashMap<>();

    public BotGraph() {

    }

    public void add(@NonNull BotNode node) {
        if (!node.hasId())
            throw new BotNodeIdMissing("Attempt to add Node to graph with no ID set");

        if (indexes.containsKey(node.getId()))
            throw new BotNodeIdExists("Node with name already exists in graph: " + node.hasId());

        nodes.add(node);
        indexes.put(node.toString(), nodes.size() - 1);
    }

    @Nullable
    public BotNode get(@NonNull String nodeId) {
        Integer index = indexes.get(nodeId);
        if (index == null)
            return null;
        return nodes.get(index);
    }
}
