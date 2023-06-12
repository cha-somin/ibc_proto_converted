// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/events.proto

package com.bitsong.fantoken.v1beta1;

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
    internal_static_bitsong_fantoken_v1beta1_EventIssue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventIssue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_EventDisableMint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventDisableMint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_EventMint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventMint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_EventBurn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventBurn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_EventSetAuthority_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventSetAuthority_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_EventSetMinter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventSetMinter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_EventSetUri_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_EventSetUri_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%bitsong/fantoken/v1beta1/events.proto\022" +
      "\030bitsong.fantoken.v1beta1\032\024gogoproto/gog" +
      "o.proto\"\"\n\nEventIssue\022\024\n\005denom\030\001 \001(\tR\005de" +
      "nom\"(\n\020EventDisableMint\022\024\n\005denom\030\001 \001(\tR\005" +
      "denom\"=\n\tEventMint\022\034\n\trecipient\030\001 \001(\tR\tr" +
      "ecipient\022\022\n\004coin\030\002 \001(\tR\004coin\"7\n\tEventBur" +
      "n\022\026\n\006sender\030\001 \001(\tR\006sender\022\022\n\004coin\030\002 \001(\tR" +
      "\004coin\"\247\001\n\021EventSetAuthority\022\024\n\005denom\030\001 \001" +
      "(\tR\005denom\022=\n\rold_authority\030\002 \001(\tB\030\362\336\037\024ya" +
      "ml:\"old_authority\"R\014oldAuthority\022=\n\rnew_" +
      "authority\030\003 \001(\tB\030\362\336\037\024yaml:\"new_authority" +
      "\"R\014newAuthority\"\222\001\n\016EventSetMinter\022\024\n\005de" +
      "nom\030\001 \001(\tR\005denom\0224\n\nold_minter\030\002 \001(\tB\025\362\336" +
      "\037\021yaml:\"old_minter\"R\toldMinter\0224\n\nnew_mi" +
      "nter\030\003 \001(\tB\025\362\336\037\021yaml:\"new_minter\"R\tnewMi" +
      "nter\"#\n\013EventSetUri\022\024\n\005denom\030\001 \001(\tR\005deno" +
      "mB\345\001\n\034com.bitsong.fantoken.v1beta1B\013Even" +
      "tsProtoP\001Z6github.com/bitsongofficial/go" +
      "-bitsong/x/fantoken/types\242\002\003BFX\252\002\030Bitson" +
      "g.Fantoken.V1beta1\312\002\030Bitsong\\Fantoken\\V1" +
      "beta1\342\002$Bitsong\\Fantoken\\V1beta1\\GPBMeta" +
      "data\352\002\032Bitsong::Fantoken::V1beta1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_bitsong_fantoken_v1beta1_EventIssue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bitsong_fantoken_v1beta1_EventIssue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventIssue_descriptor,
        new java.lang.String[] { "Denom", });
    internal_static_bitsong_fantoken_v1beta1_EventDisableMint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bitsong_fantoken_v1beta1_EventDisableMint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventDisableMint_descriptor,
        new java.lang.String[] { "Denom", });
    internal_static_bitsong_fantoken_v1beta1_EventMint_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bitsong_fantoken_v1beta1_EventMint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventMint_descriptor,
        new java.lang.String[] { "Recipient", "Coin", });
    internal_static_bitsong_fantoken_v1beta1_EventBurn_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bitsong_fantoken_v1beta1_EventBurn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventBurn_descriptor,
        new java.lang.String[] { "Sender", "Coin", });
    internal_static_bitsong_fantoken_v1beta1_EventSetAuthority_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bitsong_fantoken_v1beta1_EventSetAuthority_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventSetAuthority_descriptor,
        new java.lang.String[] { "Denom", "OldAuthority", "NewAuthority", });
    internal_static_bitsong_fantoken_v1beta1_EventSetMinter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bitsong_fantoken_v1beta1_EventSetMinter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventSetMinter_descriptor,
        new java.lang.String[] { "Denom", "OldMinter", "NewMinter", });
    internal_static_bitsong_fantoken_v1beta1_EventSetUri_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bitsong_fantoken_v1beta1_EventSetUri_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_EventSetUri_descriptor,
        new java.lang.String[] { "Denom", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
