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
 * ConfigPeerDeliveryclientAddressOverridesItem.
 */
public class ConfigPeerDeliveryclientAddressOverridesItem extends GenericModel {

  protected String from;
  protected String to;
  protected String caCertsFile;

  /**
   * Builder.
   */
  public static class Builder {
    private String from;
    private String to;
    private String caCertsFile;

    private Builder(ConfigPeerDeliveryclientAddressOverridesItem configPeerDeliveryclientAddressOverridesItem) {
      this.from = configPeerDeliveryclientAddressOverridesItem.from;
      this.to = configPeerDeliveryclientAddressOverridesItem.to;
      this.caCertsFile = configPeerDeliveryclientAddressOverridesItem.caCertsFile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerDeliveryclientAddressOverridesItem.
     *
     * @return the new ConfigPeerDeliveryclientAddressOverridesItem instance
     */
    public ConfigPeerDeliveryclientAddressOverridesItem build() {
      return new ConfigPeerDeliveryclientAddressOverridesItem(this);
    }

    /**
     * Set the from.
     *
     * @param from the from
     * @return the ConfigPeerDeliveryclientAddressOverridesItem builder
     */
    public Builder from(String from) {
      this.from = from;
      return this;
    }

    /**
     * Set the to.
     *
     * @param to the to
     * @return the ConfigPeerDeliveryclientAddressOverridesItem builder
     */
    public Builder to(String to) {
      this.to = to;
      return this;
    }

    /**
     * Set the caCertsFile.
     *
     * @param caCertsFile the caCertsFile
     * @return the ConfigPeerDeliveryclientAddressOverridesItem builder
     */
    public Builder caCertsFile(String caCertsFile) {
      this.caCertsFile = caCertsFile;
      return this;
    }
  }

  protected ConfigPeerDeliveryclientAddressOverridesItem(Builder builder) {
    from = builder.from;
    to = builder.to;
    caCertsFile = builder.caCertsFile;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerDeliveryclientAddressOverridesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the from.
   *
   * The address in the channel configuration that will be overridden.
   *
   * @return the from
   */
  public String from() {
    return from;
  }

  /**
   * Gets the to.
   *
   * The address to use.
   *
   * @return the to
   */
  public String to() {
    return to;
  }

  /**
   * Gets the caCertsFile.
   *
   * The path to the CA's cert file.
   *
   * @return the caCertsFile
   */
  public String caCertsFile() {
    return caCertsFile;
  }
}

