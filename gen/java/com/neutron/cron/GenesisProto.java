// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/cron/genesis.proto

package com.neutron.cron;

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
    internal_static_neutron_cron_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032neutron/cron/genesis.proto\022\014neutron.cr" +
      "on\032\024gogoproto/gogo.proto\032\031neutron/cron/p" +
      "arams.proto\032\033neutron/cron/schedule.proto" +
      "\"\204\001\n\014GenesisState\022@\n\014scheduleList\030\002 \003(\0132" +
      "\026.neutron.cron.ScheduleB\004\310\336\037\000R\014scheduleL" +
      "ist\0222\n\006params\030\001 \001(\0132\024.neutron.cron.Param" +
      "sB\004\310\336\037\000R\006paramsB\236\001\n\020com.neutron.cronB\014Ge" +
      "nesisProtoP\001Z+github.com/neutron-org/neu" +
      "tron/x/cron/types\242\002\003NCX\252\002\014Neutron.Cron\312\002" +
      "\014Neutron\\Cron\342\002\030Neutron\\Cron\\GPBMetadata" +
      "\352\002\rNeutron::Cronb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.neutron.cron.ParamsProto.getDescriptor(),
          com.neutron.cron.ScheduleProto.getDescriptor(),
        });
    internal_static_neutron_cron_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_neutron_cron_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_GenesisState_descriptor,
        new java.lang.String[] { "ScheduleList", "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.neutron.cron.ParamsProto.getDescriptor();
    com.neutron.cron.ScheduleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
