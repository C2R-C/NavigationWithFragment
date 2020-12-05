package com.c2r.navigationwithfragment

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
data class Integrante(var apellido: String?, var edad:Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(apellido)
        parcel.writeInt(edad)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Integrante> {
        override fun createFromParcel(parcel: Parcel): Integrante {
            return Integrante(parcel)
        }

        override fun newArray(size: Int): Array<Integrante?> {
            return arrayOfNulls(size)
        }
    }
}