/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.digitalocean;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DigitalOceanEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DigitalOceanEndpoint target = (DigitalOceanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "digitaloceanclient":
        case "digitalOceanClient": target.getConfiguration().setDigitalOceanClient(property(camelContext, com.myjeeva.digitalocean.impl.DigitalOceanClient.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.getConfiguration().setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.getConfiguration().setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.getConfiguration().setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyuser":
        case "httpProxyUser": target.getConfiguration().setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oauthtoken":
        case "oAuthToken": target.getConfiguration().setOAuthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "page": target.getConfiguration().setPage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "perpage":
        case "perPage": target.getConfiguration().setPerPage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "resource": target.getConfiguration().setResource(property(camelContext, org.apache.camel.component.digitalocean.constants.DigitalOceanResources.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
