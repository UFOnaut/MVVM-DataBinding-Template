package com.illia.mvvm.template.model.dto

import java.io.Serializable

class GithubItem : Serializable {
    private var id: Int? = null;
    var name: String? = null;
    var description: String? = null;
}