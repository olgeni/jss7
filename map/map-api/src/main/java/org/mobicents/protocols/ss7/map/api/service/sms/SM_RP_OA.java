/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.protocols.ss7.map.api.service.sms;

import java.io.Serializable;

import org.mobicents.protocols.ss7.map.api.primitives.AddressString;
import org.mobicents.protocols.ss7.map.api.primitives.ISDNAddressString;

/**
 * SM-RP-OA ::= CHOICE { msisdn [2] ISDN-AddressString, serviceCentreAddressOA [4] AddressString, noSM-RP-OA [5] NULL}
 *
 * Only one method getMsisdn() or getServiceCentreAddressOA() will return the non null value If all these methods return null -
 * this means noSM-RP-OA value
 *
 * @author sergey vetyutnev
 *
 */
public interface SM_RP_OA extends Serializable {

    ISDNAddressString getMsisdn();

    AddressString getServiceCentreAddressOA();

}
