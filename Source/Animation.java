
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
		if (j == 4000) {
			anims[j].anInt352 = 28;
			anims[j].anIntArray355 = new int[]{3,2,2,2,3,3,3,3,3,2,2,2,2,2,3,3,2,1,1,3,3,3,3,3,3,3,3,3};
			anims[j].anIntArray353 = new int[]{223019263,223019511,223019120,223019119,223019242,223019278,223019027,223019504,223019417,223019428,223019705,223019087,223019664,223019465,223019589,223019707,223019322,223019644,223019174,223019574,223019108,223019335,223019521,223019401,223019300,223019029,223019276,223019115};
			anims[j].anInt363 = 0;
			anims[j].anInt364 = 0;
		}
		if (j == 4001) {
			anims[j].anInt352 = 15;
			anims[j].anIntArray355 = new int[]{9,3,3,3,3,3,2,2,15,4,3,3,3,3,3};
			anims[j].anIntArray353 = new int[]{219742346,219742338,219742330,219742335,219742341,219742348,219742322,219742325,219742318,219742320,219742323,219742349,219742334,219742317,219742347};
		}
		if (j == 4002) {
			anims[j].anInt352 = 40;
			anims[j].anIntArray355 = new int[]{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
			anims[j].anIntArray353 = new int[]{219742278,219742256,219742218,219742282,219742223,219742222,219742253,219742232,219742300,219742239,219742254,219742252,219742245,219742224,219742219,219742294,219742209,219742241,219742299,219742230,219742279,219742238,219742221,219742214,219742283,219742305,219742312,219742280,219742265,219742211,219742210,219742208,219742212,219742234,219742314,219742240,219742292,219742313,219742267,219742263};
		}

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