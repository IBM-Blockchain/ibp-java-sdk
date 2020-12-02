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
 * ConfigCASigning.
 */
public class ConfigCASigning extends GenericModel {

  @SerializedName("default")
  protected ConfigCASigningDefault xDefault;
  protected ConfigCASigningProfiles profiles;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCASigningDefault xDefault;
    private ConfigCASigningProfiles profiles;

    private Builder(ConfigCASigning configCaSigning) {
      this.xDefault = configCaSigning.xDefault;
      this.profiles = configCaSigning.profiles;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCASigning.
     *
     * @return the new ConfigCASigning instance
     */
    public ConfigCASigning build() {
      return new ConfigCASigning(this);
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the ConfigCASigning builder
     */
    public Builder xDefault(ConfigCASigningDefault xDefault) {
      this.xDefault = xDefault;
      return this;
    }

    /**
     * Set the profiles.
     *
     * @param profiles the profiles
     * @return the ConfigCASigning builder
     */
    public Builder profiles(ConfigCASigningProfiles profiles) {
      this.profiles = profiles;
      return this;
    }
  }

  protected ConfigCASigning(Builder builder) {
    xDefault = builder.xDefault;
    profiles = builder.profiles;
  }

  /**
   * New builder.
   *
   * @return a ConfigCASigning builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDefault.
   *
   * @return the xDefault
   */
  public ConfigCASigningDefault xDefault() {
    return xDefault;
  }

  /**
   * Gets the profiles.
   *
   * @return the profiles
   */
  public ConfigCASigningProfiles profiles() {
    return profiles;
  }
}

