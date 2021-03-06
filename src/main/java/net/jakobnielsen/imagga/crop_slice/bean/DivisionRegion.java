/*
 * Copyright 2013 Jakob Vad Nielsen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.jakobnielsen.imagga.crop_slice.bean;

import java.util.List;

public class DivisionRegion {

    private final String url;

    private final List<Region> regions;

    public DivisionRegion(String url, List<Region> regions) {
        this.url = url;
        this.regions = regions;
    }

    public String getUrl() {
        return url;
    }

    public List<Region> getRegions() {
        return regions;
    }
}
