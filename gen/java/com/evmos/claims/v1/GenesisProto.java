// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/claims/v1/genesis.proto

package com.evmos.claims.v1;

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
    internal_static_evmos_claims_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_claims_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_claims_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_claims_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035evmos/claims/v1/genesis.proto\022\017evmos.c" +
      "laims.v1\032\034evmos/claims/v1/claims.proto\032\024" +
      "gogoproto/gogo.proto\032\036google/protobuf/du" +
      "ration.proto\032\037google/protobuf/timestamp." +
      "proto\"\230\001\n\014GenesisState\0225\n\006params\030\001 \001(\0132\027" +
      ".evmos.claims.v1.ParamsB\004\310\336\037\000R\006params\022Q\n" +
      "\016claims_records\030\002 \003(\0132$.evmos.claims.v1." +
      "ClaimsRecordAddressB\004\310\336\037\000R\rclaimsRecords" +
      "\"\261\003\n\006Params\022#\n\renable_claims\030\001 \001(\010R\014enab" +
      "leClaims\022R\n\022airdrop_start_time\030\002 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\010\310\336\037\000\220\337\037\001R\020aird" +
      "ropStartTime\022U\n\024duration_until_decay\030\003 \001" +
      "(\0132\031.google.protobuf.DurationB\010\310\336\037\000\230\337\037\001R" +
      "\022durationUntilDecay\022O\n\021duration_of_decay" +
      "\030\004 \001(\0132\031.google.protobuf.DurationB\010\310\336\037\000\230" +
      "\337\037\001R\017durationOfDecay\022!\n\014claims_denom\030\005 \001" +
      "(\tR\013claimsDenom\022/\n\023authorized_channels\030\006" +
      " \003(\tR\022authorizedChannels\0222\n\014evm_channels" +
      "\030\007 \003(\tB\017\342\336\037\013EVMChannelsR\013evmChannelsB\254\001\n" +
      "\023com.evmos.claims.v1B\014GenesisProtoP\001Z)gi" +
      "thub.com/evmos/evmos/v13/x/claims/types\242" +
      "\002\003ECX\252\002\017Evmos.Claims.V1\312\002\017Evmos\\Claims\\V" +
      "1\342\002\033Evmos\\Claims\\V1\\GPBMetadata\352\002\021Evmos:" +
      ":Claims::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.evmos.claims.v1.ClaimsProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_evmos_claims_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_claims_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_claims_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "ClaimsRecords", });
    internal_static_evmos_claims_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_claims_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_claims_v1_Params_descriptor,
        new java.lang.String[] { "EnableClaims", "AirdropStartTime", "DurationUntilDecay", "DurationOfDecay", "ClaimsDenom", "AuthorizedChannels", "EvmChannels", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.evmos.claims.v1.ClaimsProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
