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
package com.moesol.geoserver.sync.core;




public class IdAndValueSha1s {
	private final Sha1Value idSha1;
	private final Sha1Value valueSha1;
	
	public IdAndValueSha1s(Sha1Value id, Sha1Value value) {
		this.idSha1 = id;
		this.valueSha1 = value;
	}
	
	public Sha1Value getIdSha1() {
		return idSha1;
	}
	public Sha1Value getValueSha1() {
		return valueSha1;
	}

	@Override
	public String toString() {
		return String.format("{ id: %s, value: %s }", getIdSha1(), getValueSha1());
	}
	
}
