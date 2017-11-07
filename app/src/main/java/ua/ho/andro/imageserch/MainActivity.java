package ua.ho.andro.imageserch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import ua.ho.andro.imageserch.helper.ResponseAsync;


public class MainActivity extends BaseActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar seekBar;
    private TextView tvNumColumns;
    private EditText etSearchTerm;
    private int columnsLimit = 4;
    private int amtColumns;
    public String searchTerm;
    public int numColums;

    public String getSearchTerm() {
        return searchTerm;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        tvNumColumns = (TextView) findViewById(R.id.tv_numColumns);
        etSearchTerm = (EditText) findViewById(R.id.editText);
        seekBar.setMax(columnsLimit);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        if (progress == 0) {
            seekBar.setProgress(1);
        }
        tvNumColumns.setText(String.valueOf(seekBar.getProgress()));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void searchClick(View view) {
        searchTerm = etSearchTerm.getText().toString();
        amtColumns = seekBar.getProgress();
        ResponseAsync rs = new ResponseAsync(searchTerm);
        rs.execute();
        showResults();
    }

    public void showResults() {
        numColums = seekBar.getProgress();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("numColums", numColums);
        startActivity(intent);
    }

}
