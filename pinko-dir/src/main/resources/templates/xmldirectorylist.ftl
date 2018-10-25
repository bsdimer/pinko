<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<CiscoIPPhoneDirectory>
    <Prompt>Records ${page.start} to ${page.end} of ${page.size}</Prompt>
    <SoftKeyItem>
        <Name>Dial</Name>
        <Position>1</Position>
        <URL>SoftKey:Dial</URL>
    </SoftKeyItem>
    <SoftKeyItem>
        <Name>EditDial</Name>
        <Position>2</Position>
        <URL>SoftKey:EditDial</URL>
    </SoftKeyItem>
    <SoftKeyItem>
        <Name>Exit</Name>
        <Position>3</Position>
        <URL>SoftKey:Exit</URL>
    </SoftKeyItem>
    <SoftKeyItem>
        <Name>Next</Name>
        <Position>4</Position>
        <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmcip/xmldirectorylist.ftl?l=&amp;f=&amp;n=&amp;start=32</URL>
    </SoftKeyItem>
    <SoftKeyItem>
        <Name>Search</Name>
        <Position>5</Position>
        <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmcip/xmldirectoryinput.ftl?l=&amp;f=&amp;n=</URL>
    </SoftKeyItem>
<#list page.content as c>
    <DirectoryEntry>
        <Name>${c.sn!}, ${c.givenName!}</Name>
        <Telephone>${c.telephoneNumber!}</Telephone>
    </DirectoryEntry>
</#list>
</CiscoIPPhoneDirectory>