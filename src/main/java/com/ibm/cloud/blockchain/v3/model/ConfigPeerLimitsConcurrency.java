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
 * ConfigPeerLimitsConcurrency.
 */
public class ConfigPeerLimitsConcurrency extends GenericModel {

  protected Double endorserService;
  protected Double deliverService;

  /**
   * Builder.
   */
  public static class Builder {
    private Double endorserService;
    private Double deliverService;

    private Builder(ConfigPeerLimitsConcurrency configPeerLimitsConcurrency) {
      this.endorserService = configPeerLimitsConcurrency.endorserService;
      this.deliverService = configPeerLimitsConcurrency.deliverService;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerLimitsConcurrency.
     *
     * @return the new ConfigPeerLimitsConcurrency instance
     */
    public ConfigPeerLimitsConcurrency build() {
      return new ConfigPeerLimitsConcurrency(this);
    }

    /**
     * Set the endorserService.
     *
     * @param endorserService the endorserService
     * @return the ConfigPeerLimitsConcurrency builder
     */
    public Builder endorserService(Double endorserService) {
      this.endorserService = endorserService;
      return this;
    }

    /**
     * Set the deliverService.
     *
     * @param deliverService the deliverService
     * @return the ConfigPeerLimitsConcurrency builder
     */
    public Builder deliverService(Double deliverService) {
      this.deliverService = deliverService;
      return this;
    }
  }

  protected ConfigPeerLimitsConcurrency(Builder builder) {
    endorserService = builder.endorserService;
    deliverService = builder.deliverService;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerLimitsConcurrency builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the endorserService.
   *
   * Limits the number of concurrent requests to the endorser service. The endorser service handles application and
   * system chaincode deployment and invocations (including queries).
   *
   * @return the endorserService
   */
  public Double endorserService() {
    return endorserService;
  }

  /**
   * Gets the deliverService.
   *
   * Limits the number of concurrent requests to the deliver service. The deliver service handles block and transaction
   * events.
   *
   * @return the deliverService
   */
  public Double deliverService() {
    return deliverService;
  }
}

