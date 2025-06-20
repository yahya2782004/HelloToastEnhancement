// Generated by view binder compiler. Do not edit!
package com.example.hellotoast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hellotoast.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonCount;

  @NonNull
  public final Button buttonToast;

  @NonNull
  public final Button buttonZero;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textDisplayCount;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonCount,
      @NonNull Button buttonToast, @NonNull Button buttonZero, @NonNull ConstraintLayout main,
      @NonNull TextView textDisplayCount) {
    this.rootView = rootView;
    this.buttonCount = buttonCount;
    this.buttonToast = buttonToast;
    this.buttonZero = buttonZero;
    this.main = main;
    this.textDisplayCount = textDisplayCount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_count;
      Button buttonCount = ViewBindings.findChildViewById(rootView, id);
      if (buttonCount == null) {
        break missingId;
      }

      id = R.id.button_toast;
      Button buttonToast = ViewBindings.findChildViewById(rootView, id);
      if (buttonToast == null) {
        break missingId;
      }

      id = R.id.button_zero;
      Button buttonZero = ViewBindings.findChildViewById(rootView, id);
      if (buttonZero == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.text_display_count;
      TextView textDisplayCount = ViewBindings.findChildViewById(rootView, id);
      if (textDisplayCount == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, buttonCount, buttonToast,
          buttonZero, main, textDisplayCount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
