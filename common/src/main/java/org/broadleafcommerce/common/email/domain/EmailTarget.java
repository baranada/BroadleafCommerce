/*
 * #%L
 * BroadleafCommerce Common Libraries
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
package org.broadleafcommerce.common.email.domain;

import java.io.Serializable;

/**
 * The EmailTarget interface is used to specify the recipients of the email.
 *
 * @see EmailTargetImpl
 * @author bpolster
 */
public interface EmailTarget extends Serializable {

    public String getEmailAddress();
    public void setEmailAddress(String emailAddress);
    public String[] getCCAddresses();
    public void setCCAddresses(String[] ccAddresses);
    public String[] getBCCAddresses();
    public void setBCCAddresses(String[] BCCAddresses);

}
