# XNAT 1.7 LDAP Plugin #

This is a small plugin for XNAT 1.7 which provides properties files for ldap/localdb login credentials.

You can either configure the ldap1-provider.properties file [manually](https://wiki.xnat.org/display/XNAT16/Services.Properties+Configuration)
or you set the values from the commandline.


# Building #

To build the LDAP plugin:

1. If you haven't already, clone this repository and cd to the newly cloned folder.
1. Build the plugin: `./gradlew jar` (on Windows, you can use the batch file: `gradlew.bat jar`). This should build the plugin in the file **build/libs/LdapBiomedia-1.0.0.jar** (the version may differ based on updates to the code). You can configure the property file's parameters like so `./gradlew clean jar -Ppassword=secret -Paddress="ldap://ldapurl:389/dc=my,dc=domain" -Puserdn="cn=MyServiceAccount,ou=MyGroup,dc=my,dc=domain" -Psearch.filter="(uid={0})" -Psearch.base=""`
1. Copy the plugin jar to your plugins folder: `cp build/libs/LdapBiomedia-1.0.0.jar /data/xnat/home/plugins`

# Deploying #

Deploying your XNAT plugin just requires copying it to the **plugins** folder for your XNAT installation. 
Once you've copied the plugin jar into your XNAT's **plugins** folder, you need to restart the Tomcat server. Your new plugin will be available as soon as the restart and initialization process is completed.

