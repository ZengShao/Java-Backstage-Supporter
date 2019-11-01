package com.zking.test.shiro;

import org.apache.shiro.authc.HostAuthenticationToken;
import org.apache.shiro.authc.RememberMeAuthenticationToken;

public class AdminToken implements HostAuthenticationToken, RememberMeAuthenticationToken{
    private String adminName;
    private char[] adminPassword;
    private boolean rememberMe;
    private String host;

    public AdminToken() {
        this.rememberMe = false;
    }

    public AdminToken(String adminName, char[] adminPassword) {
        this(adminName, (char[])adminPassword, false, (String)null);
    }

    public AdminToken(String adminName, String adminPassword) {
        this(adminName, (char[])(adminPassword != null ? adminPassword.toCharArray() : null), false, (String)null);
    }

    public AdminToken(String adminName, char[] adminPassword, String host) {
        this(adminName, adminPassword, false, host);
    }

    public AdminToken(String adminName, String adminPassword, String host) {
        this(adminName, adminPassword != null ? adminPassword.toCharArray() : null, false, host);
    }

    public AdminToken(String adminName, char[] adminPassword, boolean rememberMe) {
        this(adminName, (char[])adminPassword, rememberMe, (String)null);
    }

    public AdminToken(String adminName, String adminPassword, boolean rememberMe) {
        this(adminName, (char[])(adminPassword != null ? adminPassword.toCharArray() : null), rememberMe, (String)null);
    }

    public AdminToken(String adminName, char[] adminPassword, boolean rememberMe, String host) {
        this.rememberMe = false;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.rememberMe = rememberMe;
        this.host = host;
    }

    public AdminToken(String adminName, String adminPassword, boolean rememberMe, String host) {
        this(adminName, adminPassword != null ? adminPassword.toCharArray() : null, rememberMe, host);
    }

    public String getAdminName() {
        return this.adminName;
    }

    public void setAdminName(String username) {
        this.adminName = adminName;
    }

    public char[] getAdminPassword() {
        return this.adminPassword;
    }

    public void setPassword(char[] password) {
        this.adminPassword = adminPassword;
    }

    public Object getPrincipal() {
        return this.getAdminName();
    }

    public Object getCredentials() {
        return this.getAdminPassword();
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isRememberMe() {
        return this.rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public void clear() {
        this.adminName = null;
        this.host = null;
        this.rememberMe = false;
        if (this.adminPassword != null) {
            for(int i = 0; i < this.adminPassword.length; ++i) {
                this.adminPassword[i] = 0;
            }

            this.adminPassword = null;
        }

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(" - ");
        sb.append(this.adminName);
        sb.append(", rememberMe=").append(this.rememberMe);
        if (this.host != null) {
            sb.append(" (").append(this.host).append(")");
        }

        return sb.toString();
    }
}
