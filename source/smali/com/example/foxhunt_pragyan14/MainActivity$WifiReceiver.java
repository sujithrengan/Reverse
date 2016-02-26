package com.example.foxhunt_pragyan14; class MainActivity$WifiReceiver { void a() { int a;
a=0;// .class Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "MainActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "WifiReceiver"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/example/foxhunt_pragyan14/MainActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iput-object p1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 5
a=0;//     .param p1, "c"    # Landroid/content/Context;
a=0;//     .param p2, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v2, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/example/foxhunt_pragyan14/MainActivity;->mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->wifiList:Ljava/util/List;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\n        Number Of Wifi connections :"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/example/foxhunt_pragyan14/MainActivity;->wifiList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\n\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->wifiList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity;);
a=0;//     iget-object v1, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v3, Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Integer;);
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v2, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->wifiList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "\n\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 95
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity;);
a=0;//     iget-object v1, v1, Lcom/example/foxhunt_pragyan14/MainActivity;->mainText:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;->this$0:Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
}}
