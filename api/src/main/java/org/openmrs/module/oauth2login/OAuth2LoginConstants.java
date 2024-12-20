/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.oauth2login;

public class OAuth2LoginConstants {
	
	/*
	 * Module ids
	 */
	public static final String MODULE_NAME = "OAuth 2.0 Login";
	
	public static final String MODULE_ARTIFACT_ID = "oauth2login";
	
	/*
	 * Spring components
	 */
	public static final String AUTH_SCHEME_COMPONENT = "oauth2login.userInfoAuthenticationScheme";
	
	public static final String OAUTH_PROP_BEAN_NAME = "oauth2.properties";
	
	public static final String USER_PROP_ID_TOKEN = "oauth2IdToken";
	
	public static final String OAUTH2_ENABLED_PROPERTY = "oauth2.enabled";
	
}
