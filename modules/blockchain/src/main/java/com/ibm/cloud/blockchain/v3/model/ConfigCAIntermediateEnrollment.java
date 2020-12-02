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
 * ConfigCAIntermediateEnrollment.
 */
public class ConfigCAIntermediateEnrollment extends GenericModel {

  protected String hosts;
  protected String profile;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private String hosts;
    private String profile;
    private String label;

    private Builder(ConfigCAIntermediateEnrollment configCaIntermediateEnrollment) {
      this.hosts = configCaIntermediateEnrollment.hosts;
      this.profile = configCaIntermediateEnrollment.profile;
      this.label = configCaIntermediateEnrollment.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param hosts the hosts
     * @param profile the profile
     * @param label the label
     */
    public Builder(String hosts, String profile, String label) {
      this.hosts = hosts;
      this.profile = profile;
      this.label = label;
    }

    /**
     * Builds a ConfigCAIntermediateEnrollment.
     *
     * @return the new ConfigCAIntermediateEnrollment instance
     */
    public ConfigCAIntermediateEnrollment build() {
      return new ConfigCAIntermediateEnrollment(this);
    }

    /**
     * Set the hosts.
     *
     * @param hosts the hosts
     * @return the ConfigCAIntermediateEnrollment builder
     */
    public Builder hosts(String hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ConfigCAIntermediateEnrollment builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the ConfigCAIntermediateEnrollment builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected ConfigCAIntermediateEnrollment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hosts,
      "hosts cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    hosts = builder.hosts;
    profile = builder.profile;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a ConfigCAIntermediateEnrollment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hosts.
   *
   * Hosts to set when issuing the certificate.
   *
   * @return the hosts
   */
  public String hosts() {
    return hosts;
  }

  /**
   * Gets the profile.
   *
   * Name of the signing profile to use when issuing the certificate.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }

  /**
   * Gets the label.
   *
   * Label to use in HSM operations.
   *
   * @return the label
   */
  public String label() {
    return label;
  }
}

