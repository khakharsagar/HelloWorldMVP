package com.android.hellowolrdmvp.presenter;

import com.android.hellowolrdmvp.contract.MainActivityContract;
import com.android.hellowolrdmvp.contract.MainActivityContract.Model;
import com.android.hellowolrdmvp.contract.MainActivityContract.View;
import com.android.hellowolrdmvp.model.MainActivityModel;

/**
 * Created by sagarkhakhar on 20/09/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

  private View mView;
  private Model mModel;

  public MainActivityPresenter(View view) {
    mView = view;
    initPresenter();
  }

  private void initPresenter() {
    mModel = new MainActivityModel();
    mView.initView();
  }

  @Override
  public void onClick(android.view.View view) {
    String data = mModel.getData();
    mView.setViewData(data);
  }
}
