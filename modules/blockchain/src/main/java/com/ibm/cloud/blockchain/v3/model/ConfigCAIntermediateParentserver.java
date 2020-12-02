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
 * ConfigCAIntermediateParentserver.
 */
public class ConfigCAIntermediateParentserver extends GenericModel {

  protected String url;
  protected String caname;

  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String caname;

    private Builder(ConfigCAIntermediateParentserver configCaIntermediateParentserver) {
      this.url = configCaIntermediateParentserver.url;
      this.caname = configCaIntermediateParentserver.caname;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param url the url
     * @param caname the caname
     */
    public Builder(String url, String caname) {
      this.url = url;
      this.caname = caname;
    }

    /**
     * Builds a ConfigCAIntermediateParentserver.
     *
     * @return the new ConfigCAIntermediateParentserver instance
     */
    public ConfigCAIntermediateParentserver build() {
      return new ConfigCAIntermediateParentserver(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ConfigCAIntermediateParentserver builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the caname.
     *
     * @param caname the caname
     * @return the ConfigCAIntermediateParentserver builder
     */
    public Builder caname(String caname) {
      this.caname = caname;
      return this;
    }
  }

  protected ConfigCAIntermediateParentserver(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.caname,
      "caname cannot be null");
    url = builder.url;
    caname = builder.caname;
  }

  /**
   * New builder.
   *
   * @return a ConfigCAIntermediateParentserver builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the url.
   *
   * The url of the parent server. Include the protocol, hostname/ip and port.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the caname.
   *
   * The name of the CA to enroll within the server.
   *
   * @return the caname
   */
  public String caname() {
    return caname;
  }
}

