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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ConfigPeerChaincodeExternalBuildersItem.
 */
public class ConfigPeerChaincodeExternalBuildersItem extends GenericModel {

  protected String path;
  protected String name;
  protected List<String> environmentWhitelist;

  /**
   * Builder.
   */
  public static class Builder {
    private String path;
    private String name;
    private List<String> environmentWhitelist;

    private Builder(ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItem) {
      this.path = configPeerChaincodeExternalBuildersItem.path;
      this.name = configPeerChaincodeExternalBuildersItem.name;
      this.environmentWhitelist = configPeerChaincodeExternalBuildersItem.environmentWhitelist;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerChaincodeExternalBuildersItem.
     *
     * @return the new ConfigPeerChaincodeExternalBuildersItem instance
     */
    public ConfigPeerChaincodeExternalBuildersItem build() {
      return new ConfigPeerChaincodeExternalBuildersItem(this);
    }

    /**
     * Adds an environmentWhitelist to environmentWhitelist.
     *
     * @param environmentWhitelist the new environmentWhitelist
     * @return the ConfigPeerChaincodeExternalBuildersItem builder
     */
    public Builder addEnvironmentWhitelist(String environmentWhitelist) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(environmentWhitelist,
        "environmentWhitelist cannot be null");
      if (this.environmentWhitelist == null) {
        this.environmentWhitelist = new ArrayList<String>();
      }
      this.environmentWhitelist.add(environmentWhitelist);
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the ConfigPeerChaincodeExternalBuildersItem builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ConfigPeerChaincodeExternalBuildersItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the environmentWhitelist.
     * Existing environmentWhitelist will be replaced.
     *
     * @param environmentWhitelist the environmentWhitelist
     * @return the ConfigPeerChaincodeExternalBuildersItem builder
     */
    public Builder environmentWhitelist(List<String> environmentWhitelist) {
      this.environmentWhitelist = environmentWhitelist;
      return this;
    }
  }

  protected ConfigPeerChaincodeExternalBuildersItem(Builder builder) {
    path = builder.path;
    name = builder.name;
    environmentWhitelist = builder.environmentWhitelist;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerChaincodeExternalBuildersItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the path.
   *
   * The path to a build directory.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the name.
   *
   * The name of this builder.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the environmentWhitelist.
   *
   * @return the environmentWhitelist
   */
  public List<String> environmentWhitelist() {
    return environmentWhitelist;
  }
}

