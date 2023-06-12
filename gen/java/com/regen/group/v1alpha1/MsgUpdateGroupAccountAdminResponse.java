// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/tx.proto

package com.regen.group.v1alpha1;

/**
 * <pre>
 * MsgUpdateGroupAccountAdminResponse is the Msg/UpdateGroupAccountAdmin response type.
 * </pre>
 *
 * Protobuf type {@code regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse}
 */
public final class MsgUpdateGroupAccountAdminResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse)
    MsgUpdateGroupAccountAdminResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateGroupAccountAdminResponse.newBuilder() to construct.
  private MsgUpdateGroupAccountAdminResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateGroupAccountAdminResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateGroupAccountAdminResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.class, com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse)) {
      return super.equals(obj);
    }
    com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse other = (com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * MsgUpdateGroupAccountAdminResponse is the Msg/UpdateGroupAccountAdmin response type.
   * </pre>
   *
   * Protobuf type {@code regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse)
      com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.class, com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.Builder.class);
    }

    // Construct using com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse_descriptor;
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse getDefaultInstanceForType() {
      return com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse build() {
      com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse buildPartial() {
      com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse result = new com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse) {
        return mergeFrom((com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse other) {
      if (other == com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse)
  }

  // @@protoc_insertion_point(class_scope:regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse)
  private static final com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse();
  }

  public static com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateGroupAccountAdminResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateGroupAccountAdminResponse>() {
    @java.lang.Override
    public MsgUpdateGroupAccountAdminResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MsgUpdateGroupAccountAdminResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateGroupAccountAdminResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

