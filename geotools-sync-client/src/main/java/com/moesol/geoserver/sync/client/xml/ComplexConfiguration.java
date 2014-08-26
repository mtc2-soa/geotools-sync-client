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
package com.moesol.geoserver.sync.client.xml;

import java.util.Map;

import org.geotools.gml3.GML;
import org.geotools.gml3.GMLConfiguration;
import org.geotools.xml.Configuration;
import org.geotools.xs.XS;
import org.geotools.xs.XSConfiguration;
import org.picocontainer.MutablePicoContainer;

public class ComplexConfiguration extends Configuration {
    
    public ComplexConfiguration(String namespace, String schemaLocation) {
        super(new ResolvingApplicationSchemaXSD(namespace, schemaLocation));
        addDependency(new XSConfiguration());
        addDependency(new GMLConfiguration());
    }

    @Override
    protected void configureBindings(Map bindings) {
        super.configureBindings(bindings);

    }

    @Override
    protected void configureContext(MutablePicoContainer container) {
        super.configureContext(container);
    }

    @Override
    protected void registerBindings(Map bindings) {
        super.registerBindings(bindings);

        /*
         * gml:CodeType is a simple type with attributes and requires special
         * handling. All such types should probably be handled by one binding
         * class.
         */
        bindings.put(GML.CodeType, CodeTypeBinding.class);
    }
}
