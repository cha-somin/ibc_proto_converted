// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.SubaccountPosition}
 */
public final class SubaccountPosition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.SubaccountPosition)
    SubaccountPositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubaccountPosition.newBuilder() to construct.
  private SubaccountPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubaccountPosition() {
    subaccountId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubaccountPosition();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SubaccountPosition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SubaccountPosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.SubaccountPosition.class, com.injective.exchange.v1beta1.SubaccountPosition.Builder.class);
  }

  public static final int POSITION_FIELD_NUMBER = 1;
  private com.injective.exchange.v1beta1.Position position_;
  /**
   * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
   * @return Whether the position field is set.
   */
  @java.lang.Override
  public boolean hasPosition() {
    return position_ != null;
  }
  /**
   * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
   * @return The position.
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.Position getPosition() {
    return position_ == null ? com.injective.exchange.v1beta1.Position.getDefaultInstance() : position_;
  }
  /**
   * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.PositionOrBuilder getPositionOrBuilder() {
    return position_ == null ? com.injective.exchange.v1beta1.Position.getDefaultInstance() : position_;
  }

  public static final int SUBACCOUNT_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString subaccountId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes subaccount_id = 2 [json_name = "subaccountId"];</code>
   * @return The subaccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubaccountId() {
    return subaccountId_;
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
    if (position_ != null) {
      output.writeMessage(1, getPosition());
    }
    if (!subaccountId_.isEmpty()) {
      output.writeBytes(2, subaccountId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (position_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPosition());
    }
    if (!subaccountId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, subaccountId_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.SubaccountPosition)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.SubaccountPosition other = (com.injective.exchange.v1beta1.SubaccountPosition) obj;

    if (hasPosition() != other.hasPosition()) return false;
    if (hasPosition()) {
      if (!getPosition()
          .equals(other.getPosition())) return false;
    }
    if (!getSubaccountId()
        .equals(other.getSubaccountId())) return false;
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
    if (hasPosition()) {
      hash = (37 * hash) + POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getPosition().hashCode();
    }
    hash = (37 * hash) + SUBACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubaccountId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.SubaccountPosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.SubaccountPosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.SubaccountPosition parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.SubaccountPosition prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.SubaccountPosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.SubaccountPosition)
      com.injective.exchange.v1beta1.SubaccountPositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SubaccountPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SubaccountPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.SubaccountPosition.class, com.injective.exchange.v1beta1.SubaccountPosition.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.SubaccountPosition.newBuilder()
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
      position_ = null;
      if (positionBuilder_ != null) {
        positionBuilder_.dispose();
        positionBuilder_ = null;
      }
      subaccountId_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SubaccountPosition_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.SubaccountPosition getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.SubaccountPosition.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.SubaccountPosition build() {
      com.injective.exchange.v1beta1.SubaccountPosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.SubaccountPosition buildPartial() {
      com.injective.exchange.v1beta1.SubaccountPosition result = new com.injective.exchange.v1beta1.SubaccountPosition(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.SubaccountPosition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.position_ = positionBuilder_ == null
            ? position_
            : positionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subaccountId_ = subaccountId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.SubaccountPosition) {
        return mergeFrom((com.injective.exchange.v1beta1.SubaccountPosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.SubaccountPosition other) {
      if (other == com.injective.exchange.v1beta1.SubaccountPosition.getDefaultInstance()) return this;
      if (other.hasPosition()) {
        mergePosition(other.getPosition());
      }
      if (other.getSubaccountId() != com.google.protobuf.ByteString.EMPTY) {
        setSubaccountId(other.getSubaccountId());
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
                  getPositionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              subaccountId_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.injective.exchange.v1beta1.Position position_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.Position, com.injective.exchange.v1beta1.Position.Builder, com.injective.exchange.v1beta1.PositionOrBuilder> positionBuilder_;
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     * @return Whether the position field is set.
     */
    public boolean hasPosition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     * @return The position.
     */
    public com.injective.exchange.v1beta1.Position getPosition() {
      if (positionBuilder_ == null) {
        return position_ == null ? com.injective.exchange.v1beta1.Position.getDefaultInstance() : position_;
      } else {
        return positionBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    public Builder setPosition(com.injective.exchange.v1beta1.Position value) {
      if (positionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        position_ = value;
      } else {
        positionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    public Builder setPosition(
        com.injective.exchange.v1beta1.Position.Builder builderForValue) {
      if (positionBuilder_ == null) {
        position_ = builderForValue.build();
      } else {
        positionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    public Builder mergePosition(com.injective.exchange.v1beta1.Position value) {
      if (positionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          position_ != null &&
          position_ != com.injective.exchange.v1beta1.Position.getDefaultInstance()) {
          getPositionBuilder().mergeFrom(value);
        } else {
          position_ = value;
        }
      } else {
        positionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    public Builder clearPosition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      position_ = null;
      if (positionBuilder_ != null) {
        positionBuilder_.dispose();
        positionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    public com.injective.exchange.v1beta1.Position.Builder getPositionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPositionFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    public com.injective.exchange.v1beta1.PositionOrBuilder getPositionOrBuilder() {
      if (positionBuilder_ != null) {
        return positionBuilder_.getMessageOrBuilder();
      } else {
        return position_ == null ?
            com.injective.exchange.v1beta1.Position.getDefaultInstance() : position_;
      }
    }
    /**
     * <code>.injective.exchange.v1beta1.Position position = 1 [json_name = "position"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.Position, com.injective.exchange.v1beta1.Position.Builder, com.injective.exchange.v1beta1.PositionOrBuilder> 
        getPositionFieldBuilder() {
      if (positionBuilder_ == null) {
        positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.exchange.v1beta1.Position, com.injective.exchange.v1beta1.Position.Builder, com.injective.exchange.v1beta1.PositionOrBuilder>(
                getPosition(),
                getParentForChildren(),
                isClean());
        position_ = null;
      }
      return positionBuilder_;
    }

    private com.google.protobuf.ByteString subaccountId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes subaccount_id = 2 [json_name = "subaccountId"];</code>
     * @return The subaccountId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSubaccountId() {
      return subaccountId_;
    }
    /**
     * <code>bytes subaccount_id = 2 [json_name = "subaccountId"];</code>
     * @param value The subaccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSubaccountId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      subaccountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes subaccount_id = 2 [json_name = "subaccountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubaccountId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      subaccountId_ = getDefaultInstance().getSubaccountId();
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.SubaccountPosition)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.SubaccountPosition)
  private static final com.injective.exchange.v1beta1.SubaccountPosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.SubaccountPosition();
  }

  public static com.injective.exchange.v1beta1.SubaccountPosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubaccountPosition>
      PARSER = new com.google.protobuf.AbstractParser<SubaccountPosition>() {
    @java.lang.Override
    public SubaccountPosition parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubaccountPosition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubaccountPosition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.SubaccountPosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

