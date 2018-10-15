package aavdeev.recyclerviewtask.mock;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import aavdeev.recyclerviewtask.R;

public class ImageMockHolder  extends RecyclerView.ViewHolder {
    private ImageView imageView;

    public ImageMockHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.picture);
    }

    public void bind(ImageMock image) {
        imageView.setImageBitmap(image.getImage());
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
