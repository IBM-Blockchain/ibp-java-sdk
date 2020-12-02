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
 * ConfigPeerChaincodeGolang.
 */
public class ConfigPeerChaincodeGolang extends GenericModel {

  protected Boolean dynamicLink;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean dynamicLink;

    private Builder(ConfigPeerChaincodeGolang configPeerChaincodeGolang) {
      this.dynamicLink = configPeerChaincodeGolang.dynamicLink;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerChaincodeGolang.
     *
     * @return the new ConfigPeerChaincodeGolang instance
     */
    public ConfigPeerChaincodeGolang build() {
      return new ConfigPeerChaincodeGolang(this);
    }

    /**
     * Set the dynamicLink.
     *
     * @param dynamicLink the dynamicLink
     * @return the ConfigPeerChaincodeGolang builder
     */
    public Builder dynamicLink(Boolean dynamicLink) {
      this.dynamicLink = dynamicLink;
      return this;
    }
  }

  protected ConfigPeerChaincodeGolang(Builder builder) {
    dynamicLink = builder.dynamicLink;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerChaincodeGolang builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dynamicLink.
   *
   * Controls if golang chaincode should be built with dynamic linking or static linking. Defaults `false` (static).
   *
   * @return the dynamicLink
   */
  public Boolean dynamicLink() {
    return dynamicLink;
  }
}

