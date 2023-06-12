// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/feerefunder/params.proto

package com.neutron.feerefunder;

/**
 * <pre>
 * Params defines the parameters for the module.
 * </pre>
 *
 * Protobuf type {@code neutron.feerefunder.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:neutron.feerefunder.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.neutron.feerefunder.ParamsProto.internal_static_neutron_feerefunder_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.neutron.feerefunder.ParamsProto.internal_static_neutron_feerefunder_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.neutron.feerefunder.Params.class, com.neutron.feerefunder.Params.Builder.class);
  }

  public static final int MIN_FEE_FIELD_NUMBER = 1;
  private com.neutron.feerefunder.Fee minFee_;
  /**
   * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
   * @return Whether the minFee field is set.
   */
  @java.lang.Override
  public boolean hasMinFee() {
    return minFee_ != null;
  }
  /**
   * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
   * @return The minFee.
   */
  @java.lang.Override
  public com.neutron.feerefunder.Fee getMinFee() {
    return minFee_ == null ? com.neutron.feerefunder.Fee.getDefaultInstance() : minFee_;
  }
  /**
   * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.neutron.feerefunder.FeeOrBuilder getMinFeeOrBuilder() {
    return minFee_ == null ? com.neutron.feerefunder.Fee.getDefaultInstance() : minFee_;
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
    if (minFee_ != null) {
      output.writeMessage(1, getMinFee());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minFee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMinFee());
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
    if (!(obj instanceof com.neutron.feerefunder.Params)) {
      return super.equals(obj);
    }
    com.neutron.feerefunder.Params other = (com.neutron.feerefunder.Params) obj;

    if (hasMinFee() != other.hasMinFee()) return false;
    if (hasMinFee()) {
      if (!getMinFee()
          .equals(other.getMinFee())) return false;
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
    if (hasMinFee()) {
      hash = (37 * hash) + MIN_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getMinFee().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.neutron.feerefunder.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.feerefunder.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.feerefunder.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.feerefunder.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.feerefunder.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.feerefunder.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.feerefunder.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.feerefunder.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.neutron.feerefunder.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.neutron.feerefunder.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.neutron.feerefunder.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.feerefunder.Params parseFrom(
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
  public static Builder newBuilder(com.neutron.feerefunder.Params prototype) {
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
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code neutron.feerefunder.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:neutron.feerefunder.Params)
      com.neutron.feerefunder.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.neutron.feerefunder.ParamsProto.internal_static_neutron_feerefunder_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.neutron.feerefunder.ParamsProto.internal_static_neutron_feerefunder_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.neutron.feerefunder.Params.class, com.neutron.feerefunder.Params.Builder.class);
    }

    // Construct using com.neutron.feerefunder.Params.newBuilder()
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
      minFee_ = null;
      if (minFeeBuilder_ != null) {
        minFeeBuilder_.dispose();
        minFeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.neutron.feerefunder.ParamsProto.internal_static_neutron_feerefunder_Params_descriptor;
    }

    @java.lang.Override
    public com.neutron.feerefunder.Params getDefaultInstanceForType() {
      return com.neutron.feerefunder.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.neutron.feerefunder.Params build() {
      com.neutron.feerefunder.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.neutron.feerefunder.Params buildPartial() {
      com.neutron.feerefunder.Params result = new com.neutron.feerefunder.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.neutron.feerefunder.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minFee_ = minFeeBuilder_ == null
            ? minFee_
            : minFeeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.neutron.feerefunder.Params) {
        return mergeFrom((com.neutron.feerefunder.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.neutron.feerefunder.Params other) {
      if (other == com.neutron.feerefunder.Params.getDefaultInstance()) return this;
      if (other.hasMinFee()) {
        mergeMinFee(other.getMinFee());
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
                  getMinFeeFieldBuilder().getBuilder(),
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

    private com.neutron.feerefunder.Fee minFee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.neutron.feerefunder.Fee, com.neutron.feerefunder.Fee.Builder, com.neutron.feerefunder.FeeOrBuilder> minFeeBuilder_;
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     * @return Whether the minFee field is set.
     */
    public boolean hasMinFee() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     * @return The minFee.
     */
    public com.neutron.feerefunder.Fee getMinFee() {
      if (minFeeBuilder_ == null) {
        return minFee_ == null ? com.neutron.feerefunder.Fee.getDefaultInstance() : minFee_;
      } else {
        return minFeeBuilder_.getMessage();
      }
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMinFee(com.neutron.feerefunder.Fee value) {
      if (minFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minFee_ = value;
      } else {
        minFeeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMinFee(
        com.neutron.feerefunder.Fee.Builder builderForValue) {
      if (minFeeBuilder_ == null) {
        minFee_ = builderForValue.build();
      } else {
        minFeeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeMinFee(com.neutron.feerefunder.Fee value) {
      if (minFeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          minFee_ != null &&
          minFee_ != com.neutron.feerefunder.Fee.getDefaultInstance()) {
          getMinFeeBuilder().mergeFrom(value);
        } else {
          minFee_ = value;
        }
      } else {
        minFeeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMinFee() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minFee_ = null;
      if (minFeeBuilder_ != null) {
        minFeeBuilder_.dispose();
        minFeeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.feerefunder.Fee.Builder getMinFeeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMinFeeFieldBuilder().getBuilder();
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.feerefunder.FeeOrBuilder getMinFeeOrBuilder() {
      if (minFeeBuilder_ != null) {
        return minFeeBuilder_.getMessageOrBuilder();
      } else {
        return minFee_ == null ?
            com.neutron.feerefunder.Fee.getDefaultInstance() : minFee_;
      }
    }
    /**
     * <code>.neutron.feerefunder.Fee min_fee = 1 [json_name = "minFee", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.neutron.feerefunder.Fee, com.neutron.feerefunder.Fee.Builder, com.neutron.feerefunder.FeeOrBuilder> 
        getMinFeeFieldBuilder() {
      if (minFeeBuilder_ == null) {
        minFeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.neutron.feerefunder.Fee, com.neutron.feerefunder.Fee.Builder, com.neutron.feerefunder.FeeOrBuilder>(
                getMinFee(),
                getParentForChildren(),
                isClean());
        minFee_ = null;
      }
      return minFeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:neutron.feerefunder.Params)
  }

  // @@protoc_insertion_point(class_scope:neutron.feerefunder.Params)
  private static final com.neutron.feerefunder.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.neutron.feerefunder.Params();
  }

  public static com.neutron.feerefunder.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.neutron.feerefunder.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

