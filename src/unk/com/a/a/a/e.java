package unk.com.a.a.a;

public final class e
{
  private static final char[] mq = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  public static final byte[] mr = new byte[0];

  public static String b(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return null;
    char[] arrayOfChar = new char[2 * paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i];
      arrayOfChar[(1 + i * 2)] = mq[(j & 0xF)];
      int k = (byte)(j >>> 4);
      arrayOfChar[(0 + i * 2)] = mq[(k & 0xF)];
    }
    return new String(arrayOfChar);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.a.a.a.e
 * JD-Core Version:    0.6.2
 */