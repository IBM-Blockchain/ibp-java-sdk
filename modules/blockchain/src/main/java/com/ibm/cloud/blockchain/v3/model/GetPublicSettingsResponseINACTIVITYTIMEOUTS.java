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
 * GetPublicSettingsResponseINACTIVITYTIMEOUTS.
 */
public class GetPublicSettingsResponseINACTIVITYTIMEOUTS extends GenericModel {

  protected Boolean enabled;
  @SerializedName("max_idle_time")
  protected Double maxIdleTime;

  /**
   * Gets the enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the maxIdleTime.
   *
   * How long to wait before auto-logging out a user. In milliseconds.
   *
   * @return the maxIdleTime
   */
  public Double getMaxIdleTime() {
    return maxIdleTime;
  }
}

