// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/lockup/genesis.proto

package com.osmosis.lockup;

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
    internal_static_osmosis_lockup_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_lockup_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034osmosis/lockup/genesis.proto\022\016osmosis." +
      "lockup\032\024gogoproto/gogo.proto\032\031osmosis/lo" +
      "ckup/lock.proto\"\266\001\n\014GenesisState\022 \n\014last" +
      "_lock_id\030\001 \001(\004R\nlastLockId\0226\n\005locks\030\002 \003(" +
      "\0132\032.osmosis.lockup.PeriodLockB\004\310\336\037\000R\005loc" +
      "ks\022L\n\017synthetic_locks\030\003 \003(\0132\035.osmosis.lo" +
      "ckup.SyntheticLockB\004\310\336\037\000R\016syntheticLocks" +
      "B\257\001\n\022com.osmosis.lockupB\014GenesisProtoP\001Z" +
      "2github.com/osmosis-labs/osmosis/v15/x/l" +
      "ockup/types\242\002\003OLX\252\002\016Osmosis.Lockup\312\002\016Osm" +
      "osis\\Lockup\342\002\032Osmosis\\Lockup\\GPBMetadata" +
      "\352\002\017Osmosis::Lockupb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.osmosis.lockup.LockProto.getDescriptor(),
        });
    internal_static_osmosis_lockup_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_lockup_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_lockup_GenesisState_descriptor,
        new java.lang.String[] { "LastLockId", "Locks", "SyntheticLocks", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.osmosis.lockup.LockProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
