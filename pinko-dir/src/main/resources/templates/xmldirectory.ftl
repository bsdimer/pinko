<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<CiscoIPPhoneMenu>
    <Prompt>Select a directory</Prompt>
    <#--<MenuItem>
        <Name>Bertrange Personal Directory</Name>
        <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmpd/pdCheckLogin.do?name=null</URL>
    </MenuItem>-->
    <MenuItem>
        <Name>${directory.instance?capitalize} Corporate Directory</Name>
        <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmcip/${directory.instance}/xmldirectoryinput</URL>
    </MenuItem>
</CiscoIPPhoneMenu>