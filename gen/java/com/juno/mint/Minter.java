// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/mint/mint.proto

package com.juno.mint;

/**
 * <pre>
 * Minter represents the minting state.
 * </pre>
 *
 * Protobuf type {@code juno.mint.Minter}
 */
public final class Minter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:juno.mint.Minter)
    MinterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Minter.newBuilder() to construct.
  private Minter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Minter() {
    inflation_ = "";
    annualProvisions_ = "";
    targetSupply_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Minter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.juno.mint.MintProto.internal_static_juno_mint_Minter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.juno.mint.MintProto.internal_static_juno_mint_Minter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.juno.mint.Minter.class, com.juno.mint.Minter.Builder.class);
  }

  public static final int INFLATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inflation_ = "";
  /**
   * <pre>
   * current annual inflation rate
   * </pre>
   *
   * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The inflation.
   */
  @java.lang.Override
  public java.lang.String getInflation() {
    java.lang.Object ref = inflation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inflation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * current annual inflation rate
   * </pre>
   *
   * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for inflation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInflationBytes() {
    java.lang.Object ref = inflation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inflation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHASE_FIELD_NUMBER = 2;
  private long phase_ = 0L;
  /**
   * <code>uint64 phase = 2 [json_name = "phase"];</code>
   * @return The phase.
   */
  @java.lang.Override
  public long getPhase() {
    return phase_;
  }

  public static final int START_PHASE_BLOCK_FIELD_NUMBER = 3;
  private long startPhaseBlock_ = 0L;
  /**
   * <code>uint64 start_phase_block = 3 [json_name = "startPhaseBlock", (.gogoproto.moretags) = "yaml:&#92;"start_phase_block&#92;""];</code>
   * @return The startPhaseBlock.
   */
  @java.lang.Override
  public long getStartPhaseBlock() {
    return startPhaseBlock_;
  }

  public static final int ANNUAL_PROVISIONS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object annualProvisions_ = "";
  /**
   * <pre>
   * current annual expected provisions
   * </pre>
   *
   * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
   * @return The annualProvisions.
   */
  @java.lang.Override
  public java.lang.String getAnnualProvisions() {
    java.lang.Object ref = annualProvisions_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annualProvisions_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * current annual expected provisions
   * </pre>
   *
   * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
   * @return The bytes for annualProvisions.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAnnualProvisionsBytes() {
    java.lang.Object ref = annualProvisions_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      annualProvisions_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_SUPPLY_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object targetSupply_ = "";
  /**
   * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
   * @return The targetSupply.
   */
  @java.lang.Override
  public java.lang.String getTargetSupply() {
    java.lang.Object ref = targetSupply_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetSupply_ = s;
      return s;
    }
  }
  /**
   * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
   * @return The bytes for targetSupply.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetSupplyBytes() {
    java.lang.Object ref = targetSupply_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetSupply_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inflation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inflation_);
    }
    if (phase_ != 0L) {
      output.writeUInt64(2, phase_);
    }
    if (startPhaseBlock_ != 0L) {
      output.writeUInt64(3, startPhaseBlock_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annualProvisions_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, annualProvisions_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetSupply_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, targetSupply_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inflation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inflation_);
    }
    if (phase_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, phase_);
    }
    if (startPhaseBlock_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, startPhaseBlock_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annualProvisions_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, annualProvisions_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetSupply_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, targetSupply_);
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
    if (!(obj instanceof com.juno.mint.Minter)) {
      return super.equals(obj);
    }
    com.juno.mint.Minter other = (com.juno.mint.Minter) obj;

    if (!getInflation()
        .equals(other.getInflation())) return false;
    if (getPhase()
        != other.getPhase()) return false;
    if (getStartPhaseBlock()
        != other.getStartPhaseBlock()) return false;
    if (!getAnnualProvisions()
        .equals(other.getAnnualProvisions())) return false;
    if (!getTargetSupply()
        .equals(other.getTargetSupply())) return false;
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
    hash = (37 * hash) + INFLATION_FIELD_NUMBER;
    hash = (53 * hash) + getInflation().hashCode();
    hash = (37 * hash) + PHASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPhase());
    hash = (37 * hash) + START_PHASE_BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartPhaseBlock());
    hash = (37 * hash) + ANNUAL_PROVISIONS_FIELD_NUMBER;
    hash = (53 * hash) + getAnnualProvisions().hashCode();
    hash = (37 * hash) + TARGET_SUPPLY_FIELD_NUMBER;
    hash = (53 * hash) + getTargetSupply().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.juno.mint.Minter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.mint.Minter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.mint.Minter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.mint.Minter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.mint.Minter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.mint.Minter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.mint.Minter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.juno.mint.Minter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.juno.mint.Minter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.juno.mint.Minter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.juno.mint.Minter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.juno.mint.Minter parseFrom(
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
  public static Builder newBuilder(com.juno.mint.Minter prototype) {
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
   * Minter represents the minting state.
   * </pre>
   *
   * Protobuf type {@code juno.mint.Minter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:juno.mint.Minter)
      com.juno.mint.MinterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.juno.mint.MintProto.internal_static_juno_mint_Minter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.juno.mint.MintProto.internal_static_juno_mint_Minter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.juno.mint.Minter.class, com.juno.mint.Minter.Builder.class);
    }

    // Construct using com.juno.mint.Minter.newBuilder()
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
      inflation_ = "";
      phase_ = 0L;
      startPhaseBlock_ = 0L;
      annualProvisions_ = "";
      targetSupply_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.juno.mint.MintProto.internal_static_juno_mint_Minter_descriptor;
    }

    @java.lang.Override
    public com.juno.mint.Minter getDefaultInstanceForType() {
      return com.juno.mint.Minter.getDefaultInstance();
    }

    @java.lang.Override
    public com.juno.mint.Minter build() {
      com.juno.mint.Minter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.juno.mint.Minter buildPartial() {
      com.juno.mint.Minter result = new com.juno.mint.Minter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.juno.mint.Minter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inflation_ = inflation_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.phase_ = phase_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startPhaseBlock_ = startPhaseBlock_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.annualProvisions_ = annualProvisions_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.targetSupply_ = targetSupply_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.juno.mint.Minter) {
        return mergeFrom((com.juno.mint.Minter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.juno.mint.Minter other) {
      if (other == com.juno.mint.Minter.getDefaultInstance()) return this;
      if (!other.getInflation().isEmpty()) {
        inflation_ = other.inflation_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPhase() != 0L) {
        setPhase(other.getPhase());
      }
      if (other.getStartPhaseBlock() != 0L) {
        setStartPhaseBlock(other.getStartPhaseBlock());
      }
      if (!other.getAnnualProvisions().isEmpty()) {
        annualProvisions_ = other.annualProvisions_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getTargetSupply().isEmpty()) {
        targetSupply_ = other.targetSupply_;
        bitField0_ |= 0x00000010;
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
              inflation_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              phase_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              startPhaseBlock_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              annualProvisions_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              targetSupply_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object inflation_ = "";
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The inflation.
     */
    public java.lang.String getInflation() {
      java.lang.Object ref = inflation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inflation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for inflation.
     */
    public com.google.protobuf.ByteString
        getInflationBytes() {
      java.lang.Object ref = inflation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inflation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The inflation to set.
     * @return This builder for chaining.
     */
    public Builder setInflation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inflation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInflation() {
      inflation_ = getDefaultInstance().getInflation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for inflation to set.
     * @return This builder for chaining.
     */
    public Builder setInflationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inflation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long phase_ ;
    /**
     * <code>uint64 phase = 2 [json_name = "phase"];</code>
     * @return The phase.
     */
    @java.lang.Override
    public long getPhase() {
      return phase_;
    }
    /**
     * <code>uint64 phase = 2 [json_name = "phase"];</code>
     * @param value The phase to set.
     * @return This builder for chaining.
     */
    public Builder setPhase(long value) {

      phase_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 phase = 2 [json_name = "phase"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPhase() {
      bitField0_ = (bitField0_ & ~0x00000002);
      phase_ = 0L;
      onChanged();
      return this;
    }

    private long startPhaseBlock_ ;
    /**
     * <code>uint64 start_phase_block = 3 [json_name = "startPhaseBlock", (.gogoproto.moretags) = "yaml:&#92;"start_phase_block&#92;""];</code>
     * @return The startPhaseBlock.
     */
    @java.lang.Override
    public long getStartPhaseBlock() {
      return startPhaseBlock_;
    }
    /**
     * <code>uint64 start_phase_block = 3 [json_name = "startPhaseBlock", (.gogoproto.moretags) = "yaml:&#92;"start_phase_block&#92;""];</code>
     * @param value The startPhaseBlock to set.
     * @return This builder for chaining.
     */
    public Builder setStartPhaseBlock(long value) {

      startPhaseBlock_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 start_phase_block = 3 [json_name = "startPhaseBlock", (.gogoproto.moretags) = "yaml:&#92;"start_phase_block&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartPhaseBlock() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startPhaseBlock_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object annualProvisions_ = "";
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     * @return The annualProvisions.
     */
    public java.lang.String getAnnualProvisions() {
      java.lang.Object ref = annualProvisions_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annualProvisions_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     * @return The bytes for annualProvisions.
     */
    public com.google.protobuf.ByteString
        getAnnualProvisionsBytes() {
      java.lang.Object ref = annualProvisions_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        annualProvisions_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     * @param value The annualProvisions to set.
     * @return This builder for chaining.
     */
    public Builder setAnnualProvisions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      annualProvisions_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnualProvisions() {
      annualProvisions_ = getDefaultInstance().getAnnualProvisions();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     * @param value The bytes for annualProvisions to set.
     * @return This builder for chaining.
     */
    public Builder setAnnualProvisionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      annualProvisions_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object targetSupply_ = "";
    /**
     * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
     * @return The targetSupply.
     */
    public java.lang.String getTargetSupply() {
      java.lang.Object ref = targetSupply_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetSupply_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
     * @return The bytes for targetSupply.
     */
    public com.google.protobuf.ByteString
        getTargetSupplyBytes() {
      java.lang.Object ref = targetSupply_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetSupply_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
     * @param value The targetSupply to set.
     * @return This builder for chaining.
     */
    public Builder setTargetSupply(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      targetSupply_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetSupply() {
      targetSupply_ = getDefaultInstance().getTargetSupply();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
     * @param value The bytes for targetSupply to set.
     * @return This builder for chaining.
     */
    public Builder setTargetSupplyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      targetSupply_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:juno.mint.Minter)
  }

  // @@protoc_insertion_point(class_scope:juno.mint.Minter)
  private static final com.juno.mint.Minter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.juno.mint.Minter();
  }

  public static com.juno.mint.Minter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Minter>
      PARSER = new com.google.protobuf.AbstractParser<Minter>() {
    @java.lang.Override
    public Minter parsePartialFrom(
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

  public static com.google.protobuf.Parser<Minter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Minter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.juno.mint.Minter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

