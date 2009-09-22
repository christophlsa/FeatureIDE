/* FeatureIDE - An IDE to support feature-oriented software development
 * Copyright (C) 2005-2009  FeatureIDE Team, University of Magdeburg
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses/.
 *
 * See http://www.fosd.de/featureide/ for further information.
 */
package de.ovgu.featureide.ui.ahead.editors.jak;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import de.ovgu.featureide.ui.ahead.AheadUIPlugin;

/**
 * This class loads messages from JakMessages.properties file.
 * 
 * @author Constanze Adler
 */
public class JakEditorMessages {
	
	public static final String ID = "featureide.ui.ahead.editors.jak.JakEditorMessages";

	private static final String RESOURCE_BUNDLE= AheadUIPlugin.PLUGIN_ID+".editors.jak.JakEditorMessages";//$NON-NLS-1$

	private static ResourceBundle fgResourceBundle= ResourceBundle.getBundle(RESOURCE_BUNDLE);

	private JakEditorMessages(){
	}
	
	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!";//$NON-NLS-2$ //$NON-NLS-1$
		}
	}

}
