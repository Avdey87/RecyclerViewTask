package aavdeev.recyclerviewtask;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import aavdeev.recyclerviewtask.mock.MockAdapter;
import aavdeev.recyclerviewtask.mock.MockGenerator;

public class RecyclerFragment extends Fragment {

    private RecyclerView recycler;
    private final MockAdapter mockAdapter = new MockAdapter();

    public static RecyclerFragment newInstance() {
        return new RecyclerFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        recycler = view.findViewById(R.id.recycler);
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(mockAdapter);
        mockAdapter.addData(MockGenerator.generate(1));

    }





}
