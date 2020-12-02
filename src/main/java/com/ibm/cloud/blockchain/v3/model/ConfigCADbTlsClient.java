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
 * ConfigCADbTlsClient.
 */
public class ConfigCADbTlsClient extends GenericModel {

  protected String certfile;
  protected String keyfile;

  /**
   * Builder.
   */
  public static class Builder {
    private String certfile;
    private String keyfile;

    private Builder(ConfigCADbTlsClient configCaDbTlsClient) {
      this.certfile = configCaDbTlsClient.certfile;
      this.keyfile = configCaDbTlsClient.keyfile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certfile the certfile
     * @param keyfile the keyfile
     */
    public Builder(String certfile, String keyfile) {
      this.certfile = certfile;
      this.keyfile = keyfile;
    }

    /**
     * Builds a ConfigCADbTlsClient.
     *
     * @return the new ConfigCADbTlsClient instance
     */
    public ConfigCADbTlsClient build() {
      return new ConfigCADbTlsClient(this);
    }

    /**
     * Set the certfile.
     *
     * @param certfile the certfile
     * @return the ConfigCADbTlsClient builder
     */
    public Builder certfile(String certfile) {
      this.certfile = certfile;
      return this;
    }

    /**
     * Set the keyfile.
     *
     * @param keyfile the keyfile
     * @return the ConfigCADbTlsClient builder
     */
    public Builder keyfile(String keyfile) {
      this.keyfile = keyfile;
      return this;
    }
  }

  protected ConfigCADbTlsClient(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certfile,
      "certfile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.keyfile,
      "keyfile cannot be null");
    certfile = builder.certfile;
    keyfile = builder.keyfile;
  }

  /**
   * New builder.
   *
   * @return a ConfigCADbTlsClient builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certfile.
   *
   * The TLS certificate for client TLS as base 64 encoded PEM.
   *
   * @return the certfile
   */
  public String certfile() {
    return certfile;
  }

  /**
   * Gets the keyfile.
   *
   * The TLS private key for client TLS as base 64 encoded PEM.
   *
   * @return the keyfile
   */
  public String keyfile() {
    return keyfile;
  }
}

