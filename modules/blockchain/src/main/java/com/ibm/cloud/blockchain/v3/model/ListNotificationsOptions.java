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
 * The listNotifications options.
 */
public class ListNotificationsOptions extends GenericModel {

  protected Double limit;
  protected Double skip;
  protected String componentId;

  /**
   * Builder.
   */
  public static class Builder {
    private Double limit;
    private Double skip;
    private String componentId;

    private Builder(ListNotificationsOptions listNotificationsOptions) {
      this.limit = listNotificationsOptions.limit;
      this.skip = listNotificationsOptions.skip;
      this.componentId = listNotificationsOptions.componentId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListNotificationsOptions.
     *
     * @return the new ListNotificationsOptions instance
     */
    public ListNotificationsOptions build() {
      return new ListNotificationsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListNotificationsOptions builder
     */
    public Builder limit(Double limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the skip.
     *
     * @param skip the skip
     * @return the ListNotificationsOptions builder
     */
    public Builder skip(Double skip) {
      this.skip = skip;
      return this;
    }

    /**
     * Set the componentId.
     *
     * @param componentId the componentId
     * @return the ListNotificationsOptions builder
     */
    public Builder componentId(String componentId) {
      this.componentId = componentId;
      return this;
    }
  }

  protected ListNotificationsOptions(Builder builder) {
    limit = builder.limit;
    skip = builder.skip;
    componentId = builder.componentId;
  }

  /**
   * New builder.
   *
   * @return a ListNotificationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * The number of notifications to return. The default value is 100.
   *
   * @return the limit
   */
  public Double limit() {
    return limit;
  }

  /**
   * Gets the skip.
   *
   * `skip` is used to paginate through a long list of sorted entries. For example, if there are 100 notifications, you
   * can issue the API with limit=10 and skip=0 to get the first 1-10. To get the next 10, you can set limit=10 and
   * skip=10 so that the values of entries 11-20 are returned.
   *
   * @return the skip
   */
  public Double skip() {
    return skip;
  }

  /**
   * Gets the componentId.
   *
   * Filter response to only contain notifications for a particular component id. The default response will include all
   * notifications.
   *
   * @return the componentId
   */
  public String componentId() {
    return componentId;
  }
}

