// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/oracle/v2alpha2/tx.proto

package com.panacea.oracle.v2alpha2;

/**
 * <pre>
 * MsgUpgradeOracleResponse defines the Msg/UpgradeOracle response type.
 * </pre>
 *
 * Protobuf type {@code panacea.oracle.v2alpha2.MsgUpgradeOracleResponse}
 */
public final class MsgUpgradeOracleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.oracle.v2alpha2.MsgUpgradeOracleResponse)
    MsgUpgradeOracleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpgradeOracleResponse.newBuilder() to construct.
  private MsgUpgradeOracleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpgradeOracleResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpgradeOracleResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.class, com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.Builder.class);
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
    if (!(obj instanceof com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse)) {
      return super.equals(obj);
    }
    com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse other = (com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse) obj;

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

  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse parseFrom(
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
  public static Builder newBuilder(com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse prototype) {
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
   * MsgUpgradeOracleResponse defines the Msg/UpgradeOracle response type.
   * </pre>
   *
   * Protobuf type {@code panacea.oracle.v2alpha2.MsgUpgradeOracleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.oracle.v2alpha2.MsgUpgradeOracleResponse)
      com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.class, com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.Builder.class);
    }

    // Construct using com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.newBuilder()
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
      return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse_descriptor;
    }

    @java.lang.Override
    public com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse getDefaultInstanceForType() {
      return com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse build() {
      com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse buildPartial() {
      com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse result = new com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse) {
        return mergeFrom((com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse other) {
      if (other == com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:panacea.oracle.v2alpha2.MsgUpgradeOracleResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.oracle.v2alpha2.MsgUpgradeOracleResponse)
  private static final com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse();
  }

  public static com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpgradeOracleResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpgradeOracleResponse>() {
    @java.lang.Override
    public MsgUpgradeOracleResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpgradeOracleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpgradeOracleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.oracle.v2alpha2.MsgUpgradeOracleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

