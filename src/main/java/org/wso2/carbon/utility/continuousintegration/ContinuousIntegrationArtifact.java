package org.wso2.carbon.utility.continuousintegration;

import org.wso2.carbon.utility.continuousintegration.exception.GenericArtifactException;

import java.io.IOException;

/**
 * ContinuousIntegrationArtifact is an interface for all Continuous Integration related APIs
 * this will act as a plugable api interface.
 *
 * @author Pubudu Dissanayake : pubudud@wso2.com on 02/02/2014.
 */
public interface ContinuousIntegrationArtifact {

	/**
	 * This method will returns artifact type
	 *
	 * @return <code>cis</code>
	 */
	public String getCISType();

	/**
	 * This method will create a project which is related to iss
	 *
	 * @param username    valid username to access API
	 * @param password    valid password to access API
	 * @param endpoint    endpoint of the api
	 * @param projectName valid project name
	 * @return <code>true</code> if project get successfully created
	 */
	public void createCISProject(String username, String password, String endpoint,
	                                String projectName)throws GenericArtifactException;

}
