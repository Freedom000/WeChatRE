package unk.com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.plugin.base.a.j;

final class d
  implements AdapterView.OnItemClickListener
{
  d(AddAppUI paramAddAppUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    j localj = AddAppUI.b(this.cNR).qB(paramInt);
    AddAppUI.a(this.cNR, localj.field_appId);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.d
 * JD-Core Version:    0.6.2
 */