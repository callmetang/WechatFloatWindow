package com.floats.demo.acts;

import android.os.Bundle;

import com.floats.demo.R;

public class OtherActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }



//    @Subscribe(threadMode = ThreadMode.MAIN)
//    public void Event(String messageEvent) {
//        Log.d("MainActivity", "messageEvent:" + messageEvent);
//        if ("show".equals(messageEvent)) {
//            showFloat();
//        } else if ("hide".equals(messageEvent)) {
//            hideFloat();
//        }
//    }
//    private void hideFloat() {
//        if (floatView != null && floatView.getParent() != null && floatView.getVisibility() == View.VISIBLE) {
//            floatView.setVisibility(View.GONE);
//            FloatService.hideFloat(this);
//        }
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        EventBus.getDefault().register(this);
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        if (contentView != null && floatView != null) {
//            contentView.removeView(floatView);
//        }
//        if(EventBus.getDefault().isRegistered(this)) {
//            EventBus.getDefault().unregister(this);
//        }
//    }
//    private View floatView;
//    private FrameLayout contentView;
//
//    public void floatClick(View view) {
//        showFloat();
//    }
//
//    private void showFloat() {
//        View rootView = getWindow().getDecorView().getRootView();
//        contentView = (FrameLayout) rootView.findViewById(android.R.id.content);
//
//        floatView = SingleFloatView.getInstance().getFloatView(this);
//        if (floatView != null && floatView.getParent() == null) {
//            contentView.addView(floatView);
//        }
//        if (floatView != null) {
//            floatView.setVisibility(View.VISIBLE);
//        }
//
//        FloatService.hideFloat(this);
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (floatView != null && floatView.getParent() != null && floatView.getVisibility() == View.VISIBLE) {
//            floatView.setVisibility(View.GONE);
//            if (SingleFloatView.showFloat){
//                FloatService.showFloat(this);
//            }else {
//                SingleFloatView.getInstance().setFloatView(null);
//            }
//        } else {
//            super.onBackPressed();
//        }
//    }
}
