// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/reward/v1beta1/params.proto

package com.axelar.reward.v1beta1;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:axelar.reward.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes external_chain_voting_inflation_rate = 1 [json_name = "externalChainVotingInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The externalChainVotingInflationRate.
     */
    com.google.protobuf.ByteString getExternalChainVotingInflationRate();

    /**
     * <code>bytes key_mgmt_relative_inflation_rate = 2 [json_name = "keyMgmtRelativeInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The keyMgmtRelativeInflationRate.
     */
    com.google.protobuf.ByteString getKeyMgmtRelativeInflationRate();
  }
  /**
   * <pre>
   * Params represent the genesis parameters for the module
   * </pre>
   *
   * Protobuf type {@code axelar.reward.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.reward.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      externalChainVotingInflationRate_ = com.google.protobuf.ByteString.EMPTY;
      keyMgmtRelativeInflationRate_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.reward.v1beta1.ParamsProto.internal_static_axelar_reward_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.reward.v1beta1.ParamsProto.internal_static_axelar_reward_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.reward.v1beta1.ParamsProto.Params.class, com.axelar.reward.v1beta1.ParamsProto.Params.Builder.class);
    }

    public static final int EXTERNAL_CHAIN_VOTING_INFLATION_RATE_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString externalChainVotingInflationRate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes external_chain_voting_inflation_rate = 1 [json_name = "externalChainVotingInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The externalChainVotingInflationRate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getExternalChainVotingInflationRate() {
      return externalChainVotingInflationRate_;
    }

    public static final int KEY_MGMT_RELATIVE_INFLATION_RATE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString keyMgmtRelativeInflationRate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key_mgmt_relative_inflation_rate = 2 [json_name = "keyMgmtRelativeInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The keyMgmtRelativeInflationRate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKeyMgmtRelativeInflationRate() {
      return keyMgmtRelativeInflationRate_;
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
      if (!externalChainVotingInflationRate_.isEmpty()) {
        output.writeBytes(1, externalChainVotingInflationRate_);
      }
      if (!keyMgmtRelativeInflationRate_.isEmpty()) {
        output.writeBytes(2, keyMgmtRelativeInflationRate_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!externalChainVotingInflationRate_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, externalChainVotingInflationRate_);
      }
      if (!keyMgmtRelativeInflationRate_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, keyMgmtRelativeInflationRate_);
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
      if (!(obj instanceof com.axelar.reward.v1beta1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.axelar.reward.v1beta1.ParamsProto.Params other = (com.axelar.reward.v1beta1.ParamsProto.Params) obj;

      if (!getExternalChainVotingInflationRate()
          .equals(other.getExternalChainVotingInflationRate())) return false;
      if (!getKeyMgmtRelativeInflationRate()
          .equals(other.getKeyMgmtRelativeInflationRate())) return false;
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
      hash = (37 * hash) + EXTERNAL_CHAIN_VOTING_INFLATION_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getExternalChainVotingInflationRate().hashCode();
      hash = (37 * hash) + KEY_MGMT_RELATIVE_INFLATION_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getKeyMgmtRelativeInflationRate().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.axelar.reward.v1beta1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.axelar.reward.v1beta1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.reward.v1beta1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.axelar.reward.v1beta1.ParamsProto.Params prototype) {
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
     * Params represent the genesis parameters for the module
     * </pre>
     *
     * Protobuf type {@code axelar.reward.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.reward.v1beta1.Params)
        com.axelar.reward.v1beta1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.axelar.reward.v1beta1.ParamsProto.internal_static_axelar_reward_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.axelar.reward.v1beta1.ParamsProto.internal_static_axelar_reward_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.axelar.reward.v1beta1.ParamsProto.Params.class, com.axelar.reward.v1beta1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.axelar.reward.v1beta1.ParamsProto.Params.newBuilder()
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
        externalChainVotingInflationRate_ = com.google.protobuf.ByteString.EMPTY;
        keyMgmtRelativeInflationRate_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.axelar.reward.v1beta1.ParamsProto.internal_static_axelar_reward_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public com.axelar.reward.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
        return com.axelar.reward.v1beta1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.axelar.reward.v1beta1.ParamsProto.Params build() {
        com.axelar.reward.v1beta1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.axelar.reward.v1beta1.ParamsProto.Params buildPartial() {
        com.axelar.reward.v1beta1.ParamsProto.Params result = new com.axelar.reward.v1beta1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.axelar.reward.v1beta1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.externalChainVotingInflationRate_ = externalChainVotingInflationRate_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.keyMgmtRelativeInflationRate_ = keyMgmtRelativeInflationRate_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.axelar.reward.v1beta1.ParamsProto.Params) {
          return mergeFrom((com.axelar.reward.v1beta1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.axelar.reward.v1beta1.ParamsProto.Params other) {
        if (other == com.axelar.reward.v1beta1.ParamsProto.Params.getDefaultInstance()) return this;
        if (other.getExternalChainVotingInflationRate() != com.google.protobuf.ByteString.EMPTY) {
          setExternalChainVotingInflationRate(other.getExternalChainVotingInflationRate());
        }
        if (other.getKeyMgmtRelativeInflationRate() != com.google.protobuf.ByteString.EMPTY) {
          setKeyMgmtRelativeInflationRate(other.getKeyMgmtRelativeInflationRate());
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
                externalChainVotingInflationRate_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                keyMgmtRelativeInflationRate_ = input.readBytes();
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

      private com.google.protobuf.ByteString externalChainVotingInflationRate_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes external_chain_voting_inflation_rate = 1 [json_name = "externalChainVotingInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return The externalChainVotingInflationRate.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getExternalChainVotingInflationRate() {
        return externalChainVotingInflationRate_;
      }
      /**
       * <code>bytes external_chain_voting_inflation_rate = 1 [json_name = "externalChainVotingInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @param value The externalChainVotingInflationRate to set.
       * @return This builder for chaining.
       */
      public Builder setExternalChainVotingInflationRate(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        externalChainVotingInflationRate_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes external_chain_voting_inflation_rate = 1 [json_name = "externalChainVotingInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return This builder for chaining.
       */
      public Builder clearExternalChainVotingInflationRate() {
        bitField0_ = (bitField0_ & ~0x00000001);
        externalChainVotingInflationRate_ = getDefaultInstance().getExternalChainVotingInflationRate();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString keyMgmtRelativeInflationRate_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes key_mgmt_relative_inflation_rate = 2 [json_name = "keyMgmtRelativeInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return The keyMgmtRelativeInflationRate.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getKeyMgmtRelativeInflationRate() {
        return keyMgmtRelativeInflationRate_;
      }
      /**
       * <code>bytes key_mgmt_relative_inflation_rate = 2 [json_name = "keyMgmtRelativeInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @param value The keyMgmtRelativeInflationRate to set.
       * @return This builder for chaining.
       */
      public Builder setKeyMgmtRelativeInflationRate(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        keyMgmtRelativeInflationRate_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes key_mgmt_relative_inflation_rate = 2 [json_name = "keyMgmtRelativeInflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return This builder for chaining.
       */
      public Builder clearKeyMgmtRelativeInflationRate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        keyMgmtRelativeInflationRate_ = getDefaultInstance().getKeyMgmtRelativeInflationRate();
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


      // @@protoc_insertion_point(builder_scope:axelar.reward.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:axelar.reward.v1beta1.Params)
    private static final com.axelar.reward.v1beta1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.axelar.reward.v1beta1.ParamsProto.Params();
    }

    public static com.axelar.reward.v1beta1.ParamsProto.Params getDefaultInstance() {
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
    public com.axelar.reward.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_reward_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_reward_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"axelar/reward/v1beta1/params.proto\022\025ax" +
      "elar.reward.v1beta1\032\024gogoproto/gogo.prot" +
      "o\"\200\002\n\006Params\022~\n$external_chain_voting_in" +
      "flation_rate\030\001 \001(\014B.\310\336\037\000\332\336\037&github.com/c" +
      "osmos/cosmos-sdk/types.DecR externalChai" +
      "nVotingInflationRate\022v\n key_mgmt_relativ" +
      "e_inflation_rate\030\002 \001(\014B.\310\336\037\000\332\336\037&github.c" +
      "om/cosmos/cosmos-sdk/types.DecR\034keyMgmtR" +
      "elativeInflationRateB\325\001\n\031com.axelar.rewa" +
      "rd.v1beta1B\013ParamsProtoZ3github.com/axel" +
      "arnetwork/axelar-core/x/reward/types\242\002\003A" +
      "RX\252\002\025Axelar.Reward.V1beta1\312\002\025Axelar\\Rewa" +
      "rd\\V1beta1\342\002!Axelar\\Reward\\V1beta1\\GPBMe" +
      "tadata\352\002\027Axelar::Reward::V1beta1\310\341\036\000b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_axelar_reward_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_reward_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_reward_v1beta1_Params_descriptor,
        new java.lang.String[] { "ExternalChainVotingInflationRate", "KeyMgmtRelativeInflationRate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}