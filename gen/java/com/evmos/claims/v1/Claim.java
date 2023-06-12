// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/claims/v1/claims.proto

package com.evmos.claims.v1;

/**
 * <pre>
 * Claim defines the action, completed flag and the remaining claimable amount
 * for a given user. This is only used during client queries.
 * </pre>
 *
 * Protobuf type {@code evmos.claims.v1.Claim}
 */
public final class Claim extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:evmos.claims.v1.Claim)
    ClaimOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Claim.newBuilder() to construct.
  private Claim(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Claim() {
    action_ = 0;
    claimableAmount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Claim();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.evmos.claims.v1.ClaimsProto.internal_static_evmos_claims_v1_Claim_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.evmos.claims.v1.ClaimsProto.internal_static_evmos_claims_v1_Claim_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.evmos.claims.v1.Claim.class, com.evmos.claims.v1.Claim.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_ = 0;
  /**
   * <pre>
   * action enum
   * </pre>
   *
   * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <pre>
   * action enum
   * </pre>
   *
   * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override public com.evmos.claims.v1.Action getAction() {
    com.evmos.claims.v1.Action result = com.evmos.claims.v1.Action.forNumber(action_);
    return result == null ? com.evmos.claims.v1.Action.UNRECOGNIZED : result;
  }

  public static final int COMPLETED_FIELD_NUMBER = 2;
  private boolean completed_ = false;
  /**
   * <pre>
   * completed is true if the action has been completed
   * </pre>
   *
   * <code>bool completed = 2 [json_name = "completed"];</code>
   * @return The completed.
   */
  @java.lang.Override
  public boolean getCompleted() {
    return completed_;
  }

  public static final int CLAIMABLE_AMOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object claimableAmount_ = "";
  /**
   * <pre>
   * claimable_amount of tokens for the action. Zero if completed
   * </pre>
   *
   * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The claimableAmount.
   */
  @java.lang.Override
  public java.lang.String getClaimableAmount() {
    java.lang.Object ref = claimableAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      claimableAmount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * claimable_amount of tokens for the action. Zero if completed
   * </pre>
   *
   * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for claimableAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClaimableAmountBytes() {
    java.lang.Object ref = claimableAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      claimableAmount_ = b;
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
    if (action_ != com.evmos.claims.v1.Action.ACTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (completed_ != false) {
      output.writeBool(2, completed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(claimableAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, claimableAmount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != com.evmos.claims.v1.Action.ACTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (completed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, completed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(claimableAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, claimableAmount_);
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
    if (!(obj instanceof com.evmos.claims.v1.Claim)) {
      return super.equals(obj);
    }
    com.evmos.claims.v1.Claim other = (com.evmos.claims.v1.Claim) obj;

    if (action_ != other.action_) return false;
    if (getCompleted()
        != other.getCompleted()) return false;
    if (!getClaimableAmount()
        .equals(other.getClaimableAmount())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + COMPLETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCompleted());
    hash = (37 * hash) + CLAIMABLE_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getClaimableAmount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.evmos.claims.v1.Claim parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.claims.v1.Claim parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.claims.v1.Claim parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.evmos.claims.v1.Claim parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.evmos.claims.v1.Claim parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.claims.v1.Claim parseFrom(
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
  public static Builder newBuilder(com.evmos.claims.v1.Claim prototype) {
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
   * Claim defines the action, completed flag and the remaining claimable amount
   * for a given user. This is only used during client queries.
   * </pre>
   *
   * Protobuf type {@code evmos.claims.v1.Claim}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:evmos.claims.v1.Claim)
      com.evmos.claims.v1.ClaimOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.evmos.claims.v1.ClaimsProto.internal_static_evmos_claims_v1_Claim_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.evmos.claims.v1.ClaimsProto.internal_static_evmos_claims_v1_Claim_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.evmos.claims.v1.Claim.class, com.evmos.claims.v1.Claim.Builder.class);
    }

    // Construct using com.evmos.claims.v1.Claim.newBuilder()
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
      action_ = 0;
      completed_ = false;
      claimableAmount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.evmos.claims.v1.ClaimsProto.internal_static_evmos_claims_v1_Claim_descriptor;
    }

    @java.lang.Override
    public com.evmos.claims.v1.Claim getDefaultInstanceForType() {
      return com.evmos.claims.v1.Claim.getDefaultInstance();
    }

    @java.lang.Override
    public com.evmos.claims.v1.Claim build() {
      com.evmos.claims.v1.Claim result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.evmos.claims.v1.Claim buildPartial() {
      com.evmos.claims.v1.Claim result = new com.evmos.claims.v1.Claim(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.evmos.claims.v1.Claim result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.completed_ = completed_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.claimableAmount_ = claimableAmount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.evmos.claims.v1.Claim) {
        return mergeFrom((com.evmos.claims.v1.Claim)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.evmos.claims.v1.Claim other) {
      if (other == com.evmos.claims.v1.Claim.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (other.getCompleted() != false) {
        setCompleted(other.getCompleted());
      }
      if (!other.getClaimableAmount().isEmpty()) {
        claimableAmount_ = other.claimableAmount_;
        bitField0_ |= 0x00000004;
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
            case 8: {
              action_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              completed_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              claimableAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int action_ = 0;
    /**
     * <pre>
     * action enum
     * </pre>
     *
     * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <pre>
     * action enum
     * </pre>
     *
     * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * action enum
     * </pre>
     *
     * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
     * @return The action.
     */
    @java.lang.Override
    public com.evmos.claims.v1.Action getAction() {
      com.evmos.claims.v1.Action result = com.evmos.claims.v1.Action.forNumber(action_);
      return result == null ? com.evmos.claims.v1.Action.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * action enum
     * </pre>
     *
     * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.evmos.claims.v1.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * action enum
     * </pre>
     *
     * <code>.evmos.claims.v1.Action action = 1 [json_name = "action"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private boolean completed_ ;
    /**
     * <pre>
     * completed is true if the action has been completed
     * </pre>
     *
     * <code>bool completed = 2 [json_name = "completed"];</code>
     * @return The completed.
     */
    @java.lang.Override
    public boolean getCompleted() {
      return completed_;
    }
    /**
     * <pre>
     * completed is true if the action has been completed
     * </pre>
     *
     * <code>bool completed = 2 [json_name = "completed"];</code>
     * @param value The completed to set.
     * @return This builder for chaining.
     */
    public Builder setCompleted(boolean value) {

      completed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * completed is true if the action has been completed
     * </pre>
     *
     * <code>bool completed = 2 [json_name = "completed"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCompleted() {
      bitField0_ = (bitField0_ & ~0x00000002);
      completed_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object claimableAmount_ = "";
    /**
     * <pre>
     * claimable_amount of tokens for the action. Zero if completed
     * </pre>
     *
     * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The claimableAmount.
     */
    public java.lang.String getClaimableAmount() {
      java.lang.Object ref = claimableAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        claimableAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * claimable_amount of tokens for the action. Zero if completed
     * </pre>
     *
     * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for claimableAmount.
     */
    public com.google.protobuf.ByteString
        getClaimableAmountBytes() {
      java.lang.Object ref = claimableAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        claimableAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * claimable_amount of tokens for the action. Zero if completed
     * </pre>
     *
     * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The claimableAmount to set.
     * @return This builder for chaining.
     */
    public Builder setClaimableAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      claimableAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * claimable_amount of tokens for the action. Zero if completed
     * </pre>
     *
     * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClaimableAmount() {
      claimableAmount_ = getDefaultInstance().getClaimableAmount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * claimable_amount of tokens for the action. Zero if completed
     * </pre>
     *
     * <code>string claimable_amount = 3 [json_name = "claimableAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for claimableAmount to set.
     * @return This builder for chaining.
     */
    public Builder setClaimableAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      claimableAmount_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:evmos.claims.v1.Claim)
  }

  // @@protoc_insertion_point(class_scope:evmos.claims.v1.Claim)
  private static final com.evmos.claims.v1.Claim DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.evmos.claims.v1.Claim();
  }

  public static com.evmos.claims.v1.Claim getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Claim>
      PARSER = new com.google.protobuf.AbstractParser<Claim>() {
    @java.lang.Override
    public Claim parsePartialFrom(
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

  public static com.google.protobuf.Parser<Claim> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Claim> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.evmos.claims.v1.Claim getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

