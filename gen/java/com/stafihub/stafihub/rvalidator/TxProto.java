// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rvalidator/tx.proto

package com.stafihub.stafihub.rvalidator;

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
    internal_static_stafihub_stafihub_rvalidator_MsgInitRValidator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgInitRValidator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSeconds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSeconds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgAddRValidator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgAddRValidator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgRmRValidator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgRmRValidator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034stafihub/rvalidator/tx.proto\022\034stafihub" +
      ".stafihub.rvalidator\032\024gogoproto/gogo.pro" +
      "to\"\215\001\n\021MsgInitRValidator\022\030\n\007creator\030\001 \001(" +
      "\tR\007creator\022\024\n\005denom\030\002 \001(\tR\005denom\022 \n\013pool" +
      "Address\030\003 \001(\tR\013poolAddress\022&\n\016valAddress" +
      "List\030\004 \003(\tR\016valAddressList\"\033\n\031MsgInitRVa" +
      "lidatorResponse\"k\n\022MsgSetCycleSeconds\022\030\n" +
      "\007creator\030\001 \001(\tR\007creator\022\024\n\005denom\030\002 \001(\tR\005" +
      "denom\022%\n\007seconds\030\003 \001(\004B\013\352\336\037\007secondsR\007sec" +
      "onds\"\034\n\032MsgSetCycleSecondsResponse\"m\n\024Ms" +
      "gSetShuffleSeconds\022\030\n\007creator\030\001 \001(\tR\007cre" +
      "ator\022\024\n\005denom\030\002 \001(\tR\005denom\022%\n\007seconds\030\003 " +
      "\001(\004B\013\352\336\037\007secondsR\007seconds\"\036\n\034MsgSetShuff" +
      "leSecondsResponse\"\204\001\n\020MsgAddRValidator\022\030" +
      "\n\007creator\030\001 \001(\tR\007creator\022\024\n\005denom\030\002 \001(\tR" +
      "\005denom\022 \n\013poolAddress\030\003 \001(\tR\013poolAddress" +
      "\022\036\n\nvalAddress\030\004 \001(\tR\nvalAddress\"\032\n\030MsgA" +
      "ddRValidatorResponse\"\243\001\n\017MsgRmRValidator" +
      "\022\030\n\007creator\030\001 \001(\tR\007creator\022\024\n\005denom\030\002 \001(" +
      "\tR\005denom\022 \n\013poolAddress\030\003 \001(\tR\013poolAddre" +
      "ss\022\036\n\noldAddress\030\004 \001(\tR\noldAddress\022\036\n\nne" +
      "wAddress\030\005 \001(\tR\nnewAddress\"\031\n\027MsgRmRVali" +
      "datorResponse2\365\004\n\003Msg\022z\n\016InitRValidator\022" +
      "/.stafihub.stafihub.rvalidator.MsgInitRV" +
      "alidator\0327.stafihub.stafihub.rvalidator." +
      "MsgInitRValidatorResponse\022}\n\017SetCycleSec" +
      "onds\0220.stafihub.stafihub.rvalidator.MsgS" +
      "etCycleSeconds\0328.stafihub.stafihub.rvali" +
      "dator.MsgSetCycleSecondsResponse\022\203\001\n\021Set" +
      "ShuffleSeconds\0222.stafihub.stafihub.rvali" +
      "dator.MsgSetShuffleSeconds\032:.stafihub.st" +
      "afihub.rvalidator.MsgSetShuffleSecondsRe" +
      "sponse\022w\n\rAddRValidator\022..stafihub.stafi" +
      "hub.rvalidator.MsgAddRValidator\0326.stafih" +
      "ub.stafihub.rvalidator.MsgAddRValidatorR" +
      "esponse\022t\n\014RmRValidator\022-.stafihub.stafi" +
      "hub.rvalidator.MsgRmRValidator\0325.stafihu" +
      "b.stafihub.rvalidator.MsgRmRValidatorRes" +
      "ponseB\356\001\n com.stafihub.stafihub.rvalidat" +
      "orB\007TxProtoP\001Z/github.com/stafihub/stafi" +
      "hub/x/rvalidator/types\242\002\003SSR\252\002\034Stafihub." +
      "Stafihub.Rvalidator\312\002\034Stafihub\\Stafihub\\" +
      "Rvalidator\342\002(Stafihub\\Stafihub\\Rvalidato" +
      "r\\GPBMetadata\352\002\036Stafihub::Stafihub::Rval" +
      "idatorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stafihub_stafihub_rvalidator_MsgInitRValidator_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stafihub_stafihub_rvalidator_MsgInitRValidator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgInitRValidator_descriptor,
        new java.lang.String[] { "Creator", "Denom", "PoolAddress", "ValAddressList", });
    internal_static_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse_descriptor,
        new java.lang.String[] { });
    internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSeconds_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSeconds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSeconds_descriptor,
        new java.lang.String[] { "Creator", "Denom", "Seconds", });
    internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds_descriptor,
        new java.lang.String[] { "Creator", "Denom", "Seconds", });
    internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_stafihub_stafihub_rvalidator_MsgAddRValidator_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_stafihub_stafihub_rvalidator_MsgAddRValidator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgAddRValidator_descriptor,
        new java.lang.String[] { "Creator", "Denom", "PoolAddress", "ValAddress", });
    internal_static_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse_descriptor,
        new java.lang.String[] { });
    internal_static_stafihub_stafihub_rvalidator_MsgRmRValidator_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_stafihub_stafihub_rvalidator_MsgRmRValidator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgRmRValidator_descriptor,
        new java.lang.String[] { "Creator", "Denom", "PoolAddress", "OldAddress", "NewAddress", });
    internal_static_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
