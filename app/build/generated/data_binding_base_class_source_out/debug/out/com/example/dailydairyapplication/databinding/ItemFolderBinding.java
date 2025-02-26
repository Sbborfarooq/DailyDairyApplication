// Generated by view binder compiler. Do not edit!
package com.example.dailydairyapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dailydairyapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFolderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView deleteFolderButton;

  @NonNull
  public final ImageView folderImg;

  @NonNull
  public final TextView folderNameText;

  private ItemFolderBinding(@NonNull LinearLayout rootView, @NonNull ImageView deleteFolderButton,
      @NonNull ImageView folderImg, @NonNull TextView folderNameText) {
    this.rootView = rootView;
    this.deleteFolderButton = deleteFolderButton;
    this.folderImg = folderImg;
    this.folderNameText = folderNameText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFolderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_folder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFolderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deleteFolderButton;
      ImageView deleteFolderButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteFolderButton == null) {
        break missingId;
      }

      id = R.id.folderImg;
      ImageView folderImg = ViewBindings.findChildViewById(rootView, id);
      if (folderImg == null) {
        break missingId;
      }

      id = R.id.folderNameText;
      TextView folderNameText = ViewBindings.findChildViewById(rootView, id);
      if (folderNameText == null) {
        break missingId;
      }

      return new ItemFolderBinding((LinearLayout) rootView, deleteFolderButton, folderImg,
          folderNameText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
