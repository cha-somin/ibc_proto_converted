// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/tx.proto

package com.axelar.nexus.v1beta1;

/**
 * <pre>
 * SetTransferRateLimitRequest represents a message to set rate limits on
 * transfers
 * </pre>
 *
 * Protobuf type {@code axelar.nexus.v1beta1.SetTransferRateLimitRequest}
 */
public final class SetTransferRateLimitRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.nexus.v1beta1.SetTransferRateLimitRequest)
    SetTransferRateLimitRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetTransferRateLimitRequest.newBuilder() to construct.
  private SetTransferRateLimitRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetTransferRateLimitRequest() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    chain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetTransferRateLimitRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.nexus.v1beta1.TxProto.internal_static_axelar_nexus_v1beta1_SetTransferRateLimitRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.nexus.v1beta1.TxProto.internal_static_axelar_nexus_v1beta1_SetTransferRateLimitRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.class, com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSender() {
    return sender_;
  }

  public static final int CHAIN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chain_ = "";
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  @java.lang.Override
  public java.lang.String getChain() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chain_ = s;
      return s;
    }
  }
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainBytes() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin limit_;
  /**
   * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
   * @return Whether the limit field is set.
   */
  @java.lang.Override
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
   * @return The limit.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getLimit() {
    return limit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : limit_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getLimitOrBuilder() {
    return limit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : limit_;
  }

  public static final int WINDOW_FIELD_NUMBER = 4;
  private com.google.protobuf.Duration window_;
  /**
   * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the window field is set.
   */
  @java.lang.Override
  public boolean hasWindow() {
    return window_ != null;
  }
  /**
   * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The window.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getWindow() {
    return window_ == null ? com.google.protobuf.Duration.getDefaultInstance() : window_;
  }
  /**
   * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getWindowOrBuilder() {
    return window_ == null ? com.google.protobuf.Duration.getDefaultInstance() : window_;
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
    if (!sender_.isEmpty()) {
      output.writeBytes(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chain_);
    }
    if (limit_ != null) {
      output.writeMessage(3, getLimit());
    }
    if (window_ != null) {
      output.writeMessage(4, getWindow());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!sender_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chain_);
    }
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLimit());
    }
    if (window_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getWindow());
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
    if (!(obj instanceof com.axelar.nexus.v1beta1.SetTransferRateLimitRequest)) {
      return super.equals(obj);
    }
    com.axelar.nexus.v1beta1.SetTransferRateLimitRequest other = (com.axelar.nexus.v1beta1.SetTransferRateLimitRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getChain()
        .equals(other.getChain())) return false;
    if (hasLimit() != other.hasLimit()) return false;
    if (hasLimit()) {
      if (!getLimit()
          .equals(other.getLimit())) return false;
    }
    if (hasWindow() != other.hasWindow()) return false;
    if (hasWindow()) {
      if (!getWindow()
          .equals(other.getWindow())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getChain().hashCode();
    if (hasLimit()) {
      hash = (37 * hash) + LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getLimit().hashCode();
    }
    if (hasWindow()) {
      hash = (37 * hash) + WINDOW_FIELD_NUMBER;
      hash = (53 * hash) + getWindow().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.nexus.v1beta1.SetTransferRateLimitRequest prototype) {
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
   * SetTransferRateLimitRequest represents a message to set rate limits on
   * transfers
   * </pre>
   *
   * Protobuf type {@code axelar.nexus.v1beta1.SetTransferRateLimitRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.nexus.v1beta1.SetTransferRateLimitRequest)
      com.axelar.nexus.v1beta1.SetTransferRateLimitRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.nexus.v1beta1.TxProto.internal_static_axelar_nexus_v1beta1_SetTransferRateLimitRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.nexus.v1beta1.TxProto.internal_static_axelar_nexus_v1beta1_SetTransferRateLimitRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.class, com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.Builder.class);
    }

    // Construct using com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.newBuilder()
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
      sender_ = com.google.protobuf.ByteString.EMPTY;
      chain_ = "";
      limit_ = null;
      if (limitBuilder_ != null) {
        limitBuilder_.dispose();
        limitBuilder_ = null;
      }
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.nexus.v1beta1.TxProto.internal_static_axelar_nexus_v1beta1_SetTransferRateLimitRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.SetTransferRateLimitRequest getDefaultInstanceForType() {
      return com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.SetTransferRateLimitRequest build() {
      com.axelar.nexus.v1beta1.SetTransferRateLimitRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.SetTransferRateLimitRequest buildPartial() {
      com.axelar.nexus.v1beta1.SetTransferRateLimitRequest result = new com.axelar.nexus.v1beta1.SetTransferRateLimitRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.nexus.v1beta1.SetTransferRateLimitRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chain_ = chain_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.limit_ = limitBuilder_ == null
            ? limit_
            : limitBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.window_ = windowBuilder_ == null
            ? window_
            : windowBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.nexus.v1beta1.SetTransferRateLimitRequest) {
        return mergeFrom((com.axelar.nexus.v1beta1.SetTransferRateLimitRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.nexus.v1beta1.SetTransferRateLimitRequest other) {
      if (other == com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (!other.getChain().isEmpty()) {
        chain_ = other.chain_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLimit()) {
        mergeLimit(other.getLimit());
      }
      if (other.hasWindow()) {
        mergeWindow(other.getWindow());
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
              sender_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              chain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getLimitFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getWindowFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The sender.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSender() {
      return sender_;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sender_ = getDefaultInstance().getSender();
      onChanged();
      return this;
    }

    private java.lang.Object chain_ = "";
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The chain.
     */
    public java.lang.String getChain() {
      java.lang.Object ref = chain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The bytes for chain.
     */
    public com.google.protobuf.ByteString
        getChainBytes() {
      java.lang.Object ref = chain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The chain to set.
     * @return This builder for chaining.
     */
    public Builder setChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChain() {
      chain_ = getDefaultInstance().getChain();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The bytes for chain to set.
     * @return This builder for chaining.
     */
    public Builder setChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin limit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> limitBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     * @return Whether the limit field is set.
     */
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     * @return The limit.
     */
    public com.cosmos.base.v1beta1.Coin getLimit() {
      if (limitBuilder_ == null) {
        return limit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : limit_;
      } else {
        return limitBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLimit(com.cosmos.base.v1beta1.Coin value) {
      if (limitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        limit_ = value;
      } else {
        limitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLimit(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (limitBuilder_ == null) {
        limit_ = builderForValue.build();
      } else {
        limitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeLimit(com.cosmos.base.v1beta1.Coin value) {
      if (limitBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          limit_ != null &&
          limit_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getLimitBuilder().mergeFrom(value);
        } else {
          limit_ = value;
        }
      } else {
        limitBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000004);
      limit_ = null;
      if (limitBuilder_ != null) {
        limitBuilder_.dispose();
        limitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getLimitBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLimitFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getLimitOrBuilder() {
      if (limitBuilder_ != null) {
        return limitBuilder_.getMessageOrBuilder();
      } else {
        return limit_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : limit_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin limit = 3 [json_name = "limit", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getLimitFieldBuilder() {
      if (limitBuilder_ == null) {
        limitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getLimit(),
                getParentForChildren(),
                isClean());
        limit_ = null;
      }
      return limitBuilder_;
    }

    private com.google.protobuf.Duration window_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> windowBuilder_;
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the window field is set.
     */
    public boolean hasWindow() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The window.
     */
    public com.google.protobuf.Duration getWindow() {
      if (windowBuilder_ == null) {
        return window_ == null ? com.google.protobuf.Duration.getDefaultInstance() : window_;
      } else {
        return windowBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setWindow(com.google.protobuf.Duration value) {
      if (windowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        window_ = value;
      } else {
        windowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setWindow(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (windowBuilder_ == null) {
        window_ = builderForValue.build();
      } else {
        windowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeWindow(com.google.protobuf.Duration value) {
      if (windowBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          window_ != null &&
          window_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getWindowBuilder().mergeFrom(value);
        } else {
          window_ = value;
        }
      } else {
        windowBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearWindow() {
      bitField0_ = (bitField0_ & ~0x00000008);
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getWindowBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getWindowFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getWindowOrBuilder() {
      if (windowBuilder_ != null) {
        return windowBuilder_.getMessageOrBuilder();
      } else {
        return window_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : window_;
      }
    }
    /**
     * <code>.google.protobuf.Duration window = 4 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getWindowFieldBuilder() {
      if (windowBuilder_ == null) {
        windowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getWindow(),
                getParentForChildren(),
                isClean());
        window_ = null;
      }
      return windowBuilder_;
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


    // @@protoc_insertion_point(builder_scope:axelar.nexus.v1beta1.SetTransferRateLimitRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.nexus.v1beta1.SetTransferRateLimitRequest)
  private static final com.axelar.nexus.v1beta1.SetTransferRateLimitRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.nexus.v1beta1.SetTransferRateLimitRequest();
  }

  public static com.axelar.nexus.v1beta1.SetTransferRateLimitRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetTransferRateLimitRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetTransferRateLimitRequest>() {
    @java.lang.Override
    public SetTransferRateLimitRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetTransferRateLimitRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetTransferRateLimitRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.nexus.v1beta1.SetTransferRateLimitRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

