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
 * ConfigCARegistryIdentitiesItem.
 */
public class ConfigCARegistryIdentitiesItem extends GenericModel {

  /**
   * The type of identity.
   */
  public interface Type {
    /** client. */
    String CLIENT = "client";
    /** peer. */
    String PEER = "peer";
    /** orderer. */
    String ORDERER = "orderer";
    /** user. */
    String USER = "user";
    /** admin. */
    String ADMIN = "admin";
  }

  protected String name;
  protected String pass;
  protected String type;
  protected Double maxenrollments;
  protected String affiliation;
  protected IdentityAttrs attrs;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String pass;
    private String type;
    private Double maxenrollments;
    private String affiliation;
    private IdentityAttrs attrs;

    private Builder(ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItem) {
      this.name = configCaRegistryIdentitiesItem.name;
      this.pass = configCaRegistryIdentitiesItem.pass;
      this.type = configCaRegistryIdentitiesItem.type;
      this.maxenrollments = configCaRegistryIdentitiesItem.maxenrollments;
      this.affiliation = configCaRegistryIdentitiesItem.affiliation;
      this.attrs = configCaRegistryIdentitiesItem.attrs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param pass the pass
     * @param type the type
     */
    public Builder(String name, String pass, String type) {
      this.name = name;
      this.pass = pass;
      this.type = type;
    }

    /**
     * Builds a ConfigCARegistryIdentitiesItem.
     *
     * @return the new ConfigCARegistryIdentitiesItem instance
     */
    public ConfigCARegistryIdentitiesItem build() {
      return new ConfigCARegistryIdentitiesItem(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ConfigCARegistryIdentitiesItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the pass.
     *
     * @param pass the pass
     * @return the ConfigCARegistryIdentitiesItem builder
     */
    public Builder pass(String pass) {
      this.pass = pass;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ConfigCARegistryIdentitiesItem builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the maxenrollments.
     *
     * @param maxenrollments the maxenrollments
     * @return the ConfigCARegistryIdentitiesItem builder
     */
    public Builder maxenrollments(Double maxenrollments) {
      this.maxenrollments = maxenrollments;
      return this;
    }

    /**
     * Set the affiliation.
     *
     * @param affiliation the affiliation
     * @return the ConfigCARegistryIdentitiesItem builder
     */
    public Builder affiliation(String affiliation) {
      this.affiliation = affiliation;
      return this;
    }

    /**
     * Set the attrs.
     *
     * @param attrs the attrs
     * @return the ConfigCARegistryIdentitiesItem builder
     */
    public Builder attrs(IdentityAttrs attrs) {
      this.attrs = attrs;
      return this;
    }
  }

  protected ConfigCARegistryIdentitiesItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pass,
      "pass cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    name = builder.name;
    pass = builder.pass;
    type = builder.type;
    maxenrollments = builder.maxenrollments;
    affiliation = builder.affiliation;
    attrs = builder.attrs;
  }

  /**
   * New builder.
   *
   * @return a ConfigCARegistryIdentitiesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The ID for the identity, aka enroll id.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the pass.
   *
   * The password for the identity, aka enroll secret.
   *
   * @return the pass
   */
  public String pass() {
    return pass;
  }

  /**
   * Gets the type.
   *
   * The type of identity.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the maxenrollments.
   *
   * Maximum number of enrollments for id. Set -1 for infinite.
   *
   * @return the maxenrollments
   */
  public Double maxenrollments() {
    return maxenrollments;
  }

  /**
   * Gets the affiliation.
   *
   * The affiliation data for the identity.
   *
   * @return the affiliation
   */
  public String affiliation() {
    return affiliation;
  }

  /**
   * Gets the attrs.
   *
   * @return the attrs
   */
  public IdentityAttrs attrs() {
    return attrs;
  }
}

