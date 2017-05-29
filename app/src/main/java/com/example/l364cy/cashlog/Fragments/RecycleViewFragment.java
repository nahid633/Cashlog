package com.example.l364cy.cashlog.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.l364cy.cashlog.R;
import com.example.l364cy.cashlog.Adapters.RecycleAdapter;
import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewFragment extends Fragment {
    private RecyclerView rView;
    public static RecycleViewFragment newInstance() {
        return new RecycleViewFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.recycle_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rView = (RecyclerView) view.findViewById(R.id.recyclerView);
        final List<Object> items = new ArrayList<>();
        for(int i = 0;i<50;i++){
            items.add(new Object());
        }
        rView.setLayoutManager(new LinearLayoutManager(getActivity()));
        rView.setHasFixedSize(true);
        rView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
        rView.setAdapter(new RecycleAdapter(items));
    }
}
