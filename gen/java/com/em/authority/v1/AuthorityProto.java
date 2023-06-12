// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/authority/v1/authority.proto

package com.em.authority.v1;

public final class AuthorityProto {
  private AuthorityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_authority_v1_Authority_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_authority_v1_Authority_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_authority_v1_GasPrices_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_authority_v1_GasPrices_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037em/authority/v1/authority.proto\022\017em.au" +
      "thority.v1\032\024gogoproto/gogo.proto\032\036cosmos" +
      "/base/v1beta1/coin.proto\032\037google/protobu" +
      "f/timestamp.proto\"\336\001\n\tAuthority\022,\n\007addre" +
      "ss\030\001 \001(\tB\022\362\336\037\016yaml:\"address\"R\007address\022@\n" +
      "\016former_address\030\002 \001(\tB\031\362\336\037\025yaml:\"former_" +
      "address\"R\rformerAddress\022a\n\rlast_modified" +
      "\030\003 \001(\0132\032.google.protobuf.TimestampB \310\336\037\000" +
      "\362\336\037\024yaml:\"last_modified\"\220\337\037\001R\014lastModifi" +
      "ed\"\212\001\n\tGasPrices\022}\n\007minimum\030\001 \003(\0132\034.cosm" +
      "os.base.v1beta1.DecCoinBE\310\336\037\000\362\336\037\016yaml:\"m" +
      "inimum\"\252\337\037+github.com/cosmos/cosmos-sdk/" +
      "types.DecCoinsR\007minimumB\263\001\n\023com.em.autho" +
      "rity.v1B\016AuthorityProtoP\001Z.github.com/e-" +
      "money/em-ledger/x/authority/types\242\002\003EAX\252" +
      "\002\017Em.Authority.V1\312\002\017Em\\Authority\\V1\342\002\033Em" +
      "\\Authority\\V1\\GPBMetadata\352\002\021Em::Authorit" +
      "y::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_em_authority_v1_Authority_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_em_authority_v1_Authority_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_authority_v1_Authority_descriptor,
        new java.lang.String[] { "Address", "FormerAddress", "LastModified", });
    internal_static_em_authority_v1_GasPrices_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_em_authority_v1_GasPrices_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_authority_v1_GasPrices_descriptor,
        new java.lang.String[] { "Minimum", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
