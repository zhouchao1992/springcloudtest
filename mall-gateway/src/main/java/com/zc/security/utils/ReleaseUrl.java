package com.zc.security.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "release")
public class ReleaseUrl {
    List<String> releaseUrls = new ArrayList<>();
}
