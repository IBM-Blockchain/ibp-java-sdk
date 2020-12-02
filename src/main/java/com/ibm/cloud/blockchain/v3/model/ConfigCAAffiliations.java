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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Set the keys to the desired affiliation parent names. The keys 'org1' and 'org2' are examples.
 */
public class ConfigCAAffiliations extends DynamicModel<Object> {

  @SerializedName("org1")
  protected List<String> org1;
  @SerializedName("org2")
  protected List<String> org2;

  public ConfigCAAffiliations() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> org1;
    private List<String> org2;
    private Map<String, Object> dynamicProperties;

    private Builder(ConfigCAAffiliations configCaAffiliations) {
      this.org1 = configCaAffiliations.org1;
      this.org2 = configCaAffiliations.org2;
      this.dynamicProperties = configCaAffiliations.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCAAffiliations.
     *
     * @return the new ConfigCAAffiliations instance
     */
    public ConfigCAAffiliations build() {
      return new ConfigCAAffiliations(this);
    }

    /**
     * Adds an org1 to org1.
     *
     * @param org1 the new org1
     * @return the ConfigCAAffiliations builder
     */
    public Builder addOrg1(String org1) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(org1,
        "org1 cannot be null");
      if (this.org1 == null) {
        this.org1 = new ArrayList<String>();
      }
      this.org1.add(org1);
      return this;
    }

    /**
     * Adds an org2 to org2.
     *
     * @param org2 the new org2
     * @return the ConfigCAAffiliations builder
     */
    public Builder addOrg2(String org2) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(org2,
        "org2 cannot be null");
      if (this.org2 == null) {
        this.org2 = new ArrayList<String>();
      }
      this.org2.add(org2);
      return this;
    }

    /**
     * Set the org1.
     * Existing org1 will be replaced.
     *
     * @param org1 the org1
     * @return the ConfigCAAffiliations builder
     */
    public Builder org1(List<String> org1) {
      this.org1 = org1;
      return this;
    }

    /**
     * Set the org2.
     * Existing org2 will be replaced.
     *
     * @param org2 the org2
     * @return the ConfigCAAffiliations builder
     */
    public Builder org2(List<String> org2) {
      this.org2 = org2;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the ConfigCAAffiliations builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected ConfigCAAffiliations(Builder builder) {
    super(new TypeToken<Object>() { });
    org1 = builder.org1;
    org2 = builder.org2;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a ConfigCAAffiliations builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the org1.
   *
   * @return the org1
   */
  public List<String> getOrg1() {
    return this.org1;
  }

  /**
   * Sets the org1.
   *
   * @param org1 the new org1
   */
  public void setOrg1(final List<String> org1) {
    this.org1 = org1;
  }

  /**
   * Gets the org2.
   *
   * @return the org2
   */
  public List<String> getOrg2() {
    return this.org2;
  }

  /**
   * Sets the org2.
   *
   * @param org2 the new org2
   */
  public void setOrg2(final List<String> org2) {
    this.org2 = org2;
  }
}
