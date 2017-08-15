/**
 * <copyright>
 *
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: IWorkspaceActionExtension.java,v 1.1 2008/04/02 15:31:12 pelder Exp $
 */
package org.eclipse.jet.taglib.workspace;

import org.eclipse.jet.BufferedJET2Writer;

/**
 * Extension to {@link IWorkspaceAction} that permits actions to avoid
 * unnecessary file IO if the generated contents have not changed and the
 * contents is generated by a {@link BufferedJET2Writer}.
 * @since 0.9
 */
public interface IWorkspaceActionExtension
{

  /**
   * Return the buffered JET writer defining the contents to be written.
   * @return a buffered JET writer instance
   */
  BufferedJET2Writer getContentWriter();

}