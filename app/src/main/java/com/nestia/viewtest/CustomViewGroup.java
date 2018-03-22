package com.nestia.viewtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by gaoyang on 2018/3/19.
 */

public class CustomViewGroup extends LinearLayout {
    private static final String TAG = "gaoyanggCustomViewGroup";

    public CustomViewGroup(Context context) {
        super(context);
        init(context);
    }

    public CustomViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        setBackgroundColor(ContextCompat.getColor(context, android.R.color.holo_orange_light));
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        Log.i(TAG, "dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

//    int mLastXIntercepted;
//    int mLastYIntercepted;
//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        int x = (int) ev.getX();
//        int y = (int) ev.getY();
//        boolean intercepted = false;
//        switch (ev.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                intercepted = false;
//                Log.i(TAG, "onInterceptTouchEvent: ACTION_DOWN x = "+x+", y = "+y);
//                break;
//            case MotionEvent.ACTION_MOVE:
//                if (父容器需要当前点击事件) {
//                    intercepted = true;
//                } else {
//                    intercepted = false;
//                }
//                Log.i(TAG, "onInterceptTouchEvent: ACTION_MOVE x = "+x+", y = "+y);
//                break;
//            case MotionEvent.ACTION_UP:
//                intercepted = false;
//                Log.i(TAG, "onInterceptTouchEvent: ACTION_UP x = "+x+", y = "+y);
//                break;
//        }
//
//        mLastXIntercepted = x;
//        mLastYIntercepted = y;
//        return intercepted;
//    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        Log.i(TAG, "onTouchEvent: ");
        return super.onTouchEvent(event);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
//        Log.d(TAG, "onScrollChanged() called with: l = [" + l + "], t = [" + t + "], oldl = [" + oldl + "], oldt = [" + oldt + "]");
        super.onScrollChanged(l, t, oldl, oldt);
    }
}
