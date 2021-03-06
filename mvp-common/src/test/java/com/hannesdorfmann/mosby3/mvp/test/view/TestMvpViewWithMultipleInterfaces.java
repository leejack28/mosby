package com.hannesdorfmann.mosby3.mvp.test.view;

import com.hannesdorfmann.mosby3.mvp.test.data.TestData;
import com.hannesdorfmann.mosby3.mvp.test.interfaces.BarInterface;
import com.hannesdorfmann.mosby3.mvp.test.interfaces.FooInterface;

public class TestMvpViewWithMultipleInterfaces
        implements FooInterface, BarInterface, AnotherMvpView, TestMvpView {

  @Override
  public void bar() {
  }

  @Override
  public void foo() {
  }

  @Override
  public void showFoo(TestData data) {
  }

  @Override
  public void showThat() {
  }

  @Override
  public void showOtherMvpView() {
  }
}