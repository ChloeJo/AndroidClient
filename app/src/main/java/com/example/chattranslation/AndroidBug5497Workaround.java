//package com.example.chattranslation;
//
//import android.app.Activity;
//import android.graphics.Rect;
//import android.view.View;
//import android.view.ViewTreeObserver;
//import android.webkit.WebView;
//import android.widget.FrameLayout;
//
//public class AndroidBug5497Workaround {
//
//    public static void assistActivity (Activity activity){
//        new AndroidBug5497Workaround(activity);
//    }
//
//    WebView webView = (WebView) findViewById(R.id.webview);
//    private View mChildOfContent;
//    private int usableHeightPrevious;
//    private FrameLayout.LayoutParams frameLayoutParams;
//
//    private AndroidBug5497Workaround(Activity activity){
//        FrameLayout content = (FrameLayout)activity.findViewById(android.R.id.content);
//        mChildOfContent = content.getChildAt(0);
//        mChildOfContent.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalFocusChangeListener(){
//            public void onGlobalLayout(){
//                possiblyResizeChildOfContent();
//            }
//        });
//        frameLayoutParams = (FrameLayout.LayoutParams) mChildOfContent.getLayoutParams();
//    }
//
//    private void possiblyResizeChildOfContent(){
//        int usableHeightNow = computeUsableHeight();
//        if(usableHeightNow != usableHeightPrevious){
//            int usableHeightSansKeyboard = mChildOfContent.getRootView().getHeight();
//            int heightDifference = usableHeightSansKeyboard - usableHeightNow;
//            if(heightDifference > (usableHeightSansKeyboard/4)){
//                frameLayoutParams.height = usableHeightSansKeyboard - heightDifference;
//            }else{
//                frameLayoutParams.height = usableHeightSansKeyboard;
//            }
//            mChildOfContent.requeustLayout();
//            usableHeightPrevious = usableHeightNow;
//        }
//    }
//
//    private int  computeUsableHeight(){
//        Rect r = new Rect();
//        mChildOfContent.getWindowVisibleDisplayFrame(r);
//        return (r.bottom - r.top);
//    }
//
//}
