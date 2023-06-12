// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/query.proto

package com.stafihub.stafihub.ledger;

/**
 * Protobuf type {@code stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse}
 */
public final class QueryGetEraExchangeRateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse)
    QueryGetEraExchangeRateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetEraExchangeRateResponse.newBuilder() to construct.
  private QueryGetEraExchangeRateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetEraExchangeRateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetEraExchangeRateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.class, com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.Builder.class);
  }

  public static final int ERAEXCHANGERATE_FIELD_NUMBER = 1;
  private com.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate_;
  /**
   * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
   * @return Whether the eraExchangeRate field is set.
   */
  @java.lang.Override
  public boolean hasEraExchangeRate() {
    return eraExchangeRate_ != null;
  }
  /**
   * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
   * @return The eraExchangeRate.
   */
  @java.lang.Override
  public com.stafihub.stafihub.ledger.EraExchangeRate getEraExchangeRate() {
    return eraExchangeRate_ == null ? com.stafihub.stafihub.ledger.EraExchangeRate.getDefaultInstance() : eraExchangeRate_;
  }
  /**
   * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.stafihub.stafihub.ledger.EraExchangeRateOrBuilder getEraExchangeRateOrBuilder() {
    return eraExchangeRate_ == null ? com.stafihub.stafihub.ledger.EraExchangeRate.getDefaultInstance() : eraExchangeRate_;
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
    if (eraExchangeRate_ != null) {
      output.writeMessage(1, getEraExchangeRate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eraExchangeRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEraExchangeRate());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse other = (com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse) obj;

    if (hasEraExchangeRate() != other.hasEraExchangeRate()) return false;
    if (hasEraExchangeRate()) {
      if (!getEraExchangeRate()
          .equals(other.getEraExchangeRate())) return false;
    }
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
    if (hasEraExchangeRate()) {
      hash = (37 * hash) + ERAEXCHANGERATE_FIELD_NUMBER;
      hash = (53 * hash) + getEraExchangeRate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse prototype) {
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
   * Protobuf type {@code stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse)
      com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.class, com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.Builder.class);
    }

    // Construct using com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eraExchangeRate_ = null;
      if (eraExchangeRateBuilder_ != null) {
        eraExchangeRateBuilder_.dispose();
        eraExchangeRateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse getDefaultInstanceForType() {
      return com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse build() {
      com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse buildPartial() {
      com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse result = new com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eraExchangeRate_ = eraExchangeRateBuilder_ == null
            ? eraExchangeRate_
            : eraExchangeRateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse) {
        return mergeFrom((com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse other) {
      if (other == com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.getDefaultInstance()) return this;
      if (other.hasEraExchangeRate()) {
        mergeEraExchangeRate(other.getEraExchangeRate());
      }
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
            case 10: {
              input.readMessage(
                  getEraExchangeRateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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
    private int bitField0_;

    private com.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stafihub.stafihub.ledger.EraExchangeRate, com.stafihub.stafihub.ledger.EraExchangeRate.Builder, com.stafihub.stafihub.ledger.EraExchangeRateOrBuilder> eraExchangeRateBuilder_;
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     * @return Whether the eraExchangeRate field is set.
     */
    public boolean hasEraExchangeRate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     * @return The eraExchangeRate.
     */
    public com.stafihub.stafihub.ledger.EraExchangeRate getEraExchangeRate() {
      if (eraExchangeRateBuilder_ == null) {
        return eraExchangeRate_ == null ? com.stafihub.stafihub.ledger.EraExchangeRate.getDefaultInstance() : eraExchangeRate_;
      } else {
        return eraExchangeRateBuilder_.getMessage();
      }
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    public Builder setEraExchangeRate(com.stafihub.stafihub.ledger.EraExchangeRate value) {
      if (eraExchangeRateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eraExchangeRate_ = value;
      } else {
        eraExchangeRateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    public Builder setEraExchangeRate(
        com.stafihub.stafihub.ledger.EraExchangeRate.Builder builderForValue) {
      if (eraExchangeRateBuilder_ == null) {
        eraExchangeRate_ = builderForValue.build();
      } else {
        eraExchangeRateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeEraExchangeRate(com.stafihub.stafihub.ledger.EraExchangeRate value) {
      if (eraExchangeRateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          eraExchangeRate_ != null &&
          eraExchangeRate_ != com.stafihub.stafihub.ledger.EraExchangeRate.getDefaultInstance()) {
          getEraExchangeRateBuilder().mergeFrom(value);
        } else {
          eraExchangeRate_ = value;
        }
      } else {
        eraExchangeRateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearEraExchangeRate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eraExchangeRate_ = null;
      if (eraExchangeRateBuilder_ != null) {
        eraExchangeRateBuilder_.dispose();
        eraExchangeRateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    public com.stafihub.stafihub.ledger.EraExchangeRate.Builder getEraExchangeRateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEraExchangeRateFieldBuilder().getBuilder();
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    public com.stafihub.stafihub.ledger.EraExchangeRateOrBuilder getEraExchangeRateOrBuilder() {
      if (eraExchangeRateBuilder_ != null) {
        return eraExchangeRateBuilder_.getMessageOrBuilder();
      } else {
        return eraExchangeRate_ == null ?
            com.stafihub.stafihub.ledger.EraExchangeRate.getDefaultInstance() : eraExchangeRate_;
      }
    }
    /**
     * <code>.stafihub.stafihub.ledger.EraExchangeRate eraExchangeRate = 1 [json_name = "eraExchangeRate", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stafihub.stafihub.ledger.EraExchangeRate, com.stafihub.stafihub.ledger.EraExchangeRate.Builder, com.stafihub.stafihub.ledger.EraExchangeRateOrBuilder> 
        getEraExchangeRateFieldBuilder() {
      if (eraExchangeRateBuilder_ == null) {
        eraExchangeRateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stafihub.stafihub.ledger.EraExchangeRate, com.stafihub.stafihub.ledger.EraExchangeRate.Builder, com.stafihub.stafihub.ledger.EraExchangeRateOrBuilder>(
                getEraExchangeRate(),
                getParentForChildren(),
                isClean());
        eraExchangeRate_ = null;
      }
      return eraExchangeRateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse)
  private static final com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse();
  }

  public static com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetEraExchangeRateResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetEraExchangeRateResponse>() {
    @java.lang.Override
    public QueryGetEraExchangeRateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetEraExchangeRateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetEraExchangeRateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

