package com.dotmarketing.filters.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serializable;

/**
 * Encapsulates an Interceptor; an interceptor is a good way to extends a filter behavior
 * Usually useful to be added as an OSGI plugin
 * @author jsanca
 */
public interface WebInterceptor extends Serializable {

    /**
     * Called on destroy
     */
    void destroy();

    /**
     * Called on init
     */
    void init();

    /**
     * In case you want to apply this filter just to some subset of path's return them here.
     * Null means accept all.
     *
     * @return String []
     */
    default String [] getFilters() {

        return null;
    }

    /**
     * Called in any request. Returns true if you want to continue the chain call, false otherwise.
     * @param req
     * @param res
     * @return boolean
     * @throws IOException
     */
    boolean intercept(HttpServletRequest req, HttpServletResponse res)
            throws IOException;
} // E:O:F:WebInterceptor.
