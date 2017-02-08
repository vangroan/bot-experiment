package com.vangroan.botexperiment.view.viewholder;

import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.vangroan.botexperiment.view.viewmodel.BotVM;

/**
 * Created by Victor on 2017/02/08.
 */

public abstract class BotVH<T extends BotVM> extends RecyclerView.ViewHolder {

    protected T viewModel;

    public BotVH(View itemView) {
        super(itemView);
    }

    public void setViewModel(T viewModel) {
        this.viewModel = viewModel;
    }

    @CallSuper
    public void populate() {
        reset();
    }

    protected abstract void reset();
}
