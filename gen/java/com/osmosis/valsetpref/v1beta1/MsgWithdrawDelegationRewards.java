// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/valset-pref/v1beta1/tx.proto

package com.osmosis.valsetpref.v1beta1;

/**
 * <pre>
 * MsgWithdrawDelegationRewards allows user to claim staking rewards from the
 * validator set.
 * </pre>
 *
 * Protobuf type {@code osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards}
 */
public final class MsgWithdrawDelegationRewards extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards)
    MsgWithdrawDelegationRewardsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWithdrawDelegationRewards.newBuilder() to construct.
  private MsgWithdrawDelegationRewards(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWithdrawDelegationRewards() {
    delegator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWithdrawDelegationRewards();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.class, com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.Builder.class);
  }

  public static final int DELEGATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegator_ = "";
  /**
   * <pre>
   * delegator is the user who is trying to claim staking rewards.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The delegator.
   */
  @java.lang.Override
  public java.lang.String getDelegator() {
    java.lang.Object ref = delegator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegator_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * delegator is the user who is trying to claim staking rewards.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The bytes for delegator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegatorBytes() {
    java.lang.Object ref = delegator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegator_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegator_);
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
    if (!(obj instanceof com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards)) {
      return super.equals(obj);
    }
    com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards other = (com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards) obj;

    if (!getDelegator()
        .equals(other.getDelegator())) return false;
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
    hash = (37 * hash) + DELEGATOR_FIELD_NUMBER;
    hash = (53 * hash) + getDelegator().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards parseFrom(
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
  public static Builder newBuilder(com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards prototype) {
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
   * MsgWithdrawDelegationRewards allows user to claim staking rewards from the
   * validator set.
   * </pre>
   *
   * Protobuf type {@code osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards)
      com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewardsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.class, com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.Builder.class);
    }

    // Construct using com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.newBuilder()
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
      delegator_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards_descriptor;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards getDefaultInstanceForType() {
      return com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards build() {
      com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards buildPartial() {
      com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards result = new com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delegator_ = delegator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards) {
        return mergeFrom((com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards other) {
      if (other == com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards.getDefaultInstance()) return this;
      if (!other.getDelegator().isEmpty()) {
        delegator_ = other.delegator_;
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
              delegator_ = input.readStringRequireUtf8();
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

    private java.lang.Object delegator_ = "";
    /**
     * <pre>
     * delegator is the user who is trying to claim staking rewards.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return The delegator.
     */
    public java.lang.String getDelegator() {
      java.lang.Object ref = delegator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * delegator is the user who is trying to claim staking rewards.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return The bytes for delegator.
     */
    public com.google.protobuf.ByteString
        getDelegatorBytes() {
      java.lang.Object ref = delegator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * delegator is the user who is trying to claim staking rewards.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @param value The delegator to set.
     * @return This builder for chaining.
     */
    public Builder setDelegator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delegator is the user who is trying to claim staking rewards.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegator() {
      delegator_ = getDefaultInstance().getDelegator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delegator is the user who is trying to claim staking rewards.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @param value The bytes for delegator to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegator_ = value;
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


    // @@protoc_insertion_point(builder_scope:osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards)
  }

  // @@protoc_insertion_point(class_scope:osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards)
  private static final com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards();
  }

  public static com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWithdrawDelegationRewards>
      PARSER = new com.google.protobuf.AbstractParser<MsgWithdrawDelegationRewards>() {
    @java.lang.Override
    public MsgWithdrawDelegationRewards parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgWithdrawDelegationRewards> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWithdrawDelegationRewards> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

