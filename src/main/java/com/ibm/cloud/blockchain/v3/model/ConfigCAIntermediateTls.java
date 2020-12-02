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
 * ConfigCAIntermediateTls.
 */
public class ConfigCAIntermediateTls extends GenericModel {

  protected List<String> certfiles;
  protected ConfigCAIntermediateTlsClient client;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> certfiles;
    private ConfigCAIntermediateTlsClient client;

    private Builder(ConfigCAIntermediateTls configCaIntermediateTls) {
      this.certfiles = configCaIntermediateTls.certfiles;
      this.client = configCaIntermediateTls.client;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certfiles the certfiles
     */
    public Builder(List<String> certfiles) {
      this.certfiles = certfiles;
    }

    /**
     * Builds a ConfigCAIntermediateTls.
     *
     * @return the new ConfigCAIntermediateTls instance
     */
    public ConfigCAIntermediateTls build() {
      return new ConfigCAIntermediateTls(this);
    }

    /**
     * Adds an certfiles to certfiles.
     *
     * @param certfiles the new certfiles
     * @return the ConfigCAIntermediateTls builder
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
     * @return the ConfigCAIntermediateTls builder
     */
    public Builder certfiles(List<String> certfiles) {
      this.certfiles = certfiles;
      return this;
    }

    /**
     * Set the client.
     *
     * @param client the client
     * @return the ConfigCAIntermediateTls builder
     */
    public Builder client(ConfigCAIntermediateTlsClient client) {
      this.client = client;
      return this;
    }
  }

  protected ConfigCAIntermediateTls(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certfiles,
      "certfiles cannot be null");
    certfiles = builder.certfiles;
    client = builder.client;
  }

  /**
   * New builder.
   *
   * @return a ConfigCAIntermediateTls builder
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
  public ConfigCAIntermediateTlsClient client() {
    return client;
  }
}

