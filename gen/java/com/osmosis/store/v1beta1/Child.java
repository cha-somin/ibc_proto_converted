// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/sumtree/v1beta1/tree.proto

package com.osmosis.store.v1beta1;

/**
 * Protobuf type {@code osmosis.store.v1beta1.Child}
 */
public final class Child extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.store.v1beta1.Child)
    ChildOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Child.newBuilder() to construct.
  private Child(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Child() {
    index_ = com.google.protobuf.ByteString.EMPTY;
    accumulation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Child();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.store.v1beta1.TreeProto.internal_static_osmosis_store_v1beta1_Child_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.store.v1beta1.TreeProto.internal_static_osmosis_store_v1beta1_Child_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.store.v1beta1.Child.class, com.osmosis.store.v1beta1.Child.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString index_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIndex() {
    return index_;
  }

  public static final int ACCUMULATION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accumulation_ = "";
  /**
   * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The accumulation.
   */
  @java.lang.Override
  public java.lang.String getAccumulation() {
    java.lang.Object ref = accumulation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accumulation_ = s;
      return s;
    }
  }
  /**
   * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for accumulation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccumulationBytes() {
    java.lang.Object ref = accumulation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accumulation_ = b;
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
    if (!index_.isEmpty()) {
      output.writeBytes(1, index_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accumulation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accumulation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!index_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, index_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accumulation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accumulation_);
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
    if (!(obj instanceof com.osmosis.store.v1beta1.Child)) {
      return super.equals(obj);
    }
    com.osmosis.store.v1beta1.Child other = (com.osmosis.store.v1beta1.Child) obj;

    if (!getIndex()
        .equals(other.getIndex())) return false;
    if (!getAccumulation()
        .equals(other.getAccumulation())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex().hashCode();
    hash = (37 * hash) + ACCUMULATION_FIELD_NUMBER;
    hash = (53 * hash) + getAccumulation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.store.v1beta1.Child parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.store.v1beta1.Child parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.store.v1beta1.Child parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.store.v1beta1.Child parseFrom(
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
  public static Builder newBuilder(com.osmosis.store.v1beta1.Child prototype) {
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
   * Protobuf type {@code osmosis.store.v1beta1.Child}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.store.v1beta1.Child)
      com.osmosis.store.v1beta1.ChildOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.store.v1beta1.TreeProto.internal_static_osmosis_store_v1beta1_Child_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.store.v1beta1.TreeProto.internal_static_osmosis_store_v1beta1_Child_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.store.v1beta1.Child.class, com.osmosis.store.v1beta1.Child.Builder.class);
    }

    // Construct using com.osmosis.store.v1beta1.Child.newBuilder()
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
      index_ = com.google.protobuf.ByteString.EMPTY;
      accumulation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.store.v1beta1.TreeProto.internal_static_osmosis_store_v1beta1_Child_descriptor;
    }

    @java.lang.Override
    public com.osmosis.store.v1beta1.Child getDefaultInstanceForType() {
      return com.osmosis.store.v1beta1.Child.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.store.v1beta1.Child build() {
      com.osmosis.store.v1beta1.Child result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.store.v1beta1.Child buildPartial() {
      com.osmosis.store.v1beta1.Child result = new com.osmosis.store.v1beta1.Child(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.store.v1beta1.Child result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.index_ = index_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accumulation_ = accumulation_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.store.v1beta1.Child) {
        return mergeFrom((com.osmosis.store.v1beta1.Child)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.store.v1beta1.Child other) {
      if (other == com.osmosis.store.v1beta1.Child.getDefaultInstance()) return this;
      if (other.getIndex() != com.google.protobuf.ByteString.EMPTY) {
        setIndex(other.getIndex());
      }
      if (!other.getAccumulation().isEmpty()) {
        accumulation_ = other.accumulation_;
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
              index_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              accumulation_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.ByteString index_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes index = 1 [json_name = "index"];</code>
     * @return The index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getIndex() {
      return index_;
    }
    /**
     * <code>bytes index = 1 [json_name = "index"];</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      index_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes index = 1 [json_name = "index"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      index_ = getDefaultInstance().getIndex();
      onChanged();
      return this;
    }

    private java.lang.Object accumulation_ = "";
    /**
     * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The accumulation.
     */
    public java.lang.String getAccumulation() {
      java.lang.Object ref = accumulation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accumulation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for accumulation.
     */
    public com.google.protobuf.ByteString
        getAccumulationBytes() {
      java.lang.Object ref = accumulation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accumulation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The accumulation to set.
     * @return This builder for chaining.
     */
    public Builder setAccumulation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accumulation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccumulation() {
      accumulation_ = getDefaultInstance().getAccumulation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string accumulation = 2 [json_name = "accumulation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for accumulation to set.
     * @return This builder for chaining.
     */
    public Builder setAccumulationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accumulation_ = value;
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


    // @@protoc_insertion_point(builder_scope:osmosis.store.v1beta1.Child)
  }

  // @@protoc_insertion_point(class_scope:osmosis.store.v1beta1.Child)
  private static final com.osmosis.store.v1beta1.Child DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.store.v1beta1.Child();
  }

  public static com.osmosis.store.v1beta1.Child getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Child>
      PARSER = new com.google.protobuf.AbstractParser<Child>() {
    @java.lang.Override
    public Child parsePartialFrom(
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

  public static com.google.protobuf.Parser<Child> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Child> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.store.v1beta1.Child getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

