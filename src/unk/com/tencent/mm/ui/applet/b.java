package unk.com.tencent.mm.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class b
  implements DialogInterface.OnCancelListener
{
  b(a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a.a(this.cmb, false, a.a(this.cmb));
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.b
 * JD-Core Version:    0.6.2
 */