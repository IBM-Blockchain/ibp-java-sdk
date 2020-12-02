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
 * ConfigCATlsClientauth.
 */
public class ConfigCATlsClientauth extends GenericModel {

  protected String type;
  protected List<String> certfiles;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> certfiles;

    private Builder(ConfigCATlsClientauth configCaTlsClientauth) {
      this.type = configCaTlsClientauth.type;
      this.certfiles = configCaTlsClientauth.certfiles;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param certfiles the certfiles
     */
    public Builder(String type, List<String> certfiles) {
      this.type = type;
      this.certfiles = certfiles;
    }

    /**
     * Builds a ConfigCATlsClientauth.
     *
     * @return the new ConfigCATlsClientauth instance
     */
    public ConfigCATlsClientauth build() {
      return new ConfigCATlsClientauth(this);
    }

    /**
     * Adds an certfiles to certfiles.
     *
     * @param certfiles the new certfiles
     * @return the ConfigCATlsClientauth builder
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
     * Set the type.
     *
     * @param type the type
     * @return the ConfigCATlsClientauth builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the certfiles.
     * Existing certfiles will be replaced.
     *
     * @param certfiles the certfiles
     * @return the ConfigCATlsClientauth builder
     */
    public Builder certfiles(List<String> certfiles) {
      this.certfiles = certfiles;
      return this;
    }
  }

  protected ConfigCATlsClientauth(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certfiles,
      "certfiles cannot be null");
    type = builder.type;
    certfiles = builder.certfiles;
  }

  /**
   * New builder.
   *
   * @return a ConfigCATlsClientauth builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the certfiles.
   *
   * @return the certfiles
   */
  public List<String> certfiles() {
    return certfiles;
  }
}

