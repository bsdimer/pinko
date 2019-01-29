<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<CiscoIPPhoneInput>
    <Title>Directory Search</Title>
    <Prompt>Enter search criteria</Prompt>
    <SoftKeyItem>
        <Name>Search</Name>
        <Position>1</Position>
        <URL>SoftKey:Submit</URL>
    </SoftKeyItem>
    <SoftKeyItem>
        <Name>&lt;&lt;</Name>
        <Position>2</Position>
        <URL>SoftKey:&lt;&lt;</URL>
    </SoftKeyItem>
    <SoftKeyItem>
        <Name>Cancel</Name>
        <Position>3</Position>
        <URL>SoftKey:Cancel</URL>
    </SoftKeyItem>
    <URL>${directory.proto}://${directory.hostname}:${directory.port}/ccmcip/${directory.instance}/xmldirectorylist</URL>
    <InputItem>
        <DisplayName>First Name</DisplayName>
        <QueryStringParam>f</QueryStringParam>
        <InputFlags>A</InputFlags>
        <DefaultValue></DefaultValue>
    </InputItem>
    <InputItem>
        <DisplayName>Last Name</DisplayName>
        <QueryStringParam>l</QueryStringParam>
        <InputFlags>A</InputFlags>
        <DefaultValue></DefaultValue>
    </InputItem>
    <InputItem>
        <DisplayName>Number</DisplayName>
        <QueryStringParam>n</QueryStringParam>
        <InputFlags>T</InputFlags>
        <DefaultValue></DefaultValue>
    </InputItem>
</CiscoIPPhoneInput>