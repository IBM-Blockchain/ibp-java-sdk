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
 * ConfigCACa.
 */
public class ConfigCACa extends GenericModel {

  protected String keyfile;
  protected String certfile;
  protected String chainfile;

  /**
   * Builder.
   */
  public static class Builder {
    private String keyfile;
    private String certfile;
    private String chainfile;

    private Builder(ConfigCACa configCaCa) {
      this.keyfile = configCaCa.keyfile;
      this.certfile = configCaCa.certfile;
      this.chainfile = configCaCa.chainfile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCACa.
     *
     * @return the new ConfigCACa instance
     */
    public ConfigCACa build() {
      return new ConfigCACa(this);
    }

    /**
     * Set the keyfile.
     *
     * @param keyfile the keyfile
     * @return the ConfigCACa builder
     */
    public Builder keyfile(String keyfile) {
      this.keyfile = keyfile;
      return this;
    }

    /**
     * Set the certfile.
     *
     * @param certfile the certfile
     * @return the ConfigCACa builder
     */
    public Builder certfile(String certfile) {
      this.certfile = certfile;
      return this;
    }

    /**
     * Set the chainfile.
     *
     * @param chainfile the chainfile
     * @return the ConfigCACa builder
     */
    public Builder chainfile(String chainfile) {
      this.chainfile = chainfile;
      return this;
    }
  }

  protected ConfigCACa(Builder builder) {
    keyfile = builder.keyfile;
    certfile = builder.certfile;
    chainfile = builder.chainfile;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACa builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the keyfile.
   *
   * The CA's private key as base 64 encoded PEM.
   *
   * @return the keyfile
   */
  public String keyfile() {
    return keyfile;
  }

  /**
   * Gets the certfile.
   *
   * The CA's certificate as base 64 encoded PEM.
   *
   * @return the certfile
   */
  public String certfile() {
    return certfile;
  }

  /**
   * Gets the chainfile.
   *
   * The CA's certificate chain as base 64 encoded PEM.
   *
   * @return the chainfile
   */
  public String chainfile() {
    return chainfile;
  }
}

