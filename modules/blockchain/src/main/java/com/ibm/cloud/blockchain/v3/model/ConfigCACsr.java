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
 * ConfigCACsr.
 */
public class ConfigCACsr extends GenericModel {

  protected String cn;
  protected ConfigCACsrKeyrequest keyrequest;
  protected List<ConfigCACsrNamesItem> names;
  protected List<String> hosts;
  protected ConfigCACsrCa ca;

  /**
   * Builder.
   */
  public static class Builder {
    private String cn;
    private ConfigCACsrKeyrequest keyrequest;
    private List<ConfigCACsrNamesItem> names;
    private List<String> hosts;
    private ConfigCACsrCa ca;

    private Builder(ConfigCACsr configCaCsr) {
      this.cn = configCaCsr.cn;
      this.keyrequest = configCaCsr.keyrequest;
      this.names = configCaCsr.names;
      this.hosts = configCaCsr.hosts;
      this.ca = configCaCsr.ca;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cn the cn
     * @param names the names
     * @param ca the ca
     */
    public Builder(String cn, List<ConfigCACsrNamesItem> names, ConfigCACsrCa ca) {
      this.cn = cn;
      this.names = names;
      this.ca = ca;
    }

    /**
     * Builds a ConfigCACsr.
     *
     * @return the new ConfigCACsr instance
     */
    public ConfigCACsr build() {
      return new ConfigCACsr(this);
    }

    /**
     * Adds an names to names.
     *
     * @param names the new names
     * @return the ConfigCACsr builder
     */
    public Builder addNames(ConfigCACsrNamesItem names) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(names,
        "names cannot be null");
      if (this.names == null) {
        this.names = new ArrayList<ConfigCACsrNamesItem>();
      }
      this.names.add(names);
      return this;
    }

    /**
     * Adds an hosts to hosts.
     *
     * @param hosts the new hosts
     * @return the ConfigCACsr builder
     */
    public Builder addHosts(String hosts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hosts,
        "hosts cannot be null");
      if (this.hosts == null) {
        this.hosts = new ArrayList<String>();
      }
      this.hosts.add(hosts);
      return this;
    }

    /**
     * Set the cn.
     *
     * @param cn the cn
     * @return the ConfigCACsr builder
     */
    public Builder cn(String cn) {
      this.cn = cn;
      return this;
    }

    /**
     * Set the keyrequest.
     *
     * @param keyrequest the keyrequest
     * @return the ConfigCACsr builder
     */
    public Builder keyrequest(ConfigCACsrKeyrequest keyrequest) {
      this.keyrequest = keyrequest;
      return this;
    }

    /**
     * Set the names.
     * Existing names will be replaced.
     *
     * @param names the names
     * @return the ConfigCACsr builder
     */
    public Builder names(List<ConfigCACsrNamesItem> names) {
      this.names = names;
      return this;
    }

    /**
     * Set the hosts.
     * Existing hosts will be replaced.
     *
     * @param hosts the hosts
     * @return the ConfigCACsr builder
     */
    public Builder hosts(List<String> hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the ConfigCACsr builder
     */
    public Builder ca(ConfigCACsrCa ca) {
      this.ca = ca;
      return this;
    }
  }

  protected ConfigCACsr(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cn,
      "cn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.names,
      "names cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    cn = builder.cn;
    keyrequest = builder.keyrequest;
    names = builder.names;
    hosts = builder.hosts;
    ca = builder.ca;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACsr builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cn.
   *
   * The Common Name for the CSRs.
   *
   * @return the cn
   */
  public String cn() {
    return cn;
  }

  /**
   * Gets the keyrequest.
   *
   * @return the keyrequest
   */
  public ConfigCACsrKeyrequest keyrequest() {
    return keyrequest;
  }

  /**
   * Gets the names.
   *
   * @return the names
   */
  public List<ConfigCACsrNamesItem> names() {
    return names;
  }

  /**
   * Gets the hosts.
   *
   * @return the hosts
   */
  public List<String> hosts() {
    return hosts;
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public ConfigCACsrCa ca() {
    return ca;
  }
}

