/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2013  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://www.fosd.de/featureide/ for further information.
 */
package de.ovgu.featureide.core.signature.java;

import de.ovgu.featureide.core.signature.abstr.AbstractClass;
import de.ovgu.featureide.core.signature.abstr.AbstractClassSignature;

/**
 * Holds the java signature of a class.
 * 
 * @author Sebastian Krieter
 */
public class JavaClass extends AbstractClass {
	
	public JavaClass(AbstractClassSignature signature) {
		super(signature);
	}
	
	@Override
	public String toString() {
		return JavaStringBuilder.getClassString(this, false);
	}

	@Override
	public String toShortString() {
		return JavaStringBuilder.getClassString(this, true);
	}
}