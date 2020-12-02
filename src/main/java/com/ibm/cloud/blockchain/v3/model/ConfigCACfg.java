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
 * ConfigCACfg.
 */
public class ConfigCACfg extends GenericModel {

  protected ConfigCACfgIdentities identities;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCACfgIdentities identities;

    private Builder(ConfigCACfg configCaCfg) {
      this.identities = configCaCfg.identities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param identities the identities
     */
    public Builder(ConfigCACfgIdentities identities) {
      this.identities = identities;
    }

    /**
     * Builds a ConfigCACfg.
     *
     * @return the new ConfigCACfg instance
     */
    public ConfigCACfg build() {
      return new ConfigCACfg(this);
    }

    /**
     * Set the identities.
     *
     * @param identities the identities
     * @return the ConfigCACfg builder
     */
    public Builder identities(ConfigCACfgIdentities identities) {
      this.identities = identities;
      return this;
    }
  }

  protected ConfigCACfg(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.identities,
      "identities cannot be null");
    identities = builder.identities;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACfg builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the identities.
   *
   * @return the identities
   */
  public ConfigCACfgIdentities identities() {
    return identities;
  }
}

