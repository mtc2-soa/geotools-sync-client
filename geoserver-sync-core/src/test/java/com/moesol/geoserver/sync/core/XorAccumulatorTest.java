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




import com.moesol.geoserver.sync.core.XorAccumulator;

import junit.framework.TestCase;

public class XorAccumulatorTest extends TestCase {

	public void testUpdate() {
		XorAccumulator a = new XorAccumulator();
		byte[] v = new byte[20];
		v[0] = 1;
		a.update(v);
		assertEquals("0100000000000000000000000000000000000000", a.toString());
		
		v[19] = 1;
		a.update(v);
		assertEquals("0000000000000000000000000000000000000001", a.toString());
	}

	public void testToString() {
		XorAccumulator a = new XorAccumulator();
		assertEquals(40, a.toString().length());
		assertEquals("0000000000000000000000000000000000000000", a.toString());
	}

}
