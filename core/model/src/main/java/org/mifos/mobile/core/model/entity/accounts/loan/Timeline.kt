/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-mobile/blob/master/LICENSE.md
 */
package org.mifos.mobile.core.model.entity.accounts.loan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
@Suppress("ktlint:standard:property-naming")
data class Timeline(
    var submittedOnDate: List<Int>? = null,

    var submittedByUsername: String?,

    var submittedByFirstname: String?,

    var submittedByLastname: String?,

    var approvedOnDate: List<Int>? = null,

    var approvedByUsername: String?,

    var approvedByFirstname: String?,

    var approvedByLastname: String?,

    var expectedDisbursementDate: List<Int>? = null,

    var actualDisbursementDate: List<Int>? = null,

    var disbursedByUsername: String?,

    var disbursedByFirstname: String?,

    var disbursedByLastname: String?,

    var closedOnDate: List<Int>? = null,

    var expectedMaturityDate: List<Int>? = null,

    var withdrawnOnDate: List<Int>,

) : Parcelable
