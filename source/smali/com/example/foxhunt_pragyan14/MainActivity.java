package com.example.foxhunt_pragyan14; class MainActivity { void a() { int a;
a=0;// .class public Lcom/example/foxhunt_pragyan14/MainActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "MainActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field Search:Ljava/lang/String;
a=0;// 
a=0;// .field mainText:Landroid/widget/TextView;
a=0;// 
a=0;// .field mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;// .field receiverWifi:Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// 
a=0;// .field sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field wifiList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/net/wifi/ScanResult;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity;);
a=0;//     const-string v0, "Search for these WiFI Networks :\n1.Happie\n2.Bday\n3.Kutti"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->Search:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v0, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 35
a=0;//     #v3=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 36
a=0;//     const v1, 0x7f030001
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/example/foxhunt_pragyan14/MainActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 37
a=0;//     const v1, 0x7f080006
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/example/foxhunt_pragyan14/MainActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainText:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 39
a=0;//     const-string v1, "wifi"
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/example/foxhunt_pragyan14/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/example/foxhunt_pragyan14/MainActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "wifi is disabled..making it enabled"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/net/wifi/WifiManager;->setWifiEnabled(Z)Z
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v1, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;);
a=0;//     invoke-direct {v1, p0}, Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;-><init>(Lcom/example/foxhunt_pragyan14/MainActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;);
a=0;//     iput-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->receiverWifi:Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->receiverWifi:Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// 
a=0;//     new-instance v2, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     const-string v3, "android.net.wifi.SCAN_RESULTS"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/IntentFilter;);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/example/foxhunt_pragyan14/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->startScan()Z
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainText:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v2, "Starting Scan..."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 54
a=0;//     const v1, 0x7f080005
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/example/foxhunt_pragyan14/MainActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "Text":Landroid/widget/TextView;
a=0;//     iget-object v1, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->Search:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateOptionsMenu(Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Null);
a=0;//     const-string v0, "Refresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 62
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainWifi:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->mainText:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "Starting Scan"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->receiverWifi:Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// 
a=0;//     #v0=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;);
a=0;//     invoke-virtual {p0, v0}, Lcom/example/foxhunt_pragyan14/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/example/foxhunt_pragyan14/MainActivity;->receiverWifi:Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;
a=0;// 
a=0;//     #v0=(Reference,Lcom/example/foxhunt_pragyan14/MainActivity$WifiReceiver;);
a=0;//     new-instance v1, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     const-string v2, "android.net.wifi.SCAN_RESULTS"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/IntentFilter;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/example/foxhunt_pragyan14/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
}}
