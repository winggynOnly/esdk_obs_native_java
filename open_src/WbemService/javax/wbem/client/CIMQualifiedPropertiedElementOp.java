/*
 *EXHIBIT A - Sun Industry Standards Source License
 *
 *"The contents of this file are subject to the Sun Industry
 *Standards Source License Version 1.2 (the "License");
 *You may not use this file except in compliance with the
 *License. You may obtain a copy of the 
 *License at http://wbemservices.sourceforge.net/license.html
 *
 *Software distributed under the License is distributed on
 *an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either
 *express or implied. See the License for the specific
 *language governing rights and limitations under the License.
 *
 *The Original Code is WBEM Services.
 *
 *The Initial Developer of the Original Code is:
 *Sun Microsystems, Inc.
 *
 *Portions created by: Sun Microsystems, Inc.
 *are Copyright (c) 2001 Sun Microsystems, Inc.
 *
 *All Rights Reserved.
 *
 *Contributor(s): Brian Schlosser
*/

package javax.wbem.client;

import javax.wbem.cim.CIMObjectPath;

abstract public class CIMQualifiedPropertiedElementOp extends CIMElementOp {

    private final boolean includeQualifier;
    private final String[] propertyList;

    public CIMQualifiedPropertiedElementOp(CIMObjectPath objectPath, 
                                 boolean includeQualifier, 
                                 String[] propertyList) {
        super(objectPath);
        this.includeQualifier = includeQualifier;
        this.propertyList     = propertyList;
    }

    public boolean isQualifiersIncluded() {
        return includeQualifier;
    }

    public String[] getPropertyList() {
        return propertyList;
    }
}
