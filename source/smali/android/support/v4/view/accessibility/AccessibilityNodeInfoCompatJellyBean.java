package android.support.v4.view.accessibility; class AccessibilityNodeInfoCompatJellyBean { void a() { int a;
a=0;// .class Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatJellyBean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityNodeInfoCompatJellyBean.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatJellyBean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addChild(Ljava/lang/Object;Landroid/view/View;I)V
a=0;//     .locals 0
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "virtualDescendantId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static findFocus(Ljava/lang/Object;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "focus"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityNodeInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static focusSearch(Ljava/lang/Object;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->focusSearch(I)Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityNodeInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getMovementGranularities(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isAccessibilityFocused(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isAccessibilityFocused()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isVisibleToUser(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static obtain(Landroid/view/View;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "root"    # Landroid/view/View;
a=0;//     .param p1, "virtualDescendantId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-static {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityNodeInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static performAction(Ljava/lang/Object;ILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "action"    # I
a=0;//     .param p2, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static setAccesibilityFocused(Ljava/lang/Object;Z)V
a=0;//     .locals 0
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "focused"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setMovementGranularities(Ljava/lang/Object;I)V
a=0;//     .locals 0
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "granularities"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setParent(Ljava/lang/Object;Landroid/view/View;I)V
a=0;//     .locals 0
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "root"    # Landroid/view/View;
a=0;//     .param p2, "virtualDescendantId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setSource(Ljava/lang/Object;Landroid/view/View;I)V
a=0;//     .locals 0
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "root"    # Landroid/view/View;
a=0;//     .param p2, "virtualDescendantId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setVisibleToUser(Ljava/lang/Object;Z)V
a=0;//     .locals 0
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "visibleToUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
}}
