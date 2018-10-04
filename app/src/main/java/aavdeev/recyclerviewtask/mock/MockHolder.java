package aavdeev.recyclerviewtask.mock;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import aavdeev.recyclerviewtask.R;

public class MockHolder extends RecyclerView.ViewHolder {
    private TextView value;


    public MockHolder( View itemView) {
        super(itemView);

        value = itemView.findViewById(R.id.tv_value);
    }

    public void bind(Mock mock) {
        value.setText(mock.getValue());
    }
}
