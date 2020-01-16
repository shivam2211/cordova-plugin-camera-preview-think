package com.cordovaplugincamerapreview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

class CustomSurfaceViewThink extends SurfaceView implements SurfaceHolder.Callback{
  private final String TAG = "CustomSurfaceViewThink";

  CustomSurfaceViewThink(Context context){
    super(context);
  }

  @Override
  public void surfaceCreated(SurfaceHolder holder) {
  }

  @Override
  public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
  }

  @Override
  public void surfaceDestroyed(SurfaceHolder holder) {
  }
}
