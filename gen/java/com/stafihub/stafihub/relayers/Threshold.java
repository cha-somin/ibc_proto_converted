// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/relayers/relayer.proto

package com.stafihub.stafihub.relayers;

/**
 * Protobuf type {@code stafihub.stafihub.relayers.Threshold}
 */
public final class Threshold extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.relayers.Threshold)
    ThresholdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Threshold.newBuilder() to construct.
  private Threshold(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Threshold() {
    arena_ = "";
    denom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Threshold();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.relayers.RelayerProto.internal_static_stafihub_stafihub_relayers_Threshold_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.relayers.RelayerProto.internal_static_stafihub_stafihub_relayers_Threshold_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.relayers.Threshold.class, com.stafihub.stafihub.relayers.Threshold.Builder.class);
  }

  public static final int ARENA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object arena_ = "";
  /**
   * <code>string arena = 1 [json_name = "arena"];</code>
   * @return The arena.
   */
  @java.lang.Override
  public java.lang.String getArena() {
    java.lang.Object ref = arena_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arena_ = s;
      return s;
    }
  }
  /**
   * <code>string arena = 1 [json_name = "arena"];</code>
   * @return The bytes for arena.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArenaBytes() {
    java.lang.Object ref = arena_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arena_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private int value_ = 0;
  /**
   * <code>uint32 value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public int getValue() {
    return value_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(arena_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, arena_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (value_ != 0) {
      output.writeUInt32(3, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(arena_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, arena_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (value_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, value_);
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
    if (!(obj instanceof com.stafihub.stafihub.relayers.Threshold)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.relayers.Threshold other = (com.stafihub.stafihub.relayers.Threshold) obj;

    if (!getArena()
        .equals(other.getArena())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (getValue()
        != other.getValue()) return false;
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
    hash = (37 * hash) + ARENA_FIELD_NUMBER;
    hash = (53 * hash) + getArena().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.relayers.Threshold parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.relayers.Threshold parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.relayers.Threshold parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.relayers.Threshold prototype) {
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
   * Protobuf type {@code stafihub.stafihub.relayers.Threshold}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.relayers.Threshold)
      com.stafihub.stafihub.relayers.ThresholdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.relayers.RelayerProto.internal_static_stafihub_stafihub_relayers_Threshold_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.relayers.RelayerProto.internal_static_stafihub_stafihub_relayers_Threshold_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.relayers.Threshold.class, com.stafihub.stafihub.relayers.Threshold.Builder.class);
    }

    // Construct using com.stafihub.stafihub.relayers.Threshold.newBuilder()
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
      arena_ = "";
      denom_ = "";
      value_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.relayers.RelayerProto.internal_static_stafihub_stafihub_relayers_Threshold_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.relayers.Threshold getDefaultInstanceForType() {
      return com.stafihub.stafihub.relayers.Threshold.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.relayers.Threshold build() {
      com.stafihub.stafihub.relayers.Threshold result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.relayers.Threshold buildPartial() {
      com.stafihub.stafihub.relayers.Threshold result = new com.stafihub.stafihub.relayers.Threshold(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.relayers.Threshold result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.arena_ = arena_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.relayers.Threshold) {
        return mergeFrom((com.stafihub.stafihub.relayers.Threshold)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.relayers.Threshold other) {
      if (other == com.stafihub.stafihub.relayers.Threshold.getDefaultInstance()) return this;
      if (!other.getArena().isEmpty()) {
        arena_ = other.arena_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getValue() != 0) {
        setValue(other.getValue());
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
              arena_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              value_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object arena_ = "";
    /**
     * <code>string arena = 1 [json_name = "arena"];</code>
     * @return The arena.
     */
    public java.lang.String getArena() {
      java.lang.Object ref = arena_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arena_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string arena = 1 [json_name = "arena"];</code>
     * @return The bytes for arena.
     */
    public com.google.protobuf.ByteString
        getArenaBytes() {
      java.lang.Object ref = arena_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arena_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string arena = 1 [json_name = "arena"];</code>
     * @param value The arena to set.
     * @return This builder for chaining.
     */
    public Builder setArena(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      arena_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string arena = 1 [json_name = "arena"];</code>
     * @return This builder for chaining.
     */
    public Builder clearArena() {
      arena_ = getDefaultInstance().getArena();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string arena = 1 [json_name = "arena"];</code>
     * @param value The bytes for arena to set.
     * @return This builder for chaining.
     */
    public Builder setArenaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      arena_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int value_ ;
    /**
     * <code>uint32 value = 3 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
    }
    /**
     * <code>uint32 value = 3 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(int value) {

      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 value = 3 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = 0;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.relayers.Threshold)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.relayers.Threshold)
  private static final com.stafihub.stafihub.relayers.Threshold DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.relayers.Threshold();
  }

  public static com.stafihub.stafihub.relayers.Threshold getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Threshold>
      PARSER = new com.google.protobuf.AbstractParser<Threshold>() {
    @java.lang.Override
    public Threshold parsePartialFrom(
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

  public static com.google.protobuf.Parser<Threshold> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Threshold> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.relayers.Threshold getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

