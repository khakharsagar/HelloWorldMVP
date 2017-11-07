package com.android.hellowolrdmvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.android.hellowolrdmvp.R;
import com.android.hellowolrdmvp.contract.MainActivityContract.Presenter;
import com.android.hellowolrdmvp.contract.MainActivityContract.View;
import com.android.hellowolrdmvp.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements View {

  private TextView mTextView;
  private Button mButton;
  private Presenter mPresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mPresenter = new MainActivityPresenter(this);
  }

  @Override
  public void initView() {
    mTextView = (TextView) findViewById(R.id.textView);
    mButton = (Button) findViewById(R.id.button);
    mButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(android.view.View view) {
        mPresenter.onClick(view);
      }
    });
  }

  @Override
  public void setViewData(String data) {
    mTextView.setText(data);
  }
}
