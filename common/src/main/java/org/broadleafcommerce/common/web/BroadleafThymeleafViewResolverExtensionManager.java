/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License” located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License” located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.common.web;

import org.broadleafcommerce.common.extension.ExtensionManager;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


/**
 * @author Andre Azzolini (apazzolini)
 */
@Service("blBroadleafThymeleafViewResolverExtensionManager")
public class BroadleafThymeleafViewResolverExtensionManager extends ExtensionManager<BroadleafThymeleafViewResolverExtensionHandler> {

    private List<BroadleafThymeleafViewResolverExtensionHandler> EMPTY_LIST = Collections.emptyList();

    public BroadleafThymeleafViewResolverExtensionManager() {
        super(BroadleafThymeleafViewResolverExtensionHandler.class);
    }

    @Override
    /**
     * Don't use this extension manager in the admin.
     */
    public List<BroadleafThymeleafViewResolverExtensionHandler> getHandlers() {
        if (BroadleafRequestContext.getBroadleafRequestContext().getAdmin()) {
            return EMPTY_LIST;
        } else {
            return super.getHandlers();
        }
    }


    /**
     * By default, this manager will allow other handlers to process the method when a handler returns
     * HANDLED.
     */
    @Override
    public boolean continueOnHandled() {
        return true;
    }
}
