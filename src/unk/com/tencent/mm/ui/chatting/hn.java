package unk.com.tencent.mm.ui.chatting;

import android.media.ToneGenerator;

final class hn
  implements Runnable
{
  hn(ChattingUI paramChattingUI)
  {
  }

  public final void run()
  {
    ChattingUI.C(this.cAk).stopTone();
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hn
 * JD-Core Version:    0.6.2
 */