package com.vangroan.botexperiment.view.viewholder;

import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Victor on 2017/02/08.
 */

public abstract class BotVH extends RecyclerView.ViewHolder {

    public BotVH(View itemView) {
        super(itemView);
    }

    @CallSuper
    public void populate() {
        reset();
    }

    protected abstract void reset();
}
