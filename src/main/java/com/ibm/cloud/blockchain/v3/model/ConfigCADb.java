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
 * ConfigCADb.
 */
public class ConfigCADb extends GenericModel {

  /**
   * The type of database. Either 'sqlite3', 'postgres', 'mysql'. Defaults 'sqlite3'.
   */
  public interface Type {
    /** sqlite3. */
    String SQLITE3 = "sqlite3";
    /** postgres. */
    String POSTGRES = "postgres";
    /** mysql. */
    String MYSQL = "mysql";
  }

  protected String type;
  protected String datasource;
  protected ConfigCADbTls tls;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String datasource;
    private ConfigCADbTls tls;

    private Builder(ConfigCADb configCaDb) {
      this.type = configCaDb.type;
      this.datasource = configCaDb.datasource;
      this.tls = configCaDb.tls;
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
     * @param datasource the datasource
     */
    public Builder(String type, String datasource) {
      this.type = type;
      this.datasource = datasource;
    }

    /**
     * Builds a ConfigCADb.
     *
     * @return the new ConfigCADb instance
     */
    public ConfigCADb build() {
      return new ConfigCADb(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ConfigCADb builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the datasource.
     *
     * @param datasource the datasource
     * @return the ConfigCADb builder
     */
    public Builder datasource(String datasource) {
      this.datasource = datasource;
      return this;
    }

    /**
     * Set the tls.
     *
     * @param tls the tls
     * @return the ConfigCADb builder
     */
    public Builder tls(ConfigCADbTls tls) {
      this.tls = tls;
      return this;
    }
  }

  protected ConfigCADb(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.datasource,
      "datasource cannot be null");
    type = builder.type;
    datasource = builder.datasource;
    tls = builder.tls;
  }

  /**
   * New builder.
   *
   * @return a ConfigCADb builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The type of database. Either 'sqlite3', 'postgres', 'mysql'. Defaults 'sqlite3'.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the datasource.
   *
   * Build this string - "host=\&lt;hostname&gt; port=\&lt;port&gt; user=\&lt;username&gt; password=\&lt;password&gt;
   * dbname=ibmclouddb sslmode=verify-full".
   *
   * @return the datasource
   */
  public String datasource() {
    return datasource;
  }

  /**
   * Gets the tls.
   *
   * @return the tls
   */
  public ConfigCADbTls tls() {
    return tls;
  }
}

