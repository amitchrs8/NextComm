
package basic;

import java.util.HashMap;

/**
 * @author rsriniv1
 */

public enum CounterType {
    
    NE_ES("ne-es"),               // D="Near End Error Seconds" L="ne-es" 
    NE_SES("ne-ses"),              // D="Near End Severe Error Second" L="ne-ses"
    NE_UAS("ne-uas"),             // D="Near End Unavailable Seconds"
    NE_BBE("ne-bbe"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODUSLOT  ("ne-bbe-oduslot"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU1     ("ne-bbe-odu1"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU2     ("ne-bbe-odu2"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU2E    ("ne-bbe-odu2e"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU2F    ("ne-bbe-odu2f"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU3     ("ne-bbe-odu3"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU3E    ("ne-bbe-odu3e"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_OTU1     ("ne-bbe-otu1"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_OTU2     ("ne-bbe-otu2"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_OTU2E    ("ne-bbe-otu2e"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_OTU2F    ("ne-bbe-otu2f"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_OTU2X    ("ne-bbe-otu2x"),              // D="Near End Background Block Error for otu2x"
    NE_BBE_OTU3     ("ne-bbe-otu3"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_OTU3E    ("ne-bbe-otu3e"),              // D="Near End Background Block Error" L="ne-bbe"
    NE_BBE_ODU4		("ne-bbe-odu4"),  			// D="Near End Background Block Error for odu4"
    NE_BBE_OTU4		("ne-bbe-otu4"),			// D="Near End Background Block Error for otu4"
    
    FE_ES("fe-es"),           // D="Far End Error Second"  L="fe-es"
    FE_SES("fe-ses"),          // D="Far End Severe Error Second"  L="fe-ses"
    FE_UAS("fe-uas"),          // D="Far End Unavailable Seconds"
    FE_BBE("fe-bbe"),              // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODUSLOT  ("fe-bbe-oduslot"),            // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODU1     ("fe-bbe-odu1"),               // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODU2     ("fe-bbe-odu2"),               // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODU2E    ("fe-bbe-odu2e"),              // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODU2F    ("fe-bbe-odu2f"),              // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODU3     ("fe-bbe-odu3"),               // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_ODU3E    ("fe-bbe-odu3e"),              // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_OTU1     ("fe-bbe-otu1"),               // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_OTU2     ("fe-bbe-otu2"),               // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_OTU2E    ("fe-bbe-otu2e"),              // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_OTU2F    ("fe-bbe-otu2f"),              // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_OTU2X    ("fe-bbe-otu2x"),              // D="Far End Background Block Error for otu2x"
    FE_BBE_OTU3     ("fe-bbe-otu3"),               // D="Far End  Background Block Error"  L="fe-bbe"
    FE_BBE_OTU3E    ("fe-bbe-otu3e"),              // D="Far End  Background Block Error"  L="fe-bbe"
	FE_BBE_OTU4     ("fe-bbe-otu4"),// D="Far End Background Block Error for otu4"
	FE_BBE_ODU4		("fe-bbe-odu4"), // D="Far End Background Block Error for odu4"

	CE("ce"),               // D="Corrected Errors" L="ce"
    CE_OTU1("ce-otu1"),     // D="Corrected Errors for otu1"
    CE_OTU2("ce-otu2"),     // D="Corrected Errors for otu2"
    CE_OTU2E("ce-otu2e"),   // D="Corrected Errors for otu2e"
    CE_OTU2F("ce-otu2f"),   // D="Corrected Errors for otu2f"
    CE_OTU2X("ce-otu2x"),   // D="Corrected Errors for otu2x"
    CE_OTU3("ce-otu3"),     // D="Corrected Errors for otu3"
    CE_OTU3E("ce-otu3e"),   // D="Corrected Errors for otu3e"
    CE_OTU4("ce-otu4"),     // D="Corrected Errors for otu4"
    
    OFS("ofs"),                 // D="Out Of Frame Seconds" L="ofs"
    UAS("uas"),                 // D="Unavailable Seconds" L="uas"
    RX_BAD_OCTET("rx-bad-octet"),        // D="Receiver Bad Octet"  L="rx-bad-octet"
    CRC_ERR("crc-err"),         // D="Receiver CRC Error"  L="crc-err"
    TX_BAD_OCTET("tx-bad-octet"),        // D="Transmitter Bad Octet"  L="tx-bad-octet"
    TX_CRC_ERR("tx-crc-err"),      // D="Transmitter CRC Error"  L="tx-crc-err"
    RX_POWER_MIN("rx-power-min"),        // D="Receiver Power Min "  L="rx-power-min(acc.10 dbm)"
    RX_POWER_MAX("rx-power-max"),        // D="Receiver Power Max "  L="rx-power-max(acc.10 dbm)"
    TX_POWER_MIN("tx-power-min"),         // D="Transmitter Power Min"  L="tx-power-min(acc.10 dbm)"
    TX_POWER_MAX("tx-power-max"),        // D="Transmitter Power Max"  L="tx-power-max(acc.10 dbm)"
    ACTUAL_SPAN_LOSS_MIN("actual-span-loss-min-acc-0.1dbm"), // D="Actual span Loss Min (0.1 dbm Accurancy)" L="actual-span-loss-min-acc-0.1dbm"
    ACTUAL_SPAN_LOSS_MAX("actual-span-loss-max-acc-0.1dbm"), // D="Actual span Loss Max (0.1 dbm Accurancy)" L="actual-span-loss-max-acc-0.1dbm"
    PRBS("prbs"),                 //D="PRBS Errors"
	PRBS_OUT_OF_SYNC_SEC("prbs-out-of-sync"), //D="Time(sec) PRBS is out of sync"
    
    PCS_NE_ES("pcs-ne-es"),           // D="PCS Near End Error Seconds" L="pcs-ne-es"
    PCS_NE_SES("pcs-ne-ses"),          // D="PCS Near End Severe Error Seconds" L="pcs-ne-ses"
    PCS_NE_BBE("pvs-ne-bbe"),          // D="PCS Near End Background Block Error" L="pcs-ne-bbe"
    PCS_ERRORED_BLOCK("pcs-errored-block"),   // D="PCS Errored Block"     L="pcs-errored-block"
    PCS_UAS("pcs-uas"),             // D= "PCS Unavailable Seconds" L="pcs-uas"
    
    GFP_NE_ES("gfp-ne-es"),           // D="GFP Near End Error Seconds" L="gfp-ne-es"
    GFP_NE_SES("gfp-ne-ses"),          // D="GFP Near End Severe Error Seconds" L="gfp-ne-ses"
    GFP_NE_BBE("gfp-ne-bbe"),          // D="GFP Near End Background Block Error" L="gfp-ne-bbe"
    GFP_UAS("gfp-uas"),          // D="GFP Unavailable Seconds" L="gfp-uas"
    GFP_T_HEC_UCE("gfp-thec-uce"),       // D="GFP T Hec UCE" L= "gfp-thec-uce"
    GFP_T_HEC_CCE("gfp-thec-cce"),       // D="GFP T Hec CCe" L="gfp-thec-cce"
    GFP_C_HEC_CE("gfp-chec-ce"),        // D="GFP C Hec CE" L="gfp-chec-ce"
    GFP_RX_VALID_CDF("gfp-rx-valid-cdf"),    //D="GFP Rx Valid CDF" L="gfp-rx-valid-cdf"
    GFP_TX_CDF("gfp-tx-cdf"),          //D="GFP Tx CDF" L="gfp-tx-cdf"
    GFP_DISCARDED_FRAMES("gfp-discarded-frames"),//D="GFP Discarded Frames" L="gfp-discarded-frames"
    GFP_FCS_ERR("gfp-fcs-err"),         //D="GFP FCS Errors"     L="gfp-fcs-err"
    GFP_TX_BYTE("gfp-tx-bytes"),         //D="GFP Tx Bytes"       L= "gfp-tx-bytes"
    GFP_RX_BYTE("gfp-rx-bytes"),         //D="GFP Rx Bytes"       L= "gfp-rx-bytes"
    
    ETH_RX_OCTETS("eth-rx-octets"),                         //D="ETH Rx Octets"   L="eth-rx-octets"
    ETH_RX_BAD_OCTETS("eth-rx-bad-octets"),                     //D="ETH Rx Bad Octets" L="eth-rx-bad-octets" 
    ETH_RX_FRAMES("eth-rx-frames"),                         //D="ETH Rx Frames" L="eth-rx-frames"
    ETH_RX_GOOD_FRAMES("eth-rx-good-frames"),                    //D="ETH Rx Good Frames" L="eth-rx-good-frames"
    ETH_RX_BRDCST_FRAMES("eth-rx-brdcst-frames"),                  //D="ETH Rx Broadcast Frames" L="eth-rx-brdcst-frames"
    ETH_RX_MLCST_FRAMES("eth-rx-mlcst-frames"),                   //D="ETH Rx Multicast Frames" L="eth-rx-mlcst-frames"
    ETH_RX_BAD_FRAMES("eth-rx-bad-frames"),              //D="ETH Rx Bad Frames"
    ETH_RX_UNDER_SIZE_ERRORS_FRAMES("eth-rx-undersize-errors-frames"),       //D="ETH Rx Undersize Errors  Frames" L="eth-rx-undersize-errors-frames"
    ETH_RX_OVERSIZE_FRAMES("eth-rx-oversize-errors-frames"),                //D="ETH Rx Oversize Errors  Frames" L="eth-rx-oversize-errors-frames"
    ETH_RX_FRAGMENTS_FRAMES("eth-rx-fragments-frames"),               //D="ETH Rx Fragments  Frames" L="eth-rx-fragments-frames"
    ETH_RX_PAUSES_FRAMES("eth-rx-pauses-frames"),                  //D="ETH Rx Pauses  Frames" L="eth-rx-pauses-frames"
    ETH_RX_64_OCTETS("eth-rx-64-octets"),                      //D="ETH Rx 64 Octets" L="eth-rx-64-octets"
    ETH_RX_65_TO_127_OCTETS("eth-rx-65-to-127-octets"),               //D="ETH Rx 65 To 127 Octets" L="eth-rx-65-to-127-octets"
    ETH_RX_128_TO_255_OCTETS("eth-rx-128-to-255-octets"),              //D="ETH Rx 128 To 255 Octets" L="eth-rx-128-to-255-octets"
    ETH_RX_256_TO_511_OCTETS("eth-rx-256-to-511-octets"),              //D="ETH Rx 256 To 511 Octets" L="eth-rx-256-to-511-octets"
    ETH_RX_512_TO_1023_OCTETS("eth-rx-512-to-1023-octets"),             //D="ETH Rx 512 To 1023 Octets" L="eth-rx-512-to-1023-octets"
    ETH_RX_1024_TO_1518_OCTETS("eth-rx-1024-to-1518-octets"),            //D="ETH Rx 1024 To 1518 Octets" L="eth-rx-1024-to-1518-octets"
    ETH_RX_1519_TO_MAX_FRAME_SIZE_OCTETS("eth-rx-1519-to-max-frame-size-octets"),  //D="ETH Rx 1519 To Max Frame Size Octets" L="eth-rx-1519-to-max-frame-size-octets"
    ETH_RX_OAM_FRAMES("eth-rx-oam-frames"),                     //D="ETH Rx OAM Frames"   L="eth-rx-oam-frames"
    ETH_RX_MLCST_FRAMES_OK("ETH Rx Multicast Frames"),  	//D="ETH Rx Multicast Frames"
    ETH_TX_MLCST_FRAMES_OK("ETH Tx Multicast Frames"),  	//D="ETH Tx Multicast Frames"
    ETH_TX_GOOD_OCTETS("eth-tx-good-octets-frames"),                    //D="ETH Tx Good Octets Frames"   L="eth-tx-good-octets-frames"
    ETH_TX_OCTETS("eth-tx-octets-frames"),                    //D="ETH Tx Octets Frames"
    ETH_TX_BAD_OCTETS("eth-tx-bad-octets"),                     //D="ETH Tx Bad Octets" L="eth-tx-bad-octets" 
    ETH_TX_FRAMES("eth-tx-frames"),                         //D="ETH Tx Frames" L="eth-tx-frames"
    ETH_TX_GOOD_FRAMES("eth-tx-good-frames"),                    //D="ETH Tx Good Frames" L="eth-tx-good-frames"
    ETH_TX_BRDCST_FRAMES("eth-tx-brdcst-frames"),                  //D="ETH Tx Broadcast Frames" L="eth-tx-brdcst-frames"
    ETH_TX_MLCST_FRAMES("eth-tx-mlcst-frames"),                   //D="ETH Tx Multicast Frames" L="eth-tx-mlcst-frames"
    ETH_TX_BAD_FRAMES("eth-tx-bad-frames"),              //D="ETH Tx Bad  Frames"  
    ETH_TX_UNDER_SIZE_ERRORS_FRAMES("eth-tx-undersize-errors-frames"),       //D="ETH Tx Undersize Errors  Frames" L="eth-tx-undersize-errors-frames"
    ETH_TX_OVERSIZE_FRAMES("eth-tx-oversize-errors-frames"),                //D="ETH Tx Oversize Errors  Frames" L="eth-tx-oversize-errors-frames"
    ETH_TX_FRAGMENTS_FRAMES("eth-tx-fragments-frames"),               //D="ETH Tx Fragments  Frames" L="eth-tx-fragments-frames"
    ETH_TX_PAUSES_FRAMES("eth-tx-pauses-frames"),                  //D="ETH Tx Pauses  Frames" L="eth-tx-pauses-frames"
    ETH_TX_64_OCTETS("eth-tx-64-octets"),                      //D="ETH Tx 64 Octets" L="eth-tx-64-octets"
    ETH_TX_65_TO_127_OCTETS("eth-tx-65-to-127-octets"),               //D="ETH Tx 65 To 127 Octets" L="eth-tx-65-to-127-octets"
    ETH_TX_128_TO_255_OCTETS("eth-tx-128-to-255-octets"),              //D="ETH Tx 128 To 255 Octets" L="eth-tx-128-to-255-octets"
    ETH_TX_256_TO_511_OCTETS("eth-tx-256-to-511-octets"),              //D="ETH Tx 256 To 511 Octets" L="eth-tx-256-to-511-octets"
    ETH_TX_512_TO_1023_OCTETS("eth-tx-512-to-1023-octets"),             //D="ETH Tx 512 To 1023 Octets" L="eth-tx-512-to-1023-octets"
    ETH_TX_1024_TO_1518_OCTETS("eth-tx-1024-to-1518-octets"),            //D="ETH Tx 1024 To 1518 Octets" L="eth-tx-1024-to-1518-octets"
    ETH_TX_1519_TO_MAX_FRAME_SIZE_OCTETS("eth-tx-1519-to-max-frame-size-octets"),  //D="ETH Tx 1519 To Max Frame Size Octets" L="eth-tx-1519-to-max-frame-size-octets"
    ETH_TX_OAM_FRAMES("eth-tx-oam-frames"),                     //D="ETH Tx OAM Frames"   L="eth-tx-oam-frames"
    ETH_RX_BUFFER_OVERFLOW("eth-rx-buffer-overflow"),               //D="ETH Rx Buffer Overflow" L="eth-rx-buffer-overflow"
    OSC_RX_GOOD_OCTETS("osc-rx-good-octets"),         //D="OSC Rx Good Octets"
    OSC_RX_BAD_OCTETS("osc-rx-bad-octets"),          //D="OSC Rx Bad Octets"
    OSC_TX_OCTETS("osc-tx-octets"),              //D="OSC Tx Octets"
    OSC_RX_GOOD_FRAMES("osc-rx-good-frames"),         //D="OSC Rx Good Frames"
    OSC_RX_BAD_FRAMES("osc-rx-bad-frames"),          //D="OSC Rx Bad Frames"
    OSC_TX_FRAMES("osc-tx-frames"),              //D="OSC Tx Frames"
    OSC_LINE_ERRORS("osc-line-errors"),              //D="OSC CRC Errors"
    ETH_LINK_DOWN_SECONDS("eth-link-down-seconds"),
    NE_CV("ne-cv"),                      //D="Near End Code Violation"
    TSE("tse"),            // D="Test Sequence Error"
    TSE_ODUSLOT("tse-oduslot"),    // D="Test Sequence Error for odu slot"
    TSE_ODU1("tse-odu1"),       // D="Test Sequence Error for odu1"
    TSE_ODU2("tse-odu2"),       // D="Test Sequence Error for odu2"
    TSE_ODU2E("tse-odu2e"),      // D="Test Sequence Error for odu2e"
    TSE_ODU2F("tse-odu2f"),      // D="Test Sequence Error for odu2f"
    TSE_ODU3("tse-odu3"),      // D="Test Sequence Error for odu2f"
    TSE_ODU3E("tse-odu3e"),      // D="Test Sequence Error for odu3e"
    TSE_ODU4("tse-odu4"),       // D="Test Sequence Error for odu4"
    
    PCS_TEST_PATTERN_ERROR("pcs-test-pattern-error"),    // D="PCS Test Pattern Error"
      
    OSC_MON_RX_POWER_MIN("osc-monitor-rx-power-min-acc-0.1dbm"),// D="Osc Monitor Receiver Power Min (0.1 dbm Accurancy)"  L="osc-monitor-rx-power-min-acc-0.1dbm"
    OSC_MON_RX_POWER_MAX("osc-monitor-rx-power-max-acc-0.1dbm"),// D="Osc Monitor Receiver Power Max (0.1 dbm Accurancy)"  L="osc-monitor-rx-power-max-acc-0.1dbm"
    OSC_MON_TX_POWER_MIN("osc-monitor-tx-power-min-acc-0.1dbm"),// D="Osc Monitor Transmitter Power Min (0.1 dbm Accurancy)"  L="osc-monitor-tx-power-min-acc-0.1dbm"
    OSC_MON_TX_POWER_MAX("osc-monitor-tx-power-max-acc-0.1dbm"),// D="Osc Monitor Transmitter Power Max (0.1 dbm Accurancy)"  L="osc-monitor-tx-power-max-acc-0.1dbm"
    
	PCS_BIP8_ERRORS("pcs-bip8-errors"),   // D="PCS BIP8 Errors"
	DGD_MAX("dgd-max-acc-1ps"),   // D="Differential Group Delay Max (1ps Accuracy)" L="dgd-max-acc-1ps"
	DGD_MIN("dgd-min-acc-1ps"),   // D="Differential Group Delay Min (1ps Accuracy)" L="dgd-min-acc-1ps"
	CD_MAX("cd-max-acc-10ps/nm"),    // D="Chromatic Dispersion Max (10ps/nm Accuracy)" L="cd-max-acc-10ps/nm"
	CD_MIN("cd-min-acc-10ps/nm"),    // D="Chromatic Dispersion Min (10ps/nm Accuracy)" L="cd-min-acc-10ps/nm"

	
	NULL_PROFILE("null-profile"),

	NE_BBE_ODU0		("ne-bbe-odu0"),				 //   D="Near End Background Block Error for odu0"

	NE_BBE_ODUF_SDI3G ("ne-bbe-oduf-sdi3g"),     // D="Near End Background Block Error for odu-sdi3g"                  
    NE_BBE_ODUF_SDI3G_NA ("ne-bbe-oduf-sdi3g-na"),  // D="Near End Background Block Error for odu-sdi3g-na"               
    NE_BBE_ODUF_FC400    ("ne-bbe-oduf-fc400"), // D="Near End Background Block Error for odu-fc400"                  
    NE_BBE_ODUF_FC800     ("ne-bbe-oduf-fc800"),// D="Near End Background Block Error for odu-fc800"
    
    FE_BBE_ODU0		("fe-bbe-odu0")				,				// D="Far End Background Block Error for odu0"  
	
    FE_BBE_ODUF_SDI3G ("fe-bbe-oduf-sdi3g"),     // D="far End Background Block Error for odu-sdi3g"                  
    FE_BBE_ODUF_SDI3G_NA ("fe-bbe-oduf-sdi3g-na"),  // D="far End Background Block Error for odu-sdi3g-na"               
    FE_BBE_ODUF_FC400    ("fe-bbe-oduf-fc400"), // D="far End Background Block Error for odu-fc400"                  
    FE_BBE_ODUF_FC800     ("fe-bbe-oduf-fc800"),// D="far End Background Block Error for odu-fc800"
    TSE_ODU0("tse-odu0"),       // D="Test Sequence Error for odu0"     
    TSE_ODUF_SDI3G ("tse-oduf-sdi3g"),     // D="test sequence Error for odu-sdi3g"                  
    TSE_ODUF_SDI3G_NA ("tse-oduf-sdi3g-na"),  // D="test sequence Error Block Error for odu-sdi3g-na"               
    TSE_ODUF_FC400    ("tse-oduf-fc400"), // D="test sequence Error for odu-fc400"                  
    TSE_ODUF_FC800     ("tse-oduf-fc800"),// D="test sequence Error for odu-fc800"
    MIC_ERRORS ("mic-errors"),
    ETH_RX_PACKETS    ("eth-rx-packets","Rx Pkts"),
    ETH_RX_BRDCST_PACKETS                   ("eth-rx-brdcst-packets","Rx Broadcast Pkts"),
    ETH_RX_MLCST_PACKETS                    ("eth-rx-mlcst-packets","Rx Multicast Pkts"),
    ETH_RX_UNDERSIZE_PACKETS                ("eth-rx-undersize-packets","Rx Undersize Pkts"),
    ETH_RX_OVERSIZE_PACKETS                 ("eth-rx-oversize-packets","Rx Oversize Pkts"),
    ETH_RX_CRC_ALIGN_PACKETS                ("eth-rx-crc-align-packets","Rx CRC Align Error Pkts"),
    ETH_RX_FRAGMENTS_PACKETS                ("eth-rx-fragments-packets","Rx Fragments"),
    ETH_RX_JABBERS_PACKETS                  ("eth-rx-jabbers-packets","Rx Jabber Pkts"),
    ETH_RX_BAD_PACKETS                      ("eth-rx-bad-packets"),
    ETH_RX_HEADER_ERROR_PACKETS             ("eth-rx-header-error-packets","Rx Header Error Pkts"),
    ETH_RX_PHY_ERRORS                       ("eth-rx-phy-errors"),
    VLAN_PORT_IN_DISCRAD                    ("vlan-port-in-discrad"),
    IGMP_RX_NO_ERRORS_PACKETS               ("igmp-rx-no-errors-packets","Rx IGMP Pkts"),
    IGMP_QUERIES_AT_ACCESS_PORT             ("igmp-queries-at-access-port","Rx IGMP Queries on Access port"),
    IGMP_HEADRE_MC_SRC_ADDR_ERROR           ("igmp-headre-mc-src-addr-error","Rx IGMP IP multicast source address error"),
    IGMP_IP_FRAGMENTS                       ("igmp-ip-fragments","Rx IGMP Fragments"),
    IGMP_HEADER_TYPE_ERROR                  ("igmp-header-type-error","Rx IGMP header Type error"),
    IGMP_ADDRESS_NOT_IN_MC_STREAM_RANGE     ("igmp-address-not-in-mc-stream-range","Rx IGMP Address not in MC range"),
    IGMP_ADDRESS_TO_MAC_AMBIGUITY           ("igmp-address-to-mac-ambiguity","Rx IGMP Group Address to MAC ambiguity"),
    IGMP_HOST_QUEUE_OVERFLOW                ("igmp-host-queue-overflow","Rx IGMP Host queue overflow"),
    IGMP_OTHER_DISCARDS                     ("igmp-other-discards","Rx IGMP Other discards"),
    TX_AVAERAGE_OCTETS_RATE                 ("tx-avaerage-octets-rate"),
    TX_UTILIZATION    ("tx-utilization"),
    TX_PEAK_OCTETS_RATE                     ("tx-peak-octets-rate"),
    TX_PEAK_OCTETS_RATE_TIMESTAMP           ("tx-peak-octets-rate-timestamp"),
    TX_PKTS_OK                              ("tx-pkts-ok"),
    TX_PAUSE_FRAME    ("tx-pause-frame"),
    TX_ESMC_PACKETS                         ("tx-esmc-packets"),
    IF_PORT_DROP_PACKETS                    ("if-port-drop-packets"),
    PRIO_RANDOM_DROP_OCTETS                 ("prio-random-drop-octets"),
    TX_DROP_TIMEOUT_OCTETS                  ("tx-drop-timeout-octets"),
    TX_DROP_TIMEOUT_PACKETS                 ("tx-drop-timeout-packets"),
    EGRESS_PRIORITY_FILTERING_DISCARDS      ("egress-priority-filtering-discards"),
    IF_OUT_WRED_PERCENT                     ("if-out-wred-percent"),
    DUPLICATE_MAC_ALERTS_SEC                ("duplicate-mac-alerts-sec"),
    PORT_FORWARD_TRANS                      ("port-forward-trans"),
    TX_AVAREGE_OCTET_RATE_COS_0             ("tx-avarege-octet-rate-cos-0"),
    TX_AVAREGE_OCTET_RATE_COS_1             ("tx-avarege-octet-rate-cos-1"),
    TX_AVAREGE_OCTET_RATE_COS_2             ("tx-avarege-octet-rate-cos-2"),
    TX_AVAREGE_OCTET_RATE_COS_3             ("tx-avarege-octet-rate-cos-3"),
    TX_AVAREGE_OCTET_RATE_COS_4             ("tx-avarege-octet-rate-cos-4"),
    TX_AVAREGE_OCTET_RATE_COS_5             ("tx-avarege-octet-rate-cos-5"),
    TX_AVAREGE_OCTET_RATE_COS_6             ("tx-avarege-octet-rate-cos-6"),
    TX_AVAREGE_OCTET_RATE_COS_7             ("tx-avarege-octet-rate-cos-7"),
    TX_UTILIZATION_COS_0                    ("tx-utilization-cos-0"),
    TX_UTILIZATION_COS_1                    ("tx-utilization-cos-1"),
    TX_UTILIZATION_COS_2                    ("tx-utilization-cos-2"),
    TX_UTILIZATION_COS_3                    ("tx-utilization-cos-3"),
    TX_UTILIZATION_COS_4                    ("tx-utilization-cos-4"),
    TX_UTILIZATION_COS_5                    ("tx-utilization-cos-5"),
    TX_UTILIZATION_COS_6                    ("tx-utilization-cos-6"),
    TX_UTILIZATION_COS_7                    ("tx-utilization-cos-7"),
    IF_PORT_PASSED_PKTS_COS_0               ("if-port-passed-pkts-cos-0"),
    IF_PORT_PASSED_PKTS_COS_1               ("if-port-passed-pkts-cos-1"),
    IF_PORT_PASSED_PKTS_COS_2               ("if-port-passed-pkts-cos-2"),
    IF_PORT_PASSED_PKTS_COS_3               ("if-port-passed-pkts-cos-3"),
    IF_PORT_PASSED_PKTS_COS_4               ("if-port-passed-pkts-cos-4"),
    IF_PORT_PASSED_PKTS_COS_5               ("if-port-passed-pkts-cos-5"),
    IF_PORT_PASSED_PKTS_COS_6               ("if-port-passed-pkts-cos-6"),
    IF_PORT_PASSED_PKTS_COS_7               ("if-port-passed-pkts-cos-7"),
    IF_PORT_PASSED_OCTETS_COS_0             ("if-port-passed-octets-cos-0"),
    IF_PORT_PASSED_OCTETS_COS_1             ("if-port-passed-octets-cos-1"),
    IF_PORT_PASSED_OCTETS_COS_2             ("if-port-passed-octets-cos-2"),
    IF_PORT_PASSED_OCTETS_COS_3             ("if-port-passed-octets-cos-3"),
    IF_PORT_PASSED_OCTETS_COS_4             ("if-port-passed-octets-cos-4"),
    IF_PORT_PASSED_OCTETS_COS_5             ("if-port-passed-octets-cos-5"),
    IF_PORT_PASSED_OCTETS_COS_6             ("if-port-passed-octets-cos-6"),
    IF_PORT_PASSED_OCTETS_COS_7             ("if-port-passed-octets-cos-7"),
    PRIO_0_STAT_PKTS                        ("prio-0-stat-pkts"),
    PRIO_1_STAT_PKTS                        ("prio-1-stat-pkts"),
    PRIO_2_STAT_PKTS                        ("prio-2-stat-pkts"),
    PRIO_3_STAT_PKTS                        ("prio-3-stat-pkts"),
    PRIO_4_STAT_PKTS                        ("prio-4-stat-pkts"),
    PRIO_5_STAT_PKTS                        ("prio-5-stat-pkts"),
    PRIO_6_STAT_PKTS                        ("prio-6-stat-pkts"),
    PRIO_7_STAT_PKTS                        ("prio-7-stat-pkts"),
    IF_PORT_DROP_PKTS_0                     ("if-port-drop-pkts-0"),
    IF_PORT_DROP_PKTS_1                     ("if-port-drop-pkts-1"),
    IF_PORT_DROP_PKTS_2                     ("if-port-drop-pkts-2"),
    IF_PORT_DROP_PKTS_3                     ("if-port-drop-pkts-3"),
    IF_PORT_DROP_PKTS_4                     ("if-port-drop-pkts-4"),
    IF_PORT_DROP_PKTS_5                     ("if-port-drop-pkts-5"),
    IF_PORT_DROP_PKTS_6                     ("if-port-drop-pkts-6"),
    IF_PORT_DROP_PKTS_7                     ("if-port-drop-pkts-7"),
    PRIO_0_RAND_DROP_OCTETS                 ("prio-0-rand-drop-octets"),
    PRIO_1_RAND_DROP_OCTETS                 ("prio-1-rand-drop-octets"),
    PRIO_2_RAND_DROP_OCTETS                 ("prio-2-rand-drop-octets"),
    PRIO_3_RAND_DROP_OCTETS                 ("prio-3-rand-drop-octets"),
    PRIO_4_RAND_DROP_OCTETS                 ("prio-4-rand-drop-octets"),
    PRIO_5_RAND_DROP_OCTETS                 ("prio-5-rand-drop-octets"),
    PRIO_6_RAND_DROP_OCTETS                 ("prio-6-rand-drop-octets"),
    PRIO_7_RAND_DROP_OCTETS                 ("prio-7-rand-drop-octets"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_0      ("if-port-drop-octets-cos-perecent-0"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_1      ("if-port-drop-octets-cos-perecent-1"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_2      ("if-port-drop-octets-cos-perecent-2"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_3      ("if-port-drop-octets-cos-perecent-3"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_4      ("if-port-drop-octets-cos-perecent-4"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_5      ("if-port-drop-octets-cos-perecent-5"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_6      ("if-port-drop-octets-cos-perecent-6"),
    IF_PORT_DROP_OCTETS_COS_PERECENT_7      ("if-port-drop-octets-cos-perecent-7"),
    MC_VPN_OCTETS                           ("mc-vpn-octets"),
    MC_VPN_OCTETS_DROPPED                   ("mc-vpn-octets-dropped"),
    MC_VPN_PACKETS_DROPPED                  ("mc-vpn-packets-dropped"),
    MC_VPN_AVERAGE_RATE                     ("mc-vpn-average-rate"),
    MC_VPN_UTILIZATION                      ("mc-vpn-utilization"),
    VPN_QUOTA_DROPPED_PKTS                  ("vpn-quota-dropped-pkts"),
    ACT_PKTS                                ("act-pkts"),
    ACT_OCTETS                              ("act-octets"),
    GREEN_PKTS                              ("green-pkts"),
    YELLOW_OCTETS                           ("yellow-octets"),
    DROP_PKTS    ("drop-pkts"),
    GREEN_OCTETS                            ("green-octets"),
    YELLOW_PKTS                             ("yellow-pkts"),
    DROP_OCTETS                             ("drop-octets"),
    CONF_OCTET_RATE                         ("conf-octet-rate"),
    CIR_UTILIZATION                         ("cir-utilization"),
    PERCENT_NON_CONFORMING                  ("percent-non-conforming"),
    EGRESS_TX_PASS_PKTS_COS_0               ("egress-tx-pass-pkts-cos-0"),
    EGRESS_TX_PASS_PKTS_COS_1               ("egress-tx-pass-pkts-cos-1"),
    EGRESS_TX_PASS_PKTS_COS_2               ("egress-tx-pass-pkts-cos-2"),
    EGRESS_TX_PASS_PKTS_COS_3               ("egress-tx-pass-pkts-cos-3"),
    EGRESS_TX_PASS_PKTS_COS_4               ("egress-tx-pass-pkts-cos-4"),
    EGRESS_TX_PASS_PKTS_COS_5               ("egress-tx-pass-pkts-cos-5"),
    EGRESS_TX_PASS_PKTS_COS_6               ("egress-tx-pass-pkts-cos-6"),
    EGRESS_TX_PASS_PKTS_COS_7               ("egress-tx-pass-pkts-cos-7"),
    EGRESS_TX_PASS_OCTETS_COS_0             ("egress-tx-pass-octets-cos-0"),
    EGRESS_TX_PASS_OCTETS_COS_1             ("egress-tx-pass-octets-cos-1"),
    EGRESS_TX_PASS_OCTETS_COS_2             ("egress-tx-pass-octets-cos-2"),
    EGRESS_TX_PASS_OCTETS_COS_3             ("egress-tx-pass-octets-cos-3"),
    EGRESS_TX_PASS_OCTETS_COS_4             ("egress-tx-pass-octets-cos-4"),
    EGRESS_TX_PASS_OCTETS_COS_5             ("egress-tx-pass-octets-cos-5"),
    EGRESS_TX_PASS_OCTETS_COS_6             ("egress-tx-pass-octets-cos-6"),
    EGRESS_TX_PASS_OCTETS_COS_7             ("egress-tx-pass-octets-cos-7"),
    EGRESS_TX_WRED_DROP_PKTS_COS_0          ("egress-tx-wred-drop-pkts-cos-0"),
    EGRESS_TX_WRED_DROP_PKTS_COS_1          ("egress-tx-wred-drop-pkts-cos-1"),
    EGRESS_TX_WRED_DROP_PKTS_COS_2          ("egress-tx-wred-drop-pkts-cos-2"),
    EGRESS_TX_WRED_DROP_PKTS_COS_3          ("egress-tx-wred-drop-pkts-cos-3"),
    EGRESS_TX_WRED_DROP_PKTS_COS_4          ("egress-tx-wred-drop-pkts-cos-4"),
    EGRESS_TX_WRED_DROP_PKTS_COS_5          ("egress-tx-wred-drop-pkts-cos-5"),
    EGRESS_TX_WRED_DROP_PKTS_COS_6          ("egress-tx-wred-drop-pkts-cos-6"),
    EGRESS_TX_WRED_DROP_PKTS_COS_7          ("egress-tx-wred-drop-pkts-cos-7"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_0        ("egress-tx-wred-drop-octets-cos-0"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_1        ("egress-tx-wred-drop-octets-cos-1"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_2        ("egress-tx-wred-drop-octets-cos-2"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_3        ("egress-tx-wred-drop-octets-cos-3"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_4        ("egress-tx-wred-drop-octets-cos-4"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_5        ("egress-tx-wred-drop-octets-cos-5"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_6        ("egress-tx-wred-drop-octets-cos-6"),
    EGRESS_TX_WRED_DROP_OCTETS_COS_7        ("egress-tx-wred-drop-octets-cos-7"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_0     ("egress-tx-avarege-octets-rate-cos-0"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_1     ("egress-tx-avarege-octets-rate-cos-1"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_2     ("egress-tx-avarege-octets-rate-cos-2"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_3     ("egress-tx-avarege-octets-rate-cos-3"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_4     ("egress-tx-avarege-octets-rate-cos-4"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_5     ("egress-tx-avarege-octets-rate-cos-5"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_6     ("egress-tx-avarege-octets-rate-cos-6"),
    EGRESS_TX_AVAREGE_OCTETS_RATE_COS_7     ("egress-tx-avarege-octets-rate-cos-7"),
    EGRESS_TX_FLOW_UTIL_COS_0               ("egress-tx-flow-util-cos-0"),
    EGRESS_TX_FLOW_UTIL_COS_1               ("egress-tx-flow-util-cos-1"),
    EGRESS_TX_FLOW_UTIL_COS_2               ("egress-tx-flow-util-cos-2"),
    EGRESS_TX_FLOW_UTIL_COS_3               ("egress-tx-flow-util-cos-3"),
    EGRESS_TX_FLOW_UTIL_COS_4               ("egress-tx-flow-util-cos-4"),
    EGRESS_TX_FLOW_UTIL_COS_5               ("egress-tx-flow-util-cos-5"),
    EGRESS_TX_FLOW_UTIL_COS_6               ("egress-tx-flow-util-cos-6"),
    EGRESS_TX_FLOW_UTIL_COS_7               ("egress-tx-flow-util-cos-7"),
    EGRESS_TX_DROP_PRECENT_COS_0            ("egress-tx-drop-precent-cos-0"),
    EGRESS_TX_DROP_PRECENT_COS_1            ("egress-tx-drop-precent-cos-1"),
    EGRESS_TX_DROP_PRECENT_COS_2            ("egress-tx-drop-precent-cos-2"),
    EGRESS_TX_DROP_PRECENT_COS_3            ("egress-tx-drop-precent-cos-3"),
    EGRESS_TX_DROP_PRECENT_COS_4            ("egress-tx-drop-precent-cos-4"),
    EGRESS_TX_DROP_PRECENT_COS_5            ("egress-tx-drop-precent-cos-5"),
    EGRESS_TX_DROP_PRECENT_COS_6            ("egress-tx-drop-precent-cos-6"),
    EGRESS_TX_DROP_PRECENT_COS_7            ("egress-tx-drop-precent-cos-7"),
    MAC_MOVE                                ("mac-move"),
    FIB_UTILIZATION               ("fib-utilization"),
    FIB_QUOTA_UTILIZATION         ("fib-quota-utilization"),
    TX_PW_STATUS_PKTS             ("tx-pw-status-pkts"),
    RX_PW_STATUS_PKTS             ("rx-pw-status-pkts"),
    REMOTE_MEP_DOWN_SEC                 ("remote-mep-down-sec"),
    REMOTE_MEP_DOWN_SEC_RATIO_PPM       ("remote-mep-down-sec-ratio-ppm"),
    MEG_DOWN_SEC                       ("meg-down-sec"),
    MEG_SEC_RATIO_PPM                  ("meg-sec-ratio-ppm"),
    CCM_TX                             ("ccm-tx"),
    CCM_RX                             ("ccm-rx"),
    LBM_TX                             ("lbm-tx"),
    LBM_RX                             ("lbm-rx"),
    LBR_TX                             ("lbr-tx"),
    LBR_RX                             ("lbr-rx"),
    LTM_TX                             ("ltm-tx"),
    LTM_RX                             ("ltm-rx"),
    LTR_UNEXPECTED_RX                  ("ltr-unexpected-rx"),
    CTRL_BUDGET_POLICING_DSCR          ("ctrl-budget-policing-dscr"),
    SOAM_CCM_LEVEL_DSCR                ("soam-ccm-level-dscr"),
    SOAM_CCM_INVALID_DSCR              ("soam-ccm-invalid-dscr"),
    SOAM_LBM_INVALID_DSCR              ("soam-lbm-invalid-dscr"),
    SOAM_LBR_INVALID_DSCR              ("soam-lbr-invalid-dscr"),
    SOAM_LTM_INVALID_DSCR              ("soam-ltm-invalid-dscr"),
    SOAM_LTR_INVALID_DSCR              ("soam-ltr-invalid-dscr"),
    SOAM_UNIDENT_DSCR                  ("soam-unident-dscr"),
    SOAM_CFM_PM_DMM_INVALID_DSCR       ("soam-cfm-pm-dmm-invalid-dscr"),
    SOAM_CFM_PM_DMR_INVALID_DSCR       ("soam-cfm-pm-dmr-invalid-dscr"),
    SOAM_CFM_PM_SLM_INVALID_DSCR       ("soam-cfm-pm-slm-invalid-dscr"),
    SOAM_CFM_PM_SLR_INVALID_DSCR       ("soam-cfm-pm-slr-invalid-dscr"),
    STP_TOP_CHANGES                    ("stp-top-changes"),
    LOW_CLASS_DISCARD_PKTS             ("low-class-discard-pkts"),
    UNKNOWN_GACH_DSCR                  ("unknown-gach-dscr"),
    UNKNOWN_GACH_TLV_DSCR              ("unknown-gach-tlv-dscr"),
    TX_BYTES                           ("tx-bytes"),
    TX_AVG_BYTE_RATE                   ("tx-avg-byte-rate"),
    TX_MIN_BYTE_RATE                   ("tx-min-byte-rate"),
    TX_MAX_BYTE_RATE                   ("tx-max-byte-rate"),
    TX_PKTS                            ("tx-pkts"),
    TX_AVG_PKT_RATE                    ("tx-avg-pkt-rate"),
    TX_MIN_PKT_RATE                    ("tx-min-pkt-rate"),
    TX_MAX_PKT_RATE                    ("tx-max-pkt-rate"),
    RX_BYTES                           ("rx-bytes"),
    RX_AVG_BYTE_RATE                   ("rx-avg-byte-rate"),
    RX_MIN_BYTE_RATE                   ("rx-min-byte-rate"),
    RX_MAX_BYTE_RATE                   ("rx-max-byte-rate"),
    RX_PKTS                            ("rx-pkts"),
    RX_AVG_PKTS_RATE                   ("rx-avg-pkts-rate"),
    RX_MIN_PKT_RATE                    ("rx-min-pkt-rate"),
    RX_MAX_PKT_RATE                    ("rx-max-pkt-rate");



   private String stName,stmsName;
   
   private static HashMap<String, CounterType> byStName;
   static {
       byStName = new HashMap<String, CounterType>();
       for (CounterType t : values()) {
           byStName.put(t.getStName(), t);
       }
   }

    private CounterType(String stName) {
         this.stName = stName;
    }
    
    private CounterType(String stName, String stmsName){
    	this.stName = stName;
    	this.stmsName=stmsName;
    }
    
    public String getStName(){
        return stName;
    }
    
    public String getStmsName(){
    	return this.stmsName;
    }
    
    
    public static CounterType byShadetreeName(String name) {
   // 	System.out.println("ST12345 name "+name+" countertype "+byStName.get(name));
        return byStName.get(name);
    }
}
