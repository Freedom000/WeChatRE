package unk.com.tencent.mm.plugin.masssend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.k.y;
import com.tencent.mm.model.bd;
import com.tencent.mm.plugin.masssend.a.f;

final class ai
  implements DialogInterface.OnCancelListener
{
  ai(MassSendMsgUI paramMassSendMsgUI, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bd.hM().c(this.ayv);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.ai
 * JD-Core Version:    0.6.2
 */