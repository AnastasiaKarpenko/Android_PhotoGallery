package ws.tilda.anastasia.photogallery.view;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import ws.tilda.anastasia.photogallery.R;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
