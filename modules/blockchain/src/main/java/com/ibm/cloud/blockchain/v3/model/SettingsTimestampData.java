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
 * SettingsTimestampData.
 */
public class SettingsTimestampData extends GenericModel {

  protected Double now;
  protected Double born;
  @SerializedName("next_settings_update")
  protected String nextSettingsUpdate;
  @SerializedName("up_time")
  protected String upTime;

  /**
   * Gets the now.
   *
   * UTC UNIX timestamp of the current time according to the server. In milliseconds.
   *
   * @return the now
   */
  public Double getNow() {
    return now;
  }

  /**
   * Gets the born.
   *
   * UTC UNIX timestamp of when the server started. In milliseconds.
   *
   * @return the born
   */
  public Double getBorn() {
    return born;
  }

  /**
   * Gets the nextSettingsUpdate.
   *
   * Time remaining until the server performs a hard-refresh of its settings.
   *
   * @return the nextSettingsUpdate
   */
  public String getNextSettingsUpdate() {
    return nextSettingsUpdate;
  }

  /**
   * Gets the upTime.
   *
   * Total time the IBP console server has been running.
   *
   * @return the upTime
   */
  public String getUpTime() {
    return upTime;
  }
}

