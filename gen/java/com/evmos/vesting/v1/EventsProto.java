// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/vesting/v1/events.proto

package com.evmos.vesting.v1;

public final class EventsProto {
  private EventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_vesting_v1_EventCreateClawbackVestingAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_vesting_v1_EventCreateClawbackVestingAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_vesting_v1_EventClawback_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_vesting_v1_EventClawback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_vesting_v1_EventUpdateVestingFunder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_vesting_v1_EventUpdateVestingFunder_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035evmos/vesting/v1/events.proto\022\020evmos.v" +
      "esting.v1\"\240\001\n!EventCreateClawbackVesting" +
      "Account\022\026\n\006sender\030\001 \001(\tR\006sender\022\024\n\005coins" +
      "\030\002 \001(\tR\005coins\022\035\n\nstart_time\030\003 \001(\tR\tstart" +
      "Time\022\024\n\005merge\030\004 \001(\tR\005merge\022\030\n\007account\030\005 " +
      "\001(\tR\007account\"c\n\rEventClawback\022\026\n\006funder\030" +
      "\001 \001(\tR\006funder\022\030\n\007account\030\002 \001(\tR\007account\022" +
      " \n\013destination\030\003 \001(\tR\013destination\"k\n\030Eve" +
      "ntUpdateVestingFunder\022\026\n\006funder\030\001 \001(\tR\006f" +
      "under\022\030\n\007account\030\002 \001(\tR\007account\022\035\n\nnew_f" +
      "under\030\003 \001(\tR\tnewFunderB\261\001\n\024com.evmos.ves" +
      "ting.v1B\013EventsProtoP\001Z*github.com/evmos" +
      "/evmos/v13/x/vesting/types\242\002\003EVX\252\002\020Evmos" +
      ".Vesting.V1\312\002\020Evmos\\Vesting\\V1\342\002\034Evmos\\V" +
      "esting\\V1\\GPBMetadata\352\002\022Evmos::Vesting::" +
      "V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_evmos_vesting_v1_EventCreateClawbackVestingAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_vesting_v1_EventCreateClawbackVestingAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_vesting_v1_EventCreateClawbackVestingAccount_descriptor,
        new java.lang.String[] { "Sender", "Coins", "StartTime", "Merge", "Account", });
    internal_static_evmos_vesting_v1_EventClawback_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_vesting_v1_EventClawback_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_vesting_v1_EventClawback_descriptor,
        new java.lang.String[] { "Funder", "Account", "Destination", });
    internal_static_evmos_vesting_v1_EventUpdateVestingFunder_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_evmos_vesting_v1_EventUpdateVestingFunder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_vesting_v1_EventUpdateVestingFunder_descriptor,
        new java.lang.String[] { "Funder", "Account", "NewFunder", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
