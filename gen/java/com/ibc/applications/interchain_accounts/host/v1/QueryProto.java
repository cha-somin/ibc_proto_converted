// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/host/v1/query.proto

package com.ibc.applications.interchain_accounts.host.v1;

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
    internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8ibc/applications/interchain_accounts/h" +
      "ost/v1/query.proto\022,ibc.applications.int" +
      "erchain_accounts.host.v1\032\034google/api/ann" +
      "otations.proto\0327ibc/applications/interch" +
      "ain_accounts/host/v1/host.proto\"\024\n\022Query" +
      "ParamsRequest\"c\n\023QueryParamsResponse\022L\n\006" +
      "params\030\001 \001(\01324.ibc.applications.intercha" +
      "in_accounts.host.v1.ParamsR\006params2\315\001\n\005Q" +
      "uery\022\303\001\n\006Params\022@.ibc.applications.inter" +
      "chain_accounts.host.v1.QueryParamsReques" +
      "t\032A.ibc.applications.interchain_accounts" +
      ".host.v1.QueryParamsResponse\"4\202\323\344\223\002.\022,/i" +
      "bc/apps/interchain_accounts/host/v1/para" +
      "msB\333\002\n0com.ibc.applications.interchain_a" +
      "ccounts.host.v1B\nQueryProtoP\001ZJgithub.co" +
      "m/cosmos/ibc-go/v7/modules/apps/27-inter" +
      "chain-accounts/host/types\242\002\004IAIH\252\002+Ibc.A" +
      "pplications.InterchainAccounts.Host.V1\312\002" +
      "+Ibc\\Applications\\InterchainAccounts\\Hos" +
      "t\\V1\342\0027Ibc\\Applications\\InterchainAccoun" +
      "ts\\Host\\V1\\GPBMetadata\352\002/Ibc::Applicatio" +
      "ns::InterchainAccounts::Host::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.ibc.applications.interchain_accounts.host.v1.HostProto.getDescriptor(),
        });
    internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.ibc.applications.interchain_accounts.host.v1.HostProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
