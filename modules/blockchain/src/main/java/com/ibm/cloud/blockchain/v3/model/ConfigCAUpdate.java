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
 * ConfigCAUpdate.
 */
public class ConfigCAUpdate extends GenericModel {

  protected ConfigCACors cors;
  protected Boolean debug;
  protected Double crlsizelimit;
  protected ConfigCATls tls;
  protected ConfigCACa ca;
  protected ConfigCACrl crl;
  protected ConfigCARegistry registry;
  protected ConfigCADb db;
  protected ConfigCAAffiliations affiliations;
  protected ConfigCACsr csr;
  protected ConfigCAIdemix idemix;
  @SerializedName("BCCSP")
  protected Bccsp bccsp;
  protected ConfigCAIntermediate intermediate;
  protected ConfigCACfg cfg;
  protected Metrics metrics;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCACors cors;
    private Boolean debug;
    private Double crlsizelimit;
    private ConfigCATls tls;
    private ConfigCACa ca;
    private ConfigCACrl crl;
    private ConfigCARegistry registry;
    private ConfigCADb db;
    private ConfigCAAffiliations affiliations;
    private ConfigCACsr csr;
    private ConfigCAIdemix idemix;
    private Bccsp bccsp;
    private ConfigCAIntermediate intermediate;
    private ConfigCACfg cfg;
    private Metrics metrics;

    private Builder(ConfigCAUpdate configCaUpdate) {
      this.cors = configCaUpdate.cors;
      this.debug = configCaUpdate.debug;
      this.crlsizelimit = configCaUpdate.crlsizelimit;
      this.tls = configCaUpdate.tls;
      this.ca = configCaUpdate.ca;
      this.crl = configCaUpdate.crl;
      this.registry = configCaUpdate.registry;
      this.db = configCaUpdate.db;
      this.affiliations = configCaUpdate.affiliations;
      this.csr = configCaUpdate.csr;
      this.idemix = configCaUpdate.idemix;
      this.bccsp = configCaUpdate.bccsp;
      this.intermediate = configCaUpdate.intermediate;
      this.cfg = configCaUpdate.cfg;
      this.metrics = configCaUpdate.metrics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCAUpdate.
     *
     * @return the new ConfigCAUpdate instance
     */
    public ConfigCAUpdate build() {
      return new ConfigCAUpdate(this);
    }

    /**
     * Set the cors.
     *
     * @param cors the cors
     * @return the ConfigCAUpdate builder
     */
    public Builder cors(ConfigCACors cors) {
      this.cors = cors;
      return this;
    }

    /**
     * Set the debug.
     *
     * @param debug the debug
     * @return the ConfigCAUpdate builder
     */
    public Builder debug(Boolean debug) {
      this.debug = debug;
      return this;
    }

    /**
     * Set the crlsizelimit.
     *
     * @param crlsizelimit the crlsizelimit
     * @return the ConfigCAUpdate builder
     */
    public Builder crlsizelimit(Double crlsizelimit) {
      this.crlsizelimit = crlsizelimit;
      return this;
    }

    /**
     * Set the tls.
     *
     * @param tls the tls
     * @return the ConfigCAUpdate builder
     */
    public Builder tls(ConfigCATls tls) {
      this.tls = tls;
      return this;
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the ConfigCAUpdate builder
     */
    public Builder ca(ConfigCACa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the crl.
     *
     * @param crl the crl
     * @return the ConfigCAUpdate builder
     */
    public Builder crl(ConfigCACrl crl) {
      this.crl = crl;
      return this;
    }

    /**
     * Set the registry.
     *
     * @param registry the registry
     * @return the ConfigCAUpdate builder
     */
    public Builder registry(ConfigCARegistry registry) {
      this.registry = registry;
      return this;
    }

    /**
     * Set the db.
     *
     * @param db the db
     * @return the ConfigCAUpdate builder
     */
    public Builder db(ConfigCADb db) {
      this.db = db;
      return this;
    }

    /**
     * Set the affiliations.
     *
     * @param affiliations the affiliations
     * @return the ConfigCAUpdate builder
     */
    public Builder affiliations(ConfigCAAffiliations affiliations) {
      this.affiliations = affiliations;
      return this;
    }

    /**
     * Set the csr.
     *
     * @param csr the csr
     * @return the ConfigCAUpdate builder
     */
    public Builder csr(ConfigCACsr csr) {
      this.csr = csr;
      return this;
    }

    /**
     * Set the idemix.
     *
     * @param idemix the idemix
     * @return the ConfigCAUpdate builder
     */
    public Builder idemix(ConfigCAIdemix idemix) {
      this.idemix = idemix;
      return this;
    }

    /**
     * Set the bccsp.
     *
     * @param bccsp the bccsp
     * @return the ConfigCAUpdate builder
     */
    public Builder bccsp(Bccsp bccsp) {
      this.bccsp = bccsp;
      return this;
    }

    /**
     * Set the intermediate.
     *
     * @param intermediate the intermediate
     * @return the ConfigCAUpdate builder
     */
    public Builder intermediate(ConfigCAIntermediate intermediate) {
      this.intermediate = intermediate;
      return this;
    }

    /**
     * Set the cfg.
     *
     * @param cfg the cfg
     * @return the ConfigCAUpdate builder
     */
    public Builder cfg(ConfigCACfg cfg) {
      this.cfg = cfg;
      return this;
    }

    /**
     * Set the metrics.
     *
     * @param metrics the metrics
     * @return the ConfigCAUpdate builder
     */
    public Builder metrics(Metrics metrics) {
      this.metrics = metrics;
      return this;
    }
  }

  protected ConfigCAUpdate(Builder builder) {
    cors = builder.cors;
    debug = builder.debug;
    crlsizelimit = builder.crlsizelimit;
    tls = builder.tls;
    ca = builder.ca;
    crl = builder.crl;
    registry = builder.registry;
    db = builder.db;
    affiliations = builder.affiliations;
    csr = builder.csr;
    idemix = builder.idemix;
    bccsp = builder.bccsp;
    intermediate = builder.intermediate;
    cfg = builder.cfg;
    metrics = builder.metrics;
  }

  /**
   * New builder.
   *
   * @return a ConfigCAUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cors.
   *
   * @return the cors
   */
  public ConfigCACors cors() {
    return cors;
  }

  /**
   * Gets the debug.
   *
   * Enable debug to debug the CA.
   *
   * @return the debug
   */
  public Boolean debug() {
    return debug;
  }

  /**
   * Gets the crlsizelimit.
   *
   * Max size of an acceptable CRL in bytes.
   *
   * @return the crlsizelimit
   */
  public Double crlsizelimit() {
    return crlsizelimit;
  }

  /**
   * Gets the tls.
   *
   * @return the tls
   */
  public ConfigCATls tls() {
    return tls;
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public ConfigCACa ca() {
    return ca;
  }

  /**
   * Gets the crl.
   *
   * @return the crl
   */
  public ConfigCACrl crl() {
    return crl;
  }

  /**
   * Gets the registry.
   *
   * @return the registry
   */
  public ConfigCARegistry registry() {
    return registry;
  }

  /**
   * Gets the db.
   *
   * @return the db
   */
  public ConfigCADb db() {
    return db;
  }

  /**
   * Gets the affiliations.
   *
   * Set the keys to the desired affiliation parent names. The keys 'org1' and 'org2' are examples.
   *
   * @return the affiliations
   */
  public ConfigCAAffiliations affiliations() {
    return affiliations;
  }

  /**
   * Gets the csr.
   *
   * @return the csr
   */
  public ConfigCACsr csr() {
    return csr;
  }

  /**
   * Gets the idemix.
   *
   * @return the idemix
   */
  public ConfigCAIdemix idemix() {
    return idemix;
  }

  /**
   * Gets the bccsp.
   *
   * Configures the Blockchain Crypto Service Providers (bccsp).
   *
   * @return the bccsp
   */
  public Bccsp bccsp() {
    return bccsp;
  }

  /**
   * Gets the intermediate.
   *
   * @return the intermediate
   */
  public ConfigCAIntermediate intermediate() {
    return intermediate;
  }

  /**
   * Gets the cfg.
   *
   * @return the cfg
   */
  public ConfigCACfg cfg() {
    return cfg;
  }

  /**
   * Gets the metrics.
   *
   * @return the metrics
   */
  public Metrics metrics() {
    return metrics;
  }
}

