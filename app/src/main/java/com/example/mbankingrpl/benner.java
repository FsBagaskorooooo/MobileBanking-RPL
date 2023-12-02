package com.example.mbankingrpl;

// BannerFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class benner extends Fragment {

    private int imageResourceId;

    public benner(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_benner, container, false);
        ImageView imageView = view.findViewById(R.id.imageViewBanner);
        imageView.setImageResource(imageResourceId);
        return view;
    }
}
