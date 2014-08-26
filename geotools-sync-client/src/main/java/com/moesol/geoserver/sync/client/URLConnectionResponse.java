/**
 *  #%L
 *  geoserver-sync-core
 *  %%
 *  Copyright (C) 2013 Moebius Solutions Inc.
 *  %%
 *  This program is free software: you can redistribute it and/or
 *  modify it under the terms of the Apache License v2.0 as
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  Apache License v2.0 for more details.
 *
 *  You should have received a copy of the Apache License v2.0
 *  along with this program.  If not, see
 *  <http://www.apache.org/licenses/LICENSE-2.0.html>.
 *  #L%
 *
 */
package com.moesol.geoserver.sync.client;




import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

public class URLConnectionResponse implements Response {
	private final HttpURLConnection m_connection;

	public URLConnectionResponse(HttpURLConnection conn) {
		m_connection = conn;
	}

	@Override
	public int getResponseCode() throws IOException {
		return m_connection.getResponseCode();
	}

	@Override
	public String getResponseMessage() throws IOException {
		return m_connection.getResponseMessage();
	}
	
	@Override
	public String getContentEncoding() {
		return m_connection.getContentEncoding();
	}

	@Override
	public InputStream getResultStream() throws IOException {
        InputStream is = m_connection.getInputStream();
        String encoding = m_connection.getContentEncoding();
        if ("gzip".equalsIgnoreCase(encoding)) { 
        	is = new GZIPInputStream(is); 
        }
        return is;
	}

}
