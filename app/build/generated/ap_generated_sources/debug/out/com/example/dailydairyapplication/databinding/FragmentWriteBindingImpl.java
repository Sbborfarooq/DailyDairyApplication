package com.example.dailydairyapplication.databinding;
import com.example.dailydairyapplication.R;
import com.example.dailydairyapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWriteBindingImpl extends FragmentWriteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameLayout, 4);
        sViewsWithIds.put(R.id.constraintLayout2, 5);
        sViewsWithIds.put(R.id.imageView3, 6);
        sViewsWithIds.put(R.id.textView2, 7);
        sViewsWithIds.put(R.id.materialCardView, 8);
        sViewsWithIds.put(R.id.textView3, 9);
        sViewsWithIds.put(R.id.dateTextView, 10);
        sViewsWithIds.put(R.id.emojiTextView, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.titleText.getValue()
            //         is viewModel.titleText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTitle);
            // localize variables for thread safety
            // viewModel.titleText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTitleText = null;
            // viewModel.titleText != null
            boolean viewModelTitleTextJavaLangObjectNull = false;
            // viewModel
            com.example.dailydairyapplication.classes.WriteViewModel viewModel = mViewModel;
            // viewModel.titleText.getValue()
            java.lang.String viewModelTitleTextGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTitleText = viewModel.getTitleText();

                viewModelTitleTextJavaLangObjectNull = (viewModelTitleText) != (null);
                if (viewModelTitleTextJavaLangObjectNull) {




                    viewModelTitleText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editWriteandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.contentText.getValue()
            //         is viewModel.contentText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editWrite);
            // localize variables for thread safety
            // viewModel.contentText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelContentText = null;
            // viewModel
            com.example.dailydairyapplication.classes.WriteViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.contentText != null
            boolean viewModelContentTextJavaLangObjectNull = false;
            // viewModel.contentText.getValue()
            java.lang.String viewModelContentTextGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelContentText = viewModel.getContentText();

                viewModelContentTextJavaLangObjectNull = (viewModelContentText) != (null);
                if (viewModelContentTextJavaLangObjectNull) {




                    viewModelContentText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentWriteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentWriteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            );
        this.button.setTag(null);
        this.editTitle.setTag(null);
        this.editWrite.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.dailydairyapplication.classes.WriteViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.dailydairyapplication.classes.WriteViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTitleText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelContentText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTitleText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTitleText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContentText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelContentText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewModelTitleTextIsEmpty = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTitleText = null;
        int viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalseButtonAndroidColorWhiteButtonAndroidColorSaveButtonColor = 0;
        boolean viewModelContentTextIsEmpty = false;
        java.lang.String viewModelTitleTextGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelContentText = null;
        boolean ViewModelContentTextIsEmpty1 = false;
        boolean viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalse = false;
        com.example.dailydairyapplication.classes.WriteViewModel viewModel = mViewModel;
        boolean ViewModelTitleTextIsEmpty1 = false;
        java.lang.String viewModelContentTextGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.titleText
                    viewModelTitleText = viewModel.getTitleText();
                }
                updateLiveDataRegistration(0, viewModelTitleText);


                if (viewModelTitleText != null) {
                    // read viewModel.titleText.getValue()
                    viewModelTitleTextGetValue = viewModelTitleText.getValue();
                }


                if (viewModelTitleTextGetValue != null) {
                    // read viewModel.titleText.getValue().isEmpty()
                    viewModelTitleTextIsEmpty = viewModelTitleTextGetValue.isEmpty();
                }


                // read !viewModel.titleText.getValue().isEmpty()
                ViewModelTitleTextIsEmpty1 = !viewModelTitleTextIsEmpty;
            if((dirtyFlags & 0xfL) != 0) {
                if(ViewModelTitleTextIsEmpty1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contentText
                        viewModelContentText = viewModel.getContentText();
                    }
                    updateLiveDataRegistration(1, viewModelContentText);


                    if (viewModelContentText != null) {
                        // read viewModel.contentText.getValue()
                        viewModelContentTextGetValue = viewModelContentText.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModel != null) {
                    // read viewModel.contentText
                    viewModelContentText = viewModel.getContentText();
                }
                updateLiveDataRegistration(1, viewModelContentText);


                if (viewModelContentText != null) {
                    // read viewModel.contentText.getValue()
                    viewModelContentTextGetValue = viewModelContentText.getValue();
                }


                if (viewModelContentTextGetValue != null) {
                    // read viewModel.contentText.getValue().isEmpty()
                    viewModelContentTextIsEmpty = viewModelContentTextGetValue.isEmpty();
                }


                // read !viewModel.contentText.getValue().isEmpty()
                ViewModelContentTextIsEmpty1 = !viewModelContentTextIsEmpty;
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read !viewModel.titleText.getValue().isEmpty() ? !viewModel.contentText.getValue().isEmpty() : false
                viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalse = ((ViewModelTitleTextIsEmpty1) ? (ViewModelContentTextIsEmpty1) : (false));
            if((dirtyFlags & 0xfL) != 0) {
                if(viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read !viewModel.titleText.getValue().isEmpty() ? !viewModel.contentText.getValue().isEmpty() : false ? @android:color/white : @android:color/save_button_color
                viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalseButtonAndroidColorWhiteButtonAndroidColorSaveButtonColor = ((viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalse) ? (getColorFromResource(button, R.color.white)) : (getColorFromResource(button, R.color.save_button_color)));
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.button.setEnabled(viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalse);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.button.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelTitleTextIsEmptyViewModelContentTextIsEmptyBooleanFalseButtonAndroidColorWhiteButtonAndroidColorSaveButtonColor));
            }
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTitle, viewModelTitleTextGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTitleandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editWrite, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editWriteandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editWrite, viewModelContentTextGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.titleText
        flag 1 (0x2L): viewModel.contentText
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): !viewModel.titleText.getValue().isEmpty() ? !viewModel.contentText.getValue().isEmpty() : false ? @android:color/white : @android:color/save_button_color
        flag 5 (0x6L): !viewModel.titleText.getValue().isEmpty() ? !viewModel.contentText.getValue().isEmpty() : false ? @android:color/white : @android:color/save_button_color
        flag 6 (0x7L): !viewModel.titleText.getValue().isEmpty() ? !viewModel.contentText.getValue().isEmpty() : false
        flag 7 (0x8L): !viewModel.titleText.getValue().isEmpty() ? !viewModel.contentText.getValue().isEmpty() : false
    flag mapping end*/
    //end
}