// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/types.proto

package com.regen.ecocredit.v1alpha2;

/**
 * <pre>
 * BasketCriteria defines a criteria by which credits can be added to a basket.
 * </pre>
 *
 * Protobuf type {@code regen.ecocredit.v1alpha2.BasketCriteria}
 */
public final class BasketCriteria extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.ecocredit.v1alpha2.BasketCriteria)
    BasketCriteriaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BasketCriteria.newBuilder() to construct.
  private BasketCriteria(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BasketCriteria() {
    multiplier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BasketCriteria();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.ecocredit.v1alpha2.TypesProto.internal_static_regen_ecocredit_v1alpha2_BasketCriteria_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.ecocredit.v1alpha2.TypesProto.internal_static_regen_ecocredit_v1alpha2_BasketCriteria_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.ecocredit.v1alpha2.BasketCriteria.class, com.regen.ecocredit.v1alpha2.BasketCriteria.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.regen.ecocredit.v1alpha2.Filter filter_;
  /**
   * <pre>
   * filter defines condition(s) that credits should satisfy in order to be
   * added to the basket.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * filter defines condition(s) that credits should satisfy in order to be
   * added to the basket.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.Filter getFilter() {
    return filter_ == null ? com.regen.ecocredit.v1alpha2.Filter.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * filter defines condition(s) that credits should satisfy in order to be
   * added to the basket.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
   */
  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.FilterOrBuilder getFilterOrBuilder() {
    return filter_ == null ? com.regen.ecocredit.v1alpha2.Filter.getDefaultInstance() : filter_;
  }

  public static final int MULTIPLIER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object multiplier_ = "";
  /**
   * <pre>
   * multiplier is an integer number which is applied to credit units when
   * converting to basket units. For example if the multiplier is 2000, then
   * 1.1 credits will result in 2200 basket tokens. If there are any fractional
   * amounts left over in this calculation when adding credits to a basket,
   * those fractional amounts will not get added to the basket.
   * </pre>
   *
   * <code>string multiplier = 2 [json_name = "multiplier"];</code>
   * @return The multiplier.
   */
  @java.lang.Override
  public java.lang.String getMultiplier() {
    java.lang.Object ref = multiplier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      multiplier_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * multiplier is an integer number which is applied to credit units when
   * converting to basket units. For example if the multiplier is 2000, then
   * 1.1 credits will result in 2200 basket tokens. If there are any fractional
   * amounts left over in this calculation when adding credits to a basket,
   * those fractional amounts will not get added to the basket.
   * </pre>
   *
   * <code>string multiplier = 2 [json_name = "multiplier"];</code>
   * @return The bytes for multiplier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMultiplierBytes() {
    java.lang.Object ref = multiplier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      multiplier_ = b;
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
    if (filter_ != null) {
      output.writeMessage(1, getFilter());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(multiplier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, multiplier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFilter());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(multiplier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, multiplier_);
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
    if (!(obj instanceof com.regen.ecocredit.v1alpha2.BasketCriteria)) {
      return super.equals(obj);
    }
    com.regen.ecocredit.v1alpha2.BasketCriteria other = (com.regen.ecocredit.v1alpha2.BasketCriteria) obj;

    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter()
          .equals(other.getFilter())) return false;
    }
    if (!getMultiplier()
        .equals(other.getMultiplier())) return false;
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
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (37 * hash) + MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + getMultiplier().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.BasketCriteria parseFrom(
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
  public static Builder newBuilder(com.regen.ecocredit.v1alpha2.BasketCriteria prototype) {
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
   * BasketCriteria defines a criteria by which credits can be added to a basket.
   * </pre>
   *
   * Protobuf type {@code regen.ecocredit.v1alpha2.BasketCriteria}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.ecocredit.v1alpha2.BasketCriteria)
      com.regen.ecocredit.v1alpha2.BasketCriteriaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.ecocredit.v1alpha2.TypesProto.internal_static_regen_ecocredit_v1alpha2_BasketCriteria_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.ecocredit.v1alpha2.TypesProto.internal_static_regen_ecocredit_v1alpha2_BasketCriteria_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.ecocredit.v1alpha2.BasketCriteria.class, com.regen.ecocredit.v1alpha2.BasketCriteria.Builder.class);
    }

    // Construct using com.regen.ecocredit.v1alpha2.BasketCriteria.newBuilder()
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
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      multiplier_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.ecocredit.v1alpha2.TypesProto.internal_static_regen_ecocredit_v1alpha2_BasketCriteria_descriptor;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.BasketCriteria getDefaultInstanceForType() {
      return com.regen.ecocredit.v1alpha2.BasketCriteria.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.BasketCriteria build() {
      com.regen.ecocredit.v1alpha2.BasketCriteria result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.BasketCriteria buildPartial() {
      com.regen.ecocredit.v1alpha2.BasketCriteria result = new com.regen.ecocredit.v1alpha2.BasketCriteria(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.ecocredit.v1alpha2.BasketCriteria result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filter_ = filterBuilder_ == null
            ? filter_
            : filterBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.multiplier_ = multiplier_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.ecocredit.v1alpha2.BasketCriteria) {
        return mergeFrom((com.regen.ecocredit.v1alpha2.BasketCriteria)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.ecocredit.v1alpha2.BasketCriteria other) {
      if (other == com.regen.ecocredit.v1alpha2.BasketCriteria.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      if (!other.getMultiplier().isEmpty()) {
        multiplier_ = other.multiplier_;
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
              input.readMessage(
                  getFilterFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              multiplier_ = input.readStringRequireUtf8();
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

    private com.regen.ecocredit.v1alpha2.Filter filter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.regen.ecocredit.v1alpha2.Filter, com.regen.ecocredit.v1alpha2.Filter.Builder, com.regen.ecocredit.v1alpha2.FilterOrBuilder> filterBuilder_;
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     * @return The filter.
     */
    public com.regen.ecocredit.v1alpha2.Filter getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.regen.ecocredit.v1alpha2.Filter.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder setFilter(com.regen.ecocredit.v1alpha2.Filter value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
      } else {
        filterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder setFilter(
        com.regen.ecocredit.v1alpha2.Filter.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder mergeFilter(com.regen.ecocredit.v1alpha2.Filter value) {
      if (filterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          filter_ != null &&
          filter_ != com.regen.ecocredit.v1alpha2.Filter.getDefaultInstance()) {
          getFilterBuilder().mergeFrom(value);
        } else {
          filter_ = value;
        }
      } else {
        filterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder clearFilter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public com.regen.ecocredit.v1alpha2.Filter.Builder getFilterBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public com.regen.ecocredit.v1alpha2.FilterOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.regen.ecocredit.v1alpha2.Filter.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * filter defines condition(s) that credits should satisfy in order to be
     * added to the basket.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.Filter filter = 1 [json_name = "filter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.regen.ecocredit.v1alpha2.Filter, com.regen.ecocredit.v1alpha2.Filter.Builder, com.regen.ecocredit.v1alpha2.FilterOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.regen.ecocredit.v1alpha2.Filter, com.regen.ecocredit.v1alpha2.Filter.Builder, com.regen.ecocredit.v1alpha2.FilterOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
    }

    private java.lang.Object multiplier_ = "";
    /**
     * <pre>
     * multiplier is an integer number which is applied to credit units when
     * converting to basket units. For example if the multiplier is 2000, then
     * 1.1 credits will result in 2200 basket tokens. If there are any fractional
     * amounts left over in this calculation when adding credits to a basket,
     * those fractional amounts will not get added to the basket.
     * </pre>
     *
     * <code>string multiplier = 2 [json_name = "multiplier"];</code>
     * @return The multiplier.
     */
    public java.lang.String getMultiplier() {
      java.lang.Object ref = multiplier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        multiplier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * multiplier is an integer number which is applied to credit units when
     * converting to basket units. For example if the multiplier is 2000, then
     * 1.1 credits will result in 2200 basket tokens. If there are any fractional
     * amounts left over in this calculation when adding credits to a basket,
     * those fractional amounts will not get added to the basket.
     * </pre>
     *
     * <code>string multiplier = 2 [json_name = "multiplier"];</code>
     * @return The bytes for multiplier.
     */
    public com.google.protobuf.ByteString
        getMultiplierBytes() {
      java.lang.Object ref = multiplier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        multiplier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * multiplier is an integer number which is applied to credit units when
     * converting to basket units. For example if the multiplier is 2000, then
     * 1.1 credits will result in 2200 basket tokens. If there are any fractional
     * amounts left over in this calculation when adding credits to a basket,
     * those fractional amounts will not get added to the basket.
     * </pre>
     *
     * <code>string multiplier = 2 [json_name = "multiplier"];</code>
     * @param value The multiplier to set.
     * @return This builder for chaining.
     */
    public Builder setMultiplier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      multiplier_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * multiplier is an integer number which is applied to credit units when
     * converting to basket units. For example if the multiplier is 2000, then
     * 1.1 credits will result in 2200 basket tokens. If there are any fractional
     * amounts left over in this calculation when adding credits to a basket,
     * those fractional amounts will not get added to the basket.
     * </pre>
     *
     * <code>string multiplier = 2 [json_name = "multiplier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiplier() {
      multiplier_ = getDefaultInstance().getMultiplier();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * multiplier is an integer number which is applied to credit units when
     * converting to basket units. For example if the multiplier is 2000, then
     * 1.1 credits will result in 2200 basket tokens. If there are any fractional
     * amounts left over in this calculation when adding credits to a basket,
     * those fractional amounts will not get added to the basket.
     * </pre>
     *
     * <code>string multiplier = 2 [json_name = "multiplier"];</code>
     * @param value The bytes for multiplier to set.
     * @return This builder for chaining.
     */
    public Builder setMultiplierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      multiplier_ = value;
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


    // @@protoc_insertion_point(builder_scope:regen.ecocredit.v1alpha2.BasketCriteria)
  }

  // @@protoc_insertion_point(class_scope:regen.ecocredit.v1alpha2.BasketCriteria)
  private static final com.regen.ecocredit.v1alpha2.BasketCriteria DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.ecocredit.v1alpha2.BasketCriteria();
  }

  public static com.regen.ecocredit.v1alpha2.BasketCriteria getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BasketCriteria>
      PARSER = new com.google.protobuf.AbstractParser<BasketCriteria>() {
    @java.lang.Override
    public BasketCriteria parsePartialFrom(
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

  public static com.google.protobuf.Parser<BasketCriteria> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BasketCriteria> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.BasketCriteria getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

