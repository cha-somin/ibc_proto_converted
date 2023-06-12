// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/tx.proto

package com.injective.oracle.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayProviderPrices_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayProviderPrices_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayProviderPricesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayProviderPricesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayBandRates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayBandRates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessages_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessages_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayPythPrices_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayPythPrices_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgRelayPythPricesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgRelayPythPricesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgUpdateParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgUpdateParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_MsgUpdateParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!injective/oracle/v1beta1/tx.proto\022\030inj" +
      "ective.oracle.v1beta1\032\024gogoproto/gogo.pr" +
      "oto\032%injective/oracle/v1beta1/oracle.pro" +
      "to\032\027cosmos/msg/v1/msg.proto\032\031cosmos_prot" +
      "o/cosmos.proto\"\303\001\n\026MsgRelayProviderPrice" +
      "s\022\026\n\006sender\030\001 \001(\tR\006sender\022\032\n\010provider\030\002 " +
      "\001(\tR\010provider\022\030\n\007symbols\030\003 \003(\tR\007symbols\022" +
      "F\n\006prices\030\004 \003(\tB.\310\336\037\000\332\336\037&github.com/cosm" +
      "os/cosmos-sdk/types.DecR\006prices:\023\210\240\037\000\350\240\037" +
      "\000\202\347\260*\006sender\" \n\036MsgRelayProviderPricesRe" +
      "sponse\"\265\001\n\026MsgRelayPriceFeedPrice\022\026\n\006sen" +
      "der\030\001 \001(\tR\006sender\022\022\n\004base\030\002 \003(\tR\004base\022\024\n" +
      "\005quote\030\003 \003(\tR\005quote\022D\n\005price\030\004 \003(\tB.\310\336\037\000" +
      "\332\336\037&github.com/cosmos/cosmos-sdk/types.D" +
      "ecR\005price:\023\210\240\037\000\350\240\037\000\202\347\260*\006sender\" \n\036MsgRel" +
      "ayPriceFeedPriceResponse\"\260\001\n\021MsgRelayBan" +
      "dRates\022\030\n\007relayer\030\001 \001(\tR\007relayer\022\030\n\007symb" +
      "ols\030\002 \003(\tR\007symbols\022\024\n\005rates\030\003 \003(\004R\005rates" +
      "\022#\n\rresolve_times\030\004 \003(\004R\014resolveTimes\022\036\n" +
      "\nrequestIDs\030\005 \003(\004R\nrequestIDs:\014\202\347\260*\007rela" +
      "yer\"\033\n\031MsgRelayBandRatesResponse\"\203\001\n\030Msg" +
      "RelayCoinbaseMessages\022\026\n\006sender\030\001 \001(\tR\006s" +
      "ender\022\032\n\010messages\030\002 \003(\014R\010messages\022\036\n\nsig" +
      "natures\030\003 \003(\014R\nsignatures:\023\210\240\037\000\350\240\037\000\202\347\260*\006" +
      "sender\"\"\n MsgRelayCoinbaseMessagesRespon" +
      "se\"d\n\026MsgRequestBandIBCRates\022\026\n\006sender\030\001" +
      " \001(\tR\006sender\022\035\n\nrequest_id\030\002 \001(\004R\treques" +
      "tId:\023\210\240\037\000\350\240\037\000\202\347\260*\006sender\" \n\036MsgRequestBa" +
      "ndIBCRatesResponse\"\234\001\n\022MsgRelayPythPrice" +
      "s\022\026\n\006sender\030\001 \001(\tR\006sender\022Y\n\022price_attes" +
      "tations\030\002 \003(\0132*.injective.oracle.v1beta1" +
      ".PriceAttestationR\021priceAttestations:\023\210\240" +
      "\037\000\350\240\037\000\202\347\260*\006sender\"\034\n\032MsgRelayPythPricesR" +
      "esponse\"\231\001\n\017MsgUpdateParams\0226\n\tauthority" +
      "\030\001 \001(\tB\030\322\264-\024cosmos.AddressStringR\tauthor" +
      "ity\022>\n\006params\030\002 \001(\0132 .injective.oracle.v" +
      "1beta1.ParamsB\004\310\336\037\000R\006params:\016\202\347\260*\tauthor" +
      "ity\"\031\n\027MsgUpdateParamsResponse2\364\006\n\003Msg\022\201" +
      "\001\n\023RelayProviderPrices\0220.injective.oracl" +
      "e.v1beta1.MsgRelayProviderPrices\0328.injec" +
      "tive.oracle.v1beta1.MsgRelayProviderPric" +
      "esResponse\022\201\001\n\023RelayPriceFeedPrice\0220.inj" +
      "ective.oracle.v1beta1.MsgRelayPriceFeedP" +
      "rice\0328.injective.oracle.v1beta1.MsgRelay" +
      "PriceFeedPriceResponse\022r\n\016RelayBandRates" +
      "\022+.injective.oracle.v1beta1.MsgRelayBand" +
      "Rates\0323.injective.oracle.v1beta1.MsgRela" +
      "yBandRatesResponse\022\201\001\n\023RequestBandIBCRat" +
      "es\0220.injective.oracle.v1beta1.MsgRequest" +
      "BandIBCRates\0328.injective.oracle.v1beta1." +
      "MsgRequestBandIBCRatesResponse\022\207\001\n\025Relay" +
      "CoinbaseMessages\0222.injective.oracle.v1be" +
      "ta1.MsgRelayCoinbaseMessages\032:.injective" +
      ".oracle.v1beta1.MsgRelayCoinbaseMessages" +
      "Response\022u\n\017RelayPythPrices\022,.injective." +
      "oracle.v1beta1.MsgRelayPythPrices\0324.inje" +
      "ctive.oracle.v1beta1.MsgRelayPythPricesR" +
      "esponse\022l\n\014UpdateParams\022).injective.orac" +
      "le.v1beta1.MsgUpdateParams\0321.injective.o" +
      "racle.v1beta1.MsgUpdateParamsResponseB\367\001" +
      "\n\034com.injective.oracle.v1beta1B\007TxProtoP" +
      "\001ZLgithub.com/InjectiveLabs/injective-co" +
      "re/injective-chain/modules/oracle/types\242" +
      "\002\003IOX\252\002\030Injective.Oracle.V1beta1\312\002\030Injec" +
      "tive\\Oracle\\V1beta1\342\002$Injective\\Oracle\\V" +
      "1beta1\\GPBMetadata\352\002\032Injective::Oracle::" +
      "V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.injective.oracle.v1beta1.OracleProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_injective_oracle_v1beta1_MsgRelayProviderPrices_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_oracle_v1beta1_MsgRelayProviderPrices_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayProviderPrices_descriptor,
        new java.lang.String[] { "Sender", "Provider", "Symbols", "Prices", });
    internal_static_injective_oracle_v1beta1_MsgRelayProviderPricesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_injective_oracle_v1beta1_MsgRelayProviderPricesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayProviderPricesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_descriptor,
        new java.lang.String[] { "Sender", "Base", "Quote", "Price", });
    internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse_descriptor,
        new java.lang.String[] { });
    internal_static_injective_oracle_v1beta1_MsgRelayBandRates_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_injective_oracle_v1beta1_MsgRelayBandRates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayBandRates_descriptor,
        new java.lang.String[] { "Relayer", "Symbols", "Rates", "ResolveTimes", "RequestIDs", });
    internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessages_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessages_descriptor,
        new java.lang.String[] { "Sender", "Messages", "Signatures", });
    internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRates_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRates_descriptor,
        new java.lang.String[] { "Sender", "RequestId", });
    internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_injective_oracle_v1beta1_MsgRelayPythPrices_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_injective_oracle_v1beta1_MsgRelayPythPrices_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayPythPrices_descriptor,
        new java.lang.String[] { "Sender", "PriceAttestations", });
    internal_static_injective_oracle_v1beta1_MsgRelayPythPricesResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_injective_oracle_v1beta1_MsgRelayPythPricesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgRelayPythPricesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_injective_oracle_v1beta1_MsgUpdateParams_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_injective_oracle_v1beta1_MsgUpdateParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgUpdateParams_descriptor,
        new java.lang.String[] { "Authority", "Params", });
    internal_static_injective_oracle_v1beta1_MsgUpdateParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_injective_oracle_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_MsgUpdateParamsResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.injective.oracle.v1beta1.OracleProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
