// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/epochs/query.proto

package com.stride.epochs;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_epochs_QueryEpochsInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_epochs_QueryEpochsInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_epochs_QueryEpochsInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_epochs_QueryEpochsInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_epochs_QueryCurrentEpochRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_epochs_QueryCurrentEpochRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_epochs_QueryCurrentEpochResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_epochs_QueryCurrentEpochResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_epochs_QueryEpochInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_epochs_QueryEpochInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_epochs_QueryEpochInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_epochs_QueryEpochInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031stride/epochs/query.proto\022\rstride.epoc" +
      "hs\032\024gogoproto/gogo.proto\032\034google/api/ann" +
      "otations.proto\032*cosmos/base/query/v1beta" +
      "1/pagination.proto\032\033stride/epochs/genesi" +
      "s.proto\"`\n\026QueryEpochsInfoRequest\022F\n\npag" +
      "ination\030\001 \001(\0132&.cosmos.base.query.v1beta" +
      "1.PageRequestR\npagination\"\232\001\n\027QueryEpoch" +
      "sInfoResponse\0226\n\006epochs\030\001 \003(\0132\030.stride.e" +
      "pochs.EpochInfoB\004\310\336\037\000R\006epochs\022G\n\npaginat" +
      "ion\030\002 \001(\0132\'.cosmos.base.query.v1beta1.Pa" +
      "geResponseR\npagination\":\n\030QueryCurrentEp" +
      "ochRequest\022\036\n\nidentifier\030\001 \001(\tR\nidentifi" +
      "er\"@\n\031QueryCurrentEpochResponse\022#\n\rcurre" +
      "nt_epoch\030\001 \001(\003R\014currentEpoch\"7\n\025QueryEpo" +
      "chInfoRequest\022\036\n\nidentifier\030\001 \001(\tR\nident" +
      "ifier\"N\n\026QueryEpochInfoResponse\0224\n\005epoch" +
      "\030\001 \001(\0132\030.stride.epochs.EpochInfoB\004\310\336\037\000R\005" +
      "epoch2\245\003\n\005Query\022~\n\nEpochInfos\022%.stride.e" +
      "pochs.QueryEpochsInfoRequest\032&.stride.ep" +
      "ochs.QueryEpochsInfoResponse\"!\202\323\344\223\002\033\022\031/S" +
      "tridelabs/stride/epochs\022\222\001\n\014CurrentEpoch" +
      "\022\'.stride.epochs.QueryCurrentEpochReques" +
      "t\032(.stride.epochs.QueryCurrentEpochRespo" +
      "nse\"/\202\323\344\223\002)\022\'/Stridelabs/stride/epochs/c" +
      "urrent_epoch\022\206\001\n\tEpochInfo\022$.stride.epoc" +
      "hs.QueryEpochInfoRequest\032%.stride.epochs" +
      ".QueryEpochInfoResponse\",\202\323\344\223\002&\022$/Stride" +
      "labs/stride/epochs/epoch_infoB\245\001\n\021com.st" +
      "ride.epochsB\nQueryProtoP\001Z/github.com/St" +
      "ride-Labs/stride/v9/x/epochs/types\242\002\003SEX" +
      "\252\002\rStride.Epochs\312\002\rStride\\Epochs\342\002\031Strid" +
      "e\\Epochs\\GPBMetadata\352\002\016Stride::Epochsb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.stride.epochs.GenesisProto.getDescriptor(),
        });
    internal_static_stride_epochs_QueryEpochsInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_epochs_QueryEpochsInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_epochs_QueryEpochsInfoRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_stride_epochs_QueryEpochsInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stride_epochs_QueryEpochsInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_epochs_QueryEpochsInfoResponse_descriptor,
        new java.lang.String[] { "Epochs", "Pagination", });
    internal_static_stride_epochs_QueryCurrentEpochRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stride_epochs_QueryCurrentEpochRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_epochs_QueryCurrentEpochRequest_descriptor,
        new java.lang.String[] { "Identifier", });
    internal_static_stride_epochs_QueryCurrentEpochResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stride_epochs_QueryCurrentEpochResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_epochs_QueryCurrentEpochResponse_descriptor,
        new java.lang.String[] { "CurrentEpoch", });
    internal_static_stride_epochs_QueryEpochInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_stride_epochs_QueryEpochInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_epochs_QueryEpochInfoRequest_descriptor,
        new java.lang.String[] { "Identifier", });
    internal_static_stride_epochs_QueryEpochInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_stride_epochs_QueryEpochInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_epochs_QueryEpochInfoResponse_descriptor,
        new java.lang.String[] { "Epoch", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.stride.epochs.GenesisProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
