package com.magad.audiovideostreamtb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {

    RecyclerView rv;
    Videdapter adapter;
    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View v = inflater.inflate(R.layout.fragment_video, container, false);
            rv = v.findViewById(R.id.rvvideo);
            adapter = new Videdapter(getActivity());
            rv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
            rv.setAdapter(adapter);
            return v;
    }

}
