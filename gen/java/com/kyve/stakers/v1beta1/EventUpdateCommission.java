// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/stakers/v1beta1/events.proto

package com.kyve.stakers.v1beta1;

/**
 * <pre>
 * EventUpdateCommission ...
 * emitted_by: EndBlock
 * </pre>
 *
 * Protobuf type {@code kyve.stakers.v1beta1.EventUpdateCommission}
 */
public final class EventUpdateCommission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.stakers.v1beta1.EventUpdateCommission)
    EventUpdateCommissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventUpdateCommission.newBuilder() to construct.
  private EventUpdateCommission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventUpdateCommission() {
    staker_ = "";
    commission_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventUpdateCommission();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventUpdateCommission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventUpdateCommission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.stakers.v1beta1.EventUpdateCommission.class, com.kyve.stakers.v1beta1.EventUpdateCommission.Builder.class);
  }

  public static final int STAKER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object staker_ = "";
  /**
   * <pre>
   * staker is the account address of the protocol node.
   * </pre>
   *
   * <code>string staker = 1 [json_name = "staker"];</code>
   * @return The staker.
   */
  @java.lang.Override
  public java.lang.String getStaker() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      staker_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * staker is the account address of the protocol node.
   * </pre>
   *
   * <code>string staker = 1 [json_name = "staker"];</code>
   * @return The bytes for staker.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStakerBytes() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      staker_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMISSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object commission_ = "";
  /**
   * <pre>
   * commission ...
   * </pre>
   *
   * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The commission.
   */
  @java.lang.Override
  public java.lang.String getCommission() {
    java.lang.Object ref = commission_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commission_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * commission ...
   * </pre>
   *
   * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for commission.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommissionBytes() {
    java.lang.Object ref = commission_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commission_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, staker_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commission_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, commission_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, staker_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commission_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, commission_);
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
    if (!(obj instanceof com.kyve.stakers.v1beta1.EventUpdateCommission)) {
      return super.equals(obj);
    }
    com.kyve.stakers.v1beta1.EventUpdateCommission other = (com.kyve.stakers.v1beta1.EventUpdateCommission) obj;

    if (!getStaker()
        .equals(other.getStaker())) return false;
    if (!getCommission()
        .equals(other.getCommission())) return false;
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
    hash = (37 * hash) + STAKER_FIELD_NUMBER;
    hash = (53 * hash) + getStaker().hashCode();
    hash = (37 * hash) + COMMISSION_FIELD_NUMBER;
    hash = (53 * hash) + getCommission().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.stakers.v1beta1.EventUpdateCommission parseFrom(
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
  public static Builder newBuilder(com.kyve.stakers.v1beta1.EventUpdateCommission prototype) {
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
   * EventUpdateCommission ...
   * emitted_by: EndBlock
   * </pre>
   *
   * Protobuf type {@code kyve.stakers.v1beta1.EventUpdateCommission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.stakers.v1beta1.EventUpdateCommission)
      com.kyve.stakers.v1beta1.EventUpdateCommissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventUpdateCommission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventUpdateCommission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.stakers.v1beta1.EventUpdateCommission.class, com.kyve.stakers.v1beta1.EventUpdateCommission.Builder.class);
    }

    // Construct using com.kyve.stakers.v1beta1.EventUpdateCommission.newBuilder()
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
      staker_ = "";
      commission_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventUpdateCommission_descriptor;
    }

    @java.lang.Override
    public com.kyve.stakers.v1beta1.EventUpdateCommission getDefaultInstanceForType() {
      return com.kyve.stakers.v1beta1.EventUpdateCommission.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.stakers.v1beta1.EventUpdateCommission build() {
      com.kyve.stakers.v1beta1.EventUpdateCommission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.stakers.v1beta1.EventUpdateCommission buildPartial() {
      com.kyve.stakers.v1beta1.EventUpdateCommission result = new com.kyve.stakers.v1beta1.EventUpdateCommission(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.stakers.v1beta1.EventUpdateCommission result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.staker_ = staker_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commission_ = commission_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.stakers.v1beta1.EventUpdateCommission) {
        return mergeFrom((com.kyve.stakers.v1beta1.EventUpdateCommission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.stakers.v1beta1.EventUpdateCommission other) {
      if (other == com.kyve.stakers.v1beta1.EventUpdateCommission.getDefaultInstance()) return this;
      if (!other.getStaker().isEmpty()) {
        staker_ = other.staker_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCommission().isEmpty()) {
        commission_ = other.commission_;
        bitField0_ |= 0x00000002;
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
              staker_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              commission_ = input.readStringRequireUtf8();
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

    private java.lang.Object staker_ = "";
    /**
     * <pre>
     * staker is the account address of the protocol node.
     * </pre>
     *
     * <code>string staker = 1 [json_name = "staker"];</code>
     * @return The staker.
     */
    public java.lang.String getStaker() {
      java.lang.Object ref = staker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        staker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * staker is the account address of the protocol node.
     * </pre>
     *
     * <code>string staker = 1 [json_name = "staker"];</code>
     * @return The bytes for staker.
     */
    public com.google.protobuf.ByteString
        getStakerBytes() {
      java.lang.Object ref = staker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        staker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * staker is the account address of the protocol node.
     * </pre>
     *
     * <code>string staker = 1 [json_name = "staker"];</code>
     * @param value The staker to set.
     * @return This builder for chaining.
     */
    public Builder setStaker(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      staker_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker is the account address of the protocol node.
     * </pre>
     *
     * <code>string staker = 1 [json_name = "staker"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStaker() {
      staker_ = getDefaultInstance().getStaker();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker is the account address of the protocol node.
     * </pre>
     *
     * <code>string staker = 1 [json_name = "staker"];</code>
     * @param value The bytes for staker to set.
     * @return This builder for chaining.
     */
    public Builder setStakerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      staker_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object commission_ = "";
    /**
     * <pre>
     * commission ...
     * </pre>
     *
     * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The commission.
     */
    public java.lang.String getCommission() {
      java.lang.Object ref = commission_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commission_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * commission ...
     * </pre>
     *
     * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for commission.
     */
    public com.google.protobuf.ByteString
        getCommissionBytes() {
      java.lang.Object ref = commission_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commission_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * commission ...
     * </pre>
     *
     * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The commission to set.
     * @return This builder for chaining.
     */
    public Builder setCommission(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      commission_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * commission ...
     * </pre>
     *
     * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCommission() {
      commission_ = getDefaultInstance().getCommission();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * commission ...
     * </pre>
     *
     * <code>string commission = 2 [json_name = "commission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for commission to set.
     * @return This builder for chaining.
     */
    public Builder setCommissionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      commission_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:kyve.stakers.v1beta1.EventUpdateCommission)
  }

  // @@protoc_insertion_point(class_scope:kyve.stakers.v1beta1.EventUpdateCommission)
  private static final com.kyve.stakers.v1beta1.EventUpdateCommission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.stakers.v1beta1.EventUpdateCommission();
  }

  public static com.kyve.stakers.v1beta1.EventUpdateCommission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventUpdateCommission>
      PARSER = new com.google.protobuf.AbstractParser<EventUpdateCommission>() {
    @java.lang.Override
    public EventUpdateCommission parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventUpdateCommission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventUpdateCommission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.stakers.v1beta1.EventUpdateCommission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

