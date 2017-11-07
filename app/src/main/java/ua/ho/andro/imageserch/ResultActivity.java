package ua.ho.andro.imageserch;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import ua.ho.andro.imageserch.adapters.ImageListAdapter;
import ua.ho.andro.imageserch.helper.ResponseAsync;
import ua.ho.andro.imageserch.model.Item;
import ua.ho.andro.imageserch.view.ImageGridView;

public class ResultActivity extends BaseActivity {
    private ImageGridView imageGrid;
    private ImageListAdapter adapter;
    private int numColums=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        imageGrid = (ImageGridView) findViewById(R.id.gv_list_image);
        mAdView = (AdView) findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Intent intent = new Intent();
        int test = 0;
        numColums = intent.getIntExtra("numColums",numColums);

        adapter = new ImageListAdapter(this);
        imageGrid.setAdapter(adapter);
        imageGrid.setNumColumns(numColums);
        imageGrid.setVerticalSpacing(2);
        imageGrid.setHorizontalSpacing(2);
        for (Item response : ResponseAsync.res.getItems()) {
            adapter.addAll(response);
        }
    }

}
