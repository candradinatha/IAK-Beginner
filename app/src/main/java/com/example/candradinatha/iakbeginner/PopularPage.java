package com.example.candradinatha.iakbeginner;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.ListAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopularPage extends Fragment {


    public PopularPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_popular_page, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_popular);

        PopularAdapter popularAdapter = new PopularAdapter();
        recyclerView.setAdapter(popularAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

}
