/*
 	Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 	
 	This file is part of OpenPnP.
 	
	OpenPnP is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpenPnP is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpenPnP.  If not, see <http://www.gnu.org/licenses/>.
 	
 	For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.machine.generic;

import org.openpnp.Location;
import org.openpnp.Part;
import org.openpnp.spi.Feeder;
import org.w3c.dom.Node;

/**
 * A common base class for Feeders that the generic machine supports.
 * Provides support for additional configuration and a chance for the Feeder to have it's say
 * during part pickup. 
 */
public abstract class GenericFeeder implements Feeder {
	String reference;
	
	public abstract void configure(Node n) throws Exception;

	@Override
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
}