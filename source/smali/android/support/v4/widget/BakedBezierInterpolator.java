package android.support.v4.widget; class BakedBezierInterpolator { void a() { int a;
a=0;// .class final Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BakedBezierInterpolator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;// .field private static final STEP_SIZE:F
a=0;// 
a=0;// .field private static final VALUES:[F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/BakedBezierInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     .line 48
a=0;//     const/16 v0, 0x65
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     .line 61
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sput v0, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3951b717    # 2.0E-4f
a=0;//         0x3a6bedfa    # 9.0E-4f
a=0;//         0x3af9096c    # 0.0019f
a=0;//         0x3b6bedfa    # 0.0036f
a=0;//         0x3bc154ca    # 0.0059f
a=0;//         0x3c0ce704    # 0.0086f
a=0;//         0x3c42f838    # 0.0119f
a=0;//         0x3c809d49    # 0.0157f
a=0;//         0x3cab367a    # 0.0209f
a=0;//         0x3cd288ce    # 0.0257f
a=0;//         0x3d037b4a
a=0;//         0x3d20902e    # 0.0392f
a=0;//         0x3d401a37    # 0.0469f
a=0;//         0x3d67d567    # 0.0566f
a=0;//         0x3d86594b    # 0.0656f
a=0;//         0x3d9d4952    # 0.0768f
a=0;//         0x3db5a858    # 0.0887f
a=0;//         0x3dd38ef3    # 0.1033f
a=0;//         0x3df2e48f    # 0.1186f
a=0;//         0x3e0a233a    # 0.1349f
a=0;//         0x3e1b8bac    # 0.1519f
a=0;//         0x3e2dab9f    # 0.1696f
a=0;//         0x3e456d5d    # 0.1928f
a=0;//         0x3e5930be    # 0.2121f
a=0;//         0x3e72b021    # 0.237f
a=0;//         0x3e86809d    # 0.2627f
a=0;//         0x3e941206    # 0.2892f
a=0;//         0x3e9f2e49    # 0.3109f
a=0;//         0x3ead5cfb    # 0.3386f
a=0;//         0x3ebbc01a    # 0.3667f
a=0;//         0x3eca57a8    # 0.3952f
a=0;//         0x3ed923a3    # 0.4241f
a=0;//         0x3ee5119d    # 0.4474f
a=0;//         0x3ef404ea    # 0.4766f
a=0;//         0x3f000000    # 0.5f
a=0;//         0x3f05fd8b    # 0.5234f
a=0;//         0x3f0bfb16    # 0.5468f
a=0;//         0x3f11f213    # 0.5701f
a=0;//         0x3f17e282    # 0.5933f
a=0;//         0x3f1d07c8    # 0.6134f
a=0;//         0x3f221ff3    # 0.6333f
a=0;//         0x3f273190    # 0.6531f
a=0;//         0x3f2b7803    # 0.6698f
a=0;//         0x3f3068dc    # 0.6891f
a=0;//         0x3f349518    # 0.7054f
a=0;//         0x3f38adac    # 0.7214f
a=0;//         0x3f3c0ebf    # 0.7346f
a=0;//         0x3f400d1b    # 0.7502f
a=0;//         0x3f4353f8    # 0.763f
a=0;//         0x3f468db9    # 0.7756f
a=0;//         0x3f49b3d0    # 0.7879f
a=0;//         0x3f4ccccd    # 0.8f
a=0;//         0x3f4f8a09    # 0.8107f
a=0;//         0x3f523a2a    # 0.8212f
a=0;//         0x3f552546    # 0.8326f
a=0;//         0x3f576c8b    # 0.8415f
a=0;//         0x3f59ad43    # 0.8503f
a=0;//         0x3f5bda51    # 0.8588f
a=0;//         0x3f5e00d2    # 0.8672f
a=0;//         0x3f601a37    # 0.8754f
a=0;//         0x3f621ff3    # 0.8833f
a=0;//         0x3f641f21    # 0.8911f
a=0;//         0x3f65cfab    # 0.8977f
a=0;//         0x3f677319    # 0.9041f
a=0;//         0x3f694af5    # 0.9113f
a=0;//         0x3f6a9fbe    # 0.9165f
a=0;//         0x3f6c56d6    # 0.9232f
a=0;//         0x3f6d97f6    # 0.9281f
a=0;//         0x3f6ecbfb    # 0.9328f
a=0;//         0x3f702de0    # 0.9382f
a=0;//         0x3f7182aa    # 0.9434f
a=0;//         0x3f7295ea    # 0.9476f
a=0;//         0x3f73a92a    # 0.9518f
a=0;//         0x3f74a8c1    # 0.9557f
a=0;//         0x3f75a858    # 0.9596f
a=0;//         0x3f769446    # 0.9632f
a=0;//         0x3f7758e2    # 0.9662f
a=0;//         0x3f783127    # 0.9695f
a=0;//         0x3f78e219    # 0.9722f
a=0;//         0x3f79ad43    # 0.9753f
a=0;//         0x3f7a4a8c    # 0.9777f
a=0;//         0x3f7b020c    # 0.9805f
a=0;//         0x3f7b8bac    # 0.9826f
a=0;//         0x3f7c154d    # 0.9847f
a=0;//         0x3f7c91d1    # 0.9866f
a=0;//         0x3f7d07c8    # 0.9884f
a=0;//         0x3f7d7732    # 0.9901f
a=0;//         0x3f7de00d    # 0.9917f
a=0;//         0x3f7e3bcd    # 0.9931f
a=0;//         0x3f7e9100    # 0.9944f
a=0;//         0x3f7ed917    # 0.9955f
a=0;//         0x3f7f1412    # 0.9964f
a=0;//         0x3f7f4f0e    # 0.9973f
a=0;//         0x3f7f837b    # 0.9981f
a=0;//         0x3f7fa440    # 0.9986f
a=0;//         0x3f7fcb92    # 0.9992f
a=0;//         0x3f7fdf3b    # 0.9995f
a=0;//         0x3f7ff2e5    # 0.9998f
a=0;//         0x3f800000    # 1.0f
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final getInstance()Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getInterpolation(F)F
a=0;//     .locals 7
a=0;//     .param p1, "input"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v5=(Null);
a=0;//     cmpl-float v6, p1, v4
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ltz v6, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Float);v6=(Integer);
a=0;//     return v4
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Null);v6=(Byte);
a=0;//     cmpg-float v4, p1, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_1
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 70
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     #v4=(Byte);
a=0;//     sget-object v4, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, p1
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x2
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 77
a=0;//     .local v1, "position":I
a=0;//     #v1=(Integer);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sget v5, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
a=0;// 
a=0;//     mul-float v2, v4, v5
a=0;// 
a=0;//     .line 78
a=0;//     .local v2, "quantized":F
a=0;//     #v2=(Float);
a=0;//     sub-float v0, p1, v2
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "difference":F
a=0;//     #v0=(Float);
a=0;//     sget v4, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-float v3, v0, v4
a=0;// 
a=0;//     .line 81
a=0;//     .local v3, "weight":F
a=0;//     #v3=(Float);
a=0;//     sget-object v4, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aget v4, v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     add-int/lit8 v6, v1, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget-object v6, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v6=(Reference,[F);
a=0;//     aget v6, v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v5, v3
a=0;// 
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     goto :goto_0
a=0;// .end method
}}
