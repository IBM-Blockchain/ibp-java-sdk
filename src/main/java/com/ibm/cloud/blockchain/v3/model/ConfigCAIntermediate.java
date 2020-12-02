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
 * ConfigCAIntermediate.
 */
public class ConfigCAIntermediate extends GenericModel {

  protected ConfigCAIntermediateParentserver parentserver;
  protected ConfigCAIntermediateEnrollment enrollment;
  protected ConfigCAIntermediateTls tls;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCAIntermediateParentserver parentserver;
    private ConfigCAIntermediateEnrollment enrollment;
    private ConfigCAIntermediateTls tls;

    private Builder(ConfigCAIntermediate configCaIntermediate) {
      this.parentserver = configCaIntermediate.parentserver;
      this.enrollment = configCaIntermediate.enrollment;
      this.tls = configCaIntermediate.tls;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param parentserver the parentserver
     */
    public Builder(ConfigCAIntermediateParentserver parentserver) {
      this.parentserver = parentserver;
    }

    /**
     * Builds a ConfigCAIntermediate.
     *
     * @return the new ConfigCAIntermediate instance
     */
    public ConfigCAIntermediate build() {
      return new ConfigCAIntermediate(this);
    }

    /**
     * Set the parentserver.
     *
     * @param parentserver the parentserver
     * @return the ConfigCAIntermediate builder
     */
    public Builder parentserver(ConfigCAIntermediateParentserver parentserver) {
      this.parentserver = parentserver;
      return this;
    }

    /**
     * Set the enrollment.
     *
     * @param enrollment the enrollment
     * @return the ConfigCAIntermediate builder
     */
    public Builder enrollment(ConfigCAIntermediateEnrollment enrollment) {
      this.enrollment = enrollment;
      return this;
    }

    /**
     * Set the tls.
     *
     * @param tls the tls
     * @return the ConfigCAIntermediate builder
     */
    public Builder tls(ConfigCAIntermediateTls tls) {
      this.tls = tls;
      return this;
    }
  }

  protected ConfigCAIntermediate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.parentserver,
      "parentserver cannot be null");
    parentserver = builder.parentserver;
    enrollment = builder.enrollment;
    tls = builder.tls;
  }

  /**
   * New builder.
   *
   * @return a ConfigCAIntermediate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the parentserver.
   *
   * @return the parentserver
   */
  public ConfigCAIntermediateParentserver parentserver() {
    return parentserver;
  }

  /**
   * Gets the enrollment.
   *
   * @return the enrollment
   */
  public ConfigCAIntermediateEnrollment enrollment() {
    return enrollment;
  }

  /**
   * Gets the tls.
   *
   * @return the tls
   */
  public ConfigCAIntermediateTls tls() {
    return tls;
  }
}

