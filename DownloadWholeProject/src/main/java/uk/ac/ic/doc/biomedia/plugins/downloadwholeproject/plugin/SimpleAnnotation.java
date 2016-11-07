/*
 * xnat-workshop-plugin: SimpleAnnotation
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package uk.ac.ic.doc.biomedia.plugins.downloadwholeproject.plugin;

public @interface SimpleAnnotation {
    int value() default 0;
    String name() default "";
}
