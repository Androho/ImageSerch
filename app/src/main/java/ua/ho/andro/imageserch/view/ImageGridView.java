package ua.ho.andro.imageserch.view;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class ImageGridView extends GridView {

    public ImageGridView(Context context) {
        super(context);
    }

    public ImageGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightSpec;

        if (getLayoutParams().height == LayoutParams.WRAP_CONTENT) {
            heightSpec = MeasureSpec.makeMeasureSpec(
                    Integer.MAX_VALUE >>2, MeasureSpec.AT_MOST);
        }
        else {
            heightSpec = heightMeasureSpec;
        }
        super.onMeasure(widthMeasureSpec, heightSpec);
    }
}