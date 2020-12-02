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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ConfigPeerAuthentication.
 */
public class ConfigPeerAuthentication extends GenericModel {

  protected String timewindow;

  /**
   * Builder.
   */
  public static class Builder {
    private String timewindow;

    private Builder(ConfigPeerAuthentication configPeerAuthentication) {
      this.timewindow = configPeerAuthentication.timewindow;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param timewindow the timewindow
     */
    public Builder(String timewindow) {
      this.timewindow = timewindow;
    }

    /**
     * Builds a ConfigPeerAuthentication.
     *
     * @return the new ConfigPeerAuthentication instance
     */
    public ConfigPeerAuthentication build() {
      return new ConfigPeerAuthentication(this);
    }

    /**
     * Set the timewindow.
     *
     * @param timewindow the timewindow
     * @return the ConfigPeerAuthentication builder
     */
    public Builder timewindow(String timewindow) {
      this.timewindow = timewindow;
      return this;
    }
  }

  protected ConfigPeerAuthentication(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.timewindow,
      "timewindow cannot be null");
    timewindow = builder.timewindow;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerAuthentication builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the timewindow.
   *
   * The maximum acceptable difference between the current server time and the client's time.
   *
   * @return the timewindow
   */
  public String timewindow() {
    return timewindow;
  }
}

