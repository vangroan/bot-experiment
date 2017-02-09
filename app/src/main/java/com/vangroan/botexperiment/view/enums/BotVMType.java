package com.vangroan.botexperiment.view.enums;

import android.support.annotation.Nullable;
import android.util.SparseArray;

/**
 * Created by Victor on 2017/02/08.
 */

public enum BotVMType {

    ////////////
    // Output //
    ////////////

    UNDEFINED(-1),
    TEXT(100),

    ///////////
    // Input //
    ///////////

    INPUT_TEXT(200);


    private static SparseArray<BotVMType> map = new SparseArray<>();

    static {
        for (BotVMType t : BotVMType.values())
            map.append(t.getId(), t);
    }

    private int id;

    BotVMType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Nullable
    public static BotVMType byKey(int id) {
        return map.get(id);
    }
}
