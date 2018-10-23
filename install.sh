docker run \
 --env LDAP_ORGANISATION="Secal" \
 --env LDAP_DOMAIN="secal.fr" \
 --env LDAP_ADMIN_PASSWORD="P@ssp0rt" \
 -p 389:389/tcp \
 -p 636:636/tcp \
 --detach osixia/openldap:1.2.2
