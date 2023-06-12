// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchaintxs/v1/query.proto

package com.neutron.interchaintxs;

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
    internal_static_neutron_interchaintxs_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_interchaintxs_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_interchaintxs_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_interchaintxs_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_interchaintxs_QueryInterchainAccountAddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_interchaintxs_QueryInterchainAccountAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_interchaintxs_QueryInterchainAccountAddressResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_interchaintxs_QueryInterchainAccountAddressResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$neutron/interchaintxs/v1/query.proto\022\025" +
      "neutron.interchaintxs\032\024gogoproto/gogo.pr" +
      "oto\032\034google/api/annotations.proto\032*cosmo" +
      "s/base/query/v1beta1/pagination.proto\032%n" +
      "eutron/interchaintxs/v1/params.proto\"\024\n\022" +
      "QueryParamsRequest\"R\n\023QueryParamsRespons" +
      "e\022;\n\006params\030\001 \001(\0132\035.neutron.interchaintx" +
      "s.ParamsB\004\310\336\037\000R\006params\"\256\001\n$QueryIntercha" +
      "inAccountAddressRequest\022#\n\rowner_address" +
      "\030\001 \001(\tR\014ownerAddress\0222\n\025interchain_accou" +
      "nt_id\030\002 \001(\tR\023interchainAccountId\022#\n\rconn" +
      "ection_id\030\003 \001(\tR\014connectionId:\010\210\240\037\000\350\240\037\000\"" +
      "e\n%QueryInterchainAccountAddressResponse" +
      "\022<\n\032interchain_account_address\030\001 \001(\tR\030in" +
      "terchainAccountAddress2\204\002\n\005Query\022a\n\006Para" +
      "ms\022).neutron.interchaintxs.QueryParamsRe" +
      "quest\032*.neutron.interchaintxs.QueryParam" +
      "sResponse\"\000\022\227\001\n\030InterchainAccountAddress" +
      "\022;.neutron.interchaintxs.QueryInterchain" +
      "AccountAddressRequest\032<.neutron.intercha" +
      "intxs.QueryInterchainAccountAddressRespo" +
      "nse\"\000B\322\001\n\031com.neutron.interchaintxsB\nQue" +
      "ryProtoP\001Z4github.com/neutron-org/neutro" +
      "n/x/interchaintxs/types\242\002\003NIX\252\002\025Neutron." +
      "Interchaintxs\312\002\025Neutron\\Interchaintxs\342\002!" +
      "Neutron\\Interchaintxs\\GPBMetadata\352\002\026Neut" +
      "ron::Interchaintxsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.neutron.interchaintxs.ParamsProto.getDescriptor(),
        });
    internal_static_neutron_interchaintxs_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_neutron_interchaintxs_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_interchaintxs_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_neutron_interchaintxs_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_neutron_interchaintxs_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_interchaintxs_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_neutron_interchaintxs_QueryInterchainAccountAddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_neutron_interchaintxs_QueryInterchainAccountAddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_interchaintxs_QueryInterchainAccountAddressRequest_descriptor,
        new java.lang.String[] { "OwnerAddress", "InterchainAccountId", "ConnectionId", });
    internal_static_neutron_interchaintxs_QueryInterchainAccountAddressResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_neutron_interchaintxs_QueryInterchainAccountAddressResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_interchaintxs_QueryInterchainAccountAddressResponse_descriptor,
        new java.lang.String[] { "InterchainAccountAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.neutron.interchaintxs.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
