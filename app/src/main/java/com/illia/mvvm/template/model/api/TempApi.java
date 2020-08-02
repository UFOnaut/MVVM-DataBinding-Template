package com.illia.mvvm.template.model.api;

import com.illia.mvvm.template.model.dto.GithubItem;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TempApi {
    @GET("users/{user}/repos")
    Observable<List<GithubItem>> getRepositories(@Path("user") String user);
}
