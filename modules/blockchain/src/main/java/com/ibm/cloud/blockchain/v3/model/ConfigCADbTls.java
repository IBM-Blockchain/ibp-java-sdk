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
 * ConfigCADbTls.
 */
public class ConfigCADbTls extends GenericModel {

  protected List<String> certfiles;
  protected ConfigCADbTlsClient client;
  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> certfiles;
    private ConfigCADbTlsClient client;
    private Boolean enabled;

    private Builder(ConfigCADbTls configCaDbTls) {
      this.certfiles = configCaDbTls.certfiles;
      this.client = configCaDbTls.client;
      this.enabled = configCaDbTls.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCADbTls.
     *
     * @return the new ConfigCADbTls instance
     */
    public ConfigCADbTls build() {
      return new ConfigCADbTls(this);
    }

    /**
     * Adds an certfiles to certfiles.
     *
     * @param certfiles the new certfiles
     * @return the ConfigCADbTls builder
     */
    public Builder addCertfiles(String certfiles) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(certfiles,
        "certfiles cannot be null");
      if (this.certfiles == null) {
        this.certfiles = new ArrayList<String>();
      }
      this.certfiles.add(certfiles);
      return this;
    }

    /**
     * Set the certfiles.
     * Existing certfiles will be replaced.
     *
     * @param certfiles the certfiles
     * @return the ConfigCADbTls builder
     */
    public Builder certfiles(List<String> certfiles) {
      this.certfiles = certfiles;
      return this;
    }

    /**
     * Set the client.
     *
     * @param client the client
     * @return the ConfigCADbTls builder
     */
    public Builder client(ConfigCADbTlsClient client) {
      this.client = client;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the ConfigCADbTls builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected ConfigCADbTls(Builder builder) {
    certfiles = builder.certfiles;
    client = builder.client;
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a ConfigCADbTls builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certfiles.
   *
   * @return the certfiles
   */
  public List<String> certfiles() {
    return certfiles;
  }

  /**
   * Gets the client.
   *
   * @return the client
   */
  public ConfigCADbTlsClient client() {
    return client;
  }

  /**
   * Gets the enabled.
   *
   * Set to true if TLS is to be used between the CA and its database, else false.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

