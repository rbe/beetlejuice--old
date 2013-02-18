/*
 * beetlejuice
 * beetlejuice-web
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 15.02.13 09:27
 */

package eu.artofcoding.beetlejuice.web;

public class BeetlejuiceWebException extends Exception {

    public BeetlejuiceWebException() {
    }

    public BeetlejuiceWebException(String message) {
        super(message);
    }

    public BeetlejuiceWebException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeetlejuiceWebException(Throwable cause) {
        super(cause);
    }

    public BeetlejuiceWebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
