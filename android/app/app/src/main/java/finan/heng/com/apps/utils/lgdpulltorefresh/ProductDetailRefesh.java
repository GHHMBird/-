package finan.heng.com.apps.utils.lgdpulltorefresh;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import finan.heng.com.apps.R;

/**
 * Created by fuliang on 2017/3/2.
 */

public class ProductDetailRefesh extends RefreshView {

    private LinearLayout mLinearLayout;
    private ImageView mImageView;
    private boolean isRefresh;

    public ProductDetailRefesh(Context context) {
        super(context);

        //通过系统提供的实例获得一个LayoutInflater对象
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//第一个参数为xml文件中view的id，第二个参数为此view的父组件，可以为null，android会自动寻找它是否拥有父组件
        View view = inflater.inflate(R.layout.prodect_refresh, null);
//        mImageView = (ImageView) view.findViewById(R.id.image);
//        mLinearLayout = new LinearLayout(context);
//        mLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
//        mLinearLayout.setGravity(Gravity.CENTER);
//        mImageView = new ImageView(context);
//        LayoutParams layoutParams;
//        layoutParams = (LayoutParams) mImageView.getLayoutParams();
//        layoutParams.height = 6;
//        layoutParams.width = 6;
//        mLinearLayout.addView(mImageView);
//        addView(mLinearLayout);
        addView(view);
    }

    @Override
    public void normal() {
//        mImageView.setRotation(0);
//        mImageView.setImageResource(R.drawable.haili_loading_1);
//        mImageView.clearAnimation();
    }


    @Override
    public void beginDown(float downRate) {
        Log.d("TAG","downRate="+downRate);
        if (isRefresh){
            isRefresh = false;
        }
    }

    @Override
    public void canRefresh() {

        isRefresh = true;

    }

    //开始刷新
    @Override
    public void beginRefresh() {
//        mImageView.setImageResource(R.drawable.refresh_animlist);
//        AnimationDrawable animationDrawable = (AnimationDrawable) mImageView.getDrawable();
//        animationDrawable.start();

    }

    //刷新完成
    @Override
    public void refreshComplete() {
//        mImageView.setImageResource(0);
    }
}
