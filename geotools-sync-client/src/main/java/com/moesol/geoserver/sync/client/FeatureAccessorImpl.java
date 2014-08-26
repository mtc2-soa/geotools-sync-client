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



import org.opengis.feature.Feature;

/**
 * Simple implementation for feature accessor.
 * @author hastings
 */
public class FeatureAccessorImpl implements FeatureAccessor {
	private final Feature m_feature;
	
	public FeatureAccessorImpl(Feature f) {
		m_feature = f;
	}
	@Override
	public Feature getFeature() {
		return m_feature;
	}
}