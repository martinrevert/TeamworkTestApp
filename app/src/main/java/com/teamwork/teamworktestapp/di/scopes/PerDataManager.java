package com.teamwork.teamworktestapp.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by martin on 08/03/18.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerDataManager {
}

