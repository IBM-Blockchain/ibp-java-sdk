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
 * ConfigCATls.
 */
public class ConfigCATls extends GenericModel {

  protected String keyfile;
  protected String certfile;
  protected ConfigCATlsClientauth clientauth;

  /**
   * Builder.
   */
  public static class Builder {
    private String keyfile;
    private String certfile;
    private ConfigCATlsClientauth clientauth;

    private Builder(ConfigCATls configCaTls) {
      this.keyfile = configCaTls.keyfile;
      this.certfile = configCaTls.certfile;
      this.clientauth = configCaTls.clientauth;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param keyfile the keyfile
     * @param certfile the certfile
     */
    public Builder(String keyfile, String certfile) {
      this.keyfile = keyfile;
      this.certfile = certfile;
    }

    /**
     * Builds a ConfigCATls.
     *
     * @return the new ConfigCATls instance
     */
    public ConfigCATls build() {
      return new ConfigCATls(this);
    }

    /**
     * Set the keyfile.
     *
     * @param keyfile the keyfile
     * @return the ConfigCATls builder
     */
    public Builder keyfile(String keyfile) {
      this.keyfile = keyfile;
      return this;
    }

    /**
     * Set the certfile.
     *
     * @param certfile the certfile
     * @return the ConfigCATls builder
     */
    public Builder certfile(String certfile) {
      this.certfile = certfile;
      return this;
    }

    /**
     * Set the clientauth.
     *
     * @param clientauth the clientauth
     * @return the ConfigCATls builder
     */
    public Builder clientauth(ConfigCATlsClientauth clientauth) {
      this.clientauth = clientauth;
      return this;
    }
  }

  protected ConfigCATls(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.keyfile,
      "keyfile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certfile,
      "certfile cannot be null");
    keyfile = builder.keyfile;
    certfile = builder.certfile;
    clientauth = builder.clientauth;
  }

  /**
   * New builder.
   *
   * @return a ConfigCATls builder
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
   * Gets the clientauth.
   *
   * @return the clientauth
   */
  public ConfigCATlsClientauth clientauth() {
    return clientauth;
  }
}

