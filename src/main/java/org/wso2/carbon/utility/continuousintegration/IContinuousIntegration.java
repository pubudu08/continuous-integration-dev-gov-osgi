package org.wso2.carbon.utility.continuousintegration;

/**
 * IContinuousIntegration is an interface for all Continuous Integration related APIs
 * this will act as a pluggable api interface.
 * @author Pubudu Dissanayake : pubudud@wso2.com on 02/02/2014.
 */
public interface IContinuousIntegration {


    /**
     * This method will returns artifact type
     * @return <code>cis</code>
     */
    public String getCISType();

    /**
     * This method will create a project which is related to iss
     * @param username  valid username to access API
     * @param password  valid password to access API
     * @param endpoint  endpoint of the api
     * @param projectName valid project name
     * @return <code>true</code> if project get successfully created
     */
    public boolean createCISProject(String username, String password, String endpoint,String projectName);

    /**
     * check whether project is exists or not
     * @param username valid username to access API
     * @param password valid password to access API
     * @param endpoint  endpoint of the api
     * @param projectName  valid project name
     * @return <code>true</code> if project already exists
     */
    public boolean isCISProjectExist(String username, String password,  String endpoint,String projectName);
}
