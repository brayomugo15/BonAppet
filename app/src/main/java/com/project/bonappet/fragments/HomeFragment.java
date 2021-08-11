package com.project.bonappet.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.project.bonappet.R;

import org.jetbrains.annotations.NotNull;


public class HomeFragment extends Fragment {

    private View view;

    private RecyclerView recyclerView;
    private FloatingActionButton fabAdd;

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        // set


        // find view by id
        recyclerView = view.findViewById(R.id.recyclerview);
        fabAdd = view.findViewById(R.id.fab_add);

        // set / load data


        // listeners
        fabAdd.setOnClickListener(addListener);


        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull @NotNull Menu menu, @NonNull @NotNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.toolbarmenu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.toolbar_search:
//                TODO : search functionality
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * On Click action button
     */
    private View.OnClickListener addListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}