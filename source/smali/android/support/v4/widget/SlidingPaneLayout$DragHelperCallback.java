package android.support.v4.widget; class SlidingPaneLayout$DragHelperCallback { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;
a=0;// .super Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "DragHelperCallback"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1186
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p2, "x1"    # Landroid/support/v4/widget/SlidingPaneLayout$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1186
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clampViewPositionHorizontal(Landroid/view/View;II)I
a=0;//     .locals 6
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1241
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1242
a=0;//     .local v1, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int v0, v4, v5
a=0;// 
a=0;//     .line 1243
a=0;//     .local v0, "leftBound":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v3, v0, v4
a=0;// 
a=0;//     .line 1245
a=0;//     .local v3, "rightBound":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1247
a=0;//     .local v2, "newLeft":I
a=0;//     #v2=(Integer);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public getViewHorizontalDragRange(Landroid/view/View;)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1236
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeDragStarted(II)V
a=0;//     .locals 2
a=0;//     .param p1, "edgeFlags"    # I
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1252
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1253
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCaptured(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "capturedChild"    # Landroid/view/View;
a=0;//     .param p2, "activePointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1214
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V
a=0;// 
a=0;//     .line 1215
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewDragStateChanged(I)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1199
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1200
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1201
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1202
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1203
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;// 
a=0;//     .line 1209
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1205
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1206
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onViewPositionChanged(Landroid/view/View;IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "changedView"    # Landroid/view/View;
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "dx"    # I
a=0;//     .param p5, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1219
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
a=0;// 
a=0;//     .line 1220
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
a=0;// 
a=0;//     .line 1221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewReleased(Landroid/view/View;FF)V
a=0;//     .locals 5
a=0;//     .param p1, "releasedChild"    # Landroid/view/View;
a=0;//     .param p2, "xvel"    # F
a=0;//     .param p3, "yvel"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1225
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1226
a=0;//     .local v1, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int v0, v2, v3
a=0;// 
a=0;//     .line 1227
a=0;//     .local v0, "left":I
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v2, p2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     cmpl-float v2, p2, v4
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x3f000000    # 0.5f
a=0;// 
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 1228
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     .line 1230
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
a=0;// 
a=0;//     .line 1231
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
a=0;// 
a=0;//     .line 1232
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tryCaptureView(Landroid/view/View;I)Z
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1190
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1191
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1194
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
