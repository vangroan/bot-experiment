package com.vangroan.botexperiment.graph;

import android.support.annotation.Nullable;

/**
 * Created by Wimpie Victor on 2017/02/09.
 */

public interface BotGraphRepo {

    /**
     * @return The loaded graph. Returns null if load failed.
     */
    @Nullable
    BotGraph load();
}
