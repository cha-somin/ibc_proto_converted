// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/vote/v1beta1/service.proto

package com.axelar.vote.v1beta1;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!axelar/vote/v1beta1/service.proto\022\023axe" +
      "lar.vote.v1beta1\032\024gogoproto/gogo.proto\032\034" +
      "google/api/annotations.proto\032\034axelar/vot" +
      "e/v1beta1/tx.proto2w\n\nMsgService\022i\n\004Vote" +
      "\022 .axelar.vote.v1beta1.VoteRequest\032!.axe" +
      "lar.vote.v1beta1.VoteResponse\"\034\202\323\344\223\002\026\"\021/" +
      "axelar/vote/vote:\001*B\312\001\n\027com.axelar.vote." +
      "v1beta1B\014ServiceProtoZ1github.com/axelar" +
      "network/axelar-core/x/vote/types\242\002\003AVX\252\002" +
      "\023Axelar.Vote.V1beta1\312\002\023Axelar\\Vote\\V1bet" +
      "a1\342\002\037Axelar\\Vote\\V1beta1\\GPBMetadata\352\002\025A" +
      "xelar::Vote::V1beta1\300\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.axelar.vote.v1beta1.TxProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoRegistration);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.axelar.vote.v1beta1.TxProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
