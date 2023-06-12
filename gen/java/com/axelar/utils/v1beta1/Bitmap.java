// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/utils/v1beta1/bitmap.proto

package com.axelar.utils.v1beta1;

/**
 * Protobuf type {@code axelar.utils.v1beta1.Bitmap}
 */
public final class Bitmap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.utils.v1beta1.Bitmap)
    BitmapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Bitmap.newBuilder() to construct.
  private Bitmap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Bitmap() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Bitmap();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.utils.v1beta1.BitmapProto.internal_static_axelar_utils_v1beta1_Bitmap_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.utils.v1beta1.BitmapProto.internal_static_axelar_utils_v1beta1_Bitmap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.utils.v1beta1.Bitmap.class, com.axelar.utils.v1beta1.Bitmap.Builder.class);
  }

  public static final int TRUE_COUNT_CACHE_FIELD_NUMBER = 2;
  private com.axelar.utils.v1beta1.CircularBuffer trueCountCache_;
  /**
   * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
   * @return Whether the trueCountCache field is set.
   */
  @java.lang.Override
  public boolean hasTrueCountCache() {
    return trueCountCache_ != null;
  }
  /**
   * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
   * @return The trueCountCache.
   */
  @java.lang.Override
  public com.axelar.utils.v1beta1.CircularBuffer getTrueCountCache() {
    return trueCountCache_ == null ? com.axelar.utils.v1beta1.CircularBuffer.getDefaultInstance() : trueCountCache_;
  }
  /**
   * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
   */
  @java.lang.Override
  public com.axelar.utils.v1beta1.CircularBufferOrBuilder getTrueCountCacheOrBuilder() {
    return trueCountCache_ == null ? com.axelar.utils.v1beta1.CircularBuffer.getDefaultInstance() : trueCountCache_;
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
    if (trueCountCache_ != null) {
      output.writeMessage(2, getTrueCountCache());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trueCountCache_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTrueCountCache());
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
    if (!(obj instanceof com.axelar.utils.v1beta1.Bitmap)) {
      return super.equals(obj);
    }
    com.axelar.utils.v1beta1.Bitmap other = (com.axelar.utils.v1beta1.Bitmap) obj;

    if (hasTrueCountCache() != other.hasTrueCountCache()) return false;
    if (hasTrueCountCache()) {
      if (!getTrueCountCache()
          .equals(other.getTrueCountCache())) return false;
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
    if (hasTrueCountCache()) {
      hash = (37 * hash) + TRUE_COUNT_CACHE_FIELD_NUMBER;
      hash = (53 * hash) + getTrueCountCache().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.utils.v1beta1.Bitmap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.utils.v1beta1.Bitmap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.utils.v1beta1.Bitmap parseFrom(
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
  public static Builder newBuilder(com.axelar.utils.v1beta1.Bitmap prototype) {
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
   * Protobuf type {@code axelar.utils.v1beta1.Bitmap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.utils.v1beta1.Bitmap)
      com.axelar.utils.v1beta1.BitmapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.utils.v1beta1.BitmapProto.internal_static_axelar_utils_v1beta1_Bitmap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.utils.v1beta1.BitmapProto.internal_static_axelar_utils_v1beta1_Bitmap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.utils.v1beta1.Bitmap.class, com.axelar.utils.v1beta1.Bitmap.Builder.class);
    }

    // Construct using com.axelar.utils.v1beta1.Bitmap.newBuilder()
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
      trueCountCache_ = null;
      if (trueCountCacheBuilder_ != null) {
        trueCountCacheBuilder_.dispose();
        trueCountCacheBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.utils.v1beta1.BitmapProto.internal_static_axelar_utils_v1beta1_Bitmap_descriptor;
    }

    @java.lang.Override
    public com.axelar.utils.v1beta1.Bitmap getDefaultInstanceForType() {
      return com.axelar.utils.v1beta1.Bitmap.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.utils.v1beta1.Bitmap build() {
      com.axelar.utils.v1beta1.Bitmap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.utils.v1beta1.Bitmap buildPartial() {
      com.axelar.utils.v1beta1.Bitmap result = new com.axelar.utils.v1beta1.Bitmap(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.utils.v1beta1.Bitmap result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trueCountCache_ = trueCountCacheBuilder_ == null
            ? trueCountCache_
            : trueCountCacheBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.utils.v1beta1.Bitmap) {
        return mergeFrom((com.axelar.utils.v1beta1.Bitmap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.utils.v1beta1.Bitmap other) {
      if (other == com.axelar.utils.v1beta1.Bitmap.getDefaultInstance()) return this;
      if (other.hasTrueCountCache()) {
        mergeTrueCountCache(other.getTrueCountCache());
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
            case 18: {
              input.readMessage(
                  getTrueCountCacheFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.axelar.utils.v1beta1.CircularBuffer trueCountCache_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.axelar.utils.v1beta1.CircularBuffer, com.axelar.utils.v1beta1.CircularBuffer.Builder, com.axelar.utils.v1beta1.CircularBufferOrBuilder> trueCountCacheBuilder_;
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     * @return Whether the trueCountCache field is set.
     */
    public boolean hasTrueCountCache() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     * @return The trueCountCache.
     */
    public com.axelar.utils.v1beta1.CircularBuffer getTrueCountCache() {
      if (trueCountCacheBuilder_ == null) {
        return trueCountCache_ == null ? com.axelar.utils.v1beta1.CircularBuffer.getDefaultInstance() : trueCountCache_;
      } else {
        return trueCountCacheBuilder_.getMessage();
      }
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    public Builder setTrueCountCache(com.axelar.utils.v1beta1.CircularBuffer value) {
      if (trueCountCacheBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trueCountCache_ = value;
      } else {
        trueCountCacheBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    public Builder setTrueCountCache(
        com.axelar.utils.v1beta1.CircularBuffer.Builder builderForValue) {
      if (trueCountCacheBuilder_ == null) {
        trueCountCache_ = builderForValue.build();
      } else {
        trueCountCacheBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    public Builder mergeTrueCountCache(com.axelar.utils.v1beta1.CircularBuffer value) {
      if (trueCountCacheBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          trueCountCache_ != null &&
          trueCountCache_ != com.axelar.utils.v1beta1.CircularBuffer.getDefaultInstance()) {
          getTrueCountCacheBuilder().mergeFrom(value);
        } else {
          trueCountCache_ = value;
        }
      } else {
        trueCountCacheBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    public Builder clearTrueCountCache() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trueCountCache_ = null;
      if (trueCountCacheBuilder_ != null) {
        trueCountCacheBuilder_.dispose();
        trueCountCacheBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    public com.axelar.utils.v1beta1.CircularBuffer.Builder getTrueCountCacheBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTrueCountCacheFieldBuilder().getBuilder();
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    public com.axelar.utils.v1beta1.CircularBufferOrBuilder getTrueCountCacheOrBuilder() {
      if (trueCountCacheBuilder_ != null) {
        return trueCountCacheBuilder_.getMessageOrBuilder();
      } else {
        return trueCountCache_ == null ?
            com.axelar.utils.v1beta1.CircularBuffer.getDefaultInstance() : trueCountCache_;
      }
    }
    /**
     * <code>.axelar.utils.v1beta1.CircularBuffer true_count_cache = 2 [json_name = "trueCountCache"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.axelar.utils.v1beta1.CircularBuffer, com.axelar.utils.v1beta1.CircularBuffer.Builder, com.axelar.utils.v1beta1.CircularBufferOrBuilder> 
        getTrueCountCacheFieldBuilder() {
      if (trueCountCacheBuilder_ == null) {
        trueCountCacheBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.axelar.utils.v1beta1.CircularBuffer, com.axelar.utils.v1beta1.CircularBuffer.Builder, com.axelar.utils.v1beta1.CircularBufferOrBuilder>(
                getTrueCountCache(),
                getParentForChildren(),
                isClean());
        trueCountCache_ = null;
      }
      return trueCountCacheBuilder_;
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


    // @@protoc_insertion_point(builder_scope:axelar.utils.v1beta1.Bitmap)
  }

  // @@protoc_insertion_point(class_scope:axelar.utils.v1beta1.Bitmap)
  private static final com.axelar.utils.v1beta1.Bitmap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.utils.v1beta1.Bitmap();
  }

  public static com.axelar.utils.v1beta1.Bitmap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bitmap>
      PARSER = new com.google.protobuf.AbstractParser<Bitmap>() {
    @java.lang.Override
    public Bitmap parsePartialFrom(
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

  public static com.google.protobuf.Parser<Bitmap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bitmap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.utils.v1beta1.Bitmap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

