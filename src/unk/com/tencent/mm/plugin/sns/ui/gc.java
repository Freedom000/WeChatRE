package unk.com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class gc
  implements View.OnClickListener
{
  gc(SnsPermissionUI paramSnsPermissionUI)
  {
  }

  public final void onClick(View paramView)
  {
    this.bcI.adg();
    this.bcI.setResult(-1, new Intent());
    SnsPermissionUI.a(this.bcI, SnsPermissionUI.a(this.bcI));
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.gc
 * JD-Core Version:    0.6.2
 */