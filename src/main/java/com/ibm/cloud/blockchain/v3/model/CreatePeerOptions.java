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
 * The createPeer options.
 */
public class CreatePeerOptions extends GenericModel {

  /**
   * Select the state database for the peer. Can be either "couchdb" or "leveldb". The default is "couchdb".
   */
  public interface StateDb {
    /** couchdb. */
    String COUCHDB = "couchdb";
    /** leveldb. */
    String LEVELDB = "leveldb";
  }

  protected String mspId;
  protected String displayName;
  protected CryptoObject crypto;
  protected ConfigPeerCreate configOverride;
  protected PeerResources resources;
  protected CreatePeerBodyStorage storage;
  protected String zone;
  protected String stateDb;
  protected List<String> tags;
  protected Hsm hsm;
  protected String region;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String mspId;
    private String displayName;
    private CryptoObject crypto;
    private ConfigPeerCreate configOverride;
    private PeerResources resources;
    private CreatePeerBodyStorage storage;
    private String zone;
    private String stateDb;
    private List<String> tags;
    private Hsm hsm;
    private String region;
    private String version;

    private Builder(CreatePeerOptions createPeerOptions) {
      this.mspId = createPeerOptions.mspId;
      this.displayName = createPeerOptions.displayName;
      this.crypto = createPeerOptions.crypto;
      this.configOverride = createPeerOptions.configOverride;
      this.resources = createPeerOptions.resources;
      this.storage = createPeerOptions.storage;
      this.zone = createPeerOptions.zone;
      this.stateDb = createPeerOptions.stateDb;
      this.tags = createPeerOptions.tags;
      this.hsm = createPeerOptions.hsm;
      this.region = createPeerOptions.region;
      this.version = createPeerOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mspId the mspId
     * @param displayName the displayName
     * @param crypto the crypto
     */
    public Builder(String mspId, String displayName, CryptoObject crypto) {
      this.mspId = mspId;
      this.displayName = displayName;
      this.crypto = crypto;
    }

    /**
     * Builds a CreatePeerOptions.
     *
     * @return the new CreatePeerOptions instance
     */
    public CreatePeerOptions build() {
      return new CreatePeerOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreatePeerOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the CreatePeerOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreatePeerOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the crypto.
     *
     * @param crypto the crypto
     * @return the CreatePeerOptions builder
     */
    public Builder crypto(CryptoObject crypto) {
      this.crypto = crypto;
      return this;
    }

    /**
     * Set the configOverride.
     *
     * @param configOverride the configOverride
     * @return the CreatePeerOptions builder
     */
    public Builder configOverride(ConfigPeerCreate configOverride) {
      this.configOverride = configOverride;
      return this;
    }

    /**
     * Set the resources.
     *
     * @param resources the resources
     * @return the CreatePeerOptions builder
     */
    public Builder resources(PeerResources resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the storage.
     *
     * @param storage the storage
     * @return the CreatePeerOptions builder
     */
    public Builder storage(CreatePeerBodyStorage storage) {
      this.storage = storage;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreatePeerOptions builder
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the stateDb.
     *
     * @param stateDb the stateDb
     * @return the CreatePeerOptions builder
     */
    public Builder stateDb(String stateDb) {
      this.stateDb = stateDb;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreatePeerOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the hsm.
     *
     * @param hsm the hsm
     * @return the CreatePeerOptions builder
     */
    public Builder hsm(Hsm hsm) {
      this.hsm = hsm;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the CreatePeerOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreatePeerOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected CreatePeerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mspId,
      "mspId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crypto,
      "crypto cannot be null");
    mspId = builder.mspId;
    displayName = builder.displayName;
    crypto = builder.crypto;
    configOverride = builder.configOverride;
    resources = builder.resources;
    storage = builder.storage;
    zone = builder.zone;
    stateDb = builder.stateDb;
    tags = builder.tags;
    hsm = builder.hsm;
    region = builder.region;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a CreatePeerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mspId.
   *
   * The MSP id that is related to this component.
   *
   * @return the mspId
   */
  public String mspId() {
    return mspId;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this peer. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the crypto.
   *
   * See this [topic](/docs/blockchain?topic=blockchain-ibp-v2-apis#ibp-v2-apis-config) for instructions on how to build
   * a crypto object.
   *
   * @return the crypto
   */
  public CryptoObject crypto() {
    return crypto;
  }

  /**
   * Gets the configOverride.
   *
   * Override the [Fabric Peer configuration
   * file](https://github.com/hyperledger/fabric/blob/release-1.4/sampleconfig/core.yaml) if you want use custom
   * attributes to configure the Peer. Omit if not.
   *
   * *The field **names** below are not case-sensitive.*.
   *
   * @return the configOverride
   */
  public ConfigPeerCreate configOverride() {
    return configOverride;
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
   * Gets the storage.
   *
   * Disk space properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the storage
   */
  public CreatePeerBodyStorage storage() {
    return storage;
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

  /**
   * Gets the stateDb.
   *
   * Select the state database for the peer. Can be either "couchdb" or "leveldb". The default is "couchdb".
   *
   * @return the stateDb
   */
  public String stateDb() {
    return stateDb;
  }

  /**
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the hsm.
   *
   * The connection details of the HSM (Hardware Security Module).
   *
   * @return the hsm
   */
  public Hsm hsm() {
    return hsm;
  }

  /**
   * Gets the region.
   *
   * Specify the Kubernetes region for the deployment. The deployment will use a k8s node in this region. Find the list
   * of possible regions by retrieving your Kubernetes node labels: `kubectl get nodes --show-labels`. [More
   * info](https://kubernetes.io/docs/setup/best-practices/multiple-zones).
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the version.
   *
   * The Hyperledger Fabric release version to use.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

