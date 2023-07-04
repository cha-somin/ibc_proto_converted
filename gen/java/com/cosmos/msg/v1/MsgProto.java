// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/msg/v1/msg.proto

package com.cosmos.msg.v1;

public final class MsgProto {
  private MsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.cosmos.msg.v1.MsgProto.service);
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int SERVICE_FIELD_NUMBER = 11110000;
  /**
   * <pre>
   * service indicates that the service is a Msg service and that requests
   * must be transported via blockchain transactions rather than gRPC.
   * Tooling can use this annotation to distinguish between Msg services and
   * other types of services via reflection.
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.Boolean> service = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int SIGNER_FIELD_NUMBER = 11110000;
  /**
   * <pre>
   * signer must be used in cosmos messages in order
   * to signal to external clients which fields in a
   * given cosmos message must be filled with signer
   * information (address).
   * The field must be the protobuf name of the message
   * field extended with this MessageOption.
   * The field must either be of string kind, or of message
   * kind in case the signer information is contained within
   * a message inside the cosmos message.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.util.List<java.lang.String>> signer = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027cosmos/msg/v1/msg.proto\022\rcosmos.msg.v1" +
      "\032 google/protobuf/descriptor.proto:<\n\007se" +
      "rvice\022\037.google.protobuf.ServiceOptions\030\360" +
      "\214\246\005 \001(\010R\007service::\n\006signer\022\037.google.prot" +
      "obuf.MessageOptions\030\360\214\246\005 \003(\tR\006signerB\240\001\n" +
      "\021com.cosmos.msg.v1B\010MsgProtoZ-github.com" +
      "/cosmos/cosmos-sdk/types/msgservice\242\002\003CM" +
      "X\252\002\rCosmos.Msg.V1\312\002\rCosmos\\Msg\\V1\342\002\031Cosm" +
      "os\\Msg\\V1\\GPBMetadata\352\002\017Cosmos::Msg::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    service.internalInit(descriptor.getExtensions().get(0));
    signer.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}