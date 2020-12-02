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
 * The updatePeer options.
 */
public class UpdatePeerOptions extends GenericModel {

  protected String id;
  protected List<String> adminCerts;
  protected ConfigPeerUpdate configOverride;
  protected UpdatePeerBodyCrypto crypto;
  protected NodeOu nodeOu;
  protected Double replicas;
  protected PeerResources resources;
  protected String version;
  protected String zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> adminCerts;
    private ConfigPeerUpdate configOverride;
    private UpdatePeerBodyCrypto crypto;
    private NodeOu nodeOu;
    private Double replicas;
    private PeerResources resources;
    private String version;
    private String zone;

    private Builder(UpdatePeerOptions updatePeerOptions) {
      this.id = updatePeerOptions.id;
      this.adminCerts = updatePeerOptions.adminCerts;
      this.configOverride = updatePeerOptions.configOverride;
      this.crypto = updatePeerOptions.crypto;
      this.nodeOu = updatePeerOptions.nodeOu;
      this.replicas = updatePeerOptions.replicas;
      this.resources = updatePeerOptions.resources;
      this.version = updatePeerOptions.version;
      this.zone = updatePeerOptions.zone;
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
     * Builds a UpdatePeerOptions.
     *
     * @return the new UpdatePeerOptions instance
     */
    public UpdatePeerOptions build() {
      return new UpdatePeerOptions(this);
    }

    /**
     * Adds an adminCerts to adminCerts.
     *
     * @param adminCerts the new adminCerts
     * @return the UpdatePeerOptions builder
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
     * @return the UpdatePeerOptions builder
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
     * @return the UpdatePeerOptions builder
     */
    public Builder adminCerts(List<String> adminCerts) {
      this.adminCerts = adminCerts;
      return this;
    }

    /**
     * Set the configOverride.
     *
     * @param configOverride the configOverride
     * @return the UpdatePeerOptions builder
     */
    public Builder configOverride(ConfigPeerUpdate configOverride) {
      this.configOverride = configOverride;
      return this;
    }

    /**
     * Set the crypto.
     *
     * @param crypto the crypto
     * @return the UpdatePeerOptions builder
     */
    public Builder crypto(UpdatePeerBodyCrypto crypto) {
      this.crypto = crypto;
      return this;
    }

    /**
     * Set the nodeOu.
     *
     * @param nodeOu the nodeOu
     * @return the UpdatePeerOptions builder
     */
    public Builder nodeOu(NodeOu nodeOu) {
      this.nodeOu = nodeOu;
      return this;
    }

    /**
     * Set the replicas.
     *
     * @param replicas the replicas
     * @return the UpdatePeerOptions builder
     */
    public Builder replicas(Double replicas) {
      this.replicas = replicas;
      return this;
    }

    /**
     * Set the resources.
     *
     * @param resources the resources
     * @return the UpdatePeerOptions builder
     */
    public Builder resources(PeerResources resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the UpdatePeerOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the UpdatePeerOptions builder
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }
  }

  protected UpdatePeerOptions(Builder builder) {
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
   * @return a UpdatePeerOptions builder
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
   * Update the [Fabric Peer configuration
   * file](https://github.com/hyperledger/fabric/blob/release-1.4/sampleconfig/core.yaml) if you want use custom
   * attributes to configure the Peer. Omit if not.
   *
   * *The field **names** below are not case-sensitive.*.
   *
   * @return the configOverride
   */
  public ConfigPeerUpdate configOverride() {
    return configOverride;
  }

  /**
   * Gets the crypto.
   *
   * @return the crypto
   */
  public UpdatePeerBodyCrypto crypto() {
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
  public PeerResources resources() {
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

