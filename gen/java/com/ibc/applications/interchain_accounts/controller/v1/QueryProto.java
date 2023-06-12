// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/controller/v1/query.proto

package com.ibc.applications.interchain_accounts.controller.v1;

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
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>ibc/applications/interchain_accounts/c" +
      "ontroller/v1/query.proto\0222ibc.applicatio" +
      "ns.interchain_accounts.controller.v1\032Cib" +
      "c/applications/interchain_accounts/contr" +
      "oller/v1/controller.proto\032\034google/api/an" +
      "notations.proto\"Z\n\035QueryInterchainAccoun" +
      "tRequest\022\024\n\005owner\030\001 \001(\tR\005owner\022#\n\rconnec" +
      "tion_id\030\002 \001(\tR\014connectionId\":\n\036QueryInte" +
      "rchainAccountResponse\022\030\n\007address\030\001 \001(\tR\007" +
      "address\"\024\n\022QueryParamsRequest\"i\n\023QueryPa" +
      "ramsResponse\022R\n\006params\030\001 \001(\0132:.ibc.appli" +
      "cations.interchain_accounts.controller.v" +
      "1.ParamsR\006params2\374\003\n\005Query\022\232\002\n\021Interchai" +
      "nAccount\022Q.ibc.applications.interchain_a" +
      "ccounts.controller.v1.QueryInterchainAcc" +
      "ountRequest\032R.ibc.applications.interchai" +
      "n_accounts.controller.v1.QueryInterchain" +
      "AccountResponse\"^\202\323\344\223\002X\022V/ibc/apps/inter" +
      "chain_accounts/controller/v1/owners/{own" +
      "er}/connections/{connection_id}\022\325\001\n\006Para" +
      "ms\022F.ibc.applications.interchain_account" +
      "s.controller.v1.QueryParamsRequest\032G.ibc" +
      ".applications.interchain_accounts.contro" +
      "ller.v1.QueryParamsResponse\":\202\323\344\223\0024\0222/ib" +
      "c/apps/interchain_accounts/controller/v1" +
      "/paramsB\377\002\n6com.ibc.applications.interch" +
      "ain_accounts.controller.v1B\nQueryProtoP\001" +
      "ZPgithub.com/cosmos/ibc-go/v7/modules/ap" +
      "ps/27-interchain-accounts/controller/typ" +
      "es\242\002\004IAIC\252\0021Ibc.Applications.InterchainA" +
      "ccounts.Controller.V1\312\0021Ibc\\Applications" +
      "\\InterchainAccounts\\Controller\\V1\342\002=Ibc\\" +
      "Applications\\InterchainAccounts\\Controll" +
      "er\\V1\\GPBMetadata\352\0025Ibc::Applications::I" +
      "nterchainAccounts::Controller::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ibc.applications.interchain_accounts.controller.v1.ControllerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_descriptor,
        new java.lang.String[] { "Owner", "ConnectionId", });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.ibc.applications.interchain_accounts.controller.v1.ControllerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
