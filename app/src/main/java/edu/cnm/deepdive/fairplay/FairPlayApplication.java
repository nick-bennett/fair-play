package edu.cnm.deepdive.fairplay;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class FairPlayApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }

}
