// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/genesis.proto

package com.axelar.axelarnet.v1beta1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_axelarnet_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_axelarnet_v1beta1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_axelarnet_v1beta1_GenesisState_SeqIdMappingEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_axelarnet_v1beta1_GenesisState_SeqIdMappingEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&axelar/axelarnet/v1beta1/genesis.proto" +
      "\022\030axelar.axelarnet.v1beta1\032\024gogoproto/go" +
      "go.proto\032%axelar/axelarnet/v1beta1/param" +
      "s.proto\032$axelar/axelarnet/v1beta1/types." +
      "proto\032!axelar/utils/v1beta1/queuer.proto" +
      "\"\355\004\n\014GenesisState\022>\n\006params\030\001 \001(\0132 .axel" +
      "ar.axelarnet.v1beta1.ParamsB\004\310\336\037\000R\006param" +
      "s\022^\n\021collector_address\030\002 \001(\014B1\372\336\037-github" +
      ".com/cosmos/cosmos-sdk/types.AccAddressR" +
      "\020collectorAddress\022C\n\006chains\030\003 \003(\0132%.axel" +
      "ar.axelarnet.v1beta1.CosmosChainB\004\310\336\037\000R\006" +
      "chains\022M\n\016transfer_queue\030\005 \001(\0132 .axelar." +
      "utils.v1beta1.QueueStateB\004\310\336\037\000R\rtransfer" +
      "Queue\022`\n\ribc_transfers\030\007 \003(\0132%.axelar.ax" +
      "elarnet.v1beta1.IBCTransferB\024\310\336\037\000\342\336\037\014IBC" +
      "TransfersR\014ibcTransfers\022t\n\016seq_id_mappin" +
      "g\030\010 \003(\01328.axelar.axelarnet.v1beta1.Genes" +
      "isState.SeqIdMappingEntryB\024\310\336\037\000\342\336\037\014SeqID" +
      "MappingR\014seqIdMapping\032?\n\021SeqIdMappingEnt" +
      "ry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\004R\005val" +
      "ue:\0028\001:\004\230\241\037\001J\004\010\004\020\005J\004\010\006\020\007B\352\001\n\034com.axelar." +
      "axelarnet.v1beta1B\014GenesisProtoP\001Z6githu" +
      "b.com/axelarnetwork/axelar-core/x/axelar" +
      "net/types\242\002\003AAX\252\002\030Axelar.Axelarnet.V1bet" +
      "a1\312\002\030Axelar\\Axelarnet\\V1beta1\342\002$Axelar\\A" +
      "xelarnet\\V1beta1\\GPBMetadata\352\002\032Axelar::A" +
      "xelarnet::V1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.axelar.axelarnet.v1beta1.ParamsProto.getDescriptor(),
          com.axelar.axelarnet.v1beta1.TypesProto.getDescriptor(),
          com.axelar.utils.v1beta1.QueuerProto.getDescriptor(),
        });
    internal_static_axelar_axelarnet_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_axelarnet_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_axelarnet_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "CollectorAddress", "Chains", "TransferQueue", "IbcTransfers", "SeqIdMapping", });
    internal_static_axelar_axelarnet_v1beta1_GenesisState_SeqIdMappingEntry_descriptor =
      internal_static_axelar_axelarnet_v1beta1_GenesisState_descriptor.getNestedTypes().get(0);
    internal_static_axelar_axelarnet_v1beta1_GenesisState_SeqIdMappingEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_axelarnet_v1beta1_GenesisState_SeqIdMappingEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stableMarshaler);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.axelar.axelarnet.v1beta1.ParamsProto.getDescriptor();
    com.axelar.axelarnet.v1beta1.TypesProto.getDescriptor();
    com.axelar.utils.v1beta1.QueuerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
