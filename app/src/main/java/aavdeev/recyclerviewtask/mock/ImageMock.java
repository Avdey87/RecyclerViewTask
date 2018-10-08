package aavdeev.recyclerviewtask.mock;

import android.graphics.Bitmap;

public class ImageMock {
    private Bitmap image;

    public ImageMock(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
