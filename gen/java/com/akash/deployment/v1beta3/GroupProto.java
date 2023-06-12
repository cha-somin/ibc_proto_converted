// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta3/group.proto

package com.akash.deployment.v1beta3;

public final class GroupProto {
  private GroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_deployment_v1beta3_Group_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_deployment_v1beta3_Group_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$akash/deployment/v1beta3/group.proto\022\030" +
      "akash.deployment.v1beta3\032\024gogoproto/gogo" +
      ".proto\032&akash/deployment/v1beta3/groupid" +
      ".proto\032(akash/deployment/v1beta3/groupsp" +
      "ec.proto\"\202\004\n\005Group\022`\n\010group_id\030\001 \001(\0132!.a" +
      "kash.deployment.v1beta3.GroupIDB\"\310\336\037\000\342\336\037" +
      "\007GroupID\352\336\037\002id\362\336\037\tyaml:\"id\"R\007groupId\022V\n\005" +
      "state\030\002 \001(\0162%.akash.deployment.v1beta3.G" +
      "roup.StateB\031\352\336\037\005state\362\336\037\014yaml:\"state\"R\005s" +
      "tate\022_\n\ngroup_spec\030\003 \001(\0132#.akash.deploym" +
      "ent.v1beta3.GroupSpecB\033\310\336\037\000\352\336\037\004spec\362\336\037\013y" +
      "aml:\"spec\"R\tgroupSpec\022\035\n\ncreated_at\030\004 \001(" +
      "\003R\tcreatedAt\"\270\001\n\005State\022\"\n\007invalid\020\000\032\025\212\235 " +
      "\021GroupStateInvalid\022\027\n\004open\020\001\032\r\212\235 \tGroupO" +
      "pen\022\033\n\006paused\020\002\032\017\212\235 \013GroupPaused\0222\n\022insu" +
      "fficient_funds\020\003\032\032\212\235 \026GroupInsufficientF" +
      "unds\022\033\n\006closed\020\004\032\017\212\235 \013GroupClosed\032\004\210\243\036\000:" +
      "\004\350\240\037\000B\353\001\n\034com.akash.deployment.v1beta3B\n" +
      "GroupProtoP\001Z=github.com/akash-network/a" +
      "kash-api/go/node/deployment/v1beta3\242\002\003AD" +
      "X\252\002\030Akash.Deployment.V1beta3\312\002\030Akash\\Dep" +
      "loyment\\V1beta3\342\002$Akash\\Deployment\\V1bet" +
      "a3\\GPBMetadata\352\002\032Akash::Deployment::V1be" +
      "ta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.deployment.v1beta3.GroupidProto.getDescriptor(),
          com.akash.deployment.v1beta3.GroupspecProto.getDescriptor(),
        });
    internal_static_akash_deployment_v1beta3_Group_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_deployment_v1beta3_Group_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_deployment_v1beta3_Group_descriptor,
        new java.lang.String[] { "GroupId", "State", "GroupSpec", "CreatedAt", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.deployment.v1beta3.GroupidProto.getDescriptor();
    com.akash.deployment.v1beta3.GroupspecProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
