/*******************************************************************************
 * ATE, Automation Test Engine
 *
 * Copyright 2014, Montreal PROT, or individual contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Montreal PROT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.bigtester.ate.model.utils;

import org.bigtester.ate.constant.ThinkTimeConstants;

// TODO: Auto-generated Javadoc
/**
 * This class ThinkTime defines ....
 * @author Peidong Hu
 *
 */
public class ThinkTime {
	
	/** The think time in seconds */
	transient int thinkTime; //NOPMD
	
	/**
	 * Instantiates a new think time.
	 */
	public ThinkTime() {
		thinkTime = ThinkTimeConstants.DEFAULT_THINK_TIME;
	}
	
	/**
	 * Instantiates a new think time.
	 *
	 * @param thinkTime the think time in seconds
	 */
	public ThinkTime(int thinkTime) {
		this.thinkTime = thinkTime;
	}
	
	/**
	 * Sets the timer.
	 */
	public void setTimer() {
		
		try {
		    Thread.sleep(thinkTime * 1000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
}
