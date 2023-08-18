package com.example.a91sqfeet

import com.google.gson.annotations.SerializedName


data class Products (

    @SerializedName("code"    ) var code    : Int?            = null,
    @SerializedName("message" ) var message : String?         = null,
    @SerializedName("success" ) var success : Boolean?        = null,
    @SerializedName("data"    ) var data    : ArrayList<Data> = arrayListOf(),
    @SerializedName("errors"  ) var errors  : String?         = null

)
{
    data class UploadedBy (

        @SerializedName("id"                ) var id               : String? = null,
        @SerializedName("name"              ) var name             : String? = null,
        @SerializedName("photo"             ) var photo            : String? = null,
        @SerializedName("organization_name" ) var organizationName : String? = null

    )

    data class Data (

        @SerializedName("id"            ) var id           : String?           = null,
        @SerializedName("name"          ) var name         : String?           = null,
        @SerializedName("type"          ) var type         : String?           = null,
        @SerializedName("section"       ) var section      : String?           = null,
        @SerializedName("tags"          ) var tags         : ArrayList<String> = arrayListOf(),
        @SerializedName("file"          ) var file         : String?           = null,
        @SerializedName("version"       ) var version      : Int?              = null,
        @SerializedName("status"        ) var status       : Int?              = null,
        @SerializedName("comment_count" ) var commentCount : Int?              = null,
        @SerializedName("uploaded_at"   ) var uploadedAt   : String?           = null,
        @SerializedName("uploaded_by"   ) var uploadedBy   : UploadedBy?       = UploadedBy(),
        @SerializedName("file_size"     ) var fileSize     : Double?           = null

    )
}