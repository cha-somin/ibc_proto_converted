// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/delegation/v1beta1/genesis.proto

package com.kyve.delegation.v1beta1;

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
    internal_static_kyve_delegation_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_delegation_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%kyve/delegation/v1beta1/genesis.proto\022" +
      "\027kyve.delegation.v1beta1\032\024gogoproto/gogo" +
      ".proto\032(kyve/delegation/v1beta1/delegati" +
      "on.proto\032$kyve/delegation/v1beta1/params" +
      ".proto\"\231\006\n\014GenesisState\022=\n\006params\030\001 \001(\0132" +
      "\037.kyve.delegation.v1beta1.ParamsB\004\310\336\037\000R\006" +
      "params\022O\n\016delegator_list\030\002 \003(\0132\".kyve.de" +
      "legation.v1beta1.DelegatorB\004\310\336\037\000R\rdelega" +
      "torList\022b\n\025delegation_entry_list\030\003 \003(\0132(" +
      ".kyve.delegation.v1beta1.DelegationEntry" +
      "B\004\310\336\037\000R\023delegationEntryList\022_\n\024delegatio" +
      "n_data_list\030\004 \003(\0132\'.kyve.delegation.v1be" +
      "ta1.DelegationDataB\004\310\336\037\000R\022delegationData" +
      "List\022b\n\025delegation_slash_list\030\005 \003(\0132(.ky" +
      "ve.delegation.v1beta1.DelegationSlashB\004\310" +
      "\336\037\000R\023delegationSlashList\022x\n\035undelegation" +
      "_queue_entry_list\030\006 \003(\0132/.kyve.delegatio" +
      "n.v1beta1.UndelegationQueueEntryB\004\310\336\037\000R\032" +
      "undelegationQueueEntryList\022c\n\030queue_stat" +
      "e_undelegation\030\007 \001(\0132#.kyve.delegation.v" +
      "1beta1.QueueStateB\004\310\336\037\000R\026queueStateUndel" +
      "egation\022q\n\032redelegation_cooldown_list\030\010 " +
      "\003(\0132-.kyve.delegation.v1beta1.Redelegati" +
      "onCooldownB\004\310\336\037\000R\030redelegationCooldownLi" +
      "stB\332\001\n\033com.kyve.delegation.v1beta1B\014Gene" +
      "sisProtoP\001Z/github.com/KYVENetwork/chain" +
      "/x/delegation/types\242\002\003KDX\252\002\027Kyve.Delegat" +
      "ion.V1beta1\312\002\027Kyve\\Delegation\\V1beta1\342\002#" +
      "Kyve\\Delegation\\V1beta1\\GPBMetadata\352\002\031Ky" +
      "ve::Delegation::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.kyve.delegation.v1beta1.DelegationProto.getDescriptor(),
          com.kyve.delegation.v1beta1.ParamsProto.getDescriptor(),
        });
    internal_static_kyve_delegation_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kyve_delegation_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_delegation_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "DelegatorList", "DelegationEntryList", "DelegationDataList", "DelegationSlashList", "UndelegationQueueEntryList", "QueueStateUndelegation", "RedelegationCooldownList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.kyve.delegation.v1beta1.DelegationProto.getDescriptor();
    com.kyve.delegation.v1beta1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
