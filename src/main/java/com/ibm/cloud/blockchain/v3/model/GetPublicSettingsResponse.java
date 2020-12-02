/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.blockchain.v3.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the details of all public settings for the UI.
 */
public class GetPublicSettingsResponse extends GenericModel {

  @SerializedName("ACTIVITY_TRACKER_PATH")
  protected String activityTrackerPath;
  @SerializedName("ATHENA_ID")
  protected String athenaId;
  @SerializedName("AUTH_SCHEME")
  protected String authScheme;
  @SerializedName("CALLBACK_URI")
  protected String callbackUri;
  @SerializedName("CLUSTER_DATA")
  protected GetPublicSettingsResponseCLUSTERDATA clusterData;
  @SerializedName("CONFIGTXLATOR_URL")
  protected String configtxlatorUrl;
  @SerializedName("CRN")
  protected GetPublicSettingsResponseCRN crn;
  @SerializedName("CRN_STRING")
  protected String crnString;
  @SerializedName("CSP_HEADER_VALUES")
  protected List<String> cspHeaderValues;
  @SerializedName("DB_SYSTEM")
  protected String dbSystem;
  @SerializedName("DEPLOYER_URL")
  protected String deployerUrl;
  @SerializedName("DOMAIN")
  protected String domain;
  @SerializedName("ENVIRONMENT")
  protected String environment;
  @SerializedName("FABRIC_CAPABILITIES")
  protected GetPublicSettingsResponseFABRICCAPABILITIES fabricCapabilities;
  @SerializedName("FEATURE_FLAGS")
  protected Map<String, Object> featureFlags;
  @SerializedName("FILE_LOGGING")
  protected GetPublicSettingsResponseFILELOGGING fileLogging;
  @SerializedName("HOST_URL")
  protected String hostUrl;
  @SerializedName("IAM_CACHE_ENABLED")
  protected Boolean iamCacheEnabled;
  @SerializedName("IAM_URL")
  protected String iamUrl;
  @SerializedName("IBM_ID_CALLBACK_URL")
  protected String ibmIdCallbackUrl;
  @SerializedName("IGNORE_CONFIG_FILE")
  protected Boolean ignoreConfigFile;
  @SerializedName("INACTIVITY_TIMEOUTS")
  protected GetPublicSettingsResponseINACTIVITYTIMEOUTS inactivityTimeouts;
  @SerializedName("INFRASTRUCTURE")
  protected String infrastructure;
  @SerializedName("LANDING_URL")
  protected String landingUrl;
  @SerializedName("LOGIN_URI")
  protected String loginUri;
  @SerializedName("LOGOUT_URI")
  protected String logoutUri;
  @SerializedName("MAX_REQ_PER_MIN")
  protected Double maxReqPerMin;
  @SerializedName("MAX_REQ_PER_MIN_AK")
  protected Double maxReqPerMinAk;
  @SerializedName("MEMORY_CACHE_ENABLED")
  protected Boolean memoryCacheEnabled;
  @SerializedName("PORT")
  protected String port;
  @SerializedName("PROXY_CACHE_ENABLED")
  protected Boolean proxyCacheEnabled;
  @SerializedName("PROXY_TLS_FABRIC_REQS")
  protected String proxyTlsFabricReqs;
  @SerializedName("PROXY_TLS_HTTP_URL")
  protected String proxyTlsHttpUrl;
  @SerializedName("PROXY_TLS_WS_URL")
  protected Object proxyTlsWsUrl;
  @SerializedName("REGION")
  protected String region;
  @SerializedName("SESSION_CACHE_ENABLED")
  protected Boolean sessionCacheEnabled;
  @SerializedName("TIMEOUTS")
  protected Map<String, Object> timeouts;
  @SerializedName("TIMESTAMPS")
  protected SettingsTimestampData timestamps;
  @SerializedName("TRANSACTION_VISIBILITY")
  protected Map<String, Object> transactionVisibility;
  @SerializedName("TRUST_PROXY")
  protected String trustProxy;
  @SerializedName("TRUST_UNKNOWN_CERTS")
  protected Boolean trustUnknownCerts;
  @SerializedName("VERSIONS")
  protected GetPublicSettingsResponseVERSIONS versions;

  /**
   * Gets the activityTrackerPath.
   *
   * The path to the activity tracker file. This file holds details of all activity. Defaults to '?' (disabled).
   *
   * @return the activityTrackerPath
   */
  public String getActivityTrackerPath() {
    return activityTrackerPath;
  }

  /**
   * Gets the athenaId.
   *
   * Random/unique id for the process running the IBP console server.
   *
   * @return the athenaId
   */
  public String getAthenaId() {
    return athenaId;
  }

  /**
   * Gets the authScheme.
   *
   * The type of auth protecting the UI.
   *
   * @return the authScheme
   */
  public String getAuthScheme() {
    return authScheme;
  }

  /**
   * Gets the callbackUri.
   *
   * Route used for an SSO callback uri. Only used if AUTH_SCHEME is "iam".
   *
   * @return the callbackUri
   */
  public String getCallbackUri() {
    return callbackUri;
  }

  /**
   * Gets the clusterData.
   *
   * @return the clusterData
   */
  public GetPublicSettingsResponseCLUSTERDATA getClusterData() {
    return clusterData;
  }

  /**
   * Gets the configtxlatorUrl.
   *
   * URL used for a configtxlator rest server.
   *
   * @return the configtxlatorUrl
   */
  public String getConfigtxlatorUrl() {
    return configtxlatorUrl;
  }

  /**
   * Gets the crn.
   *
   * metadata about the IBM Cloud service instance. [Only populated if using IBM Cloud].
   *
   * @return the crn
   */
  public GetPublicSettingsResponseCRN getCrn() {
    return crn;
  }

  /**
   * Gets the crnString.
   *
   * @return the crnString
   */
  public String getCrnString() {
    return crnString;
  }

  /**
   * Gets the cspHeaderValues.
   *
   * array of strings that define the Content Security Policy headers for the IBP console.
   *
   * @return the cspHeaderValues
   */
  public List<String> getCspHeaderValues() {
    return cspHeaderValues;
  }

  /**
   * Gets the dbSystem.
   *
   * The id of the database for internal documents.
   *
   * @return the dbSystem
   */
  public String getDbSystem() {
    return dbSystem;
  }

  /**
   * Gets the deployerUrl.
   *
   * URL of the companion application for the IBP console.
   *
   * @return the deployerUrl
   */
  public String getDeployerUrl() {
    return deployerUrl;
  }

  /**
   * Gets the domain.
   *
   * Browser cookies will use this value for their domain property. Thus it should match the URL's domain in the
   * browser. `null` is valid if serving over http.
   *
   * @return the domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Gets the environment.
   *
   * Either "dev" "staging" or "prod". Controls different security settings and minor things such as the amount of time
   * to cache content.
   *
   * @return the environment
   */
  public String getEnvironment() {
    return environment;
  }

  /**
   * Gets the fabricCapabilities.
   *
   * Contains the Hyperledger Fabric capabilities flags that should be used.
   *
   * @return the fabricCapabilities
   */
  public GetPublicSettingsResponseFABRICCAPABILITIES getFabricCapabilities() {
    return fabricCapabilities;
  }

  /**
   * Gets the featureFlags.
   *
   * Configures th IBP console to enable/disable features.
   *
   * @return the featureFlags
   */
  public Map<String, Object> getFeatureFlags() {
    return featureFlags;
  }

  /**
   * Gets the fileLogging.
   *
   * File logging settings.
   *
   * @return the fileLogging
   */
  public GetPublicSettingsResponseFILELOGGING getFileLogging() {
    return fileLogging;
  }

  /**
   * Gets the hostUrl.
   *
   * The external URL to reach the IBP console.
   *
   * @return the hostUrl
   */
  public String getHostUrl() {
    return hostUrl;
  }

  /**
   * Gets the iamCacheEnabled.
   *
   * If true an in memory cache will be used to interface with the IBM IAM (an authorization) service. [Only applies if
   * IBP is running in IBM Cloud].
   *
   * @return the iamCacheEnabled
   */
  public Boolean isIamCacheEnabled() {
    return iamCacheEnabled;
  }

  /**
   * Gets the iamUrl.
   *
   * The URL to reach the IBM IAM service. [Only applies if IBP is running in IBM Cloud].
   *
   * @return the iamUrl
   */
  public String getIamUrl() {
    return iamUrl;
  }

  /**
   * Gets the ibmIdCallbackUrl.
   *
   * The URL to use during SSO login with the IBM IAM service. [Only applies if IBP is running in IBM Cloud].
   *
   * @return the ibmIdCallbackUrl
   */
  public String getIbmIdCallbackUrl() {
    return ibmIdCallbackUrl;
  }

  /**
   * Gets the ignoreConfigFile.
   *
   * If true the config file will not be loaded during startup. Thus settings in the config file will not take effect.
   *
   * @return the ignoreConfigFile
   */
  public Boolean isIgnoreConfigFile() {
    return ignoreConfigFile;
  }

  /**
   * Gets the inactivityTimeouts.
   *
   * @return the inactivityTimeouts
   */
  public GetPublicSettingsResponseINACTIVITYTIMEOUTS getInactivityTimeouts() {
    return inactivityTimeouts;
  }

  /**
   * Gets the infrastructure.
   *
   * What type of infrastructure is being used to run the IBP console. "ibmcloud", "azure", "other".
   *
   * @return the infrastructure
   */
  public String getInfrastructure() {
    return infrastructure;
  }

  /**
   * Gets the landingUrl.
   *
   * @return the landingUrl
   */
  public String getLandingUrl() {
    return landingUrl;
  }

  /**
   * Gets the loginUri.
   *
   * path for user login.
   *
   * @return the loginUri
   */
  public String getLoginUri() {
    return loginUri;
  }

  /**
   * Gets the logoutUri.
   *
   * path for user logout.
   *
   * @return the logoutUri
   */
  public String getLogoutUri() {
    return logoutUri;
  }

  /**
   * Gets the maxReqPerMin.
   *
   * The number of `/api/_*` requests per minute to allow. Exceeding this limit results in 429 error responses.
   *
   * @return the maxReqPerMin
   */
  public Double getMaxReqPerMin() {
    return maxReqPerMin;
  }

  /**
   * Gets the maxReqPerMinAk.
   *
   * The number of `/ak/api/_*` requests per minute to allow. Exceeding this limit results in 429 error responses.
   *
   * @return the maxReqPerMinAk
   */
  public Double getMaxReqPerMinAk() {
    return maxReqPerMinAk;
  }

  /**
   * Gets the memoryCacheEnabled.
   *
   * If true an in memory cache will be used against couchdb requests.
   *
   * @return the memoryCacheEnabled
   */
  public Boolean isMemoryCacheEnabled() {
    return memoryCacheEnabled;
  }

  /**
   * Gets the port.
   *
   * Internal port that IBP console is running on.
   *
   * @return the port
   */
  public String getPort() {
    return port;
  }

  /**
   * Gets the proxyCacheEnabled.
   *
   * If true an in memory cache will be used for internal proxy requests.
   *
   * @return the proxyCacheEnabled
   */
  public Boolean isProxyCacheEnabled() {
    return proxyCacheEnabled;
  }

  /**
   * Gets the proxyTlsFabricReqs.
   *
   * If `"always"` requests to Fabric components will go through the IBP console server. If `true` requests to Fabric
   * components with IP based URLs will go through the IBP console server, while Fabric components with hostname based
   * URLs will go directly from the browser to the component. If `false` all requests to Fabric components will go
   * directly from the browser to the component.
   *
   * @return the proxyTlsFabricReqs
   */
  public String getProxyTlsFabricReqs() {
    return proxyTlsFabricReqs;
  }

  /**
   * Gets the proxyTlsHttpUrl.
   *
   * The URL to use to proxy an http request to a Fabric component.
   *
   * @return the proxyTlsHttpUrl
   */
  public String getProxyTlsHttpUrl() {
    return proxyTlsHttpUrl;
  }

  /**
   * Gets the proxyTlsWsUrl.
   *
   * The URL to use to proxy WebSocket request to a Fabric component.
   *
   * @return the proxyTlsWsUrl
   */
  public Object getProxyTlsWsUrl() {
    return proxyTlsWsUrl;
  }

  /**
   * Gets the region.
   *
   * If it's "local", things like https are disabled.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the sessionCacheEnabled.
   *
   * If true an in memory cache will be used for browser session data.
   *
   * @return the sessionCacheEnabled
   */
  public Boolean isSessionCacheEnabled() {
    return sessionCacheEnabled;
  }

  /**
   * Gets the timeouts.
   *
   * Various timeouts for different Fabric operations.
   *
   * @return the timeouts
   */
  public Map<String, Object> getTimeouts() {
    return timeouts;
  }

  /**
   * Gets the timestamps.
   *
   * @return the timestamps
   */
  public SettingsTimestampData getTimestamps() {
    return timestamps;
  }

  /**
   * Gets the transactionVisibility.
   *
   * Controls if Fabric transaction details are visible on the UI.
   *
   * @return the transactionVisibility
   */
  public Map<String, Object> getTransactionVisibility() {
    return transactionVisibility;
  }

  /**
   * Gets the trustProxy.
   *
   * Controls if proxy headers such as `X-Forwarded-*` should be parsed to gather data such as the client's IP.
   *
   * @return the trustProxy
   */
  public String getTrustProxy() {
    return trustProxy;
  }

  /**
   * Gets the trustUnknownCerts.
   *
   * Controls if signatures in a signature collection APIs should skip verification or not.
   *
   * @return the trustUnknownCerts
   */
  public Boolean isTrustUnknownCerts() {
    return trustUnknownCerts;
  }

  /**
   * Gets the versions.
   *
   * The various commit hashes of components powering this IBP console.
   *
   * @return the versions
   */
  public GetPublicSettingsResponseVERSIONS getVersions() {
    return versions;
  }
}

