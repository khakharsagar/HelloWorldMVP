package com.android.hellowolrdmvp.contract;

/**
 * Created by sagarkhakhar on 20/09/17.
 */

public interface MainActivityContract {

  interface View {

    void initView();

    void setViewData(String data);
  }

  interface Model {

    String getData();
  }

  interface Presenter {

    void onClick(android.view.View view);
  }
}
