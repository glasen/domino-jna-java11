package com.mindoo.domino.jna.mime.attachments;

import java.io.IOException;
import java.io.InputStream;

public interface IMimeAttachment {
	
	String getFileName() throws IOException;
	
	String getContentType() throws IOException;
	
	InputStream getInputStream() throws IOException;
	
	long getFileSize() throws IOException;
	
}