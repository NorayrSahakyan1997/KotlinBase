package com.example.kointest.model.main.restclient.model

import com.google.gson.annotations.SerializedName

data class Response(
        @SerializedName("page") val page: Int,
        @SerializedName("per_page") val perPage: Int,
        @SerializedName("total") val total: Int,
        @SerializedName("total_pages") val totalPages: Int,
        @SerializedName("data") var listUsers: List<Row>
)

data class Row(
        @SerializedName("id") val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        @SerializedName("avatar") val avatar: String
)