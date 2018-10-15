package aavdeev.recyclerviewtask;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import aavdeev.recyclerviewtask.mock.Adapter;
import aavdeev.recyclerviewtask.mock.ImageMock;
import aavdeev.recyclerviewtask.mock.Mock;
import aavdeev.recyclerviewtask.mock.MockGenerator;

public class RecyclerFragment extends Fragment {

    private RecyclerView recycler;


    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new Mock("One", 1));
        items.add(new Mock("Two", 2));
        items.add(new Mock("Three", 3));
        items.add(R.drawable.diablo);

        return items;
    }

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
        recycler.setAdapter(new Adapter(getSampleArrayList()));

    }


    public static void addNumber() {
// логикак добавление числа в конец списка

    }




}
