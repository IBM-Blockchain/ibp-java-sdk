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
 * ConfigOrdererGeneralUpdate.
 */
public class ConfigOrdererGeneralUpdate extends GenericModel {

  @SerializedName("Keepalive")
  protected ConfigOrdererKeepalive keepalive;
  @SerializedName("Authentication")
  protected ConfigOrdererAuthentication authentication;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigOrdererKeepalive keepalive;
    private ConfigOrdererAuthentication authentication;

    private Builder(ConfigOrdererGeneralUpdate configOrdererGeneralUpdate) {
      this.keepalive = configOrdererGeneralUpdate.keepalive;
      this.authentication = configOrdererGeneralUpdate.authentication;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererGeneralUpdate.
     *
     * @return the new ConfigOrdererGeneralUpdate instance
     */
    public ConfigOrdererGeneralUpdate build() {
      return new ConfigOrdererGeneralUpdate(this);
    }

    /**
     * Set the keepalive.
     *
     * @param keepalive the keepalive
     * @return the ConfigOrdererGeneralUpdate builder
     */
    public Builder keepalive(ConfigOrdererKeepalive keepalive) {
      this.keepalive = keepalive;
      return this;
    }

    /**
     * Set the authentication.
     *
     * @param authentication the authentication
     * @return the ConfigOrdererGeneralUpdate builder
     */
    public Builder authentication(ConfigOrdererAuthentication authentication) {
      this.authentication = authentication;
      return this;
    }
  }

  protected ConfigOrdererGeneralUpdate(Builder builder) {
    keepalive = builder.keepalive;
    authentication = builder.authentication;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererGeneralUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the keepalive.
   *
   * Keep alive settings for the GRPC server.
   *
   * @return the keepalive
   */
  public ConfigOrdererKeepalive keepalive() {
    return keepalive;
  }

  /**
   * Gets the authentication.
   *
   * Contains configuration parameters that are related to authenticating client messages.
   *
   * @return the authentication
   */
  public ConfigOrdererAuthentication authentication() {
    return authentication;
  }
}

