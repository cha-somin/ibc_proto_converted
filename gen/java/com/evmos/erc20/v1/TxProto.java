// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/tx.proto

package com.evmos.erc20.v1;

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
    internal_static_evmos_erc20_v1_MsgConvertCoin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_MsgConvertCoin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_MsgConvertCoinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_MsgConvertCoinResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_MsgConvertERC20_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_MsgConvertERC20_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_MsgConvertERC20Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_MsgConvertERC20Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_MsgUpdateParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_MsgUpdateParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_MsgUpdateParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_MsgUpdateParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027evmos/erc20/v1/tx.proto\022\016evmos.erc20.v" +
      "1\032\036cosmos/base/v1beta1/coin.proto\032\027cosmo" +
      "s/msg/v1/msg.proto\032\031cosmos_proto/cosmos." +
      "proto\032\034evmos/erc20/v1/genesis.proto\032\024gog" +
      "oproto/gogo.proto\032\034google/api/annotation" +
      "s.proto\"y\n\016MsgConvertCoin\0223\n\004coin\030\001 \001(\0132" +
      "\031.cosmos.base.v1beta1.CoinB\004\310\336\037\000R\004coin\022\032" +
      "\n\010receiver\030\002 \001(\tR\010receiver\022\026\n\006sender\030\003 \001" +
      "(\tR\006sender\"\030\n\026MsgConvertCoinResponse\"\270\001\n" +
      "\017MsgConvertERC20\022)\n\020contract_address\030\001 \001" +
      "(\tR\017contractAddress\022F\n\006amount\030\002 \001(\tB.\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "IntR\006amount\022\032\n\010receiver\030\003 \001(\tR\010receiver\022" +
      "\026\n\006sender\030\004 \001(\tR\006sender\"\031\n\027MsgConvertERC" +
      "20Response\"\217\001\n\017MsgUpdateParams\0226\n\tauthor" +
      "ity\030\001 \001(\tB\030\322\264-\024cosmos.AddressStringR\taut" +
      "hority\0224\n\006params\030\002 \001(\0132\026.evmos.erc20.v1." +
      "ParamsB\004\310\336\037\000R\006params:\016\202\347\260*\tauthority\"\031\n\027" +
      "MsgUpdateParamsResponse2\344\002\n\003Msg\022~\n\013Conve" +
      "rtCoin\022\036.evmos.erc20.v1.MsgConvertCoin\032&" +
      ".evmos.erc20.v1.MsgConvertCoinResponse\"\'" +
      "\202\323\344\223\002!\022\037/evmos/erc20/v1/tx/convert_coin\022" +
      "\202\001\n\014ConvertERC20\022\037.evmos.erc20.v1.MsgCon" +
      "vertERC20\032\'.evmos.erc20.v1.MsgConvertERC" +
      "20Response\"(\202\323\344\223\002\"\022 /evmos/erc20/v1/tx/c" +
      "onvert_erc20\022X\n\014UpdateParams\022\037.evmos.erc" +
      "20.v1.MsgUpdateParams\032\'.evmos.erc20.v1.M" +
      "sgUpdateParamsResponseB\241\001\n\022com.evmos.erc" +
      "20.v1B\007TxProtoP\001Z(github.com/evmos/evmos" +
      "/v13/x/erc20/types\242\002\003EEX\252\002\016Evmos.Erc20.V" +
      "1\312\002\016Evmos\\Erc20\\V1\342\002\032Evmos\\Erc20\\V1\\GPBM" +
      "etadata\352\002\020Evmos::Erc20::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.evmos.erc20.v1.GenesisProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_evmos_erc20_v1_MsgConvertCoin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_erc20_v1_MsgConvertCoin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_MsgConvertCoin_descriptor,
        new java.lang.String[] { "Coin", "Receiver", "Sender", });
    internal_static_evmos_erc20_v1_MsgConvertCoinResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_erc20_v1_MsgConvertCoinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_MsgConvertCoinResponse_descriptor,
        new java.lang.String[] { });
    internal_static_evmos_erc20_v1_MsgConvertERC20_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_evmos_erc20_v1_MsgConvertERC20_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_MsgConvertERC20_descriptor,
        new java.lang.String[] { "ContractAddress", "Amount", "Receiver", "Sender", });
    internal_static_evmos_erc20_v1_MsgConvertERC20Response_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_evmos_erc20_v1_MsgConvertERC20Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_MsgConvertERC20Response_descriptor,
        new java.lang.String[] { });
    internal_static_evmos_erc20_v1_MsgUpdateParams_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_evmos_erc20_v1_MsgUpdateParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_MsgUpdateParams_descriptor,
        new java.lang.String[] { "Authority", "Params", });
    internal_static_evmos_erc20_v1_MsgUpdateParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_evmos_erc20_v1_MsgUpdateParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_MsgUpdateParamsResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.evmos.erc20.v1.GenesisProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
