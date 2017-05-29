package com.example.l364cy.cashlog.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.l364cy.cashlog.R;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> contents;

    public RecycleAdapter(List<Object> contents) {
        this.contents = contents;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_small, parent, false);
                return new RecyclerView.ViewHolder(view){};

}
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }
}
