package com.project.bonappet.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.project.bonappet.R;


public class AddFragment extends Fragment {

    private View view;

    private EditText txtChildName, txtYear, txtParentName, txtPhone;
    private Spinner spinnerClass;
    private Switch switchParent;
    private Button btnAdd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add, container, false);

        // set


        // find view by id
        txtChildName = view.findViewById(R.id.txt_childname);
        txtYear = view.findViewById(R.id.txt_year);
        spinnerClass = view.findViewById(R.id.spinner_class);
        switchParent = view.findViewById(R.id.switch_parent);

        txtParentName = view.findViewById(R.id.txt_parentname);
        txtPhone = view.findViewById(R.id.txt_parentphone);
        btnAdd = view.findViewById(R.id.btn_add);

        // set / load data


        // listeners
        btnAdd.setOnClickListener(addListener);

        return view;
    }

    private View.OnClickListener addListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}