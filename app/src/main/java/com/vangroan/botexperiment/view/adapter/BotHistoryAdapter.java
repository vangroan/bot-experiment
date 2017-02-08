package com.vangroan.botexperiment.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.vangroan.botexperiment.view.enums.BotVMType;
import com.vangroan.botexperiment.view.viewholder.BotVH;
import com.vangroan.botexperiment.view.viewmodel.BotVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 2017/02/08.
 */

public class BotHistoryAdapter extends RecyclerView.Adapter<BotVH> {

    private List<BotVM> history = new ArrayList<>();

    public BotHistoryAdapter() {

    }

    //////////////////////////
    // RecyclerView.Adapter //
    //////////////////////////

    @Override
    public BotVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(BotVH holder, int position) {
        holder.setViewModel(history.get(position));
        holder.populate();
    }

    @Override
    public int getItemCount() {
        return history.size();
    }

    @Override
    public int getItemViewType(int position) {
        BotVM viewModel = get(position);
        if (viewModel != null && viewModel.hasType())
            return viewModel.getType().getId();
        return BotVMType.UNDEFINED.getId();
    }

    ///////////////
    // Container //
    ///////////////

    public void add(BotVM viewModel) {
        history.add(viewModel);
        notifyDataSetChanged();
    }

    public BotVM get(int position) {
        return history.get(position);
    }
}
