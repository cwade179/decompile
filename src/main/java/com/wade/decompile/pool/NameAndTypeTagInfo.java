package com.wade.decompile.pool;

import java.io.DataInputStream;
import java.io.IOException;

public class NameAndTypeTagInfo extends TagInfo {
    private final short classIndex;
    private final short descriptor;

    public NameAndTypeTagInfo(DataInputStream in) throws IOException {
        classIndex = in.readShort();
        descriptor = in.readShort();
    }

	@Override
	public String toString() {
		return String.format("Name and Type Tag : class index = %d descriptor = %d", classIndex,descriptor);
	}

	public short getClassIndex() {
		return classIndex;
	}

	public short getDescriptor() {
		return descriptor;
	}

}