package com.vangroan.botexperiment.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.vangroan.botexperiment.graph.BotNode;
import com.vangroan.botexperiment.view.viewholder.BotVH;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 2017/02/08.
 */

public class BotHistoryAdapter extends RecyclerView.Adapter<BotVH> {

    private List<BotNode> history = new ArrayList<>();

    public BotHistoryAdapter() {

    }

    @Override
    public BotVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BotVH holder, int position) {
        holder.populate();
    }

    @Override
    public int getItemCount() {
        return history.size();
    }
}
