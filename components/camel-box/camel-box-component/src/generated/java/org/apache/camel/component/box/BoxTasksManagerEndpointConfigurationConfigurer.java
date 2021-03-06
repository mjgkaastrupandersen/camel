/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.box.BoxTasksManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BoxTasksManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessTokenCache", com.box.sdk.IAccessTokenCache.class);
        map.put("Action", com.box.sdk.BoxTask.Action.class);
        map.put("ApiName", org.apache.camel.component.box.internal.BoxApiName.class);
        map.put("AssignTo", com.box.sdk.BoxUser.class);
        map.put("AuthenticationType", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("DueAt", java.util.Date.class);
        map.put("EncryptionAlgorithm", com.box.sdk.EncryptionAlgorithm.class);
        map.put("EnterpriseId", java.lang.String.class);
        map.put("FileId", java.lang.String.class);
        map.put("HttpParams", java.util.Map.class);
        map.put("Info", com.box.sdk.BoxTask.Info.class);
        map.put("MaxCacheEntries", int.class);
        map.put("Message", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PrivateKeyFile", java.lang.String.class);
        map.put("PrivateKeyPassword", java.lang.String.class);
        map.put("PublicKeyId", java.lang.String.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("TaskAssignmentId", java.lang.String.class);
        map.put("TaskId", java.lang.String.class);
        map.put("UserId", java.lang.String.class);
        map.put("UserName", java.lang.String.class);
        map.put("UserPassword", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.box.BoxTasksManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxTasksManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": target.setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "action":
        case "Action": target.setAction(property(camelContext, com.box.sdk.BoxTask.Action.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.box.internal.BoxApiName.class, value)); return true;
        case "assignto":
        case "AssignTo": target.setAssignTo(property(camelContext, com.box.sdk.BoxUser.class, value)); return true;
        case "authenticationtype":
        case "AuthenticationType": target.setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "dueat":
        case "DueAt": target.setDueAt(property(camelContext, java.util.Date.class, value)); return true;
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": target.setEncryptionAlgorithm(property(camelContext, com.box.sdk.EncryptionAlgorithm.class, value)); return true;
        case "enterpriseid":
        case "EnterpriseId": target.setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "fileid":
        case "FileId": target.setFileId(property(camelContext, java.lang.String.class, value)); return true;
        case "httpparams":
        case "HttpParams": target.setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "info":
        case "Info": target.setInfo(property(camelContext, com.box.sdk.BoxTask.Info.class, value)); return true;
        case "maxcacheentries":
        case "MaxCacheEntries": target.setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "message":
        case "Message": target.setMessage(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeyfile":
        case "PrivateKeyFile": target.setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "PrivateKeyPassword": target.setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "PublicKeyId": target.setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "taskassignmentid":
        case "TaskAssignmentId": target.setTaskAssignmentId(property(camelContext, java.lang.String.class, value)); return true;
        case "taskid":
        case "TaskId": target.setTaskId(property(camelContext, java.lang.String.class, value)); return true;
        case "userid":
        case "UserId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "UserName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "UserPassword": target.setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": return com.box.sdk.IAccessTokenCache.class;
        case "action":
        case "Action": return com.box.sdk.BoxTask.Action.class;
        case "apiname":
        case "ApiName": return org.apache.camel.component.box.internal.BoxApiName.class;
        case "assignto":
        case "AssignTo": return com.box.sdk.BoxUser.class;
        case "authenticationtype":
        case "AuthenticationType": return java.lang.String.class;
        case "clientid":
        case "ClientId": return java.lang.String.class;
        case "clientsecret":
        case "ClientSecret": return java.lang.String.class;
        case "dueat":
        case "DueAt": return java.util.Date.class;
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": return com.box.sdk.EncryptionAlgorithm.class;
        case "enterpriseid":
        case "EnterpriseId": return java.lang.String.class;
        case "fileid":
        case "FileId": return java.lang.String.class;
        case "httpparams":
        case "HttpParams": return java.util.Map.class;
        case "info":
        case "Info": return com.box.sdk.BoxTask.Info.class;
        case "maxcacheentries":
        case "MaxCacheEntries": return int.class;
        case "message":
        case "Message": return java.lang.String.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "privatekeyfile":
        case "PrivateKeyFile": return java.lang.String.class;
        case "privatekeypassword":
        case "PrivateKeyPassword": return java.lang.String.class;
        case "publickeyid":
        case "PublicKeyId": return java.lang.String.class;
        case "sslcontextparameters":
        case "SslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "taskassignmentid":
        case "TaskAssignmentId": return java.lang.String.class;
        case "taskid":
        case "TaskId": return java.lang.String.class;
        case "userid":
        case "UserId": return java.lang.String.class;
        case "username":
        case "UserName": return java.lang.String.class;
        case "userpassword":
        case "UserPassword": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.box.BoxTasksManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxTasksManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": return target.getAccessTokenCache();
        case "action":
        case "Action": return target.getAction();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "assignto":
        case "AssignTo": return target.getAssignTo();
        case "authenticationtype":
        case "AuthenticationType": return target.getAuthenticationType();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "dueat":
        case "DueAt": return target.getDueAt();
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": return target.getEncryptionAlgorithm();
        case "enterpriseid":
        case "EnterpriseId": return target.getEnterpriseId();
        case "fileid":
        case "FileId": return target.getFileId();
        case "httpparams":
        case "HttpParams": return target.getHttpParams();
        case "info":
        case "Info": return target.getInfo();
        case "maxcacheentries":
        case "MaxCacheEntries": return target.getMaxCacheEntries();
        case "message":
        case "Message": return target.getMessage();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "privatekeyfile":
        case "PrivateKeyFile": return target.getPrivateKeyFile();
        case "privatekeypassword":
        case "PrivateKeyPassword": return target.getPrivateKeyPassword();
        case "publickeyid":
        case "PublicKeyId": return target.getPublicKeyId();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        case "taskassignmentid":
        case "TaskAssignmentId": return target.getTaskAssignmentId();
        case "taskid":
        case "TaskId": return target.getTaskId();
        case "userid":
        case "UserId": return target.getUserId();
        case "username":
        case "UserName": return target.getUserName();
        case "userpassword":
        case "UserPassword": return target.getUserPassword();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpparams":
        case "HttpParams": return java.lang.Object.class;
        default: return null;
        }
    }
}

