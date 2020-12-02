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
 * Update the [Fabric Orderer configuration
 * file](https://github.com/hyperledger/fabric/blob/release-1.4/sampleconfig/orderer.yaml) if you want use custom
 * attributes to configure the Orderer. Omit if not.
 *
 * *The field **names** below are not case-sensitive.*.
 */
public class ConfigOrdererUpdate extends GenericModel {

  @SerializedName("General")
  protected ConfigOrdererGeneralUpdate general;
  @SerializedName("Debug")
  protected ConfigOrdererDebug debug;
  @SerializedName("Metrics")
  protected ConfigOrdererMetrics metrics;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigOrdererGeneralUpdate general;
    private ConfigOrdererDebug debug;
    private ConfigOrdererMetrics metrics;

    private Builder(ConfigOrdererUpdate configOrdererUpdate) {
      this.general = configOrdererUpdate.general;
      this.debug = configOrdererUpdate.debug;
      this.metrics = configOrdererUpdate.metrics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererUpdate.
     *
     * @return the new ConfigOrdererUpdate instance
     */
    public ConfigOrdererUpdate build() {
      return new ConfigOrdererUpdate(this);
    }

    /**
     * Set the general.
     *
     * @param general the general
     * @return the ConfigOrdererUpdate builder
     */
    public Builder general(ConfigOrdererGeneralUpdate general) {
      this.general = general;
      return this;
    }

    /**
     * Set the debug.
     *
     * @param debug the debug
     * @return the ConfigOrdererUpdate builder
     */
    public Builder debug(ConfigOrdererDebug debug) {
      this.debug = debug;
      return this;
    }

    /**
     * Set the metrics.
     *
     * @param metrics the metrics
     * @return the ConfigOrdererUpdate builder
     */
    public Builder metrics(ConfigOrdererMetrics metrics) {
      this.metrics = metrics;
      return this;
    }
  }

  protected ConfigOrdererUpdate(Builder builder) {
    general = builder.general;
    debug = builder.debug;
    metrics = builder.metrics;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the general.
   *
   * @return the general
   */
  public ConfigOrdererGeneralUpdate general() {
    return general;
  }

  /**
   * Gets the debug.
   *
   * Controls the debugging options for the orderer.
   *
   * @return the debug
   */
  public ConfigOrdererDebug debug() {
    return debug;
  }

  /**
   * Gets the metrics.
   *
   * @return the metrics
   */
  public ConfigOrdererMetrics metrics() {
    return metrics;
  }
}

