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
 * EditSettingsBodyInactivityTimeouts.
 */
public class EditSettingsBodyInactivityTimeouts extends GenericModel {

  protected Boolean enabled;
  @SerializedName("max_idle_time")
  protected Double maxIdleTime;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private Double maxIdleTime;

    private Builder(EditSettingsBodyInactivityTimeouts editSettingsBodyInactivityTimeouts) {
      this.enabled = editSettingsBodyInactivityTimeouts.enabled;
      this.maxIdleTime = editSettingsBodyInactivityTimeouts.maxIdleTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EditSettingsBodyInactivityTimeouts.
     *
     * @return the new EditSettingsBodyInactivityTimeouts instance
     */
    public EditSettingsBodyInactivityTimeouts build() {
      return new EditSettingsBodyInactivityTimeouts(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the EditSettingsBodyInactivityTimeouts builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the maxIdleTime.
     *
     * @param maxIdleTime the maxIdleTime
     * @return the EditSettingsBodyInactivityTimeouts builder
     */
    public Builder maxIdleTime(Double maxIdleTime) {
      this.maxIdleTime = maxIdleTime;
      return this;
    }
  }

  protected EditSettingsBodyInactivityTimeouts(Builder builder) {
    enabled = builder.enabled;
    maxIdleTime = builder.maxIdleTime;
  }

  /**
   * New builder.
   *
   * @return a EditSettingsBodyInactivityTimeouts builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Indicates if the auto log out logic is enabled or disabled. Defaults `false`. _Refresh browser after changes_.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the maxIdleTime.
   *
   * Maximum time in milliseconds for a browser client to be idle. Once exceeded the user is logged out. Defaults to
   * `90000` ms (1.5 minutes). _Refresh browser after changes_.
   *
   * @return the maxIdleTime
   */
  public Double maxIdleTime() {
    return maxIdleTime;
  }
}

