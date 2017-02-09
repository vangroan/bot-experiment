package com.vangroan.botexperiment.view.viewholder;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.vangroan.botexperiment.R;
import com.vangroan.botexperiment.view.viewmodel.BotVM;

/**
 * Created by Wimpie Victor on 2017/02/09.
 */

public class InputTextVH extends BotVH<BotVM> {

    public InputTextVH(View itemView) {
        super(itemView);
    }

    @Override
    public void populate() {
        super.populate();

        EditText editText = (EditText) itemView.findViewById(R.id.item_bot_input_text);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return false;
            }
        });
    }

    @Override
    protected void reset() {

    }
}
