package com.cyber.myapplication;

public class Constants {
    public static final String OVPN_CONFIG = "client\n" +
            "proto udp\n" +
            "remote de1.vpnocean.net 1194\n" +
            "dev tun\n" +
            "resolv-retry infinite\n" +
            "nobind\n" +
            "persist-key\n" +
            "persist-tun\n" +
            "remote-cert-tls server\n" +
            "verify-x509-name server_QjudxgY3Ilz1fsof name\n" +
            "auth SHA256\n" +
            "auth-nocache\n" +
            "cipher AES-128-GCM\n" +
            "tls-client\n" +
            "tls-version-min 1.2\n" +
            "tls-cipher TLS-ECDHE-ECDSA-WITH-AES-128-GCM-SHA256\n" +
            "ignore-unknown-option block-outside-dns\n" +
            "setenv opt block-outside-dns # Prevent Windows 10 DNS leak\n" +
            "verb 3\n" +
            "<ca>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIB1zCCAX2gAwIBAgIUQssxJheBm1z3GaSsQBUd80HWEBswCgYIKoZIzj0EAwIw\n" +
            "HjEcMBoGA1UEAwwTY25fSktpQ1o1Qk5qWDFadlJtcjAeFw0yMzA5MTEwNDMzNDJa\n" +
            "Fw0zMzA5MDgwNDMzNDJaMB4xHDAaBgNVBAMME2NuX0pLaUNaNUJOalgxWnZSbXIw\n" +
            "WTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAATnS1ZOuxFhocteDZdrgQOYibKsWTMJ\n" +
            "AHe8zlyl0h4HLAUzhCtAirdyc3Os5LKfqCyyiL0RVeu8P/vliL3hFK0Ao4GYMIGV\n" +
            "MB0GA1UdDgQWBBT8S4NJPwXX4Vp6uY16lqNLb0nwZDBZBgNVHSMEUjBQgBT8S4NJ\n" +
            "PwXX4Vp6uY16lqNLb0nwZKEipCAwHjEcMBoGA1UEAwwTY25fSktpQ1o1Qk5qWDFa\n" +
            "dlJtcoIUQssxJheBm1z3GaSsQBUd80HWEBswDAYDVR0TBAUwAwEB/zALBgNVHQ8E\n" +
            "BAMCAQYwCgYIKoZIzj0EAwIDSAAwRQIgXqRwrWPQ6EH+2yTftFwNeHV6y2Tpni7v\n" +
            "hoUnBiwmgDACIQDkat9BT1f6ilVi/UY50aNlWjVdbUoFbdN3mUMb51o9Ug==\n" +
            "-----END CERTIFICATE-----\n" +
            "</ca>\n" +
            "<cert>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIB3TCCAYOgAwIBAgIRAOC9S/fghvMNDl0HqtxxqgMwCgYIKoZIzj0EAwIwHjEc\n" +
            "MBoGA1UEAwwTY25fSktpQ1o1Qk5qWDFadlJtcjAeFw0yMzEyMDMwMDAxMDJaFw0y\n" +
            "NjAzMDcwMDAxMDJaMBUxEzARBgNVBAMMCjIwMjMtMTItMTAwWTATBgcqhkjOPQIB\n" +
            "BggqhkjOPQMBBwNCAASZzwA6QTzEwbcsuu91sxND8fM67P7/BDjX8dJ7ZS568SvI\n" +
            "U/29MoyKNqYeevo3kBFqoTeuhg23tDnQ6xscagXto4GqMIGnMAkGA1UdEwQCMAAw\n" +
            "HQYDVR0OBBYEFLKqSxx4m+6bFHtYEiJ6wtNbPzs3MFkGA1UdIwRSMFCAFPxLg0k/\n" +
            "BdfhWnq5jXqWo0tvSfBkoSKkIDAeMRwwGgYDVQQDDBNjbl9KS2lDWjVCTmpYMVp2\n" +
            "Um1yghRCyzEmF4GbXPcZpKxAFR3zQdYQGzATBgNVHSUEDDAKBggrBgEFBQcDAjAL\n" +
            "BgNVHQ8EBAMCB4AwCgYIKoZIzj0EAwIDSAAwRQIhANGLWdXnZUV5ZBZ91si6woCa\n" +
            "eSWp3MzKevhHPVfX3kQFAiAu1ghekzXfDLmRH9jCIgWOss6xCdD0pgPscFTNMHjC\n" +
            "QA==\n" +
            "-----END CERTIFICATE-----\n" +
            "</cert>\n" +
            "<key>\n" +
            "-----BEGIN PRIVATE KEY-----\n" +
            "MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQg9MgD9lizPGfoWyZx\n" +
            "zp/OvLXMJybErH4OKrkp3m/y7Z6hRANCAASZzwA6QTzEwbcsuu91sxND8fM67P7/\n" +
            "BDjX8dJ7ZS568SvIU/29MoyKNqYeevo3kBFqoTeuhg23tDnQ6xscagXt\n" +
            "-----END PRIVATE KEY-----\n" +
            "</key>\n" +
            "<tls-crypt>\n" +
            "#\n" +
            "# 2048 bit OpenVPN static key\n" +
            "#\n" +
            "-----BEGIN OpenVPN Static key V1-----\n" +
            "72f327345378647f84be35abef3914d3\n" +
            "892d875c14f835da5614385a3ac4e82b\n" +
            "784eb606fbc9a096f73050cf302bdbd0\n" +
            "059f37ce24d0e02ee0a92c61da2a648c\n" +
            "d17c5d91f426fe73b6642355be1c4b6b\n" +
            "0becc73afc9655c51b6e6824c35bb8d0\n" +
            "4176a385215166b25e6d938f5d1f62b2\n" +
            "be3420364b5819f95559ad69cac3a5c0\n" +
            "528da393343e3818535bc042b492cbfa\n" +
            "7cedd10cc83aa2dd45e286dbd07c3a5f\n" +
            "410a8ba99118cd1c13b4206aff66eb1a\n" +
            "e5556196fad8e3cd6a69c58cc3403e7f\n" +
            "b4cc1feabf206ef74ab2973fbda39fd9\n" +
            "79dc583bb82a05497eed9ea500d3a044\n" +
            "f4c3be389bc04a60f2c2c66cfb2be56b\n" +
            "9655178afd3d9d7545a8244ff8dc1b69\n" +
            "-----END OpenVPN Static key V1-----\n" +
            "</tls-crypt>";
}
