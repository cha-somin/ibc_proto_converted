// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/erc20.proto

package com.evmos.erc20.v1;

public final class Erc20Proto {
  private Erc20Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_TokenPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_TokenPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_RegisterCoinProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_RegisterCoinProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_RegisterERC20Proposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_RegisterERC20Proposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_ToggleTokenConversionProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_ToggleTokenConversionProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_erc20_v1_ProposalMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_erc20_v1_ProposalMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032evmos/erc20/v1/erc20.proto\022\016evmos.erc2" +
      "0.v1\032\036cosmos/bank/v1beta1/bank.proto\032\024go" +
      "goproto/gogo.proto\"\244\001\n\tTokenPair\022#\n\rerc2" +
      "0_address\030\001 \001(\tR\014erc20Address\022\024\n\005denom\030\002" +
      " \001(\tR\005denom\022\030\n\007enabled\030\003 \001(\010R\007enabled\022<\n" +
      "\016contract_owner\030\004 \001(\0162\025.evmos.erc20.v1.O" +
      "wnerR\rcontractOwner:\004\350\240\037\001\"\225\001\n\024RegisterCo" +
      "inProposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013desc" +
      "ription\030\002 \001(\tR\013description\022?\n\010metadata\030\003" +
      " \003(\0132\035.cosmos.bank.v1beta1.MetadataB\004\310\336\037" +
      "\000R\010metadata:\004\350\240\037\000\"}\n\025RegisterERC20Propos" +
      "al\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030" +
      "\002 \001(\tR\013description\022&\n\016erc20addresses\030\003 \003" +
      "(\tR\016erc20addresses:\004\350\240\037\000\"s\n\035ToggleTokenC" +
      "onversionProposal\022\024\n\005title\030\001 \001(\tR\005title\022" +
      " \n\013description\030\002 \001(\tR\013description\022\024\n\005tok" +
      "en\030\003 \001(\tR\005token:\004\350\240\037\001\"S\n\020ProposalMetadat" +
      "a\022?\n\010metadata\030\001 \003(\0132\035.cosmos.bank.v1beta" +
      "1.MetadataB\004\310\336\037\000R\010metadata*J\n\005Owner\022\025\n\021O" +
      "WNER_UNSPECIFIED\020\000\022\020\n\014OWNER_MODULE\020\001\022\022\n\016" +
      "OWNER_EXTERNAL\020\002\032\004\210\243\036\000B\244\001\n\022com.evmos.erc" +
      "20.v1B\nErc20ProtoP\001Z(github.com/evmos/ev" +
      "mos/v13/x/erc20/types\242\002\003EEX\252\002\016Evmos.Erc2" +
      "0.V1\312\002\016Evmos\\Erc20\\V1\342\002\032Evmos\\Erc20\\V1\\G" +
      "PBMetadata\352\002\020Evmos::Erc20::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.bank.v1beta1.BankProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_evmos_erc20_v1_TokenPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_erc20_v1_TokenPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_TokenPair_descriptor,
        new java.lang.String[] { "Erc20Address", "Denom", "Enabled", "ContractOwner", });
    internal_static_evmos_erc20_v1_RegisterCoinProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_erc20_v1_RegisterCoinProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_RegisterCoinProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Metadata", });
    internal_static_evmos_erc20_v1_RegisterERC20Proposal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_evmos_erc20_v1_RegisterERC20Proposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_RegisterERC20Proposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Erc20Addresses", });
    internal_static_evmos_erc20_v1_ToggleTokenConversionProposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_evmos_erc20_v1_ToggleTokenConversionProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_ToggleTokenConversionProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Token", });
    internal_static_evmos_erc20_v1_ProposalMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_evmos_erc20_v1_ProposalMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_erc20_v1_ProposalMetadata_descriptor,
        new java.lang.String[] { "Metadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.bank.v1beta1.BankProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
