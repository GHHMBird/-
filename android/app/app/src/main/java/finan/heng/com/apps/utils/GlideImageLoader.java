package finan.heng.com.apps.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/*
 * Created by hhm on 2017/1/7.
 */

public class GlideImageLoader extends com.youth.banner.loader.ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
        Glide.with(context.getApplicationContext())
                .load(path)
//                .placeholder(R.mipmap.hhm)
//                .error(R.mipmap.hhm)
                .crossFade()
                .into(imageView);
    }
}
