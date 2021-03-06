/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.example.newsfeedsapp.utils;

/**
 * Created by amitshekhar on 07/07/17.
 */

public final class AppConstants {

    public static final String BASE_URL = "https://newsapi.org/v1/articles/";

    public static final String SOURCE_NEXT = "the-next-web";

    public static final String SOURCE_ASSOCIATE = "associated-press";

    public static final String API_KEY = "533af958594143758318137469b41ba9";

    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    public static final String DATE_FORMAT = "MMM d yyyy";

    private AppConstants() {
        // This utility class is not publicly instantiable
    }
}
