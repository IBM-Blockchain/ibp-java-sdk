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
 * ConfigPeerLimits.
 */
public class ConfigPeerLimits extends GenericModel {

  protected ConfigPeerLimitsConcurrency concurrency;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigPeerLimitsConcurrency concurrency;

    private Builder(ConfigPeerLimits configPeerLimits) {
      this.concurrency = configPeerLimits.concurrency;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerLimits.
     *
     * @return the new ConfigPeerLimits instance
     */
    public ConfigPeerLimits build() {
      return new ConfigPeerLimits(this);
    }

    /**
     * Set the concurrency.
     *
     * @param concurrency the concurrency
     * @return the ConfigPeerLimits builder
     */
    public Builder concurrency(ConfigPeerLimitsConcurrency concurrency) {
      this.concurrency = concurrency;
      return this;
    }
  }

  protected ConfigPeerLimits(Builder builder) {
    concurrency = builder.concurrency;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerLimits builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the concurrency.
   *
   * @return the concurrency
   */
  public ConfigPeerLimitsConcurrency concurrency() {
    return concurrency;
  }
}

