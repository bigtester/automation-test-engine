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
package org.bigtester.ate.model.page.atewebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.bigtester.ate.GlobalUtils;
import org.eclipse.jdt.annotation.Nullable;

// TODO: Auto-generated Javadoc
/**
 * The Class MyChromeDriver defines ....
 * 
 * @author Jun Yang
 */
public class MyOperaDriver extends AbstractWebDriverBase implements IMyWebDriver {
	
	/** The Constant BROWSERTYPENAME. */
	final public static String BROWSERTYPENAME = "Opera"; 
	/** The browser profile. */
	@Nullable
	final private OperaFeatureProfile browserProfile; //NOPMD
	/** The Constant BROWSERNAME. */
	/*private static final String BROWSERNAME = "operachromium";*/
	/** The Constant BROWSERDRVNAME. */
	private static final String BROWSERDRVNAME = "webdriver.chrome.driver";
	/** The Constant BROWSERWIN32PATH. */
	private static final String BROWSERWIN32PATH = "windows/operachromium/32bit/";
	/** The Constant BROWSERWIN64PATH. */
	private static final String BROWSERWIN64PATH = "windows/operachromium/64bit/";
	/** The Constant BROWSERLINUX32PATH. */
	private static final String BROWSERLINUX32PATH = "linux/operachromium/32bit/";
	/** The Constant BROWSERLINUX64PATH. */
	private static final String BROWSERLINUX64PATH = "linux/operachromium/64bit/";
	/** The Constant BROWSEROSX32PATH. */
	private static final String BROWSEROSX32PATH = "osx/operachromium/32bit/";
	/** The Constant BROWSEROSX32PATH. */
	private static final String BROWSEROSX64PATH = "osx/operachromium/64bit/";
	/** The Constant BROWSERWINFILENAME. */
	private static final String BROWSERWINFILENAME = "operadriver.exe";
	/** The Constant BROWSERLINUXFILENAME. */
	private static final String BROWSERLINUXFILENAME = "operadriver";
	/** The Constant BROWSERMACFILENAME. */
	private static final String BROWSEROSXFILENAME = "operadriver";
	/** The Constant BROWSERMACFILENAME. */
	private static final String DEFAULTOPERALINUX64PATH = "/usr/lib/x86_64-linux-gnu/opera/opera";


	/**
	 * Instantiates a new my Opera driver.
	 */
	public MyOperaDriver() {
		// TODO create Opera browsers and remote web driver handler
		super();
		browserProfile = null;
	}

	/**
	 * @return the browserProfile
	 */

	public OperaFeatureProfile getBrowserProfile() {
		final OperaFeatureProfile retVal = browserProfile;
		if (null == retVal) {
			throw new IllegalStateException(
					"browserProfile is not correctly populated");
		} else {
			return retVal;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Nullable
	public WebDriver getWebDriver() {
		return super.getWebDriver();

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebDriver getWebDriverInstance() {
		WebDriver retVal = getWebDriver();
		if (null == retVal) {
			OSinfo osinfo = new OSinfo();
			EPlatform platform = osinfo.getOSname();
			String driverPath = GlobalUtils.getDriverPath(); //NOPMD
			
			ChromeOptions options = new ChromeOptions();//NOPMD
                        
			switch (platform) {
			case Windows_32:
				/*versionNum = ReadXmlFile.parserXml(ReadXmlFile.REPOFILENAME, "windows", BROWSERNAME, ReadXmlFile.VERSION);*/
				if (driverPath == null)
					System.setProperty(BROWSERDRVNAME, GlobalUtils.DEFAULT_DRIVER_PATH + GlobalUtils.PATH_DELIMITER 
							           + BROWSERWIN32PATH + BROWSERWINFILENAME);
				else
					System.setProperty(BROWSERDRVNAME, driverPath + GlobalUtils.PATH_DELIMITER 
							           + BROWSERWIN32PATH + BROWSERWINFILENAME);
				break;
			case Windows_64:
				/*versionNum = ReadXmlFile.parserXml(ReadXmlFile.REPOFILENAME, "windows", BROWSERNAME, ReadXmlFile.VERSION);*/
				if (driverPath == null)
					System.setProperty(BROWSERDRVNAME, GlobalUtils.DEFAULT_DRIVER_PATH + GlobalUtils.PATH_DELIMITER 
							           + BROWSERWIN64PATH + BROWSERWINFILENAME);
				else
					System.setProperty(BROWSERDRVNAME, driverPath + GlobalUtils.PATH_DELIMITER 
							           + BROWSERWIN64PATH + BROWSERWINFILENAME);
				break;
			case Linux_32:
				/*versionNum = ReadXmlFile.parserXml(ReadXmlFile.REPOFILENAME, "linux", BROWSERNAME, ReadXmlFile.VERSION);*/
				if (driverPath == null)
					System.setProperty(BROWSERDRVNAME, GlobalUtils.DEFAULT_DRIVER_PATH + GlobalUtils.PATH_DELIMITER 
							           + BROWSERLINUX32PATH + BROWSERLINUXFILENAME);
				else
					System.setProperty(BROWSERDRVNAME, driverPath + GlobalUtils.PATH_DELIMITER 
							           + BROWSERLINUX32PATH + BROWSERLINUXFILENAME);
				break;
			case Linux_64:
				/*versionNum = ReadXmlFile.parserXml(ReadXmlFile.REPOFILENAME, "linux", BROWSERNAME, ReadXmlFile.VERSION);*/
				if (driverPath == null)
				    System.setProperty(BROWSERDRVNAME, GlobalUtils.DEFAULT_DRIVER_PATH + GlobalUtils.PATH_DELIMITER 
					                   + BROWSERLINUX64PATH + BROWSERLINUXFILENAME);
			    else
				    System.setProperty(BROWSERDRVNAME, driverPath + GlobalUtils.PATH_DELIMITER 
						               + BROWSERLINUX64PATH + BROWSERLINUXFILENAME);
				
				options.setBinary(DEFAULTOPERALINUX64PATH);
				break;
			case Mac_OS_X_32:
				/*versionNum = ReadXmlFile.parserXml(ReadXmlFile.REPOFILENAME, "osx", BROWSERNAME, ReadXmlFile.VERSION);*/
				if (driverPath == null)
				    System.setProperty(BROWSERDRVNAME, GlobalUtils.DEFAULT_DRIVER_PATH + GlobalUtils.PATH_DELIMITER 
				                       + BROWSEROSX32PATH + BROWSEROSXFILENAME);
			    else
				    System.setProperty(BROWSERDRVNAME, driverPath + GlobalUtils.PATH_DELIMITER 
				    		           + BROWSEROSX32PATH + BROWSEROSXFILENAME);
				break;
			case Mac_OS_X_64:
				/*versionNum = ReadXmlFile.parserXml(ReadXmlFile.REPOFILENAME, "osx", BROWSERNAME, ReadXmlFile.VERSION);*/
				if (driverPath == null)
					System.setProperty(BROWSERDRVNAME, GlobalUtils.DEFAULT_DRIVER_PATH + GlobalUtils.PATH_DELIMITER 
							           + BROWSEROSX64PATH + BROWSEROSXFILENAME);
				else
					System.setProperty(BROWSERDRVNAME, driverPath + GlobalUtils.PATH_DELIMITER 
							           + BROWSEROSX64PATH + BROWSEROSXFILENAME);
				break;
			default:
				throw GlobalUtils.createNotInitializedException("operating system is not supported ");
			}
			
			retVal = new ChromeDriver(options);
			setWebDriver(retVal);
		}
		
		return retVal;
	}

}
