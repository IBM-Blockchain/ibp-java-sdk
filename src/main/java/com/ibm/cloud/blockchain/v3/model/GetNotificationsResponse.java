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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetNotificationsResponse.
 */
public class GetNotificationsResponse extends GenericModel {

  protected Double total;
  protected Double returning;
  protected List<NotificationData> notifications;

  /**
   * Gets the total.
   *
   * Number of notifications in database.
   *
   * @return the total
   */
  public Double getTotal() {
    return total;
  }

  /**
   * Gets the returning.
   *
   * Number of notifications returned.
   *
   * @return the returning
   */
  public Double getReturning() {
    return returning;
  }

  /**
   * Gets the notifications.
   *
   * This array is ordered by creation date.
   *
   * @return the notifications
   */
  public List<NotificationData> getNotifications() {
    return notifications;
  }
}

