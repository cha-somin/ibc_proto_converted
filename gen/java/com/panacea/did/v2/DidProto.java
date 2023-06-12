// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package com.panacea.did.v2;

public final class DidProto {
  private DidProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_Strings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_Strings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_DIDDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_DIDDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_VerificationMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_VerificationMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_VerificationRelationship_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_VerificationRelationship_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_DIDDocumentWithSeq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_did_v2_DataWithSeq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_did_v2_DataWithSeq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030panacea/did/v2/did.proto\022\016panacea.did." +
      "v2\032\024gogoproto/gogo.proto\"!\n\007Strings\022\026\n\006v" +
      "alues\030\001 \003(\tR\006values\"\226\007\n\013DIDDocument\022L\n\010c" +
      "ontexts\030\001 \001(\0132\027.panacea.did.v2.StringsB\027" +
      "\332\336\037\023JSONStringOrStringsR\010@context\022\016\n\002id\030" +
      "\002 \001(\tR\002id\022P\n\ncontroller\030\003 \001(\0132\027.panacea." +
      "did.v2.StringsB\027\332\336\037\023JSONStringOrStringsR" +
      "\ncontroller\022T\n\024verification_methods\030\004 \003(" +
      "\0132\".panacea.did.v2.VerificationMethodR\022v" +
      "erificationMethod\022o\n\017authentications\030\005 \003" +
      "(\0132(.panacea.did.v2.VerificationRelation" +
      "shipB\034\332\336\037\030VerificationRelationshipR\016auth" +
      "entication\022r\n\021assertion_methods\030\006 \003(\0132(." +
      "panacea.did.v2.VerificationRelationshipB" +
      "\034\332\336\037\030VerificationRelationshipR\017assertion" +
      "Method\022l\n\016key_agreements\030\007 \003(\0132(.panacea" +
      ".did.v2.VerificationRelationshipB\034\332\336\037\030Ve" +
      "rificationRelationshipR\014keyAgreement\022|\n\026" +
      "capability_invocations\030\010 \003(\0132(.panacea.d" +
      "id.v2.VerificationRelationshipB\034\332\336\037\030Veri" +
      "ficationRelationshipR\024capabilityInvocati" +
      "on\022|\n\026capability_delegations\030\t \003(\0132(.pan" +
      "acea.did.v2.VerificationRelationshipB\034\332\336" +
      "\037\030VerificationRelationshipR\024capabilityDe" +
      "legation\0222\n\010services\030\n \003(\0132\027.panacea.did" +
      ".v2.ServiceR\007service\"\204\001\n\022VerificationMet" +
      "hod\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004type\030\002 \001(\tR\004type\022" +
      "\036\n\ncontroller\030\003 \001(\tR\ncontroller\022*\n\021publi" +
      "c_key_base58\030\004 \001(\tR\017publicKeyBase58\"\264\001\n\030" +
      "VerificationRelationship\0226\n\026verification" +
      "_method_id\030\001 \001(\tH\000R\024verificationMethodId" +
      "\022U\n\023verification_method\030\002 \001(\0132\".panacea." +
      "did.v2.VerificationMethodH\000R\022verificatio" +
      "nMethodB\t\n\007content\"X\n\007Service\022\016\n\002id\030\001 \001(" +
      "\tR\002id\022\022\n\004type\030\002 \001(\tR\004type\022)\n\020service_end" +
      "point\030\003 \001(\tR\017serviceEndpoint\"i\n\022DIDDocum" +
      "entWithSeq\0227\n\010document\030\001 \001(\0132\033.panacea.d" +
      "id.v2.DIDDocumentR\010document\022\032\n\010sequence\030" +
      "\002 \001(\004R\010sequence\"=\n\013DataWithSeq\022\022\n\004data\030\001" +
      " \001(\014R\004data\022\032\n\010sequence\030\002 \001(\004R\010sequenceB\251" +
      "\001\n\022com.panacea.did.v2B\010DidProtoP\001Z/githu" +
      "b.com/medibloc/panacea-core/v2/x/did/typ" +
      "es\242\002\003PDX\252\002\016Panacea.Did.V2\312\002\016Panacea\\Did\\" +
      "V2\342\002\032Panacea\\Did\\V2\\GPBMetadata\352\002\020Panace" +
      "a::Did::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_panacea_did_v2_Strings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_did_v2_Strings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_Strings_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_panacea_did_v2_DIDDocument_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_did_v2_DIDDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_DIDDocument_descriptor,
        new java.lang.String[] { "Contexts", "Id", "Controller", "VerificationMethods", "Authentications", "AssertionMethods", "KeyAgreements", "CapabilityInvocations", "CapabilityDelegations", "Services", });
    internal_static_panacea_did_v2_VerificationMethod_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_panacea_did_v2_VerificationMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_VerificationMethod_descriptor,
        new java.lang.String[] { "Id", "Type", "Controller", "PublicKeyBase58", });
    internal_static_panacea_did_v2_VerificationRelationship_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_panacea_did_v2_VerificationRelationship_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_VerificationRelationship_descriptor,
        new java.lang.String[] { "VerificationMethodId", "VerificationMethod", "Content", });
    internal_static_panacea_did_v2_Service_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_panacea_did_v2_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_Service_descriptor,
        new java.lang.String[] { "Id", "Type", "ServiceEndpoint", });
    internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_panacea_did_v2_DIDDocumentWithSeq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor,
        new java.lang.String[] { "Document", "Sequence", });
    internal_static_panacea_did_v2_DataWithSeq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_panacea_did_v2_DataWithSeq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_did_v2_DataWithSeq_descriptor,
        new java.lang.String[] { "Data", "Sequence", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
