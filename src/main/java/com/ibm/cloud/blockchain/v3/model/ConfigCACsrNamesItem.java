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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ConfigCACsrNamesItem.
 */
public class ConfigCACsrNamesItem extends GenericModel {

  @SerializedName("C")
  protected String c;
  @SerializedName("ST")
  protected String st;
  @SerializedName("L")
  protected String l;
  @SerializedName("O")
  protected String o;
  @SerializedName("OU")
  protected String ou;

  /**
   * Builder.
   */
  public static class Builder {
    private String c;
    private String st;
    private String l;
    private String o;
    private String ou;

    private Builder(ConfigCACsrNamesItem configCaCsrNamesItem) {
      this.c = configCaCsrNamesItem.c;
      this.st = configCaCsrNamesItem.st;
      this.l = configCaCsrNamesItem.l;
      this.o = configCaCsrNamesItem.o;
      this.ou = configCaCsrNamesItem.ou;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param c the c
     * @param st the st
     * @param o the o
     */
    public Builder(String c, String st, String o) {
      this.c = c;
      this.st = st;
      this.o = o;
    }

    /**
     * Builds a ConfigCACsrNamesItem.
     *
     * @return the new ConfigCACsrNamesItem instance
     */
    public ConfigCACsrNamesItem build() {
      return new ConfigCACsrNamesItem(this);
    }

    /**
     * Set the c.
     *
     * @param c the c
     * @return the ConfigCACsrNamesItem builder
     */
    public Builder c(String c) {
      this.c = c;
      return this;
    }

    /**
     * Set the st.
     *
     * @param st the st
     * @return the ConfigCACsrNamesItem builder
     */
    public Builder st(String st) {
      this.st = st;
      return this;
    }

    /**
     * Set the l.
     *
     * @param l the l
     * @return the ConfigCACsrNamesItem builder
     */
    public Builder l(String l) {
      this.l = l;
      return this;
    }

    /**
     * Set the o.
     *
     * @param o the o
     * @return the ConfigCACsrNamesItem builder
     */
    public Builder o(String o) {
      this.o = o;
      return this;
    }

    /**
     * Set the ou.
     *
     * @param ou the ou
     * @return the ConfigCACsrNamesItem builder
     */
    public Builder ou(String ou) {
      this.ou = ou;
      return this;
    }
  }

  protected ConfigCACsrNamesItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.c,
      "c cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.st,
      "st cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.o,
      "o cannot be null");
    c = builder.c;
    st = builder.st;
    l = builder.l;
    o = builder.o;
    ou = builder.ou;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACsrNamesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the c.
   *
   * @return the c
   */
  public String c() {
    return c;
  }

  /**
   * Gets the st.
   *
   * @return the st
   */
  public String st() {
    return st;
  }

  /**
   * Gets the l.
   *
   * @return the l
   */
  public String l() {
    return l;
  }

  /**
   * Gets the o.
   *
   * @return the o
   */
  public String o() {
    return o;
  }

  /**
   * Gets the ou.
   *
   * @return the ou
   */
  public String ou() {
    return ou;
  }
}

