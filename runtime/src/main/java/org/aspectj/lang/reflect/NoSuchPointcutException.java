/* *******************************************************************
 * Copyright (c) 2005 Contributors.
 * All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors:
 *   Adrian Colyer			Initial implementation
 * ******************************************************************/
package org.aspectj.lang.reflect;

/**
 * Thrown when AjType.getDeclaredPointcut is called with a pointcut name, and no
 * matching pointcut declaration can be found.
 */
public class NoSuchPointcutException extends Exception {

	private static final long serialVersionUID = 3256444698657634352L;
	private String name;

	public NoSuchPointcutException(String name) {
		this.name = name;
	}

	/**
	 * @return the name of the pointcut that could not be found.
	 */
	public String getName() {
		return name;
	}

}
