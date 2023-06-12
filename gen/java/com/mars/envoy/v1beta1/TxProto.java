// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mars/envoy/v1beta1/tx.proto

package com.mars.envoy.v1beta1;

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
    internal_static_mars_envoy_v1beta1_MsgRegisterAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mars_envoy_v1beta1_MsgRegisterAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mars_envoy_v1beta1_MsgRegisterAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mars_envoy_v1beta1_MsgRegisterAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mars_envoy_v1beta1_MsgSendFunds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mars_envoy_v1beta1_MsgSendFunds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mars_envoy_v1beta1_MsgSendFundsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mars_envoy_v1beta1_MsgSendFundsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mars_envoy_v1beta1_MsgSendMessages_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mars_envoy_v1beta1_MsgSendMessages_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mars_envoy_v1beta1_MsgSendMessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mars_envoy_v1beta1_MsgSendMessagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mars/envoy/v1beta1/tx.proto\022\022mars.envo" +
      "y.v1beta1\032\036cosmos/base/v1beta1/coin.prot" +
      "o\032\027cosmos/msg/v1/msg.proto\032\031cosmos_proto" +
      "/cosmos.proto\032\024gogoproto/gogo.proto\032\031goo" +
      "gle/protobuf/any.proto\"\222\001\n\022MsgRegisterAc" +
      "count\0220\n\006sender\030\001 \001(\tB\030\322\264-\024cosmos.Addres" +
      "sStringR\006sender\022=\n\rconnection_id\030\002 \001(\tB\030" +
      "\362\336\037\024yaml:\"connection_id\"R\014connectionId:\013" +
      "\202\347\260*\006sender\"\034\n\032MsgRegisterAccountRespons" +
      "e\"\361\001\n\014MsgSendFunds\0226\n\tauthority\030\001 \001(\tB\030\322" +
      "\264-\024cosmos.AddressStringR\tauthority\0224\n\nch" +
      "annel_id\030\002 \001(\tB\025\362\336\037\021yaml:\"channel_id\"R\tc" +
      "hannelId\022c\n\006amount\030\003 \003(\0132\031.cosmos.base.v" +
      "1beta1.CoinB0\310\336\037\000\252\337\037(github.com/cosmos/c" +
      "osmos-sdk/types.CoinsR\006amount:\016\202\347\260*\tauth" +
      "ority\"\026\n\024MsgSendFundsResponse\"\312\001\n\017MsgSen" +
      "dMessages\0226\n\tauthority\030\001 \001(\tB\030\322\264-\024cosmos" +
      ".AddressStringR\tauthority\022=\n\rconnection_" +
      "id\030\002 \001(\tB\030\362\336\037\024yaml:\"connection_id\"R\014conn" +
      "ectionId\0220\n\010messages\030\003 \003(\0132\024.google.prot" +
      "obuf.AnyR\010messages:\016\202\347\260*\tauthority\"\031\n\027Ms" +
      "gSendMessagesResponse2\262\002\n\003Msg\022i\n\017Registe" +
      "rAccount\022&.mars.envoy.v1beta1.MsgRegiste" +
      "rAccount\032..mars.envoy.v1beta1.MsgRegiste" +
      "rAccountResponse\022W\n\tSendFunds\022 .mars.env" +
      "oy.v1beta1.MsgSendFunds\032(.mars.envoy.v1b" +
      "eta1.MsgSendFundsResponse\022`\n\014SendMessage" +
      "s\022#.mars.envoy.v1beta1.MsgSendMessages\032+" +
      ".mars.envoy.v1beta1.MsgSendMessagesRespo" +
      "nse\032\005\200\347\260*\001B\267\001\n\026com.mars.envoy.v1beta1B\007T" +
      "xProtoP\001Z*github.com/mars-protocol/hub/x" +
      "/envoy/types\242\002\003MEX\252\002\022Mars.Envoy.V1beta1\312" +
      "\002\022Mars\\Envoy\\V1beta1\342\002\036Mars\\Envoy\\V1beta" +
      "1\\GPBMetadata\352\002\024Mars::Envoy::V1beta1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_mars_envoy_v1beta1_MsgRegisterAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mars_envoy_v1beta1_MsgRegisterAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mars_envoy_v1beta1_MsgRegisterAccount_descriptor,
        new java.lang.String[] { "Sender", "ConnectionId", });
    internal_static_mars_envoy_v1beta1_MsgRegisterAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_mars_envoy_v1beta1_MsgRegisterAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mars_envoy_v1beta1_MsgRegisterAccountResponse_descriptor,
        new java.lang.String[] { });
    internal_static_mars_envoy_v1beta1_MsgSendFunds_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_mars_envoy_v1beta1_MsgSendFunds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mars_envoy_v1beta1_MsgSendFunds_descriptor,
        new java.lang.String[] { "Authority", "ChannelId", "Amount", });
    internal_static_mars_envoy_v1beta1_MsgSendFundsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_mars_envoy_v1beta1_MsgSendFundsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mars_envoy_v1beta1_MsgSendFundsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_mars_envoy_v1beta1_MsgSendMessages_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_mars_envoy_v1beta1_MsgSendMessages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mars_envoy_v1beta1_MsgSendMessages_descriptor,
        new java.lang.String[] { "Authority", "ConnectionId", "Messages", });
    internal_static_mars_envoy_v1beta1_MsgSendMessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_mars_envoy_v1beta1_MsgSendMessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mars_envoy_v1beta1_MsgSendMessagesResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.msg.v1.MsgProto.service);
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
