package com.wade.decompile.pool;

import java.io.DataInputStream;
import java.io.IOException;

public class UTF8TagInfo extends TagInfo {
    private final short length;
    private final byte[] data;

    public UTF8TagInfo(DataInputStream in) throws IOException {
	length = in.readShort();
	data = new byte[length];
	in.read(data);
    }
}
