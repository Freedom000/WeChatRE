package unk.com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.tencent.mm.platformtools.bf;

final class jb
  implements DialogInterface.OnClickListener
{
  jb(Context paramContext, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((ClipboardManager)this.cAL.getSystemService("clipboard")).setText(this.cAM);
    bf.C(this.cAM, "key.log");
    Toast.makeText(this.cAL, 2131167023, 0).show();
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jb
 * JD-Core Version:    0.6.2
 */