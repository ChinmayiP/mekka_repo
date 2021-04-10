package com.example.myapplication.models

import android.os.Parcel
import android.os.Parcelable

class HeroNames() : Parcelable {

    var name: String? = null
    var realname: String? = null
    var team: String? = null
    var firstappearance: String? = null
    var createdby: String? = null
    var publisher: String? = null
    var imageurl: String? = null
    var bio: String? = null

    constructor(parcel: Parcel) : this() {
        name = parcel.readString()
        realname = parcel.readString()
        team = parcel.readString()
        firstappearance = parcel.readString()
        createdby = parcel.readString()
        publisher = parcel.readString()
        imageurl = parcel.readString()
        bio = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(realname)
        parcel.writeString(team)
        parcel.writeString(firstappearance)
        parcel.writeString(createdby)
        parcel.writeString(publisher)
        parcel.writeString(imageurl)
        parcel.writeString(bio)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HeroNames> {
        override fun createFromParcel(parcel: Parcel): HeroNames {
            return HeroNames(parcel)
        }

        override fun newArray(size: Int): Array<HeroNames?> {
            return arrayOfNulls(size)
        }
    }

}