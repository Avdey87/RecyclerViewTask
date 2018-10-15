package aavdeev.recyclerviewtask.mock;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

import aavdeev.recyclerviewtask.R;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Object> items;

    private final int NUMBER = 0;
    private final int PICTURE = 1;

    public Adapter(List<Object> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Mock) {
            return NUMBER;
        } else if (items.get(position) instanceof String) {
            return PICTURE;
        }

        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (i) {
            case NUMBER:
                View number = inflater.inflate(R.layout.list_mock, viewGroup, false);
                viewHolder = new MockHolder(number);
                break;
            case PICTURE:
                View picture = inflater.inflate(R.layout.list_image_mock, viewGroup, false);
                viewHolder = new ImageMockHolder(picture);
                break;

            default:
                 break;
        }


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case NUMBER:
                MockHolder mockHolder = (MockHolder) viewHolder;
                configureMockHolder(mockHolder, position);
                break;
            case PICTURE:
                ImageMockHolder imageMockHolder = (ImageMockHolder) viewHolder;
                configureImageMockHolder(imageMockHolder, position);
                break;
            default:
                break;
        }
    }

    private void configureMockHolder(MockHolder mockHolder, int position) {
        Mock mock = (Mock) items.get(position);
        if (mock != null) {
            mockHolder.getValue().setText("Number: " + mock.getName());
        }
    }

    private void configureImageMockHolder(ImageMockHolder imageMockHolder, int position) {
        imageMockHolder.getImageView().setImageResource(R.drawable.diablo);
    }


}
