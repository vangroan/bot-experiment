package com.vangroan.botexperiment.view;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vangroan.botexperiment.R;
import com.vangroan.botexperiment.bot.BotRunner;
import com.vangroan.botexperiment.graph.NodeResult;
import com.vangroan.botexperiment.graph.nodes.BotNode;
import com.vangroan.botexperiment.view.adapter.BotHistoryAdapter;
import com.vangroan.botexperiment.view.graph.BotResourceLoader;
import com.vangroan.botexperiment.view.viewmodel.BotVM;

public class BotActivity extends AppCompatActivity implements BotHistoryAdapter.OnInputListener {

    private BotRunner runner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        // Conversation History
        final BotHistoryAdapter conversationAdapter = new BotHistoryAdapter(this, this);
        RecyclerView conversationView = (RecyclerView) findViewById(R.id.activity_bot_conversation);
        conversationView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        conversationView.setAdapter(conversationAdapter);

        runner = new BotRunner(new BotResourceLoader(this, R.raw.user_greet).load());
        runner.setListener(new BotRunner.BotRunnerListener() {
            @Override
            public void onNode(@NonNull BotNode node) {

            }

            @Override
            public void onNodeExecute(@NonNull NodeResult result) {
                // TODO: Map results to VM types
                BotVM viewModel = new BotVM();
                viewModel.setText(result.getValue());
                conversationAdapter.add(viewModel);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        runner.setNode("user_greet_intro");
        runner.setNode("user_greet_ask_name");
    }


    ///////////////////////////////////////
    // BotHistoryAdapter.OnInputListener //
    ///////////////////////////////////////


    @Override
    public void onInput() {

    }
}
