package unk.com.tencent.mm.ad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ag extends Binder
  implements af
{
  public ag()
  {
    attachInterface(this, "com.tencent.mm.network.IOnNetworkChange_AIDL");
  }

  public static af e(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof af)))
      return (af)localIInterface;
    return new ah(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.tencent.mm.network.IOnNetworkChange_AIDL");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
    aw(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.ag
 * JD-Core Version:    0.6.2
 */