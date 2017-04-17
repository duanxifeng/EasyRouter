package com.example.zane.router.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.zane.router.message.Message;

/**
 * Created by Zane on 2016/12/23.
 * Email: zanebot96@gmail.com
 * Blog: zane96.github.io
 */

public class HttpRouter extends BaseRouter{
    @Override
    void startRoute(Context context, Intent rawIntent) {
        Message message = rawIntent.getParcelableExtra(BaseRouter.ROUTER_MESSAGE);
        String url = message.getUrl().getBaseUrl();
        rawIntent.setAction(Intent.ACTION_VIEW);
        Uri contentUrl = Uri.parse(url);
        rawIntent.setData(contentUrl);
        rawIntent.removeExtra(BaseRouter.ROUTER_MESSAGE);
        context.startActivity(Intent.createChooser(rawIntent, "选择一款浏览器"));
    }
}
