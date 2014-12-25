package com.wade.decompile.pool;

import java.io.DataInputStream;
import java.io.IOException;

public class IntegerTagInfo extends TagInfo {
    private final int number;

    public IntegerTagInfo(DataInputStream in) throws IOException {
        number = in.readInt();
    }
    
	@Override
	public String toString() {
		return String.format("Integer Tag : %d", number);
	}

	public int getNumber() {
		return number;
	}

}
