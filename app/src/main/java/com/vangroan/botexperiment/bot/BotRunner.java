package com.vangroan.botexperiment.bot;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.vangroan.botexperiment.graph.BotGraph;
import com.vangroan.botexperiment.graph.NodeResult;
import com.vangroan.botexperiment.graph.nodes.BotNode;

/**
 * Receives input and drives the graph.
 *
 * Created by Victor on 2017/02/08.
 */

public class BotRunner {

    // TODO: Blackboard
    private BotGraph graph;
    private BotNode current;
    private BotRunnerListener listener;

    public BotRunner() {
        this.graph = new BotGraph();
    }

    public BotRunner(BotGraph graph) {
        this.graph = graph;
    }

    public void setNode(@NonNull String nodeId) {
        BotNode node = graph.get(nodeId);

        if (node == null)
            return;

        current = node;
        NodeResult result = node.execute();
        if (result != null)
            notifyOnNodeResult(result);
    }

    private void reset() {
        graph = null;
        current = null;
    }

    public void setGraph(BotGraph graph) {
        this.graph = graph;
    }

    ////////////////////
    // Event listener //
    ////////////////////

    private void notifyOnNode(@NonNull BotNode node) {
        if (listener != null)
            listener.onNode(node);
    }

    private void notifyOnNodeResult(@NonNull NodeResult result) {
        if (listener != null)
            listener.onNodeExecute(result);
    }

    public void setListener(@Nullable BotRunnerListener listener) {
        this.listener = listener;
    }

    public interface BotRunnerListener {

        /**
         * Called when the runner sets its current node.
         *
         * @param node The current node of the runner
         */
        void onNode(@NonNull BotNode node);

        /**
         * Called when a Node executes.
         */
        void onNodeExecute(@NonNull NodeResult result);
    }
}
