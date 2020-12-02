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
 * The updateOrderer options.
 */
public class UpdateOrdererOptions extends GenericModel {

  protected String id;
  protected List<String> adminCerts;
  protected ConfigOrdererUpdate configOverride;
  protected UpdateOrdererBodyCrypto crypto;
  protected NodeOu nodeOu;
  protected Double replicas;
  protected UpdateOrdererBodyResources resources;
  protected String version;
  protected String zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> adminCerts;
    private ConfigOrdererUpdate configOverride;
    private UpdateOrdererBodyCrypto crypto;
    private NodeOu nodeOu;
    private Double replicas;
    private UpdateOrdererBodyResources resources;
    private String version;
    private String zone;

    private Builder(UpdateOrdererOptions updateOrdererOptions) {
      this.id = updateOrdererOptions.id;
      this.adminCerts = updateOrdererOptions.adminCerts;
      this.configOverride = updateOrdererOptions.configOverride;
      this.crypto = updateOrdererOptions.crypto;
      this.nodeOu = updateOrdererOptions.nodeOu;
      this.replicas = updateOrdererOptions.replicas;
      this.resources = updateOrdererOptions.resources;
      this.version = updateOrdererOptions.version;
      this.zone = updateOrdererOptions.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateOrdererOptions.
     *
     * @return the new UpdateOrdererOptions instance
     */
    public UpdateOrdererOptions build() {
      return new UpdateOrdererOptions(this);
    }

    /**
     * Adds an adminCerts to adminCerts.
     *
     * @param adminCerts the new adminCerts
     * @return the UpdateOrdererOptions builder
     */
    public Builder addAdminCerts(String adminCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(adminCerts,
        "adminCerts cannot be null");
      if (this.adminCerts == null) {
        this.adminCerts = new ArrayList<String>();
      }
      this.adminCerts.add(adminCerts);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateOrdererOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the adminCerts.
     * Existing adminCerts will be replaced.
     *
     * @param adminCerts the adminCerts
     * @return the UpdateOrdererOptions builder
     */
    public Builder adminCerts(List<String> adminCerts) {
      this.adminCerts = adminCerts;
      return this;
    }

    /**
     * Set the configOverride.
     *
     * @param configOverride the configOverride
     * @return the UpdateOrdererOptions builder
     */
    public Builder configOverride(ConfigOrdererUpdate configOverride) {
      this.configOverride = configOverride;
      return this;
    }

    /**
     * Set the crypto.
     *
     * @param crypto the crypto
     * @return the UpdateOrdererOptions builder
     */
    public Builder crypto(UpdateOrdererBodyCrypto crypto) {
      this.crypto = crypto;
      return this;
    }

    /**
     * Set the nodeOu.
     *
     * @param nodeOu the nodeOu
     * @return the UpdateOrdererOptions builder
     */
    public Builder nodeOu(NodeOu nodeOu) {
      this.nodeOu = nodeOu;
      return this;
    }

    /**
     * Set the replicas.
     *
     * @param replicas the replicas
     * @return the UpdateOrdererOptions builder
     */
    public Builder replicas(Double replicas) {
      this.replicas = replicas;
      return this;
    }

    /**
     * Set the resources.
     *
     * @param resources the resources
     * @return the UpdateOrdererOptions builder
     */
    public Builder resources(UpdateOrdererBodyResources resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the UpdateOrdererOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the UpdateOrdererOptions builder
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }
  }

  protected UpdateOrdererOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    adminCerts = builder.adminCerts;
    configOverride = builder.configOverride;
    crypto = builder.crypto;
    nodeOu = builder.nodeOu;
    replicas = builder.replicas;
    resources = builder.resources;
    version = builder.version;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a UpdateOrdererOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the component to modify. Use the [Get all components](#list_components) API to determine the component
   * id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the adminCerts.
   *
   * An array that contains *all* the base 64 encoded PEM identity certificates for administrators of this component.
   * Also known as signing certificates of an organization administrator.
   *
   * @return the adminCerts
   */
  public List<String> adminCerts() {
    return adminCerts;
  }

  /**
   * Gets the configOverride.
   *
   * Update the [Fabric Orderer configuration
   * file](https://github.com/hyperledger/fabric/blob/release-1.4/sampleconfig/orderer.yaml) if you want use custom
   * attributes to configure the Orderer. Omit if not.
   *
   * *The field **names** below are not case-sensitive.*.
   *
   * @return the configOverride
   */
  public ConfigOrdererUpdate configOverride() {
    return configOverride;
  }

  /**
   * Gets the crypto.
   *
   * @return the crypto
   */
  public UpdateOrdererBodyCrypto crypto() {
    return crypto;
  }

  /**
   * Gets the nodeOu.
   *
   * @return the nodeOu
   */
  public NodeOu nodeOu() {
    return nodeOu;
  }

  /**
   * Gets the replicas.
   *
   * The number of replica pods running at any given time.
   *
   * @return the replicas
   */
  public Double replicas() {
    return replicas;
  }

  /**
   * Gets the resources.
   *
   * CPU and memory properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the resources
   */
  public UpdateOrdererBodyResources resources() {
    return resources;
  }

  /**
   * Gets the version.
   *
   * The Hyperledger Fabric release version to update to.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the zone.
   *
   * Specify the Kubernetes zone for the deployment. The deployment will use a k8s node in this zone. Find the list of
   * possible zones by retrieving your Kubernetes node labels: `kubectl get nodes --show-labels`. [More
   * information](https://kubernetes.io/docs/setup/best-practices/multiple-zones).
   *
   * @return the zone
   */
  public String zone() {
    return zone;
  }
}

