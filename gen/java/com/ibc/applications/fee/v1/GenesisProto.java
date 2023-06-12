// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/genesis.proto

package com.ibc.applications.fee.v1;

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
    internal_static_ibc_applications_fee_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_FeeEnabledChannel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_FeeEnabledChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_RegisteredPayee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_RegisteredPayee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_RegisteredCounterpartyPayee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_RegisteredCounterpartyPayee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_ForwardRelayerAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_ForwardRelayerAddress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%ibc/applications/fee/v1/genesis.proto\022" +
      "\027ibc.applications.fee.v1\032\024gogoproto/gogo" +
      ".proto\032!ibc/applications/fee/v1/fee.prot" +
      "o\032!ibc/core/channel/v1/channel.proto\"\221\004\n" +
      "\014GenesisState\022\\\n\017identified_fees\030\001 \003(\0132-" +
      ".ibc.applications.fee.v1.IdentifiedPacke" +
      "tFeesB\004\310\336\037\000R\016identifiedFees\022b\n\024fee_enabl" +
      "ed_channels\030\002 \003(\0132*.ibc.applications.fee" +
      ".v1.FeeEnabledChannelB\004\310\336\037\000R\022feeEnabledC" +
      "hannels\022[\n\021registered_payees\030\003 \003(\0132(.ibc" +
      ".applications.fee.v1.RegisteredPayeeB\004\310\336" +
      "\037\000R\020registeredPayees\022\200\001\n\036registered_coun" +
      "terparty_payees\030\004 \003(\01324.ibc.applications" +
      ".fee.v1.RegisteredCounterpartyPayeeB\004\310\336\037" +
      "\000R\034registeredCounterpartyPayees\022_\n\020forwa" +
      "rd_relayers\030\005 \003(\0132..ibc.applications.fee" +
      ".v1.ForwardRelayerAddressB\004\310\336\037\000R\017forward" +
      "Relayers\"K\n\021FeeEnabledChannel\022\027\n\007port_id" +
      "\030\001 \001(\tR\006portId\022\035\n\nchannel_id\030\002 \001(\tR\tchan" +
      "nelId\"`\n\017RegisteredPayee\022\035\n\nchannel_id\030\001" +
      " \001(\tR\tchannelId\022\030\n\007relayer\030\002 \001(\tR\007relaye" +
      "r\022\024\n\005payee\030\003 \001(\tR\005payee\"\205\001\n\033RegisteredCo" +
      "unterpartyPayee\022\035\n\nchannel_id\030\001 \001(\tR\tcha" +
      "nnelId\022\030\n\007relayer\030\002 \001(\tR\007relayer\022-\n\022coun" +
      "terparty_payee\030\003 \001(\tR\021counterpartyPayee\"" +
      "s\n\025ForwardRelayerAddress\022\030\n\007address\030\001 \001(" +
      "\tR\007address\022@\n\tpacket_id\030\002 \001(\0132\035.ibc.core" +
      ".channel.v1.PacketIdB\004\310\336\037\000R\010packetIdB\341\001\n" +
      "\033com.ibc.applications.fee.v1B\014GenesisPro" +
      "toP\001Z5github.com/cosmos/ibc-go/v7/module" +
      "s/apps/29-fee/types\242\002\003IAF\252\002\027Ibc.Applicat" +
      "ions.Fee.V1\312\002\027Ibc\\Applications\\Fee\\V1\342\002#" +
      "Ibc\\Applications\\Fee\\V1\\GPBMetadata\352\002\032Ib" +
      "c::Applications::Fee::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ibc.applications.fee.v1.FeeProto.getDescriptor(),
          com.ibc.core.channel.v1.ChannelProto.getDescriptor(),
        });
    internal_static_ibc_applications_fee_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_fee_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_GenesisState_descriptor,
        new java.lang.String[] { "IdentifiedFees", "FeeEnabledChannels", "RegisteredPayees", "RegisteredCounterpartyPayees", "ForwardRelayers", });
    internal_static_ibc_applications_fee_v1_FeeEnabledChannel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_fee_v1_FeeEnabledChannel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_FeeEnabledChannel_descriptor,
        new java.lang.String[] { "PortId", "ChannelId", });
    internal_static_ibc_applications_fee_v1_RegisteredPayee_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_applications_fee_v1_RegisteredPayee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_RegisteredPayee_descriptor,
        new java.lang.String[] { "ChannelId", "Relayer", "Payee", });
    internal_static_ibc_applications_fee_v1_RegisteredCounterpartyPayee_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_applications_fee_v1_RegisteredCounterpartyPayee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_RegisteredCounterpartyPayee_descriptor,
        new java.lang.String[] { "ChannelId", "Relayer", "CounterpartyPayee", });
    internal_static_ibc_applications_fee_v1_ForwardRelayerAddress_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ibc_applications_fee_v1_ForwardRelayerAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_ForwardRelayerAddress_descriptor,
        new java.lang.String[] { "Address", "PacketId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ibc.applications.fee.v1.FeeProto.getDescriptor();
    com.ibc.core.channel.v1.ChannelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
