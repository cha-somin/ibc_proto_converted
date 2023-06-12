// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rmintreward/tx.proto

package com.stafihub.stafihub.rmintreward;

/**
 * Protobuf type {@code stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse}
 */
public final class MsgClaimMintRewardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse)
    MsgClaimMintRewardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgClaimMintRewardResponse.newBuilder() to construct.
  private MsgClaimMintRewardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgClaimMintRewardResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgClaimMintRewardResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.rmintreward.TxProto.internal_static_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.rmintreward.TxProto.internal_static_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.class, com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.Builder.class);
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
    if (!(obj instanceof com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse other = (com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse) obj;

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

  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse prototype) {
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
   * Protobuf type {@code stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse)
      com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.rmintreward.TxProto.internal_static_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.rmintreward.TxProto.internal_static_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.class, com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.Builder.class);
    }

    // Construct using com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.newBuilder()
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
      return com.stafihub.stafihub.rmintreward.TxProto.internal_static_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse getDefaultInstanceForType() {
      return com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse build() {
      com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse buildPartial() {
      com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse result = new com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse) {
        return mergeFrom((com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse other) {
      if (other == com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse)
  private static final com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse();
  }

  public static com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgClaimMintRewardResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgClaimMintRewardResponse>() {
    @java.lang.Override
    public MsgClaimMintRewardResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgClaimMintRewardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgClaimMintRewardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

