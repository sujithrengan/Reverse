package android.support.v4.app; class DialogFragment { void a() { int a;
a=0;// .class public Landroid/support/v4/app/DialogFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "DialogFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnCancelListener;
a=0;// .implements Landroid/content/DialogInterface$OnDismissListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SAVED_BACK_STACK_ID:Ljava/lang/String; = "android:backStackId"
a=0;// 
a=0;// .field private static final SAVED_CANCELABLE:Ljava/lang/String; = "android:cancelable"
a=0;// 
a=0;// .field private static final SAVED_DIALOG_STATE_TAG:Ljava/lang/String; = "android:savedDialogState"
a=0;// 
a=0;// .field private static final SAVED_SHOWS_DIALOG:Ljava/lang/String; = "android:showsDialog"
a=0;// 
a=0;// .field private static final SAVED_STYLE:Ljava/lang/String; = "android:style"
a=0;// 
a=0;// .field private static final SAVED_THEME:Ljava/lang/String; = "android:theme"
a=0;// 
a=0;// .field public static final STYLE_NORMAL:I = 0x0
a=0;// 
a=0;// .field public static final STYLE_NO_FRAME:I = 0x2
a=0;// 
a=0;// .field public static final STYLE_NO_INPUT:I = 0x3
a=0;// 
a=0;// .field public static final STYLE_NO_TITLE:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mBackStackId:I
a=0;// 
a=0;// .field mCancelable:Z
a=0;// 
a=0;// .field mDialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field mDismissed:Z
a=0;// 
a=0;// .field mShownByMe:Z
a=0;// 
a=0;// .field mShowsDialog:Z
a=0;// 
a=0;// .field mStyle:I
a=0;// 
a=0;// .field mTheme:I
a=0;// 
a=0;// .field mViewDestroyed:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Landroid/support/v4/app/DialogFragment;);
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     .line 74
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     .line 75
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     .line 76
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dismiss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dismissAllowingStateLoss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dismissInternal(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "allowStateLoss"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 169
a=0;//     #v3=(One);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
a=0;// 
a=0;//     .line 179
a=0;//     iget v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     iget v2, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentManager;->popBackStack(II)V
a=0;// 
a=0;//     .line 182
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 186
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     :cond_3
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDialog()Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 292
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 295
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 296
a=0;//     iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 306
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "layout_inflater"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x18
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
a=0;// 
a=0;//     .line 304
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 310
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     const-string v1, "layout_inflater"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getShowsDialog()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTheme()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCancelable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onActivityCreated(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 355
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 357
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 378
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 361
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 362
a=0;//     .local v1, "view":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 363
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 364
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "DialogFragment can not be attached to a container view"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 366
a=0;//     :cond_2
a=0;//     #v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 368
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Landroid/app/Dialog;->setCancelable(Z)V
a=0;// 
a=0;//     .line 370
a=0;//     iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
a=0;// 
a=0;//     .line 372
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     const-string v2, "android:savedDialogState"
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 374
a=0;//     .local v0, "dialogState":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAttach(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 254
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     .line 259
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCancel(Landroid/content/DialogInterface;)V
a=0;//     .locals 0
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 274
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 276
a=0;//     iget v0, p0, Landroid/support/v4/app/DialogFragment;->mContainerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     .line 278
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     const-string v0, "android:style"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     .line 280
a=0;//     const-string v0, "android:theme"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     .line 281
a=0;//     const-string v0, "android:cancelable"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     .line 282
a=0;//     const-string v0, "android:showsDialog"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     .line 283
a=0;//     const-string v0, "android:backStackId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     .line 286
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 276
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     new-instance v0, Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Dialog;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getTheme()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 428
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 433
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 435
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 437
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetach()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V
a=0;// 
a=0;//     .line 264
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDismiss(Landroid/content/DialogInterface;)V
a=0;//     .locals 1
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V
a=0;// 
a=0;//     .line 351
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 394
a=0;//     .local v0, "dialogState":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 395
a=0;//     const-string v1, "android:savedDialogState"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 398
a=0;//     .end local v0    # "dialogState":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 399
a=0;//     const-string v1, "android:style"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 401
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 402
a=0;//     const-string v1, "android:theme"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 404
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 405
a=0;//     const-string v1, "android:cancelable"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 407
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 408
a=0;//     const-string v1, "android:showsDialog"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 410
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_5
a=0;// 
a=0;//     .line 411
a=0;//     const-string v1, "android:backStackId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 413
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     .line 387
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V
a=0;// 
a=0;//     .line 418
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 419
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->hide()V
a=0;// 
a=0;//     .line 421
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCancelable(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "cancelable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowsDialog(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "showsDialog"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
a=0;// 
a=0;//     .line 242
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStyle(II)V
a=0;//     .locals 2
a=0;//     .param p1, "style"    # I
a=0;//     .param p2, "theme"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iput p1, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     .line 103
a=0;//     iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     const v0, 0x1030059
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 107
a=0;//     iput p2, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
a=0;// 
a=0;//     .line 109
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/support/v4/app/FragmentTransaction;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p1, "transaction"    # Landroid/support/v4/app/FragmentTransaction;
a=0;//     .param p2, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 140
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {p1, p0, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 143
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     .line 145
a=0;//     iget v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "manager"    # Landroid/support/v4/app/FragmentManager;
a=0;//     .param p2, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 126
a=0;//     .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     invoke-virtual {v0, p0, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
}}
