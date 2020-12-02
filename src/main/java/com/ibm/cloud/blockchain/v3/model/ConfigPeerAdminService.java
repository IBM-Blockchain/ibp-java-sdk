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
 * Used for administrative operations such as control over logger levels. Only peer administrators can use the service.
 */
public class ConfigPeerAdminService extends GenericModel {

  protected String listenAddress;

  /**
   * Builder.
   */
  public static class Builder {
    private String listenAddress;

    private Builder(ConfigPeerAdminService configPeerAdminService) {
      this.listenAddress = configPeerAdminService.listenAddress;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param listenAddress the listenAddress
     */
    public Builder(String listenAddress) {
      this.listenAddress = listenAddress;
    }

    /**
     * Builds a ConfigPeerAdminService.
     *
     * @return the new ConfigPeerAdminService instance
     */
    public ConfigPeerAdminService build() {
      return new ConfigPeerAdminService(this);
    }

    /**
     * Set the listenAddress.
     *
     * @param listenAddress the listenAddress
     * @return the ConfigPeerAdminService builder
     */
    public Builder listenAddress(String listenAddress) {
      this.listenAddress = listenAddress;
      return this;
    }
  }

  protected ConfigPeerAdminService(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.listenAddress,
      "listenAddress cannot be null");
    listenAddress = builder.listenAddress;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerAdminService builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the listenAddress.
   *
   * The interface and port on which the admin server will listen on. Defaults to the same address as the peer's listen
   * address and port 7051.
   *
   * @return the listenAddress
   */
  public String listenAddress() {
    return listenAddress;
  }
}

