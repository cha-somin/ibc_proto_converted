// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/iid/v1beta1/types.proto

package com.ixo.iid.v1beta1;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_Context_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_AccordedRight_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_AccordedRight_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_LinkedResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_LinkedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_LinkedClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_LinkedClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_LinkedEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_LinkedEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_VerificationMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_VerificationMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_iid_v1beta1_IidMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_iid_v1beta1_IidMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ixo/iid/v1beta1/types.proto\022\017ixo.iid.v" +
      "1beta1\032\024gogoproto/gogo.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"7\n\007Context\022\020\n\003key\030" +
      "\001 \001(\tR\003key\022\020\n\003val\030\002 \001(\tR\003val:\010\210\240\037\000\350\240\037\001\"\217" +
      "\001\n\rAccordedRight\022\022\n\004type\030\001 \001(\tR\004type\022\016\n\002" +
      "id\030\002 \001(\tR\002id\022\034\n\tmechanism\030\003 \001(\tR\tmechani" +
      "sm\022\030\n\007message\030\004 \001(\tR\007message\022\030\n\007service\030" +
      "\005 \001(\tR\007service:\010\210\240\037\000\350\240\037\001\"\362\001\n\016LinkedResou" +
      "rce\022\022\n\004type\030\001 \001(\tR\004type\022\016\n\002id\030\002 \001(\tR\002id\022" +
      " \n\013description\030\003 \001(\tR\013description\022\034\n\tmed" +
      "iaType\030\004 \001(\tR\tmediaType\022(\n\017serviceEndpoi" +
      "nt\030\005 \001(\tR\017serviceEndpoint\022\024\n\005proof\030\006 \001(\t" +
      "R\005proof\022\034\n\tencrypted\030\007 \001(\tR\tencrypted\022\024\n" +
      "\005right\030\010 \001(\tR\005right:\010\210\240\037\000\350\240\037\001\"\321\001\n\013Linked" +
      "Claim\022\022\n\004type\030\001 \001(\tR\004type\022\016\n\002id\030\002 \001(\tR\002i" +
      "d\022 \n\013description\030\003 \001(\tR\013description\022(\n\017s" +
      "erviceEndpoint\030\004 \001(\tR\017serviceEndpoint\022\024\n" +
      "\005proof\030\005 \001(\tR\005proof\022\034\n\tencrypted\030\006 \001(\tR\t" +
      "encrypted\022\024\n\005right\030\007 \001(\tR\005right:\010\210\240\037\000\350\240\037" +
      "\001\"z\n\014LinkedEntity\022\022\n\004type\030\001 \001(\tR\004type\022\016\n" +
      "\002id\030\002 \001(\tR\002id\022\"\n\014relationship\030\003 \001(\tR\014rel" +
      "ationship\022\030\n\007service\030\004 \001(\tR\007service:\010\210\240\037" +
      "\000\350\240\037\001\"\262\002\n\022VerificationMethod\022\016\n\002id\030\001 \001(\t" +
      "R\002id\022\022\n\004type\030\002 \001(\tR\004type\022\036\n\ncontroller\030\003" +
      " \001(\tR\ncontroller\0222\n\023blockchainAccountID\030" +
      "\004 \001(\tH\000R\023blockchainAccountID\022$\n\014publicKe" +
      "yHex\030\005 \001(\tH\000R\014publicKeyHex\0220\n\022publicKeyM" +
      "ultibase\030\006 \001(\tH\000R\022publicKeyMultibase\022*\n\017" +
      "publicKeyBase58\030\007 \001(\tH\000R\017publicKeyBase58" +
      ":\010\210\240\037\000\350\240\037\001B\026\n\024verificationMaterial\"a\n\007Se" +
      "rvice\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004type\030\002 \001(\tR\004typ" +
      "e\022(\n\017serviceEndpoint\030\003 \001(\tR\017serviceEndpo" +
      "int:\010\210\240\037\000\350\240\037\001\"\317\001\n\013IidMetadata\022\034\n\tversion" +
      "Id\030\001 \001(\tR\tversionId\022:\n\007created\030\002 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\004\220\337\037\001R\007created\022" +
      ":\n\007updated\030\003 \001(\0132\032.google.protobuf.Times" +
      "tampB\004\220\337\037\001R\007updated\022 \n\013deactivated\030\004 \001(\010" +
      "R\013deactivated:\010\210\240\037\000\350\240\037\001B\264\001\n\023com.ixo.iid." +
      "v1beta1B\nTypesProtoP\001Z3github.com/ixofou" +
      "ndation/ixo-blockchain/x/iid/types\242\002\003IIX" +
      "\252\002\017Ixo.Iid.V1beta1\312\002\017Ixo\\Iid\\V1beta1\342\002\033I" +
      "xo\\Iid\\V1beta1\\GPBMetadata\352\002\021Ixo::Iid::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_ixo_iid_v1beta1_Context_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ixo_iid_v1beta1_Context_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_Context_descriptor,
        new java.lang.String[] { "Key", "Val", });
    internal_static_ixo_iid_v1beta1_AccordedRight_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ixo_iid_v1beta1_AccordedRight_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_AccordedRight_descriptor,
        new java.lang.String[] { "Type", "Id", "Mechanism", "Message", "Service", });
    internal_static_ixo_iid_v1beta1_LinkedResource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ixo_iid_v1beta1_LinkedResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_LinkedResource_descriptor,
        new java.lang.String[] { "Type", "Id", "Description", "MediaType", "ServiceEndpoint", "Proof", "Encrypted", "Right", });
    internal_static_ixo_iid_v1beta1_LinkedClaim_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ixo_iid_v1beta1_LinkedClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_LinkedClaim_descriptor,
        new java.lang.String[] { "Type", "Id", "Description", "ServiceEndpoint", "Proof", "Encrypted", "Right", });
    internal_static_ixo_iid_v1beta1_LinkedEntity_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ixo_iid_v1beta1_LinkedEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_LinkedEntity_descriptor,
        new java.lang.String[] { "Type", "Id", "Relationship", "Service", });
    internal_static_ixo_iid_v1beta1_VerificationMethod_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ixo_iid_v1beta1_VerificationMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_VerificationMethod_descriptor,
        new java.lang.String[] { "Id", "Type", "Controller", "BlockchainAccountID", "PublicKeyHex", "PublicKeyMultibase", "PublicKeyBase58", "VerificationMaterial", });
    internal_static_ixo_iid_v1beta1_Service_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ixo_iid_v1beta1_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_Service_descriptor,
        new java.lang.String[] { "Id", "Type", "ServiceEndpoint", });
    internal_static_ixo_iid_v1beta1_IidMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ixo_iid_v1beta1_IidMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_iid_v1beta1_IidMetadata_descriptor,
        new java.lang.String[] { "VersionId", "Created", "Updated", "Deactivated", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
