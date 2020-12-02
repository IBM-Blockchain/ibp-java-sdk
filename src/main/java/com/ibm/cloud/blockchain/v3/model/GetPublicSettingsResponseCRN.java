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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * metadata about the IBM Cloud service instance. [Only populated if using IBM Cloud].
 */
public class GetPublicSettingsResponseCRN extends GenericModel {

  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("c_name")
  protected String cName;
  @SerializedName("c_type")
  protected String cType;
  @SerializedName("instance_id")
  protected String instanceId;
  protected String location;
  @SerializedName("resource_id")
  protected String resourceId;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_name")
  protected String serviceName;
  protected String version;

  /**
   * Gets the accountId.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the cName.
   *
   * @return the cName
   */
  public String getCName() {
    return cName;
  }

  /**
   * Gets the cType.
   *
   * @return the cType
   */
  public String getCType() {
    return cType;
  }

  /**
   * Gets the instanceId.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the location.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the resourceId.
   *
   * @return the resourceId
   */
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Gets the resourceType.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the serviceName.
   *
   * @return the serviceName
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Gets the version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

