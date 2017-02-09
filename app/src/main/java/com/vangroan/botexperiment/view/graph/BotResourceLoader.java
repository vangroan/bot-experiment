package com.vangroan.botexperiment.view.graph;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.vangroan.botexperiment.graph.BotGraph;
import com.vangroan.botexperiment.graph.BotGraphRepo;
import com.vangroan.botexperiment.graph.nodes.BotNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wimpie Victor on 2017/02/09.
 */

public class BotResourceLoader implements BotGraphRepo {

    private Context context;
    private ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    private int graphResid;

    public BotResourceLoader(Context context, int graphResid) {
        this.context = context;
        this.graphResid = graphResid;
    }

    @Override
    @SuppressWarnings("EmptyCatchBlock")
    @Nullable
    public BotGraph load() {
        InputStream stream = context.getResources().openRawResource(graphResid);

        List<BotNode> nodes = null;

        try {
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            nodes = mapper.readValue(bufReader, mapper.getTypeFactory().constructParametricType(List.class, BotNode.class));
        } catch (IOException e) {

        } finally {
            try {
                stream.close();
            } catch (IOException e) {

            }
        }

        if (nodes != null)
            return new BotGraph(nodes);
        else
            return new BotGraph();
    }
}
