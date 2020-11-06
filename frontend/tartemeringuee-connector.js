import consentUI from "tartemeringuee/consent-ui";
import consentManager from "tartemeringuee/consent-manager";
import getTextEN from "tartemeringuee/lang/en";
import getTextFR from "tartemeringuee/lang/fr";

import gtag from "tartemeringuee/services/gtag";
import yandex from "tartemeringuee/services/yandex";

consentManager()
    .register( gtag( 'UA-XXXXXX-1' ) )
    .register( yandex( {
        id:                  999999999,
        clickmap:            true,
        trackLinks:          true,
        accurateTrackBounce: true,
        webvisor:            true
    } ) )
    .setUI( consentUI( {
        'getText': (document.documentElement.getAttribute( 'lang' ) === 'en-US')
            ? getTextEN( { 'privacyURL': '/en/legal-notices/' } )
            : getTextFR( { 'privacyURL': '/fr/mentions-legales/' } )
    } ) )
    .launch();