package unk.com.tencent.mm.ui;

import android.app.ProgressDialog;
import com.tencent.mm.k.y;
import com.tencent.mm.model.bd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.z.bh;

final class ee
  implements ac
{
  ee(ec paramec, bh parambh)
  {
  }

  public final boolean cU()
  {
    bd.hM().c(this.cjo);
    bd.hM().b(281, ec.a(this.cjn));
    ec.b(this.cjn);
    if (ec.c(this.cjn) != null)
    {
      ec.c(this.cjn).ZR();
      ec.d(this.cjn);
    }
    if (MainTabUI.j(this.cjn.cjm.cjl) != null)
      MainTabUI.j(this.cjn.cjm.cjl).dismiss();
    MainTabUI.k(this.cjn.cjm.cjl);
    return false;
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ee
 * JD-Core Version:    0.6.2
 */