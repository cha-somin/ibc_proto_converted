// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/emergencybutton/v1beta1/query.proto

package com.secret.emergencybutton.v1beta1;

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
    internal_static_secret_emergencybutton_v1beta1_ParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_secret_emergencybutton_v1beta1_ParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_secret_emergencybutton_v1beta1_ParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_secret_emergencybutton_v1beta1_ParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*secret/emergencybutton/v1beta1/query.p" +
      "roto\022\036secret.emergencybutton.v1beta1\032\024go" +
      "goproto/gogo.proto\032\034google/api/annotatio" +
      "ns.proto\032+secret/emergencybutton/v1beta1" +
      "/params.proto\"\017\n\rParamsRequest\"V\n\016Params" +
      "Response\022D\n\006params\030\001 \001(\0132&.secret.emerge" +
      "ncybutton.v1beta1.ParamsB\004\310\336\037\000R\006params2\232" +
      "\001\n\005Query\022\220\001\n\006Params\022-.secret.emergencybu" +
      "tton.v1beta1.ParamsRequest\032..secret.emer" +
      "gencybutton.v1beta1.ParamsResponse\"\'\202\323\344\223" +
      "\002!\022\037/emergencybutton/v1beta1/paramsB\205\002\n\"" +
      "com.secret.emergencybutton.v1beta1B\nQuer" +
      "yProtoP\001Z9github.com/scrtlabs/SecretNetw" +
      "ork/x/emergencybutton/types\242\002\003SEX\252\002\036Secr" +
      "et.Emergencybutton.V1beta1\312\002\036Secret\\Emer" +
      "gencybutton\\V1beta1\342\002*Secret\\Emergencybu" +
      "tton\\V1beta1\\GPBMetadata\352\002 Secret::Emerg" +
      "encybutton::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.secret.emergencybutton.v1beta1.ParamsProto.getDescriptor(),
        });
    internal_static_secret_emergencybutton_v1beta1_ParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_secret_emergencybutton_v1beta1_ParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_secret_emergencybutton_v1beta1_ParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_secret_emergencybutton_v1beta1_ParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_secret_emergencybutton_v1beta1_ParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_secret_emergencybutton_v1beta1_ParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.secret.emergencybutton.v1beta1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
