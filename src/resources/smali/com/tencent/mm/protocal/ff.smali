.class public final Lcom/tencent/mm/protocal/ff;
.super Lcom/tencent/mm/protocal/q;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/protocal/o;


# instance fields
.field public bxp:Lcom/tencent/mm/protocal/a/hv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/tencent/mm/protocal/q;-><init>()V

    .line 9
    new-instance v0, Lcom/tencent/mm/protocal/a/hv;

    invoke-direct {v0}, Lcom/tencent/mm/protocal/a/hv;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/protocal/ff;->bxp:Lcom/tencent/mm/protocal/a/hv;

    return-void
.end method


# virtual methods
.method public final jY()I
    .locals 1

    .prologue
    .line 13
    const/16 v0, 0x84

    return v0
.end method

.method public final kG()[B
    .locals 2

    .prologue
    .line 23
    iget-object v0, p0, Lcom/tencent/mm/protocal/ff;->bxp:Lcom/tencent/mm/protocal/a/hv;

    invoke-static {p0}, Lcom/tencent/mm/protocal/n;->b(Lcom/tencent/mm/protocal/q;)Lcom/tencent/mm/protocal/a/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/mm/protocal/a/hv;->aq(Lcom/tencent/mm/protocal/a/x;)Lcom/tencent/mm/protocal/a/hv;

    .line 24
    iget-object v0, p0, Lcom/tencent/mm/protocal/ff;->bxp:Lcom/tencent/mm/protocal/a/hv;

    invoke-virtual {v0}, Lcom/tencent/mm/protocal/a/hv;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public final kH()I
    .locals 1

    .prologue
    .line 18
    const/16 v0, 0xff

    return v0
.end method
