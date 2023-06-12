// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/query.proto

package com.cudosnode.cudosnode.nft;

/**
 * <pre>
 * QueryDenomBySymbolRequest is the request type for the Query/DenomBySymbol RPC method
 * </pre>
 *
 * Protobuf type {@code cudosnode.cudosnode.nft.QueryDenomBySymbolRequest}
 */
public final class QueryDenomBySymbolRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudosnode.cudosnode.nft.QueryDenomBySymbolRequest)
    QueryDenomBySymbolRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomBySymbolRequest.newBuilder() to construct.
  private QueryDenomBySymbolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomBySymbolRequest() {
    symbol_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomBySymbolRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.class, com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.Builder.class);
  }

  public static final int SYMBOL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object symbol_ = "";
  /**
   * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
   * @return The symbol.
   */
  @java.lang.Override
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
   * @return The bytes for symbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(symbol_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, symbol_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(symbol_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, symbol_);
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
    if (!(obj instanceof com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest)) {
      return super.equals(obj);
    }
    com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest other = (com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest) obj;

    if (!getSymbol()
        .equals(other.getSymbol())) return false;
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
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest parseFrom(
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
  public static Builder newBuilder(com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest prototype) {
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
   * QueryDenomBySymbolRequest is the request type for the Query/DenomBySymbol RPC method
   * </pre>
   *
   * Protobuf type {@code cudosnode.cudosnode.nft.QueryDenomBySymbolRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudosnode.cudosnode.nft.QueryDenomBySymbolRequest)
      com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.class, com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.Builder.class);
    }

    // Construct using com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.newBuilder()
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
      symbol_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest_descriptor;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest getDefaultInstanceForType() {
      return com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest build() {
      com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest buildPartial() {
      com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest result = new com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.symbol_ = symbol_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest) {
        return mergeFrom((com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest other) {
      if (other == com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest.getDefaultInstance()) return this;
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              symbol_ = input.readStringRequireUtf8();
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

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      symbol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      symbol_ = getDefaultInstance().getSymbol();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol", (.gogoproto.moretags) = "yaml:&#92;"symbol&#92;""];</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      symbol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:cudosnode.cudosnode.nft.QueryDenomBySymbolRequest)
  }

  // @@protoc_insertion_point(class_scope:cudosnode.cudosnode.nft.QueryDenomBySymbolRequest)
  private static final com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest();
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomBySymbolRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomBySymbolRequest>() {
    @java.lang.Override
    public QueryDenomBySymbolRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomBySymbolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomBySymbolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudosnode.cudosnode.nft.QueryDenomBySymbolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

