/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for the postMultipleParameterGroups operation.
 */
public class SecondParameterGroup {
    /**
     * The headerTwo property.
     */
    @JsonProperty(value = "")
    private String headerTwo;

    /**
     * Query parameter with default
     */
    @JsonProperty(value = "")
    private Integer queryTwo;

    /**
     * Get the headerTwo value.
     *
     * @return the headerTwo value
     */ 
    public String getHeaderTwo() {
        return this.headerTwo;
    }

    /**
     * Set the headerTwo value.
     *
     * @param headerTwo the headerTwo value to set
     */
    public void setHeaderTwo(String headerTwo) {
        this.headerTwo = headerTwo;
    }

    /**
     * Get the queryTwo value.
     *
     * @return the queryTwo value
     */ 
    public Integer getQueryTwo() {
        return this.queryTwo;
    }

    /**
     * Set the queryTwo value.
     *
     * @param queryTwo the queryTwo value to set
     */
    public void setQueryTwo(Integer queryTwo) {
        this.queryTwo = queryTwo;
    }

}
