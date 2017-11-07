package ua.ho.andro.imageserch.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ua.ho.andro.imageserch.BaseActivity;
import ua.ho.andro.imageserch.R;
import ua.ho.andro.imageserch.model.Item;

public class ImageListAdapter extends ArrayAdapter<Item> {
    private String imageTitle;
    private String pathImg;
    private int widthImg;

    public ImageListAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_grid_category, null);
        }
        Item itm = getItem(position);
//        TextView tv = (TextView) convertView.findViewById(R.id.tv_category);
        ImageView iv = (ImageView) convertView.findViewById(R.id.image_category);

//        imageTitle=itm.getKind();
        pathImg=itm.getLink();
//        tv.setText(imageTitle);
        String pathStr = pathImg;
        widthImg= BaseActivity.screenWidth;
        Picasso.with(getContext()).load(pathStr)
                .error(R.drawable.common_plus_signin_btn_icon_dark_normal)
                //.resize(widthImg,widthImg)
                .placeholder(R.drawable.common_plus_signin_btn_icon_dark_normal)
                .transform(new CropSquareTransformation())
                .into(iv);
        return convertView;
    }
}
