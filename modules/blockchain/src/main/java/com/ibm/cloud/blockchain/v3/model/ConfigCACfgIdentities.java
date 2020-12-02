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
 * ConfigCACfgIdentities.
 */
public class ConfigCACfgIdentities extends GenericModel {

  protected Double passwordattempts;
  protected Boolean allowremove;

  /**
   * Builder.
   */
  public static class Builder {
    private Double passwordattempts;
    private Boolean allowremove;

    private Builder(ConfigCACfgIdentities configCaCfgIdentities) {
      this.passwordattempts = configCaCfgIdentities.passwordattempts;
      this.allowremove = configCaCfgIdentities.allowremove;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param passwordattempts the passwordattempts
     */
    public Builder(Double passwordattempts) {
      this.passwordattempts = passwordattempts;
    }

    /**
     * Builds a ConfigCACfgIdentities.
     *
     * @return the new ConfigCACfgIdentities instance
     */
    public ConfigCACfgIdentities build() {
      return new ConfigCACfgIdentities(this);
    }

    /**
     * Set the passwordattempts.
     *
     * @param passwordattempts the passwordattempts
     * @return the ConfigCACfgIdentities builder
     */
    public Builder passwordattempts(Double passwordattempts) {
      this.passwordattempts = passwordattempts;
      return this;
    }

    /**
     * Set the allowremove.
     *
     * @param allowremove the allowremove
     * @return the ConfigCACfgIdentities builder
     */
    public Builder allowremove(Boolean allowremove) {
      this.allowremove = allowremove;
      return this;
    }
  }

  protected ConfigCACfgIdentities(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.passwordattempts,
      "passwordattempts cannot be null");
    passwordattempts = builder.passwordattempts;
    allowremove = builder.allowremove;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACfgIdentities builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the passwordattempts.
   *
   * The maximum number of incorrect password attempts allowed per identity.
   *
   * @return the passwordattempts
   */
  public Double passwordattempts() {
    return passwordattempts;
  }

  /**
   * Gets the allowremove.
   *
   * Set to `true` to allow deletion of identities. Defaults `false`.
   *
   * @return the allowremove
   */
  public Boolean allowremove() {
    return allowremove;
  }
}

