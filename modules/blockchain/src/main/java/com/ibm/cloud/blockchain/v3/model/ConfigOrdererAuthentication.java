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
 * Contains configuration parameters that are related to authenticating client messages.
 */
public class ConfigOrdererAuthentication extends GenericModel {

  @SerializedName("TimeWindow")
  protected String timeWindow;
  @SerializedName("NoExpirationChecks")
  protected Boolean noExpirationChecks;

  /**
   * Builder.
   */
  public static class Builder {
    private String timeWindow;
    private Boolean noExpirationChecks;

    private Builder(ConfigOrdererAuthentication configOrdererAuthentication) {
      this.timeWindow = configOrdererAuthentication.timeWindow;
      this.noExpirationChecks = configOrdererAuthentication.noExpirationChecks;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererAuthentication.
     *
     * @return the new ConfigOrdererAuthentication instance
     */
    public ConfigOrdererAuthentication build() {
      return new ConfigOrdererAuthentication(this);
    }

    /**
     * Set the timeWindow.
     *
     * @param timeWindow the timeWindow
     * @return the ConfigOrdererAuthentication builder
     */
    public Builder timeWindow(String timeWindow) {
      this.timeWindow = timeWindow;
      return this;
    }

    /**
     * Set the noExpirationChecks.
     *
     * @param noExpirationChecks the noExpirationChecks
     * @return the ConfigOrdererAuthentication builder
     */
    public Builder noExpirationChecks(Boolean noExpirationChecks) {
      this.noExpirationChecks = noExpirationChecks;
      return this;
    }
  }

  protected ConfigOrdererAuthentication(Builder builder) {
    timeWindow = builder.timeWindow;
    noExpirationChecks = builder.noExpirationChecks;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererAuthentication builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the timeWindow.
   *
   * The maximum acceptable difference between the current server time and the client's time.
   *
   * @return the timeWindow
   */
  public String timeWindow() {
    return timeWindow;
  }

  /**
   * Gets the noExpirationChecks.
   *
   * Indicates if the orderer should ignore expired identities. Should only be used temporarily to recover from an
   * extreme event such as the expiration of administrators. Defaults `false`.
   *
   * @return the noExpirationChecks
   */
  public Boolean noExpirationChecks() {
    return noExpirationChecks;
  }
}

