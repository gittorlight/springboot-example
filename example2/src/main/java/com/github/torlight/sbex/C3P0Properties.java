package com.github.torlight.sbex;

import java.io.Serializable;
import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by acer on 2017-06-10.
 */

@ConfigurationProperties(prefix = "c3p0")
public class C3P0Properties extends Properties implements Serializable{

    private static final long serialVersionUID = 7019018492297937557L;
}
