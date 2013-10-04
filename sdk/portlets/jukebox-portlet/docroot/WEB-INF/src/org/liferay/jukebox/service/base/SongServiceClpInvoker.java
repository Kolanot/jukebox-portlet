/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.jukebox.service.base;

import org.liferay.jukebox.service.SongServiceUtil;

import java.util.Arrays;

/**
 * @author Julio Camarero
 * @generated
 */
public class SongServiceClpInvoker {
	public SongServiceClpInvoker() {
		_methodName60 = "getBeanIdentifier";

		_methodParameterTypes60 = new String[] {  };

		_methodName61 = "setBeanIdentifier";

		_methodParameterTypes61 = new String[] { "java.lang.String" };

		_methodName66 = "addSong";

		_methodParameterTypes66 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "java.lang.String", "java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName67 = "deleteSong";

		_methodParameterTypes67 = new String[] {
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName68 = "getSongs";

		_methodParameterTypes68 = new String[] { "long" };

		_methodName69 = "getSongsByAlbumId";

		_methodParameterTypes69 = new String[] { "long", "long" };

		_methodName70 = "getSongs";

		_methodParameterTypes70 = new String[] { "long", "int", "int" };

		_methodName71 = "getSongsCount";

		_methodParameterTypes71 = new String[] { "long" };

		_methodName72 = "getSongsCountByAlbumId";

		_methodParameterTypes72 = new String[] { "long", "long" };

		_methodName73 = "updateSong";

		_methodParameterTypes73 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "java.lang.String", "java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return SongServiceUtil.getBeanIdentifier();
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			SongServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return SongServiceUtil.addSong(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.io.InputStream)arguments[3],
				(java.lang.String)arguments[4],
				(java.io.InputStream)arguments[5],
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName67.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
			return SongServiceUtil.deleteSong(((Long)arguments[0]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return SongServiceUtil.getSongs(((Long)arguments[0]).longValue());
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return SongServiceUtil.getSongsByAlbumId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return SongServiceUtil.getSongs(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return SongServiceUtil.getSongsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return SongServiceUtil.getSongsCountByAlbumId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return SongServiceUtil.updateSong(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.io.InputStream)arguments[4],
				(java.lang.String)arguments[5],
				(java.io.InputStream)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
}