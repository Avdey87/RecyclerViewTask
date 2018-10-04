package aavdeev.recyclerviewtask.mock;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import aavdeev.recyclerviewtask.R;

public class MockAdapter extends RecyclerView.Adapter<MockHolder> {

    private final List<Mock> mockList = new ArrayList<>();

    @Override
    public MockHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_mock, parent, false);
        return new MockHolder(view);
    }

    @Override
    public void onBindViewHolder(MockHolder holder, int position) {
        holder.bind(mockList.get(position));
    }

    @Override
    public int getItemCount() {
        return mockList.size();
    }

    public void addData(List<Mock> mocks) {
        mockList.addAll(mocks);
        notifyDataSetChanged();
    }


}
