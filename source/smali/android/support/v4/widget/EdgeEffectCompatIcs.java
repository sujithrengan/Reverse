package android.support.v4.widget; class EdgeEffectCompatIcs { void a() { int a;
a=0;// .class Landroid/support/v4/widget/EdgeEffectCompatIcs;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EdgeEffectCompatIcs.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/EdgeEffectCompatIcs;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static draw(Ljava/lang/Object;Landroid/graphics/Canvas;)Z
a=0;//     .locals 1
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     check-cast p0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .end local p0    # "edgeEffect":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static finish(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     check-cast p0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .end local p0    # "edgeEffect":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/EdgeEffect;->finish()V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static isFinished(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     check-cast p0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .end local p0    # "edgeEffect":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static newEdgeEffect(Landroid/content/Context;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/EdgeEffect;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EdgeEffect;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static onAbsorb(Ljava/lang/Object;I)Z
a=0;//     .locals 1
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;//     .param p1, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     check-cast p0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .end local p0    # "edgeEffect":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static onPull(Ljava/lang/Object;F)Z
a=0;//     .locals 1
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;//     .param p1, "deltaDistance"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     check-cast p0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .end local p0    # "edgeEffect":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onPull(F)V
a=0;// 
a=0;//     .line 47
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static onRelease(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "eff":Landroid/widget/EdgeEffect;
a=0;//     invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static setSize(Ljava/lang/Object;II)V
a=0;//     .locals 0
a=0;//     .param p0, "edgeEffect"    # Ljava/lang/Object;
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     check-cast p0, Landroid/widget/EdgeEffect;
a=0;// 
a=0;//     .end local p0    # "edgeEffect":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->setSize(II)V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
}}