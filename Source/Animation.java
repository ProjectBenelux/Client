
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public final class Animation {

	public static byte[] getData(String s) {
			return FileOperations.ReadFile(s);
	}
	
    public static void unpackConfig(NamedArchive NamedArchive)
    {
           ByteBuffer ByteBuffer = new ByteBuffer(getData("C:/ProjectBeneluxCache/data/animation/seq.dat"));
        int length = ByteBuffer.readUnsignedWord();
        if(anims == null)
            anims = new Animation[length];
        for(int j = 0; j < length; j++)
        {
            if(anims[j] == null)
                anims[j] = new Animation();
            anims[j].readValues(ByteBuffer);

        }
    }

   public int method258(int i)
    {
        int j = anIntArray355[i];
        if(j == 0)
        {
            FrameReader class36 = FrameReader.method531(anIntArray353[i]);
            if(class36 != null)
                j = anIntArray355[i] = class36.anInt636;
        }
        if(j == 0)
            j = 1;
        return j;
    }

	public void readValues(ByteBuffer ByteBuffer)
	{
		do {
			int i = ByteBuffer.readUnsignedByte();
			if(i == 0)
				break;
			if(i == 1) {
				anInt352 = ByteBuffer.readUnsignedWord();
				anIntArray353 = new int[anInt352];
				anIntArray354 = new int[anInt352];
				anIntArray355 = new int[anInt352];
				for(int i_ = 0; i_ < anInt352; i_++){
					anIntArray353[i_] = ByteBuffer.readDWord();
					anIntArray354[i_] = -1;
				}
				for(int i_ = 0; i_ < anInt352; i_++)
					anIntArray355[i_] = ByteBuffer.readUnsignedByte();
			}
			else if(i == 2)
				anInt356 = ByteBuffer.readUnsignedWord();
			else if(i == 3) {
				int k = ByteBuffer.readUnsignedByte();
				anIntArray357 = new int[k + 1];
				for(int l = 0; l < k; l++)
					anIntArray357[l] = ByteBuffer.readUnsignedByte();
				anIntArray357[k] = 0x98967f;
			}
			else if(i == 4)
				aBoolean358 = true;
			else if(i == 5)
				anInt359 = ByteBuffer.readUnsignedByte();
			else if(i == 6)
				anInt360 = ByteBuffer.readUnsignedWord();
			else if(i == 7)
				anInt361 = ByteBuffer.readUnsignedWord();
			else if(i == 8)
				anInt362 = ByteBuffer.readUnsignedByte();
			else if(i == 9)
				anInt363 = ByteBuffer.readUnsignedByte();
			else if(i == 10)
				anInt364 = ByteBuffer.readUnsignedByte();
			else if(i == 11)
				anInt365 = ByteBuffer.readUnsignedByte();
			else 
				System.out.println("Unrecognized seq.dat config code: "+i);
		} while(true);
		if(anInt352 == 0)
		{
			anInt352 = 1;
			anIntArray353 = new int[1];
			anIntArray353[0] = -1;
			anIntArray354 = new int[1];
			anIntArray354[0] = -1;
			anIntArray355 = new int[1];
			anIntArray355[0] = -1;
		}
		if(anInt363 == -1)
			if(anIntArray357 != null)
				anInt363 = 2;
			else
				anInt363 = 0;
		if(anInt364 == -1)
		{
			if(anIntArray357 != null)
			{
				anInt364 = 2;
				return;
			}
			anInt364 = 0;
		}
	}
    private Animation()
    {
        anInt356 = -1;
        aBoolean358 = false;
        anInt359 = 5;
        anInt360 = -1;
        anInt361 = -1;
        anInt362 = 99;
        anInt363 = -1;
        anInt364 = -1;
        anInt365 = 2;
    }

    public static Animation anims[];
    public int anInt352;
    public int anIntArray353[];
    public int anIntArray354[];
    private int[] anIntArray355;
    public int anInt356;
    public int anIntArray357[];
    public boolean aBoolean358;
    public int anInt359;
    public int anInt360;
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    public static int anInt367;
}