/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.action.astro.internal;

import org.openhab.core.scriptengine.action.ActionService;

/**
 * This class registers an OSGi service for the Astro action.
 *
 * @author Gerhard Riegler
 * @since 1.7.0
 */
public class AstroActionService implements ActionService {

    public void activate() {
    }

    public void deactivate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getActionClassName() {
        return Astro.class.getCanonicalName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?> getActionClass() {
        return Astro.class;
    }

}
