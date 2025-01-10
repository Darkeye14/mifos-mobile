/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-mobile/blob/master/LICENSE.md
 */
package org.mifos.mobile.core.model.entity.accounts.savings

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimeLine(
    var submittedOnDate: List<Int> = ArrayList(),

    var submittedByUsername: String?,

    var submittedByFirstname: String?,

    var submittedByLastname: String?,

    var approvedOnDate: List<Int> = ArrayList(),

    var approvedByUsername: String?,

    var approvedByFirstname: String?,

    var approvedByLastname: String?,

    var activatedOnDate: List<Int>? = null,

    var activatedByUsername: String?,

    var activatedByFirstname: String?,

    var activatedByLastname: String?,

    var closedOnDate: List<Int>,

) : Parcelable
