<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<CiscoIPPhoneMenu>
    <Prompt>Select a directory</Prompt>
    <MenuItem>
        <Name>Personal Directory</Name>
        <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmpd/pdCheckLogin.ftl?i=${directory.instance}&name=null</URL>
    </MenuItem>
    <MenuItem>
        <Name>Corporate Directory</Name>
        <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmcip/xmldirectoryinput.ftl?i=${directory.instance}</URL>
    </MenuItem>
</CiscoIPPhoneMenu>