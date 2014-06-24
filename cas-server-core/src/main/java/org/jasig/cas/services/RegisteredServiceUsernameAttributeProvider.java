/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.services;

import java.io.Serializable;

import org.jasig.cas.authentication.principal.Principal;

/**
 * Strategy interface to define what username attribute should
 * be return for a given registered service.
 * @author Misagh Moayyed
 * @since 4.1
 */
public interface RegisteredServiceUsernameAttributeProvider extends Serializable {
    /**
     * Resolve the username that is to be returned to CAS clients.
     *
     * @param principal the principal
     * @return the username value configured for this service
     */
    String resolveUsername(final Principal principal);
}
