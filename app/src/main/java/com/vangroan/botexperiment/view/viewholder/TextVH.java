package com.vangroan.botexperiment.view.viewholder;

import android.view.View;
import android.widget.TextView;

import com.vangroan.botexperiment.R;
import com.vangroan.botexperiment.view.viewmodel.BotVM;

/**
 * Created by Victor on 2017/02/08.
 */

public class TextVH extends BotVH<BotVM> {

    public TextVH(View itemView) {
        super(itemView);
    }

    @Override
    public void populate() {
        super.populate();

        TextView textView = (TextView) itemView.findViewById(R.id.item_bot_text_text_view);
        textView.setText(viewModel.getText());
    }

    @Override
    protected void reset() {
        TextView textView = (TextView) itemView.findViewById(R.id.item_bot_text_text_view);
        textView.setText(null);
    }
}
