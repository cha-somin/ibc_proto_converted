// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/tx.proto

package com.cosmos.bank.v1beta1;

/**
 * <pre>
 * MsgUpdateParamsResponse defines the response structure for executing a
 * MsgUpdateParams message.
 *
 * Since: cosmos-sdk 0.47
 * </pre>
 *
 * Protobuf type {@code cosmos.bank.v1beta1.MsgUpdateParamsResponse}
 */
public final class MsgUpdateParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.bank.v1beta1.MsgUpdateParamsResponse)
    MsgUpdateParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateParamsResponse.newBuilder() to construct.
  private MsgUpdateParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateParamsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateParamsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.bank.v1beta1.TxProto.internal_static_cosmos_bank_v1beta1_MsgUpdateParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.bank.v1beta1.TxProto.internal_static_cosmos_bank_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.class, com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.Builder.class);
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
    if (!(obj instanceof com.cosmos.bank.v1beta1.MsgUpdateParamsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.bank.v1beta1.MsgUpdateParamsResponse other = (com.cosmos.bank.v1beta1.MsgUpdateParamsResponse) obj;

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

  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.bank.v1beta1.MsgUpdateParamsResponse prototype) {
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
   * MsgUpdateParamsResponse defines the response structure for executing a
   * MsgUpdateParams message.
   *
   * Since: cosmos-sdk 0.47
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.v1beta1.MsgUpdateParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.bank.v1beta1.MsgUpdateParamsResponse)
      com.cosmos.bank.v1beta1.MsgUpdateParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.bank.v1beta1.TxProto.internal_static_cosmos_bank_v1beta1_MsgUpdateParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.bank.v1beta1.TxProto.internal_static_cosmos_bank_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.class, com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.Builder.class);
    }

    // Construct using com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.newBuilder()
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
      return com.cosmos.bank.v1beta1.TxProto.internal_static_cosmos_bank_v1beta1_MsgUpdateParamsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.bank.v1beta1.MsgUpdateParamsResponse getDefaultInstanceForType() {
      return com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.bank.v1beta1.MsgUpdateParamsResponse build() {
      com.cosmos.bank.v1beta1.MsgUpdateParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.bank.v1beta1.MsgUpdateParamsResponse buildPartial() {
      com.cosmos.bank.v1beta1.MsgUpdateParamsResponse result = new com.cosmos.bank.v1beta1.MsgUpdateParamsResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.bank.v1beta1.MsgUpdateParamsResponse) {
        return mergeFrom((com.cosmos.bank.v1beta1.MsgUpdateParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.bank.v1beta1.MsgUpdateParamsResponse other) {
      if (other == com.cosmos.bank.v1beta1.MsgUpdateParamsResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:cosmos.bank.v1beta1.MsgUpdateParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.bank.v1beta1.MsgUpdateParamsResponse)
  private static final com.cosmos.bank.v1beta1.MsgUpdateParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.bank.v1beta1.MsgUpdateParamsResponse();
  }

  public static com.cosmos.bank.v1beta1.MsgUpdateParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateParamsResponse>() {
    @java.lang.Override
    public MsgUpdateParamsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateParamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateParamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.bank.v1beta1.MsgUpdateParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

