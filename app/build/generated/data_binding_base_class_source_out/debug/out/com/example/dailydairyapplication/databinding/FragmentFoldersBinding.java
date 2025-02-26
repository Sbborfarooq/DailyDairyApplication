// Generated by view binder compiler. Do not edit!
package com.example.dailydairyapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dailydairyapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFoldersBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton floatingActionButton;

  @NonNull
  public final ImageView folderBackArrow;

  @NonNull
  public final TextView folderImageTextView;

  @NonNull
  public final TextView folderText;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentFoldersBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton floatingActionButton, @NonNull ImageView folderBackArrow,
      @NonNull TextView folderImageTextView, @NonNull TextView folderText,
      @NonNull ImageView imageView5, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.floatingActionButton = floatingActionButton;
    this.folderBackArrow = folderBackArrow;
    this.folderImageTextView = folderImageTextView;
    this.folderText = folderText;
    this.imageView5 = imageView5;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFoldersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFoldersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_folders, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFoldersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.floatingActionButton;
      FloatingActionButton floatingActionButton = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButton == null) {
        break missingId;
      }

      id = R.id.folder_backArrow;
      ImageView folderBackArrow = ViewBindings.findChildViewById(rootView, id);
      if (folderBackArrow == null) {
        break missingId;
      }

      id = R.id.folder_Image_textView;
      TextView folderImageTextView = ViewBindings.findChildViewById(rootView, id);
      if (folderImageTextView == null) {
        break missingId;
      }

      id = R.id.folder_text;
      TextView folderText = ViewBindings.findChildViewById(rootView, id);
      if (folderText == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new FragmentFoldersBinding((ConstraintLayout) rootView, floatingActionButton,
          folderBackArrow, folderImageTextView, folderText, imageView5, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
